package recommend.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import recommend.model.service.RecommendService;
import recommend.model.vo.Component;
import recommend.model.vo.Recommend;

/**
 * Servlet implementation class RecommendDetail
 */
@WebServlet("/recommend/detail")
public class RecommendDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecommendDetail() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		Recommend recommend = new Recommend();
		recommend.setaNo(Integer.parseInt(request.getParameter("aNo")));
		recommend.setPowerCode(request.getParameter("powerCode"));
		recommend.setSsdCode(request.getParameter("ssdCode"));
		recommend.setSkinCode(request.getParameter("skinCode"));
		recommend.setGcardCode(request.getParameter("gcardCode"));
		recommend.setHddCode(request.getParameter("hddCode"));
		recommend.setCoolerCode(request.getParameter("coolerCode"));
		recommend.setRamCode(request.getParameter("ramCode"));
		recommend.setCpuCode(request.getParameter("cpuCode"));
		recommend.setMainboardCode(request.getParameter("mainboardCode"));
		Component component = new RecommendService().recommendOne(recommend);

		if(component!=null) {
			request.setAttribute("recommend", component.getRecommend());
			request.setAttribute("hdd", component.getHdd());
			request.setAttribute("cooler", component.getCooler());
			request.setAttribute("cpu", component.getCpu());
			request.setAttribute("gcard", component.getGcard());
			request.setAttribute("mainboard", component.getMainboard());
			request.setAttribute("power", component.getPower());
			request.setAttribute("ram", component.getRam());
			request.setAttribute("skin", component.getSkin());
			request.setAttribute("ssd", component.getSsd());
			request.getRequestDispatcher("/WEB-INF/views/recommend/recommendDetail.jsp").forward(request, response);
		}else {
			response.sendRedirect("오류페이지~");
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
