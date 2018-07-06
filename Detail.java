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
public class Detail extends HttpServlet {
 Connection con;
 Connection con1;
 PreparedStatement ps;
 PreparedStatement ps1;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String gyear = request.getParameter("GAMEYEAR");
            String gname = request.getParameter("GAMENAME");
            
            String action = request.getParameter("submit");
           
         
            String qr="SELECT NAME,REGNO,BRANCH FROM PLAYER WHERE G_ID in\n" +
                      "(SELECT G_ID FROM gamerecord WHERE GAMEYEAR = ? and GAMENAME='FOOTBALL')";
            
                    
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sport","root","root");
            ps = con.prepareStatement(qr);   
          
                      
                      
                          
               if(action.equals("MEDAL"))
               {
                    String quer= "Select MEDAL from gamerecord WHERE GAMEYEAR = ? and GAMENAME='FOOTBALL'";  
                    ps = con.prepareStatement(quer);   
          
                     ps.setString(1,gyear);
                  
                     ResultSet rs =ps.executeQuery(); 
                      //out.println("fnsdn");
            while (rs.next())
            {
                out.println("MEDAL :- "+rs.getString("MEDAL"));
            }
               }
               else
               {
               out.println("<html><body><table align='center' border='0' bgcolor='Teal' cellpadding='10' cellsapcing='0' style='height: 300px; width:330px;'<tr><td>NAME</td><td>RegNo</td><td>BRANCH</td></tr>");
         
            ps.setString(1,gyear);
             //ps.setString(2, gname);          
            
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
                   //out.println("not registered");
                   
               }
      /*String query ="SELECT MEDAL FROM GAMERECORD WHERE GAMEYEAR=? AND GAMENAME=?";
                      ps1 = con1.prepareStatement(query);
                      ResultSet rs1 = ps1.executeQuery();
                      
                      if(rs1.next())
                      {
                          rs1.getString("MEDAL");
                      }*/
            
            
            
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     try {
         processRequest(request, response);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(Detail.class.getName()).log(Level.SEVERE, null, ex);
     } catch (SQLException ex) {
         Logger.getLogger(Detail.class.getName()).log(Level.SEVERE, null, ex);
     }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     try {
         processRequest(request, response);
     } catch (ClassNotFoundException ex) {
         Logger.getLogger(Detail.class.getName()).log(Level.SEVERE, null, ex);
     } catch (SQLException ex) {
         Logger.getLogger(Detail.class.getName()).log(Level.SEVERE, null, ex);
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
