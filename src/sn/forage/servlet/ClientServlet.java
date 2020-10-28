package sn.forage.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.forage.dao.ClientIpml;
import sn.forage.dao.IClient;
import sn.forage.dao.IVillage;
import sn.forage.dao.VillageImpl;
import sn.forage.entities.Client;
import sn.forage.entities.Village;

/**
 * Servlet implementation class ClientServlet
 */
@WebServlet("/nouveauclient")
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IClient clientdao;
	private IVillage villagedao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
        super();
    }
    
    @Override
	public void init(ServletConfig config) throws ServletException {
		clientdao = new ClientIpml();
		villagedao = new VillageImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Clients/AddClient.jsp").forward(request, response);
		//response.sendRedirect("Clients/AddClient.jsp");	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String adresse = request.getParameter("adresse");
		String telephone = request.getParameter("telephone");
		
		Village v = new Village();
		int id = Integer.parseInt(request.getParameter("village").toString());
        v = villagedao.getVillageById(id);
        
        Client c = new Client();
        
		c.setNom(nom);
		c.setPrenom(prenom);
		c.setAdresse(adresse);
		c.setTelephone(telephone);
		c.setVillage(v);

		clientdao.save(c);
		
		request.getRequestDispatcher("gestionclient").forward(request, response);
		//response.sendRedirect("Clients/ListClient.jsp");
	}

}
