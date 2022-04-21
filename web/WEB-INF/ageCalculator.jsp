<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form method="post" action="age" >
            <label>Enter your age:</label>
            <input type="text" name="age">
            <br><br>
           
            <input type="submit" value="Age next birthday">   
        </form>
        <p>${ageNext}<p>
               <p>${message}<p>
            <div>
                <a href="arithmetic">Arithmetic Calculator</a>
            </div>
    </body>
</html>
