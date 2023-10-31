package prop;

import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCDemo {

    public static void main(String[] args) {
        Connection con = null;

        try {
          
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return; 
        }

        try {
         
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "Tejeshakula123@");
            System.out.println("Connection Established...");

            Statement statement = con.createStatement();

           
            Scanner scanner = new Scanner(System.in);

            System.out.println("1. Insert Part");
            System.out.println("2. Update Part");
            System.out.println("3. Delete Part");
            System.out.print("Select an option (1/"
            		+ "2/"
            		+ "3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
           
                    System.out.print("Enter Part ID: ");
                    int pid = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Part Name: ");
                    String pname = scanner.nextLine();

                    System.out.print("Enter Part Color: ");
                    String color = scanner.nextLine();

              
                    int rowsInserted = statement.executeUpdate(
                            "INSERT INTO parts (pid, pname, color) VALUES (" + pid + ", '" + pname + "', '" + color + "')");
                    System.out.println(rowsInserted + " record(s) inserted.");
                    break;
                case 2:
                  
                    System.out.print("Enter Part ID to update: ");
                    int updatePid = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Enter new Part Name: ");
                    String newPname = scanner.nextLine();

                    System.out.print("Enter new Part Color: ");
                    String newColor = scanner.nextLine();

               
                    int rowsUpdated = statement.executeUpdate(
                            "UPDATE parts SET pname = '" + newPname + "', color = '" + newColor + "' WHERE pid = " + updatePid);
                    System.out.println(rowsUpdated + " record(s) updated.");
                    break;
                case 3:
             
                    System.out.print("Enter Part ID to delete: ");
                    int deletePid = scanner.nextInt();

               
                    int rowsDeleted = statement.executeUpdate("DELETE FROM parts WHERE pid = " + deletePid);
                    System.out.println(rowsDeleted + " record(s) deleted.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }


            statement.close();
            con.close();
            scanner.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

