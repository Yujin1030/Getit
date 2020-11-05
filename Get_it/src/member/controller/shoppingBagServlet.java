package member.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.service.MemberService;
import member.vo.Member;
import member.vo.ShoppingBag;

/**
 * Servlet implementation class shoppingBagServlet
 */
@WebServlet("/member/shoppingbag")
public class shoppingBagServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public shoppingBagServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String userId= request.getParameter("userId");

		ArrayList<ShoppingBag> sList = new MemberService().shoppingList(userId);
		
		HttpSession session = request.getSession();
		Member member = (Member)session.getAttribute("member");
		
		System.out.println("fsafffffffffffffffffffffffffffffffffffffffffffffffff"+userId);
		
		if(!sList.isEmpty()) {
			request.setAttribute("sList", sList);
			request.setAttribute("member", member);
			request.getRequestDispatcher("/WEB-INF/views/member/basket.jsp").forward(request, response);
			
		}else {
			request.setAttribute("sList", sList);
			request.setAttribute("member", member);
			request.getRequestDispatcher("/WEB-INF/views/member/basket.jsp").forward(request, response);
			//request.getRequestDispatcher("/WEB-INF/views/member/memberError.html").forward(request, response);
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
