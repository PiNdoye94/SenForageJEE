package sn.forage.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sn.forage.dao.IGenerique;
import sn.forage.dao.VillageImpl;
import sn.forage.entities.Village;

/**
 * Servlet implementation class VillageServlet
 */
@WebServlet("/VillageServlet")
public class VillageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private IGenerique villagedao;
	/**
     * @see HttpServlet#HttpServlet()
     */
    public VillageServlet() {
        super();
    }
    
    @Override
	public void init(ServletConfig config) throws ServletException {
    	 villagedao = (IGenerique) new VillageImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("listVillage", villagedao.list());
		request.getRequestDispatcher("AccueilServlet").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomvillage = request.getParameter("nvillage").toString();
		
		Village v = new Village();
		v.setNomVillage(nomvillage);
		villagedao.save(v);
		//doGet(request,response);
		
		request.getRequestDispatcher("nouveauclient").forward(request, response);
	}

}
