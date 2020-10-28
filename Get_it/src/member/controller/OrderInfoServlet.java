package member.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.Member;
import member.OrderList;
import member.service.OrderListService;

/**
 * Servlet implementation class OrderInfoSevlet
 */
@WebServlet("/member/orderInfo")
public class OrderInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderInfoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userId= ((Member)session.getAttribute("member")).getMemberId();

		// 비즈니스 로직, 서비스 클래스 메소드의 매개값으로 넘겨준 후
		ArrayList<OrderList> oList = new OrderListService().selectOrderList(userId);


		// 결과값을 받아서
		if (!oList.isEmpty()) {

			// request 객체에 저장하고 fileList.jsp 에서 사용할 수 있도록 함
			request.setAttribute("oList", oList);
			request.getRequestDispatcher("/WEB-INF/views/member/orderInfo.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("/WEB-INF/views/member/memberError.jsp").forward(request, response);
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
