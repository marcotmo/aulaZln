package br.com.cursos.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		PrintWriter writer = response.getWriter();
		if (validacaoLogin) {
			writer.write("<html><body>Login efetuado com sucesso</body></html>");
		} else {
			writer.write("<html><body>Usuario / Senha invalidos</body></html>");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		boolean validacaoLogin = validaUsuario(usuario, senha);

		
		PrintWriter writer = response.getWriter();
		if (validacaoLogin) {
			writer.write("<html><body>Login efetuado com sucesso</body></html>");
		} else {
			writer.write("<html><body>Usuario / Senha invalidos</body></html>");
		}

		
	}
	
	private boolean validaUsuario(String usuario, String senha) {

		String usuarioMoc = "Marco";
		String senhaMoc = "Tulio";
		boolean validacao = false;
		if (usuario.equals(usuarioMoc)) {
			if (senha.equals(senhaMoc)) {
				validacao = true;
			}
			else { validacao = false; }
		}else { validacao = false; }
		
		return validacao;
	}
	
	
	
}
