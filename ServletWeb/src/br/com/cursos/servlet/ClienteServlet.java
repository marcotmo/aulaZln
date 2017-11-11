package br.com.cursos.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init() throws ServletException{
		//loadClientes();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String filtro = request.getParameter("filtro");
		List<String> resultado = filtrarClientes(filtro);
		
		PrintWriter writer = response.getWriter();
		writer.write("<html><body>");
		writer.write("<ul>");
		for (String item : resultado) {
			writer.write("<li>" + item + "</li>");
		}
		writer.write("</ul>");
		writer.write("</html></body>");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req, resp);
	}
	
	private List<String> filtrarClientes(String nomeFiltro) {
		
		List<String> clientes = new ArrayList<String>();
		List<String> listaFiltrada = new ArrayList<String>();
		
		clientes.add("Alan");
		clientes.add("Mundim");
		clientes.add("Alexsandro");
		clientes.add("Maelzim");
		clientes.add("Lennin");
		clientes.add("Lucas");
		
		if (nomeFiltro != null && !nomeFiltro.equals("")) {
			for (String cliente : clientes) {
				if(cliente.toUpperCase().contains(nomeFiltro.toUpperCase()))
					listaFiltrada.add(cliente);
			}			
		}else {
			listaFiltrada = clientes;
		}
		
		return listaFiltrada;
	}

}
