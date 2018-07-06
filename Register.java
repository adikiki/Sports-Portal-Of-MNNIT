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
public class Register extends HttpServlet {

    Connection con;
    PreparedStatement ps;
    
    @Override
    public void init(){
        try{
            String qr = "insert into reges_record (FULLNAME,REGNO,BRANCH,EMAIL,MOBILE,USERNAME,PASSWORD) VALUES (?,?,?,?,?,?,?)";
         
       Class.forName("com.mysql.jdbc.Driver");
      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sport","root","root");
            
      ps=con.prepareStatement(qr);
           
        }catch(ClassNotFoundException | SQLException ex)
        {}
    }
@Override
    public void destroy(){
        try{
            con.close();
        }catch (Exception ex){}
    }
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            String fname= request.getParameter("FULLNAME"); 
            String regno= request.getParameter("REGNO");
            String branch= request.getParameter("BRANCH");
            String email= request.getParameter("EMAIL");
            String mob= request.getParameter("MOBILE");
            String user= request.getParameter("USERNAME");
            String pwd= request.getParameter("PASSWORD");
            String submit=request.getParameter("SUBMIT");
            
    
      try {
      ps.setString(1,fname);
      ps.setString(2,regno);
      ps.setString(3,branch);
      ps.setString(4,email);
      ps.setString(5,mob);
      ps.setString(6,user);
      ps.setString(7,pwd); 
      
      ps.executeUpdate();
      
      PrintWriter exe = response.getWriter();
      exe.println("Registered successfully");
            
        }
      catch(Exception ex){
          
      }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

}
