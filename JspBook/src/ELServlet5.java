

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class Person {

	private String firstName;
	private String email;
	private int age;
	private double weight;
	public String getFirstName() 
	{
		return firstName;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	public double getWeight() 
	{
		return weight;
	}
	public void setWeight(double weight) 
	{
		this.weight = weight;
	}

}
@WebServlet("/ELServlet5")
public class ELServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ELServlet5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<Person> list = new ArrayList<Person>();
		Person p1 = new Person();
		p1.setAge(25);
		p1.setEmail("a@a.com");
		p1.setFirstName("amit");
		p1.setWeight(50.23);
		Person p2 = new Person();
		p2.setAge(26);
		p2.setEmail("b@b.com");
		p2.setFirstName("parmit");
		p2.setWeight(55.23);
		list.add(p1);
		list.add(p2);
		request.setAttribute("p", list);
		RequestDispatcher rd = request.getRequestDispatcher("el8.jsp");
		rd.forward(request, response);
	}

}
