package prop;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
 
public class MetaDataDemo {
	public static void main(String[] ar) {
		// TODO Auto-generated method stub
		Connection con=null;
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/hr","root","Tejeshakula123@");
			System.out.println("Connection Established...");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select first_name,department_name from employees e join departments d on e.department_id=d.department_id");
			ResultSetMetaData rsm=rs.getMetaData();
			System.out.println(rsm.getColumnCount());
			for(int i=0;i<rsm.getColumnCount();i++) {
				System.out.print(rsm.getColumnName(i+1)+ "\t");
			}
			System.out.println();
			while(rs.next()) {
				for(int i=0;i<rsm.getColumnCount();i++) {
					int type=rsm.getColumnType(i+1);
					switch(type) {
					case 4:{
						System.out.print(rs.getInt(i+1)+"\t\t\t");
						break;
					}
					case 1:{
						System.out.print(rs.getString(i+1)+"\t\t\t");
						break;
					}
					default:{
						System.out.print(rs.getString(i+1)+"\t\t\t");
					}
					}
				
					
				}
				System.out.print("\n");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}