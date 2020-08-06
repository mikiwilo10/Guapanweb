package ec.edu.ups.AppDis.view;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.AppDis.bussines.GestionProducto;
import ec.edu.ups.AppDis.model.Pedido;
import ec.edu.ups.AppDis.model.Producto;
import ec.edu.ups.AppDis.model.Proveedor;

@WebServlet("/prodcuto")
public class RegistoProducto   extends HttpServlet{
	
	@Inject
	private GestionProducto on;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println("<h1>Hola mundo</h1>");
		
		
		
		try {

			Producto p=new Producto();
			p.setDescripcion("clavos");;
			p.setPrecio(23.8);
			p.setStock(65);
			
			Producto p2=new Producto();
			p2.setDescripcion("Martillo");;
			p2.setPrecio(9.1);
			p2.setStock(7);
			
			Proveedor pr=new Proveedor();
			pr.setNombre("xavier");
			pr.setApellido("mainato");

			on.crearProveedor(pr);;
			
			p.setPro(pr);
			p2.setPro(pr);
			
			
			on.crearProducto(p);
			on.crearProducto(p2);
			
			
			List<Producto>lista=on.ListaProducto();
			for (Producto producto : lista) {
				System.out.println(producto.getId_producto());
				System.out.println(producto.getDescripcion());
				System.out.println(producto.getPrecio());
				System.out.println(producto.getPro().getNombre());
				

			}

			on.validarPedido(1, 6);
			
		} catch (Exception e) {
			response.getWriter().println("<h1>"+e.getMessage()+"</h1>");
		}
	}

}
