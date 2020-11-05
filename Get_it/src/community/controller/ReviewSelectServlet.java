package community.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import community.service.CommunityService;
import community.vo.PageData;
import community.vo.Review;
import community.vo.ReviewCom;
import member.service.MemberService;
import member.vo.Member;

/**
 * Servlet implementation class ReviewSelectServlet
 */
@WebServlet("/review/select")
public class ReviewSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewSelectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		String memberId = ((Member)session.getAttribute("member")).getMemberId();
		
		int reviewNo = Integer.parseInt(request.getParameter("reviewNo"));
		Review review = new CommunityService().selectReview(reviewNo);
//		ArrayList<ReviewCom> reviewCom = new CommunityService().selectReviewCom(reviewNo);
		Member member = new MemberService().selectMember(memberId);
		
		int currentPage = 0;
		if(request.getParameter("currentPage") == null) {
			currentPage = 1;
		} else { 
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		
		PageData pageData = new CommunityService().selectReviewCom(currentPage, reviewNo);
		ArrayList<ReviewCom> list = pageData.getPageComList();
		
		if(review != null) {
			request.setAttribute("contents", review);
			request.setAttribute("list", list);
			request.setAttribute("pageComNavi", pageData.getPageComNavi());
			session.setAttribute("member", member);
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/community/review_contents.jsp");
			view.forward(request, response);
		} else {
			RequestDispatcher view = request.getRequestDispatcher("/WEB/-INF/views/community/error.html");
			view.forward(request, response);
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
