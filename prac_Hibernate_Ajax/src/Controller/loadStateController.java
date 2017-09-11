package Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.SearchDaoCountry;
import Vo.CountryVo;
import Vo.StateVo;

/**
 * Servlet implementation class loadStateController
 */
@WebServlet("/loadStateController")
public class loadStateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loadStateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List ls=new ArrayList();
		
		int cid=Integer.parseInt(request.getParameter("cid"));
		
		CountryVo countryVo = new CountryVo();
		countryVo.setCid(cid);
		
		StateVo stateVo = new StateVo();
		stateVo.setCvo(countryVo);
		
		SearchDaoCountry dao=new SearchDaoCountry();
		ls=dao.searchState(stateVo);
		
		HttpSession session=request.getSession();
		session.setAttribute("data", ls);
		response.sendRedirect("jasonState.jsp");
		
	}

}
