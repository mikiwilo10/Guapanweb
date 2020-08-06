package ec.edu.ups.AppDis.bussines;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.AppDis.dao.ProductoDao;
import ec.edu.ups.AppDis.model.Pedido;
import ec.edu.ups.AppDis.model.Producto;
import ec.edu.ups.AppDis.model.Proveedor;

@Stateless
public class GestionProducto {

	@Inject
	private ProductoDao daop;
	
	public void crearProducto(Producto p) {
		daop.crearProducto(p);
	}
	
	public void crearProveedor(Proveedor pr) {
		daop.crearProveedor(pr);
	}
	

	
	public void validarPedido(int idproducto,int cantidad) throws Exception {
		
		Producto p=daop.BuscarProducto(idproducto);
		
		if (cantidad>p.getStock()) {
		    System.out.println("La cuenta no tiene fondos no se puede hacer la transaccion");
		} else {

			daop.actualizarStock(idproducto, cantidad);
			Pedido pedido=new Pedido();
			
			pedido.setCantidad(cantidad);
			pedido.setProducto(p);
			
			crearPedido(pedido);
			
		}
		
	}
	
	
	public void crearPedido(Pedido pedido) {
		daop.crearPedido(pedido);
		
		
	}
	
	public List<Producto> ListaProducto(){
		return daop.lsiatrP();
	}
	
	
}
