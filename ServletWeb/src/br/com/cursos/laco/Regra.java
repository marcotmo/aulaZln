package br.com.cursos.laco;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

public class Regra {
	

	private String parametro1;
	
	private String parametro2;
	
	private String tipoLaco;
	
	
	public Regra(HttpServletRequest request) {
	
			this.parametro1 = request.getParameter("");
		
	}
	
	public String executar() {
		
		if (this.tipoLaco.equals("for")) {
			executarFor();
		}
		
	}
	
	
	private String executarFor() {
		
		List<Integer> resultado = new ArrayList<Integer>();
		
		for (int nro = Integer.parseInt(this.parametro1); nro < Integer.parseInt(this.parametro2); nro++) {
			resultado.add(nro);
		}
		
		writer.write("<html><body>");
		writer.write("Exercicio 03:");
		writer.write("<br>" + laco.toUpperCase());
		for (int item : resExe03) {
			writer.write(" " + item + "<br>");
		}			
		writer.write("</html></body>");
		
	}
	

	public int exercicio01(int nro01, int nro02) {
		
		int maior = 0;
		
		if (nro01 > nro02) {
			maior = nro01 ;
		}
		else if (nro01 < nro02){
			maior = nro02;
		}
		
		return maior;
	}
	
	public List<Integer> exercicio02(int nro01, int nro02) {
		
		List<Integer> resultado = new ArrayList<Integer>();
		
		while (nro01<nro02) {
			resultado.add(nro01);
			nro01++;
		}
		
		return resultado;
	}
	
	public List<Integer> exercicio03(int nro01, int nro02, String tipoLaco) {
		
		List<Integer> resultado = new ArrayList<Integer>();
		
		if (tipoLaco.toUpperCase().contains("WHILE")) {
			while (nro01<nro02) {
				resultado.add(nro01);
				nro01++;
			}
		}
		else if (tipoLaco.toUpperCase().contains("DOWHILE")) {
			do {
				resultado.add(nro01);
				nro01++;
			} while (nro01<nro02);
		}
		else if (tipoLaco.toUpperCase().contains("FOR")) {
			for (int i = nro01; i < nro02; i++) {
				resultado.add(nro01);
			}
		}

		
		return resultado;
	}	
	
}
