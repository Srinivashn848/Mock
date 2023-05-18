package controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.Detailsdao;
import dto.Details;


@WebServlet("/FetchId")
public class FetchId extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("empid"));
		Detailsdao s2=new Detailsdao();
		Details s=s2.find(id);
		
		if(s==null)
		{
			res.setContentType("text/html");
			res.getWriter().print("<h1> No data found with empid:"+id+"</h1>");
			req.getRequestDispatcher("Home.html").include(req, res);
		}
		else{
			List<Details> list=new ArrayList<Details>();
			list.add(s);
			req.setAttribute("list", list);
			req.getRequestDispatcher("FetchAll.jsp").forward(req, res);
		}
	}
}

