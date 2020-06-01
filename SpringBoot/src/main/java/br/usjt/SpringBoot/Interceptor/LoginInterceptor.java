package br.usjt.SpringBoot.Interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter{
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler)

					throws Exception {
		//pega a sessão
		HttpSession session = request.getSession();
		//se ainda não logou, manda para login
		if (session.getAttribute("usuarioLogado") == null)
			response.sendRedirect("login");
		//se já logou, deixa chegar no controller
		return true;
	}
}