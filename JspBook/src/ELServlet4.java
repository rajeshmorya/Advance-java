

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ELServlet4
 */
@WebServlet("/ELServlet4")
public class ELServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ELServlet4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		HashMap map1 = new HashMap();
		map1.put("name", "amit");
		map1.put("age",25);
		map1.put("add","knw");
		HashMap map2 = new HashMap();
		map2.put("name", "parmit");
		map2.put("age", 26);
		map2.put("add", "indore");
		map2.put("mob", 2356478);
		list.add(map1);
		list.add(map2);
		request.setAttribute("msg", list);
		RequestDispatcher rd = request.getRequestDispatcher("el7.jsp");
		rd.forward(request,response);
	}
}
