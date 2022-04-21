package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatotServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                String btn = request.getParameter("sign");
        String f = request.getParameter("first");
        String s = request.getParameter("second");
         request.setAttribute("f",f);
          request.setAttribute("s",s);
          
            String result = "Result -- ";
          
          
        if(f.equals("")||f == ""|| s.equals("")||s==""){
        
            result = "Result -- ";
                 
                request.setAttribute("result",result);
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request,response);
        
           return;
            
        }
        try{
         int i=Integer.parseInt(f);
                int k=Integer.parseInt(s);
                
                  if(btn.equals("+")){
                int total = i + k;
                String t = String.valueOf(total);
                
                 result = "Result "+t;
                request.setAttribute("result",result);
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request,response);
        
           return;
        } else if (btn.equals("-")){
        
                  
                int total = i - k;
                String t = String.valueOf(total);
             result = "Result "+t;
                request.setAttribute("result",result);
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request,response);
        
           return;
        
        
        }else if (btn.equals("*")){
                 
                int total = i * k;
                String t = String.valueOf(total);
             result = "Result "+t;
                request.setAttribute("result",result);
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request,response);
        
           return;
        }else if (btn.equals("%")){
        
                
                int total = i % k;
                String t = String.valueOf(total);
             result = "Result "+t;
                request.setAttribute("result",result);
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request,response);
        
           return;
        }
                
                
        }catch(NumberFormatException  e){
                 result = "invalid";
                request.setAttribute("result",result);
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request,response);
        
           return;
        
        }
        
      
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request,response);
           return;
    }
}