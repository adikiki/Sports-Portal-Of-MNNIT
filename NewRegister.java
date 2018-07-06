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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author WELCOME
 */
public class NewRegister extends HttpServlet {

    Connection con;
    PreparedStatement ps;
    
    public void init(){
        try{
            //String qr = "insert into registration values (?,?,?,?,?,?,?,?,?)";
String qr = "insert into registration(A_Name,A_Branch,A_year,A_RegNo,A_EmailId,A_Mobile,Address1,Address2,Gender,Game)\n" +
"values (?,?,?,?,?,?,?,?,?,?) ";
            
            Class.forName("com.mysql.jdbc.Driver");
           con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sport","root","root");   
          ps= con.prepareStatement(qr);
           
           
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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        
              PrintWriter out = response.getWriter();
              //String Aname1= request.getParameter(null)
            String Aname  = request.getParameter("Athlete");            
            String Branch = request.getParameter("Branch");
            String year = request.getParameter("Year");
            String RegNo = request.getParameter("Reges");
            String Email = request.getParameter("Emailid");
            String Mobile = request.getParameter("Mobile");
            String add1 = request.getParameter("Address1");
            String add2 = request.getParameter("Address2");
            String Gender = request.getParameter("Gender");
            String game  =    request.getParameter("AGame");
            
             
            
            String submitType = request.getParameter("Register");      
            
            
        
        try{
            
            
        ps.setString(1,Aname);           
        ps.setString(2,Branch);
        ps.setString(3,year);
        ps.setString(4,RegNo);
        ps.setString(5,Email);
        ps.setString(6,Mobile);
        ps.setString(7,add1);
        ps.setString(8,add2);
        ps.setString(9,Gender);
        ps.setString(10, game);
        
        
        
        ps.executeUpdate(); 
        
       
         PrintWriter exe = response.getWriter();
         
         //exe.println("Registered succesfully");
         
        exe.println("<script type =\"text/javascript\">");
                exe.println("alert('Registered Successfully')");
                
                 exe.println("location='part.jsp';");
              exe.println("</script>"); 
             
         
            
            
        }catch(SQLException | IOException ex){
            
        }
    }

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
