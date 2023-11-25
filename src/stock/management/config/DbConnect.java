/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock.management.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author yassi
 */
public class DbConnect {
    Connection con;
    Statement state;
    
    public DbConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","");
              System.out.println("DataBase Conected");
              
        }catch(Exception e){
            System.out.println(e.getMessage()+" ok");
            
        }
        
    }
    public Connection getCon(){
        return con;
    }
    
}
