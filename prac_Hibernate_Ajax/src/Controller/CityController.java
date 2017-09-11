package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CityDao;
import Vo.CityVo;
import Vo.CountryVo;
import Vo.StateVo;

/**
 * Servlet implementation class CityController
 */
@WebServlet("/CityController")
public class CityController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CityController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int Cityid =Integer.parseInt(request.getParameter("CountryName"));
		String S1=request.getParameter("CityName");
		String S2=request.getParameter("CityDescription");
		int S3=Integer.parseInt(request.getParameter("sn"));
		
		CountryVo cvo=new CountryVo();
		cvo.setCid(Cityid);
		
		StateVo svo=new StateVo();
		svo.setSid(S3);
		
		CityVo vo=new CityVo();
		vo.setCvo(cvo);
		vo.setCityName(S1);
		vo.setCityDescription(S2);
		vo.setSvo(svo);
		
		CityDao dao=new CityDao();
		dao.InsertData(vo);
		
		response.sendRedirect("Index.jsp");
		
	}

}
