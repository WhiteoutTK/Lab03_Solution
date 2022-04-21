<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form action="arithmetic" method="post" >
            <label>First:</label>
            <input type="text" name="first" value="${f}">
            <br>
                <label>Second:</label>
                  <input type="text" name="second" value="${s}">
                 <br>
                 <input type="submit" value="+" name='sign'>
                 <input type="submit" value="-" name='sign'>
                 <input type="submit" value="*" name='sign'>
                 <input type="submit" value="%" name='sign'>
        </form>
                 <a href="age">Age Calculator</a>
        <p> ${result}</p>
    </body>
</html>
