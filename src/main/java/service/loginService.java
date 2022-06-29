package service;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletContext;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.Account;
import dataaccess.LoginDAO;

@WebServlet("/login")
public class loginService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// forward
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		boolean isAccount = LoginDAO.hasAccount(id, password);
		if (!isAccount) {
			return;
		}
		Account account = new Account("sigma", "password");
		request.setAttribute("account", account); // リクエストスコープ
		RequestDispatcher dispatcher = request.getRequestDispatcher("/test.jsp");
		dispatcher.forward(request, response);
	}
}