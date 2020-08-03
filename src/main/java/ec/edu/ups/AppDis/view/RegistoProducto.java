package ec.edu.ups.AppDis.view;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.AppDis.bussines.GestionProducto;
import ec.edu.ups.AppDis.model.Producto;

@WebServlet("/prodcuto")
public class RegistoProducto   extends HttpServlet{
	
	@Inject
	private GestionProducto on;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("<h1>Hola mundo</h1>");
		
		
		
		try {

			Producto p=new Producto();
			p.setNombre("wilmer");
			p.setApellido("camas");
			p.setEdad("25");
			
			on.crearProducto(p);
		} catch (Exception e) {
			response.getWriter().println("<h1>"+e.getMessage()+"</h1>");
		}
	}

}
