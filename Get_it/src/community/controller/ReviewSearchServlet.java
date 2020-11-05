package community.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import community.service.CommunityService;
import community.vo.PageData;
import community.vo.Review;

/**
 * Servlet implementation class ReviewSearchServlet
 */
@WebServlet("/review/search")
public class ReviewSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int currentPage = 0;
		if(request.getParameter("currentPage") == null) {
			currentPage = 1;
		} else {
			currentPage = Integer.parseInt(request.getParameter("currentPage"));
		}
		String search = request.getParameter("search1");
		PageData pageData = new CommunityService().reviewSearch(search, currentPage);
		ArrayList<Review> nList = pageData.getPageList();
		if(!nList.isEmpty()) {
			request.setAttribute("list", nList);
			request.setAttribute("pageNavi", pageData.getPageReNavi());
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/community/reviewSearch.jsp");
			view.forward(request, response);
		} else {
			request.getRequestDispatcher("/WEB-INF/views/community/error.html").forward(request, response);
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
