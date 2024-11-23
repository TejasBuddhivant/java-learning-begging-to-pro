package com.adminlogin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/Admin")
public class Admin extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        String password = request.getParameter("pass");


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Connection conn = null;
        PreparedStatement sc = null;
       

        try {
            // Loading  the JDBC driver this first step
            Class.forName("com.mysql.cj.jdbc.Driver");

           
            conn = DriverManager.getConnection("jdbc:mysql://localhost/Employee", "root", "Tejas@412301");

   
            sc = conn.prepareStatement("SELECT * FROM Admin WHERE id = ? AND pass = ?");
            sc.setString(0, id);
            sc.setString(1, password);

       
            ResultSet rs = sc.executeQuery();

            if (rs.next()) {
                // Valid credentials - Create session and redirect
                HttpSession session = request.getSession();
                session.setAttribute("id", id);
                response.sendRedirect("admin.jsp");
            } else {
                // Invalid credentials - Display error message
                out.println("<h1 style='color:red;'>ERROR: Invalid ID or Password</h1>");
                out.println("<a href='login.jsp'>Back to Login</a>");
            }
        } catch (Exception e) {
            e.printStackTrace();
            out.println("<h1 style='color:red;'>An error occurred. Please try again later.</h1>");
        } finally {
            try {
                if (rs != null) rs.close();
                if (sc != null) sc.close();
                if (conn != null) conn.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            out.close();
        }
    }
}
