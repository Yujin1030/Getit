package adminPage.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import adminPage.service.AdminService;
import adminPage.vo.OrderM;
import member.service.MemberService;
import member.vo.Member;
import member.vo.OrderList;

/**
 * Servlet implementation class depositWaitingServlet
 */
@WebServlet("/admin/deopositWaiting")
public class depositWaitingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public depositWaitingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		/*
		 * HttpSession session = request.getSession(); String userId = ((Member)
		 * session.getAttribute("member")).getMemberId();
		 */

		ArrayList<OrderM> dList = new AdminService().depositSearch();
		System.out.println(dList);

		if (!dList.isEmpty()) {
			request.setAttribute("dList", dList);
			request.getRequestDispatcher("/WEB-INF/views/admin/depositWaiting.jsp").forward(request, response);

		} else {
			request.getRequestDispatcher("/WEB-INF/views/admin/depositWaiting.jsp").forward(request, response);
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
