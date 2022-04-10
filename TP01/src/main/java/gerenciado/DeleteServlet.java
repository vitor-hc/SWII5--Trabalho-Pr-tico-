package gerenciado;
/**
 * SWII5- Trabalho Pr�tico 01
*VITOR HUGO CHAVES SILVA REIS CB3012115
*ANTONIO RODRIGUES DANTAS JUNIOR CB3010775
*/
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);
		EmpDao.delete(id);
		response.sendRedirect("ViewServlet");
	}
}