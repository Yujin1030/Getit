package other.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import other.model.service.OtherService;
import other.model.vo.Other;

/**
 * Servlet implementation class OtherContentServlet
 */
@WebServlet("/other/content")
public class OtherContentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OtherContentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int oProductNo = Integer.parseInt(request.getParameter("oProductNo"));
		Other other = new OtherService().selectOther(oProductNo);
		if(other != null) {
			request.setAttribute("content", other);
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/other/Other_contents2.jsp");
			view.forward(request, response);
		} else {
			request.getRequestDispatcher("/WEB-INF/views/Error.jsp").forward(request, response);
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
