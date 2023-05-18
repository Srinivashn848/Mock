package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Detailsdao;
import dto.Details;

@WebServlet("/FetchName")
public class FetchName extends HttpServlet{

	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("name");
		
		Detailsdao sao=new Detailsdao();
		List<Details> l=sao.fetchall();
		List<Details> list =new ArrayList<Details>();
		
		for(Details e:l)
		{
			if(name.equals(e.getName()))
				list.add(e);
		}
		
		if(list.size()==0)
		{
			res.getWriter().print("<h1 style='color:red'>No data Found with name "+name+"</h1>");
			req.getRequestDispatcher("Home.html").include(req, res);
		}
		else
		{
			req.setAttribute("list", list);
			req.getRequestDispatcher("FetchAll.jsp").forward(req, res);
		}
	}
}
