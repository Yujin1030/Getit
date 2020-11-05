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

/**
 * Servlet implementation class shoppingBagPayServlet
 */
@WebServlet("/memeber/shoppingPay")
public class shoppingBagPayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public shoppingBagPayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String userId= request.getParameter("userId");
		
		// 장바구니 거치고 결제
		 HttpSession session = request.getSession(); 
		 String address=((Member)session.getAttribute("member")).getAddress();
		 String detailAddress =((Member)session.getAttribute("member")).getDetailAddress();
		 String zipcode =((Member)session.getAttribute("member")).getZipcode();
		 
		 StringBuilder sb = new StringBuilder();
		 sb.append(address);
		 sb.append(detailAddress);
		 sb.append(zipcode);
		 
		 // 배송주소
		 sb.toString(); 
		 // 상품코드
		 String pCode = request.getParameter("pCode");
		 // 총 금액
		 int allPrice = Integer.parseInt(request.getParameter("allPrice"));
		 // 결과값 받기
		 int result = new MemberService().shoppingPayInsert(sb,userId,pCode,allPrice);
		 if(result>0) {
			
			 response.setContentType("text/html; charset=UTF-8");
				PrintWriter writer = response.getWriter();
				writer.println("<script>alert('결제가 완료 되었습니다.'); location.href='/WEB-INF/views/member/orderInfo.jsp';</script>"); 
				writer.close();
			 
		 }else {
			 response.setContentType("text/html; charset=UTF-8");
				PrintWriter writer = response.getWriter();
				writer.println("<script>alert('결제 실패! 다시 시도해주세요.'); location.href='/basket.jsp';</script>"); 
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
