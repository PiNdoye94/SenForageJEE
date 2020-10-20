package sn.forage.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AccueilServlet
 */
@WebServlet("/AccueilServlet")
public class AccueilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccueilServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/Accueil.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nv = request.getParameter("nvillage");
		request.setAttribute("nomVillage", nv);
		if (nv.equals("")) {
			response.setContentType( "text/html" );
		    PrintWriter out = response.getWriter();
			out.println("<tr><td>Veuillez remplir le nom du village!!</td></tr>");
			
			request.getRequestDispatcher("/WEB-INF/Accueil.jsp").forward(request, response);
		} else {
			
			
			request.getRequestDispatcher("/WEB-INF/Clients/AddClient.jsp").forward(request, response);
		}
	}

}
