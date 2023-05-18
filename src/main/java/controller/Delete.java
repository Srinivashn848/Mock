package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Detailsdao;



	@WebServlet("/delete")
	public class Delete extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		Detailsdao sao=new Detailsdao();
		sao.delete(id);
		res.getWriter().print("<h1>Deleted Successfully</h1>");
		req.setAttribute("list", sao.fetchall());
		req.getRequestDispatcher("Fetchall.jsp").include(req, res);
	}
		}

