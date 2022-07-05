package service;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bean.Account;
import dataaccess.LoginDAO;

/**
 * loginService extends HttpSerblet, forward to logined page.
 * @author tomita
 */
@WebServlet("/login")
public class loginService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * doGet  forward logined page.
	 * @param request HttpServletRequest
	 * @param response HttpServletResponse
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// forward
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		boolean isAccount = LoginDAO.hasAccount(id, password);
		if (!isAccount) {
			return; // login failed
		}
		Account account = new Account(id, password);
		request.setAttribute("account", account); // request scope
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/userpage.jsp");
		dispatcher.forward(request, response);
	}
}