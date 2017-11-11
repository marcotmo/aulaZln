package br.com.cliente.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cliente.dao.ClienteDao;
import br.com.cliente.model.Cliente;


public class BuscaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public BuscaServlet() {
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter outer = response.getWriter();
		outer.write("<html><body>");
		ClienteDao clienteDao = new ClienteDao();
		List<Cliente> clientes= clienteDao.obterTodosClientes();
		outer.write("<ul>");
		for(int x = 0; x < clientes.size(); x++) {
			outer.write("<li>");
			outer.write("Cliente: " + clientes.get(x));
			outer.write("</li>");
		}
		outer.write("</ul>");
		outer.write("</html></body>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
