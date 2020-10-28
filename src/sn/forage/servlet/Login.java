package sn.forage.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sn.forage.entities.User;
import sn.forage.dao.IUser;
import sn.forage.dao.UserImpl;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() { super(); }
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		  String username = request.getParameter("identifiant"); 
		  String password = request.getParameter("password");
		  
		  IUser userDao = new UserImpl(); 
		  User user = userDao.checkLogin(username,password); 
		  String destPage = "Login.jsp";
		  
		  if (user != null) { 
			  
			  HttpSession session = request.getSession();
			  session.setAttribute("user", user); 
			  destPage = "Accueil.jsp"; 
			  
		  } else {
			  
			  String message = "Identifiant ou Mot de passe Invalide!!";
			  request.setAttribute("message", message); }
			  
			  RequestDispatcher dispatcher = request.getRequestDispatcher(destPage);
			  dispatcher.forward(request, response);	
			  
	      }
}


