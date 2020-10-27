package recommend.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import recommend.model.service.RecommendService;
import recommend.model.vo.ComponentList;


/**
 * Servlet implementation class RecommendEnrollView
 */
@WebServlet("/recommendenroll/view")
public class RecommendEnrollView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecommendEnrollView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		ComponentList componentList = new RecommendService().recommendselectAll();
		
		if(componentList!=null) {
			request.setAttribute("powerList", componentList.getPowerList());
			request.setAttribute("ssdList", componentList.getSsdList());
			request.setAttribute("skinList", componentList.getSkinList());
			request.setAttribute("cpuList", componentList.getCpuList());
			request.setAttribute("hddList", componentList.getHddList());
			request.setAttribute("ramList", componentList.getRamList());
			request.setAttribute("coolerList", componentList.getCoolerList());
			request.setAttribute("mainboardList", componentList.getMainboardList());
			request.setAttribute("gcardList", componentList.getGcardList());
			request.getRequestDispatcher("/WEB-INF/views/recommend/recommendEnroll.jsp").forward(request, response);
		}else {
			// 오류 화면
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
