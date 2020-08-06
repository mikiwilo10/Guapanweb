package ec.edu.ups.AppDis.service;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.edu.ups.AppDis.bussines.GestionProducto;
import ec.edu.ups.AppDis.model.Producto;

@WebService
public class Soap {

	@Inject
	GestionProducto on;

	@WebMethod
	public void Pedido(int idproducto, int cantidad) throws Exception {
		on.validarPedido(idproducto, cantidad);
	}

//	@WebMethod
//	public List<Producto> ListaProducto() throws Exception {
//
//		List<Producto> lista = on.ListaProducto();
//		for (Producto producto : lista) {
//			System.out.println(producto.getId_producto());
//			System.out.println(producto.getDescripcion());
//			System.out.println(producto.getPrecio());
//			System.out.println(producto.getPro().getNombre());
//
//		}
//		return lista;
//	}
}
