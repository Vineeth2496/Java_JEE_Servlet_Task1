

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class reg_action extends HttpServlet {
	
    
	 public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	 {
		String name=request.getParameter("em");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass") ;
		
           Data d=new Data();
              d.setName(name);
              d.setEmail(email);
              d.setPass(pass);
              
           PrintWriter out  =response.getWriter();
               
              Dao dd=new Dao();
           int r  =dd.register(d);
           out.println("UPDATED"+r);
	}

}
