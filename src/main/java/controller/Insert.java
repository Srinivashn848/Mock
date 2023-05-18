package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.Detailsdao;

import dto.Details;

@WebServlet("/insert data")
	public class Insert extends GenericServlet{
		@Override
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
			Details s=new Details();
			s.setId(Integer.parseInt(req.getParameter("id")));
			s.setName(req.getParameter("name"));
			s.setMobile_Number(Long.parseLong(req.getParameter("mobile")));
		Detailsdao s1=new Detailsdao();
		s1.save(s);
		res.getWriter().print("<h1>data saved successfully</h1>");
		req.getRequestDispatcher("Home.html").include(req, res);
		}
		}

		
