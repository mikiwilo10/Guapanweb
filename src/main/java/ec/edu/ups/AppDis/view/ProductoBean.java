package ec.edu.ups.AppDis.view;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ec.edu.ups.AppDis.bussines.GestionProducto;
import ec.edu.ups.AppDis.model.Pedido;
import ec.edu.ups.AppDis.model.Producto;

@ManagedBean
public class ProductoBean {

	
	@Inject
	private GestionProducto on;

	private Producto p;
	private List<Producto>lista;
	
	private Pedido pedido;
	
	private int cantidad;
	private int idp;

	
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getIdp() {
		return idp;
	}

	public void setIdp(int idp) {
		this.idp = idp;
	}

	public Producto getP() {
		return p;
	}

	public void setP(Producto p) {
		this.p = p;
	}
	
	
	
	
	public List<Producto> getLista() {
		return lista;
	}

	public void setLista(List<Producto> lista) {
		this.lista = lista;
	}

	@PostConstruct
	public void init() {
		p =new Producto();
		listar();
		
	}
	
	
	public String guardarDatos() {
		try {
			on.crearProducto(p);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "listar";
		
	}
	
	
	public void listar() {
		lista=on.ListaProducto();
	}
	
	  public String redirigeCrearRetiro(String idCuenta){
	         
	         System.out.println("Redirigir:"+idCuenta);
	        return "Pedido?faces-redirect=true&idCuenta="+idCuenta;
	    }
	  
	  
	public void Pedido() throws Exception {
		on.validarPedido(idp,cantidad);
	}
	
}
