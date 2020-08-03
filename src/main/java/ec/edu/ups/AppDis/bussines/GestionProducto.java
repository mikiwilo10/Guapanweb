package ec.edu.ups.AppDis.bussines;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.AppDis.dao.ProductoDao;
import ec.edu.ups.AppDis.model.Producto;

@Stateless
public class GestionProducto {

	@Inject
	private ProductoDao daop;
	
	public void crearProducto(Producto p) {
		daop.crearProducto(p);
	}
}
