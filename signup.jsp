<%-- 
    Document   : signup
    Created on : 11 Mar, 2018, 6:11:32 PM
    Author     : WELCOME
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Form</title>
        <style> 
        body {
  margin: 0;
  padding: 0;
  background: #333333 url("spo.jpg");
  font-size: 16px;
  color: #222;
  font-family: 'Roboto', sans-serif;
  font-weight: 300;
}
     h1{
    text-align:center;
    font-size:3em;
    margin-left: auto;
}   
        #login-box {
  position: absolute;
  margin-left: 25em;
  margin-top: 2em;
  margin-bottom: 5em;
  margin-right: auto;
  width: 600px;
  height: 500px;
   background: #68c9e8;
  border-radius: 2px;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.4);
  font-weight: bold; 
 }
 
 .form-input{
     margin-left: 2em;
     margin-top: 2em;
 }
 .form-input input{
       width: 180px;
       height: 30px;
      margin-left: 20px;
      margin-top: 20px;
      font-weight: bold;      
   }
 .form-input input[name="Athlete"]{
       width: 400px;       
   }
   .form-input input[name="Emailid"]{
       width: 400px;       
   }
 
   .form-input input[name="Register"]{
       width: 100px;
       height: 30px;
      alignment-adjust: middle;
      margin-top: 30px;
      margin-left: 200px;
      font-weight: bolder;
 
   }
    select{
      
       margin-top: 1em;
       margin-left: 3em;
       font-weight: bolder;
       width: 150px;height: 25px;
   }
 
 </style>

 </head>
    <body>
        <a href="upcoming.jsp">BACK</a>
        <h1>
            <a href="http://www.mnnit.ac.in/"/><img src="mnnit.png" align="left" width="200" height="200"></a>
            Registration Form</h1>
        
        <div id="login-box">
            
            <span align="center"> <b>*All fields are mandatory!!!</b></span>
            
            <div id="wrapper">
            <form action="New" method="POST">
               <div class="form-input">
                        
                        *<input type="text" name="Athlete"   placeholder="Athlete Name" required/><br>
                        *<input type="text" name="Branch"   placeholder="Branch" required/>
                        *<input type="text" name="Year"   placeholder="Year"required /><br>    
                        *<input type="text" name="Reges" maxlength="10"  placeholder="RegNo" required/><br>
                        *<input type="text" name="Emailid" maxlength="30"  placeholder="Enter your valid email Id" required pattern = "[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$" />                                
                        <br>
                        *<input type="text" name="Mobile" maxlength="10"  placeholder="Mobile No"  required pattern="(7|8|9)\d{9}" /><br>
                        
                        *<input type="" name="Address1" maxlength="20"  placeholder="Address1" required />
                        *<input type="text" name="Address2" maxlength="20"  placeholder="Address2" required />
                        <br><br>
                        *<select name="Gender" align="center" required="required">
                        <option value="Male">Male</option>
                        <option value="Female">Female</option>
                        <option value="Others">Others</option>
                       </select>
                        
                        *<select name="Agame" align="center" required="required">
                        <option value="">Select Jumping</option>
                        <option value="">High Jump</option>
                        <option value="">Long Jump</option>
                        <option value="">Triple Jump</option>
                        </select> </br>  
              
                        <input type="submit" name="Register"   value="Register"/>
               </div>
            </form>
            </div>
            
        </div>
    </body>
</html>
