/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author mohamedkhaled
 */
public class DbOperations {
    
   /* public static void setDataOrDelete(String query,String msg)
    {
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            st.executeUpdate(query);
            if(!msg.equals(""))
                JOptionPane.showMessageDialog(null,msg);
                
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e,"message",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static ResultSet getData(String query)
    {
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeUpdate(query);
            return rs;
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e,"message",JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    */
   
    
}
