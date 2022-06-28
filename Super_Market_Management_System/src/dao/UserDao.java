/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.User;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author mohamedkhaled
 */
public class UserDao {
    
public static void save(User user){
    {
        String query="insert into user(name,email,mobileno,password,status) values('"+user.getName()+"','"+user.getEmail()+"','"+user.getMobileno()+"','"+user.getPassword()+"','true')";
        DbOperations.setDataOrDelete(query, "Registered Successfully wait for admin approval");
    }
}
    
    public static User login(String email,String password)
    {
        User user=null;
        try{
            ResultSet rs = DbOperations.getData("select *from user where email='"+email+"' and password='"+password+"'");
            while(rs.next())
            {
                user =new User();
                user.setStatus(rs.getString("status"));
            }
            
        }
        
           
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
        
    }
    
}

