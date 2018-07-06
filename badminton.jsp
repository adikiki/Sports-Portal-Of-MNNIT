<%-- 
    Document   : badminton
    Created on : 5 Apr, 2018, 6:17:20 PM
    Author     : WELCOME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <style>
            body{
                background: url("17.jpg") no-repeat;
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
        <title>Badminton</title>
    </head>
    <body>
        
        <h1>
            <a href="http://www.mnnit.ac.in/"/><img src="mnnit.png" align="left" width="150" height="150"></a>
            BADMINTON
            
        </h1>
             
        <div id="header">    
                            
               <form action="record" method="POST">
                <input type="text" name="GAMEYEAR" placeholder="GAMEYEAR">
                <input type="submit" name="submit" value="Team"> 
                <input type="submit" name="submit" value="MEDAL"> 
                                                  
               </form>           
            
            </div>
        
        
        <!--div id="wrap">
            <form action="MEDAL" method="POST" id="medalsubmit">
                    <input type="text" name="GAMEYEAR" id="medal" placeholder="GAMEYEAR" hidden="true"/>
                    
                    </form>
            <!--<input type="submit" name="submit" value="MEDAL" >>
            <button onclick="submit()">Medal</button>
            
        </div-->
        
        <!--script>
            function submit(){
              var x = document.querySelector('#aa').value;
              console.log("value  " + x);
              document.querySelector('#medal').value=x;
              
              document.querySelector('#medalsubmit').submit();
          }
            </script-->
    </body>
</html>

