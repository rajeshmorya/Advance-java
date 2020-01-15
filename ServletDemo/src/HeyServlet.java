

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HeyServlet
 */
@WebServlet("/HeyServlet")
public class HeyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HeyServlet() {
        System.out.println("hey");
        // TODO Auto-generated constructor stub
    }

    public void init(ServletConfig config) throws ServletException {
   	 System.out.println("Hey1");	
    }
    
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		System.out.println("Hey from service");
		/* response.sendRedirect("https://www.google.co.in/search?q="+name); //"http://localhost:8080/LifeCycleMethods/LCTest");
		pw.println("content type :" + request.getContentType());
		pw.println("<br>");
		pw.println(request.getContentLength());
	//	pw.println("<br>");
		pw.println(request.getAttribute(name));
		//pw.println(request.getClass().getName()); 
		//pw.println(response.getClass().getName()); 
*/
	}
	public void destroy() {
		System.out.println("Destroy Hey");
		// Scanner s = new Scanner(System.in);
		// int n = s.nextInt();
		
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

}
