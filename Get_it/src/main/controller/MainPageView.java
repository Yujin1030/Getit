package main.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.model.service.MainService;
import main.model.vo.MainList;
import recommend.model.vo.Recommend;

/**
 * Servlet implementation class MainPageView
 */
@WebServlet("/mainpage/view")
public class MainPageView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainPageView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 넘겨받은 파라미터 값 인코딩 처리
		request.setCharacterEncoding("utf-8");
		// 화면에 넘겨줄 완제품, 조립부품, 기타부품, 중고거래 데이터 불러오기
		// MainList에는 위에 해당되는 데이터리스트를 멤버변수로 가지고 있음
		MainList mainList = new MainService().selectMain();
		int recomSize = mainList.getRecommendList().size();
//		if(mainList!=null) {
			request.setAttribute("recomSize", recomSize);
			request.setAttribute("recommendList", mainList.getRecommendList());
//			request.setAttribute("dealList", mainList.getDealList());
//			request.setAttribute("otherList", mainList.getOtherList());
//			request.setAttribute("componentList", mainList.getComponentList());
		request.getRequestDispatcher("/WEB-INF/views/main/index.jsp").forward(request, response);
//		}else {
//			response.sendRedirect("페이지 요청 실패");
//		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
