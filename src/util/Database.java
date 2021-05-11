/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Fhernand
 */
public class Database {
    java.sql.Connection connection = null;
    public static java.sql.Connection getConnection(){
    try {
           
     Class.forName("com.mysql.jdbc.Driver");
            
           
     java.sql.Connection  connection = DriverManager.getConnection("jdbc:mysql://localhost/crudmaster", "root", "");
      return connection;
            
           
     }
 catch(Exception e) {
            
     JOptionPane.showMessageDialog(null, "Not Connected!");
       return null;
        }
    
    }
    
}
