package member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.service.MemberService;
import member.vo.Member;
import member.vo.OrderList;

/**
 * Servlet implementation class changeSendServlet
 */
@WebServlet("/member/changeSend")
public class changeSendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public changeSendServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		OrderList orderList = new OrderList();
		orderList.setOrderNo(Integer.parseInt(request.getParameter("orderNo")));
		orderList.setChangeA(Integer.parseInt(request.getParameter("pAccount")));
		String changeRE = request.getParameter("changeRE");
		
		if(changeRE.equals("mdelivery")) {
			orderList.setChangeRE("판매자의 오배송으로 인한 교환신청");
			
		}else if(changeRE.equals("diff")) {
			orderList.setChangeRE("상품이 설명과 다름");
			
		}else if(changeRE.equals("faulty")) {
			orderList.setChangeRE("상품 파손 및 불량품 배송");
			
		}
		
		
		
		int result = new MemberService().updateChange(orderList);
		
		if(result>0) {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter writer = response.getWriter();
			writer.println("<script>alert('교환신청이 완료 되었습니다.'); location.href='/mainpage/view';</script>"); 
			writer.close();
		/*request.getRequestDispatcher("/WEB-INF/views/main/index.jsp").forward(request, response);*/
		
	}
	else {
		request.getRequestDispatcher("/WEB-INF/views/member/memberError.html").forward(request, response);
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter writer = response.getWriter();
		writer.println("<script>alert('교환 실패! 고객센터로 연락주세요.'); location.href='/mainpage/view';</script>"); 
		writer.close();
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
