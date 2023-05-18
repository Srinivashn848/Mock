package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


import dao.Detailsdao;
import dto.Details;

@WebServlet("/Fetchall")
public class FetchAll extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		Detailsdao sao=new Detailsdao();
		List<Details> list=sao.fetchall();
		req.setAttribute("list", list);
		req.getRequestDispatcher("FetchAll.jsp").forward(req, res);
	}
}
