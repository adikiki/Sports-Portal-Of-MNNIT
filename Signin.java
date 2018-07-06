/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sports;

import java.sql.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
//import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author WELCOME
 */
public class Signin extends HttpServlet {

    PreparedStatement ps;
    Connection conn;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        
             try(PrintWriter out = response.getWriter();) 
        {                       
            String User = request.getParameter("USERNAME");
            String Pwd =  request.getParameter("PASSWORD");
            
            if(User.equals("admin")&& Pwd.equals("adi1011"))
            {
                response.sendRedirect("home.jsp");
            }
            else
            {
                out.println(" sooryyyyy!!! u hv no authentication");
            }
            
            
//            String userid = null;
//            String paswd  = null; 
//                       
//            String qer = "Select * from reges_record where USERNAME = 'admin' and PASSWORD = 'adi123'";
//            
//            Class.forName("com.mysql.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sport","root","root");
//             
//           ps=conn.prepareStatement(qer);
//           
//           ps.setString(1,User);
//           ps.setString(2,Pwd);
//            
//            ResultSet rs =ps.executeQuery();
//            //out.println("llllllj");
//            while(rs.next())
//            {
//               userid = rs.getString("USERNAME");
//               paswd = rs.getString("PASSWORD");
//            }
//            if(User.equals(userid)&& Pwd.equals(paswd))
//            {    
//                response.sendRedirect("home.jsp");
//            }
//            else
//            {
//                //RequestDispatcher rd = request.getRequestDispatcher("user.jsp");
//                //rd.include(request, response);
//                out.println("wrong id and password");
//            }
//            
        }
        catch(Exception ex){
            System.out.println("executed");
        }
    }

     
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Signin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
         }
