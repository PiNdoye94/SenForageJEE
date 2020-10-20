package sn.forage.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet(name="Login", urlPatterns="/")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("identifiant");
		String password = request.getParameter("password");
		
		//création et recupération des session
		HttpSession session = request.getSession(true);
		// stockage des sessions 
		session.setAttribute("identifiant", email);
		session.setAttribute("password", password);
		//redirection vers la vue
		
		if(email.equals("papisndoye218@gmail.com") && password.equals("12345")) {
			request.getRequestDispatcher("/WEB-INF/Accueil.jsp").forward(request, response);
			//si on est connecté on peut ajouter un attribut isConnected qui prend la valeur true pour se souvenir si on était connecté
			session.setAttribute("isConnected", true);	
	    }else{	
	    	request.getRequestDispatcher("/").forward(request, response);
	    	//quand on se redonnecte
	    	session.setAttribute("isConnected", false);
	    }
	}
}


