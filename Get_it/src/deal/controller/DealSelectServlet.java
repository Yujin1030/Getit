package deal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import deal.model.service.DealService;
import deal.model.vo.Deal;

/**
 * Servlet implementation class DealSelectServlet
 */
@WebServlet("/deal/select")
public class DealSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private DealService DealService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DealSelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		int dealNo = Integer.parseInt(request.getParameter("dealNo"));
		Deal deal = new DealService().selectDeal(dealNo);
		
		if (deal != null) {
			request.setAttribute("contents", deal);
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/deal/dealContents.jsp");
			view.forward(request, response);
		} else {
			// 게시물 내용 불러오지못할때 오류코드!
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
