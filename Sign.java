/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sports;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author WELCOME
 */
public class Sign extends HttpServlet {

   PreparedStatement ps;
   Connection con;
   
  /* @Override
      public void init(){
          try{
              //String query="insert into sport values (?,?,?,?,?)";
             // Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sport","root","root");
              //ps = con.prepareStatement(query);
              
          }catch(ClassNotFoundException | SQLException ex){}
      }
      
       @Override
      public void destroy(){
        try{
            con.close();
        }catch (Exception ex){}
    }*/
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        //try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
     try{
        //PrintWriter out = response.getWriter();
        
        String Username = request.getParameter  ("Username");
        String EmailId = request. getParameter   ("EmailId");
        String Password = request.getParameter  ("Password");
        String Rpassword = request.getParameter ("Rpassword");
        String Mobile = request. getParameter    ("Mobile");        
        String query="insert into sport(Username,EmailId,Password,Rpassword,Mobile) values (?,?,?,?,?)";
        Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sport","root","root");
        ps = con.prepareStatement(query);
                
            ps.setString(1, Username);
            ps.setString(2, EmailId);
            ps.setString(3, Password);
            ps.setString(4, Rpassword);
            ps.setString(5, Mobile);
            
            ps.executeUpdate();
            PrintWriter exe = response.getWriter(); 
            //response.sendRedirect("home.jsp");
            exe.println("Succesfully Entered ");
            
            
            
            
        }
        catch(Exception ex){ }
        
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       try {
           processRequest(request, response);
       } catch (SQLException ex) {
           Logger.getLogger(Sign.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    

}
