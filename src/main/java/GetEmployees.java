import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetEmployees")
public class GetEmployees extends HttpServlet {
    private static final long serialVersionUID = 1L;

    String url = "jdbc:mysql://localhost:3306/CompanyDB";
    String user = "root";
    String password = "";  // Change this if your root has a password
    String dpath = "com.mysql.cj.jdbc.Driver";

    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(dpath);
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT * FROM employee");

            pw.println("<html><body>");
            pw.println("<h2>Employee Details</h2>");
            pw.println("<table border='1'><tr><th>ID</th><th>Name</th><th>Salary</th></tr>");

            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int salary = rs.getInt(3);
                pw.println("<tr><td>" + id + "</td><td>" + name + "</td><td>" + salary + "</td></tr>");
            }

            pw.println("</table></body></html>");

        } catch (Exception e) {
            e.printStackTrace();
            pw.println("<p>Error: " + e.getMessage() + "</p>");
        } finally {
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (con != null) con.close(); } catch (Exception e) {}
        }
    }
}
