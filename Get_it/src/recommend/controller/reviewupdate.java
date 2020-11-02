package product.controller.recommend;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import member.model.vo.Member;
import product.model.service.recommend.RecommendService;

/**
 * Servlet implementation class reviewupdate
 */
@WebServlet("/review/update")
public class reviewupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public reviewupdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		String pCode = request.getParameter("pCode");
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		int result =0;
		if(request.getParameter("reviewNo")!=null&&((Member)session.getAttribute("memeber")!=null)) {
		int reviewNo = Integer.parseInt(request.getParameter("reviewNo"));
		String memberId = ((Member)session.getAttribute("member")).getMemberId(); 
		result = new RecommendService().reviewUpdate(memberId,pCode,title,contents,reviewNo);
		}
		if(result>0) {
			request.setAttribute("pCode", pCode);
			request.getRequestDispatcher("/recommend//recommend/detail").forward(request, response);
		}else {
			response.sendRedirect("서비스요청실패");
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
