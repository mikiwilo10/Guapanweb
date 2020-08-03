package ec.edu.ups.AppDis.view;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ec.edu.ups.AppDis.bussines.GestionProducto;
import ec.edu.ups.AppDis.model.Producto;

@ManagedBean
public class ProductoBean {

	
	@Inject
	private GestionProducto on;

	private Producto p;

	public Producto getP() {
		return p;
	}

	public void setP(Producto p) {
		this.p = p;
	}
	
	@PostConstruct
	public void init() {
		p =new Producto();
		
	}
	
	
	public void guardarDatos() {
		try {
			on.crearProducto(p);
		} catch (Exception e) {
			// TODO: handle exception
		}
	//	return "hola";
		
	}
	
}
