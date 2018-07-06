<%-- 
    Document   : user
    Created on : 22 Jan, 2018, 11:00:56 PM
    Author     : WELCOME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
             body {
               background: #333333 url("spo.jpg");
               }
               #header{
                  
		   //background: #222833;
                text-decoration: none;
                text-decoration-line: none;
                   background-position: center;
                   font-size: 2em;
                   text-align: center;
                   font-family:Sans-serif;
               }
               #wrapper{
                   background:greenyellow url("log.jpg");
   width:400px;
   height: 300px;
   margin-top: 80px;
   margin-left:auto;
   margin-right: auto;
   border-style: solid;
   border-width: thin ;
   background-color:#dfe3ee;
   text-align:center; 
   font-weight: bold; 
   border-radius: 10px;
   font-size: 20px;
   }
   
   #wrapper input{
       width: 180px;
       height: 30px;
      margin-left: 20px;
      margin-right: 20px;
      margin-bottom: 20px;
      margin-top: 50px;
      font-weight: bold;  
       }
   
    #wrapper input[name="Register"]{
       width: 100px;
       height: 30px;
      alignment-adjust: middle;
      margin-top: 30px;
      margin-left:100px;
      font-weights: Strong;
    }
    #wrapper a{
        color:inherit;
    }
   #footer {
		//padding: 4em 0;
                padding-bottom: 0em;
		color: #fff;
	}
   #footer .copyright {
                //background:#333333;
		margin-top: 3em;
                margin-bottom: 0em;
                padding-top: 3em;
		padding-bottom: 3em;
		border-top: 1px solid;
		//-color: rgba(192, 192, 192, 0.15);
		text-align: center;
		color: inherit;
		}
               

         </style>      
               
        <title>Login Page</title>
    </head>
    <body>
        
        
        <div id = "header">
            <h1>  
            <img src="mnnit.png" align="left" width="200" height="200"/>
            <a href="index.html">MNNIT SPORTS CLUB</a>
           
            </h1>     
            </div>
        
        <div id="wrapper">
               <form action="Signin"  method="POST" >
             AdminId <input type="text" name="USERNAME" required="required" /><br>
               Password <input type="password" name="PASSWORD" required="required"/><br> 
           <!--    <a href="login.jsp">Forgot Password</a> -->
                <input type="submit" name="Register" value="SignIn"/>
                <!--a href="signup.jsp" >SignUp</a></button-->
                
            </form>       
         </div>  
        
        <!--div id="footer">
            <div class="copyright">
	Design: <a href="">ADITYA  </a> (<a href=""> adi@1011</a>) <!--(<a href=""></a>)
	</div>
        </div-->
</body>
</html>
