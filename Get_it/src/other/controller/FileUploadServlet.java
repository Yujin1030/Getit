package other.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import other.model.service.FileService;
import other.model.vo.Other;

/**
 * Servlet implementation class FileUploadServlet
 */
@WebServlet("/file/upload")
public class FileUploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FileUploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int uploadFileSizeLimit = 5*1024*1024;
		String encType = "UTF-8";
		String uploadFilePath = request.getServletContext().getRealPath("/oupload");
		
		MultipartRequest multi = new MultipartRequest(request, uploadFilePath, uploadFileSizeLimit, encType, new DefaultFileRenamePolicy());
		
		File multiFile = multi.getFile("upFile");
		String systemFileName = multi.getFilesystemName("upFile");
		String filePath = multiFile.getPath();
		
		Other other = new Other();
		other.setFilePath(filePath);
		other.setoProductNo(Integer.parseInt(multi.getParameter("product_no")));
		
		int result = new FileService().uploadFile(other, systemFileName);
		if(result > 0) {
			response.sendRedirect("/WEB-INF/views/other/Success.html");
		} else {
			response.sendRedirect("/WEB-INF/views/other/Fail.html");
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
