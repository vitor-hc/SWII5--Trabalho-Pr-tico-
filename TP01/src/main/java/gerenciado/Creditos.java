package gerenciado;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Creditos")
public class Creditos extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Instituto Federal de São Paulo - Cubatão</h1>");
		out.println("<h2>Disciplina SISTEMAS WEB I</h2>");
		out.println("<h1>Alunos:</h1>");
		out.println("<h3>VITOR HUGO CHAVES SILVA REIS CB3012115</h3>");
		out.println("<h3>ANTONIO RODRIGUES DANTAS JUNIOR CB3010775</h3>");
		out.println();
		out.println("<a href='index.html'>Inicio</a>");
		out.close();
	}
}
