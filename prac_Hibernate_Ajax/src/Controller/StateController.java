package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.StateDao;
import Vo.CountryVo;
import Vo.StateVo;

/**
 * Servlet implementation class StateController
 */
@WebServlet("/StateController")
public class StateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StateController() {
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
		
		int c_id =Integer.parseInt(request.getParameter("CountryId"));
		String S3=request.getParameter("StateName");
		String S4=request.getParameter("StateDescription");
		
		CountryVo cvo=new CountryVo();
		cvo.setCid(c_id);
	
		StateVo vo=new StateVo();
		vo.setCvo(cvo);
		vo.setStateName(S3);
		vo.setStateDescription(S4);
		
		
		StateDao dao=new StateDao();
		dao.insertdata(vo);
		response.sendRedirect("Index.jsp");
		
	}

}
