package ec.edu.ups.AppDis.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Producto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 758035316268908568L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_producto;
	
	private String descripcion;
	private int stock;
	private double precio;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_proveedor")
	private Proveedor pro;
	
	@OneToMany(mappedBy="producto")
	private List<Pedido> listapedido;

	public int getId_producto() {
		return id_producto;
	}

	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Proveedor getPro() {
		return pro;
	}

	public void setPro(Proveedor pro) {
		this.pro = pro;
	}

	public List<Pedido> getListapedido() {
		return listapedido;
	}

	public void setListapedido(List<Pedido> listapedido) {
		this.listapedido = listapedido;
	}
	
	
	
}
