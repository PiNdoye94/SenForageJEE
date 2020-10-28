package sn.forage.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.forage.dao.ClientIpml;
import sn.forage.dao.IGenerique;
import sn.forage.dao.IVillage;
import sn.forage.dao.VillageImpl;
import sn.forage.entities.Village;

/**
 * Servlet implementation class AccueilServlet
 */
@WebServlet("/accueil")
public class AccueilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IVillage villagedao;  
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccueilServlet() {
        super();
    }
    
    @Override
	public void init(ServletConfig config) throws ServletException {
		villagedao = new VillageImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listVillage", villagedao.findAll());
		request.getRequestDispatcher("Accueil.jsp").forward(request, response);
		//response.sendRedirect("Accueil.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomvillage = request.getParameter("nvillage");
		
		Village v = new Village();
		v.setNomVillage(nomvillage);
		villagedao.save(v);
		doGet(request,response);
	}

}
