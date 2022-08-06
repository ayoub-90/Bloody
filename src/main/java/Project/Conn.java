/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author Destock Afric
 */
public class Conn{
    public Connection c;
    public Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:postgresql://localhost:5432/GAB","root","xbdq8555");    
            s =c.createStatement(); 
           
        }catch(ClassNotFoundException | SQLException e){ 
            System.out.println(e);
        }  
    }  
}