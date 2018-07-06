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
import java.sql.Statement;
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
public class signup extends HttpServlet {

   PreparedStatement ps;
    Connection con;
    
    @Override
      public void init(){
          try{
              String query="insert into sport values (?,?,?,?,?) ";
              Class.forName("com.mysql.jdbc.Driver");
              con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sport","root","root");
              ps = con.prepareStatement(query);
              
          }catch(ClassNotFoundException | SQLException ex){}
      }
      
       @Override
      public void destroy(){
        try{
            con.close();
        }catch (Exception ex){}
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        //try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            PrintWriter out = response.getWriter();
        
        String Username = request.getParameter  ("Username");
        String EmailId = request. getParameter   ("EmailId");
        String Password = request.getParameter  ("Password");
        String Rpassword = request.getParameter ("Rpassword");
        String Mobile = request. getParameter    ("Mobile");
       /* String submitType = request.getParameter("submit");
        out.println("llllllllllllllllllllllllll");
        out.println(Username);
        out.println(EmailId);
        out.println(Password);
        out.println(Rpassword);
        out.println(Contct);*/
        
        //Class.forName("com.mysql.jdbc.Driver");
        //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/adiquery","root","root");
              
             // ps = con.prepareStatement();
                  //Statement st = con.createStatement();
                  //st.executeUpdate("insert into collect  (Username,EmailId,Password,Rpassword,Mobile) values ('"+Username +"','"+EmailId +"','"+Password +"','"+Rpassword +"','"+Contct +"')");
              
                  //response.sendRedirect("home.jsp");
                  
                     
              
        try{
            ps.setString(1, Username);
            ps.setString(2, EmailId);
            ps.setString(3, Password);
            ps.setString(4, Rpassword);
            ps.setString(5, Mobile);
            
            ps.executeUpdate();
            PrintWriter exe = response.getWriter();            
            exe.println("Succesfully Entered ");
            
            
            
        }
        catch(Exception ex){
        out.println("roggy");
        }
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       try {
           processRequest(request, response);
       } catch (SQLException ex) {
           Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(signup.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    

}
