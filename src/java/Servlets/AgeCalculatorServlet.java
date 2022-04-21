package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         String age = request.getParameter("age");
        
    if( age == null || age.equals("")){
        String message = "You must give your current age";
        request.setAttribute("message", message);
        
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        return;
    }
    try{
             int i=Integer.parseInt(age);
               i++;
                       String s =String.valueOf(i);  
        String ageMsg = "Your age next birthday is "+s;
         request.setAttribute("ageNext",ageMsg);
         

        
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request,response);
            return;
        }catch(NumberFormatException  e){
             String message = "You must enter a number";
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        return;
        }
    
    }

}
