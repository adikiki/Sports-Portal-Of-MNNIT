<%-- 
    Document   : kho
    Created on : 13 Apr, 2018, 1:19:02 AM
    Author     : WELCOME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>khokho</title>
    </head>
    <body>              
        <style>
            body{
                background: url("new/kho.jpg") no-repeat;
                background-position: center;
                background-color: #222833;
                
            }
            h1{
                text-align: center;
                font-size: 6em;   
                color:greenyellow;
                margin-top: auto;
            }
            
           
            #header input{
                text-align: center;                
                width: 180px;
                height: 30px;
                margin-left: 40%;
                margin-right: 20px;
                margin-bottom: 20px;
                margin-top: 5em;
                font-weight: bold;    
            }         
    </style>
        
    </head>
    <body>
        
        <h1>
         <a href="http://www.mnnit.ac.in/"/><img src="mnnit.png" align="left" width="150" height="150"></a>
              INTER NIT CRICKET KHOKHO          
        </h1>             
        <div id="header">    
                            
                <form action="kho" method="POST">
                    
                <input type="text" name="Team" placeholder="BOYS or GIRLS TEAM" >
                <input type="text" name="GAMEYEAR" placeholder="GAMEYEAR">
                <input type="submit" name="submit" value="Team"> 
                <input type="submit" name="submit" value="MEDAL">                 
                </form>                           
            
        </div>         
       
    </body>
        
    </body>
</html>
