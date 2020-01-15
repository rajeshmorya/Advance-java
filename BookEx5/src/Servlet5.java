

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet5
 */
@WebServlet("/Servlet5")
public class Servlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.print("<h1><u>getParame:</u></br>");
		String skills= request.getParameter("skills");
		out.print("skills"+skills+"</br>");
		out.print("<u>getPrameterValues:</u></br>");
		String skills1[] = request.getParameterValues("skills");
		out.print("skills"+Arrays.toString(skills1)+"</br>");
		out.print("<u>getParameterMap</u></br>");
		Map map = request.getParameterMap();
		String skills2[] = (String[])map.get("skills");
		out.print("skills"+Arrays.toString(skills2)+"</h1>");
	}

}
