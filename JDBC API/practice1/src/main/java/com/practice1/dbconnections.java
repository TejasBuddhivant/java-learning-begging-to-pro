package com.practice1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dbconnections")
public class dbconnections extends HttpServlet {
    private static final long serialVersionUID = 1L;
    

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	
        	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/javaclass","root","Tejas@412301");
        	PreparedStatement sc= conn.prepareStatement("select * from student where id= ?");
        	sc.setInt(1,1);
        	ResultSet rs = sc.executeQuery();
        		int userid= 0;
        		String uname=null,add=null, mob=null;
        		
        		while(rs.next()) {
        			userid=rs.getInt(1);
        			uname= rs.getString(2);
        			add= rs.getString(3);
        			mob= rs.getString(4);
        			
        		}
                out.println("<html><body>");
                out.println("<h2>Student Details</h2>");
                out.println("<p>User Id: " + userid + "</p>");
                out.println("<p>User Name: " + uname + "</p>");
                out.println("<p>Address: " + add + "</p>");
                out.println("<p>Mobile: " + mob + "</p>");
                out.println("</body></html>");
        	
        } catch (Exception e) {
            e.printStackTrace();
           
        }
    }

    
   
}
