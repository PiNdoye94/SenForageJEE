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

/**
 * Servlet implementation class GestionServlet
 */
@WebServlet("/gestionclient")
public class GestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IClient clientdao;  
	private IVillage villagedao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionServlet() {
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
		request.setAttribute("listClient", clientdao.findAll());
		request.setAttribute("listVillage", villagedao.findAll());
		request.getRequestDispatcher("Clients/ListClient.jsp").forward(request, response);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
