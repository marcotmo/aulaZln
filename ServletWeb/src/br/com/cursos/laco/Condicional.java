package br.com.cursos.laco;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Condicional extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void init() throws ServletException{
		//loadClientes();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String numInicial = request.getParameter("numInicial");
		String numFinal = request.getParameter("numFinal");	
		String num01 = request.getParameter("num01");
		String num02 = request.getParameter("num02");
		String laco = request.getParameter("numFinal");	
		
		if (num01!=null && num02!=null) {
			Regra exe01 = new Regra();
			int resExe01 = exe01.exercicio01(Integer.parseInt(num01), Integer.parseInt(num02));
			
			PrintWriter writer = response.getWriter();
			writer.write("<html><body>");
			writer.write("Exercicio 01:<br>");
			writer.write("O numero maior eh " + resExe01);
			writer.write("</html></body>");
		}else if ((numInicial!=null) && (numFinal!=null)) {
			Regra exe02 = new Regra();
			List<Integer> resExe02 = exe02.exercicio02(Integer.parseInt(numInicial), Integer.parseInt(numFinal));
			
			PrintWriter writer = response.getWriter();
			writer.write("<html><body>");
			writer.write("Exercicio 02:<br>");
			for (int item : resExe02) {
				writer.write(" " + item + "<br>");
			}			
			writer.write("</html></body>");
		}else if (numInicial!=null && numFinal!=null && laco!=null) {
			Regra exe03 = new Regra();
			List<Integer> resExe03 = exe03.exercicio03(Integer.parseInt(numInicial), Integer.parseInt(numFinal), laco);
			
			PrintWriter writer = response.getWriter();
			writer.write("<html><body>");
			writer.write("Exercicio 03:");
			writer.write("<br>" + laco.toUpperCase());
			for (int item : resExe03) {
				writer.write(" " + item + "<br>");
			}			
			writer.write("</html></body>");
		}			
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
