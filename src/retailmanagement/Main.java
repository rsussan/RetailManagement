/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailmanagement;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    static final String userName= "rsussa1";//put your MySQL user name tsmith60
    static final String password= "Cosc*q76p";//put your MySQL password  Mine is Cosc*2jk6
    private static Connection connection=null;
    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        Object newInstance;
        newInstance = Class.forName("com.mysql.jdbc.Driver").newInstance();
        connection = DriverManager.getConnection("jdbc:mysql://triton.towson.edu:3360/rsussa1db", userName, password);// Please use your database name here
        //PreparedStatement updateStaff;
        Statement queryStatement = connection.createStatement();
        //updateStaff = null;
            String querys="select * from rsussa1db.Employees;";
            ResultSet results = queryStatement.executeQuery(querys);
            while(results.next())
            {
                System.out.print(results.getString("SSN"));
                System.out.print("    ");
                System.out.print(results.getString("Name"));
                System.out.println();
            }
    }
}