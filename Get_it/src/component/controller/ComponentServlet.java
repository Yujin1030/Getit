package component.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import component.service.ComponentService;
import component.vo.COOLER;
import component.vo.CPU;
import component.vo.GCARD;
import component.vo.HDD;
import component.vo.POWER;
import component.vo.RAM;
import component.vo.SKIN;
import component.vo.SSD;

@WebServlet("/getit/self")
public class ComponentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ComponentService ComponentService;
    public ComponentServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		ArrayList<CPU> cpuList = new ComponentService().cpuAllList();
		ArrayList<COOLER> coolerList = new ComponentService().coolerAllList();
		ArrayList<GCARD> gcardList = new ComponentService().gcardAllList();
		ArrayList<HDD> hddList = new ComponentService().hddAllList();
//		ArrayList<MainBoard> mainboardList = new ComponentService().mainboardAllList();
		ArrayList<POWER> powerList = new ComponentService().powerAllList();
		ArrayList<RAM> ramList = new ComponentService().ramAllList();
		ArrayList<SKIN> skinList = new ComponentService().skinAllList();
		ArrayList<SSD> ssdList = new ComponentService().ssdAllList();
		if( !( cpuList.isEmpty() && ssdList.isEmpty() && coolerList.isEmpty() 
				&& gcardList.isEmpty() && hddList.isEmpty() && powerList.isEmpty() 
				&& ramList.isEmpty() && skinList.isEmpty() ) ) {
			request.setAttribute("cpuList", cpuList);
			request.setAttribute("coolerList", coolerList); 
			request.setAttribute("gcardList", gcardList); 
			request.setAttribute("hddList", hddList); 
//			request.setAttribute("ssdList", mainboardList); 대기
			request.setAttribute("powerList", powerList); 
			request.setAttribute("ramList", ramList); 
			request.setAttribute("skinList", skinList); 
			request.setAttribute("ssdList", ssdList); 
			request.getRequestDispatcher("/WEB-INF/Component/ComponentModal.jsp").forward(request, response);
		}else {
			System.out.println("엄 ...");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
