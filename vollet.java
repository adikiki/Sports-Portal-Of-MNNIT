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
import java.sql.ResultSet;
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
public class vollet extends HttpServlet {

   Connection con;
   PreparedStatement ps;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            
             String team = request.getParameter("Team");
             String gyear = request.getParameter("GAMEYEAR");
            
            
            String action = request.getParameter("submit");
            String qr = "SELECT NAME,BRANCH,REGNO FROM interplayer WHERE TEAM = ? AND G_ID in\n" +
       "(SELECT G_ID FROM game WHERE GAMENAME = 'VOLLEYBALL' AND GAMEYEAR=?)";
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sport","root","root");
            ps = con.prepareStatement(qr); 
            
            
             if(action.equals("MEDAL"))
               {     String quer= "Select MEDAL from game WHERE GAMEYEAR = ? and GAMENAME='VOLLEYBALL";  
                    ps = con.prepareStatement(quer);   
          
                     ps.setString(1,gyear);
                  
                     ResultSet rs =ps.executeQuery(); 
                     
            while (rs.next())
            {
                out.println("MEDAL :- "+rs.getString("MEDAL"));
            }
               }
            else{
                
                out.println("<html><body><table align='center'border='0' bgcolor='Teal' cellpadding='10' cellsapcing='0' style='height: 300px; width:330px;'<tr><td>NAME</td><td>BRANCH</td><td>RegNo</td></tr>");
         
                ps.setString(1, team);
            ps.setString(2,gyear);
                       
            
            ResultSet rs =ps.executeQuery(); 
            if(rs.next())
            {
            while(rs.next())
            {
               out.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td></tr>");
            }  
            }
            else
            {
                out.println("<h2>Team is not registered in this "+(gyear)+"</h2>");
            }
            out.println("</table></body></html>");
               rs.close();
               ps.close(); 
                
            } 
        }
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       try {
           processRequest(request, response);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(vollet.class.getName()).log(Level.SEVERE, null, ex);
       } catch (SQLException ex) {
           Logger.getLogger(vollet.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
