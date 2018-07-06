<%-- 
    Document   : upcoming
    Created on : 18 Apr, 2018, 11:00:16 PM
    Author     : WELCOME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upcoming Events</title>
        <style>
            body{
                background: url("spo.jpg");
             }
             h1{
                 text-align: center;
             }
             p{
                 text-decoration-line: none;
             }
            h2{
                margin-top: 2em;
                text-align: center;
                font-size: 3em;
            }
            row{
                padding: auto;
            }
            button{
                text-decoration-line: none;
                font-size: 2em;  
                width: 200px;
            }
            section{
                margin-left: 35%;
                margin-top: 3em;
                margin-right: auto;
                margin-bottom: 2em;
                padding:auto; 
            }
        </style>
        
    </head>
    <body>
        <p> <a href="home.jsp">BACK</a></p>
        <h1>
            <a href="http://www.mnnit.ac.in/"/><img src="mnnit.png" align="left" width="200" height="200"></a>
            MNNIT SPORTS EVENTS</h1>
       
        <h2>Register for Athletics</h2>
        <section class="row">
            
            <a href="part.jsp" ><button class="button-alt">Running</button></a>
            <a href="signup.jsp" ><button class="button-alt">Jumping</button></a>
            <a href="reg.jsp" ><button class="button-alt">Cycle Race</button></a>
        
        </section>
    </body>
</html>
