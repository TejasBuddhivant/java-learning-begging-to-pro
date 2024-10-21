package tejas12;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deletquery {
public static void main(String[] args) {
	int r=0;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/javaclass","root","Tejas@412301");
		
		if(con!=null) {
		 System.out.println("Connected..");
		}
		PreparedStatement st=con.prepareStatement("delete from student where id=?");
		st.setInt(1, 12);
		
		r= st.executeUpdate();
		if(r>0) {
			System.out.println("ID DELETED");
		}
	
	}
	
	catch(SQLException | ClassNotFoundException e) {
		
		e.printStackTrace();
	}
}
}

