package ec.edu.ups.AppDis.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.AppDis.model.Pedido;
import ec.edu.ups.AppDis.model.Producto;
import ec.edu.ups.AppDis.model.Proveedor;

@Stateless
public class ProductoDao {

	@PersistenceContext
	private EntityManager em;
	
	public void crearProducto(Producto p) {
		em.persist(p);
		
	}
	
	public Producto BuscarProducto (int idproducto) {
		return em.find(Producto.class,idproducto);
	}
	
	public void crearProveedor(Proveedor pr) {
		em.persist(pr);
		
	}
	
	public void crearPedido(Pedido pe) {
		em.persist(pe);
		
	}
	
	
	public List<Producto> lsiatrP(){
		
		String jpql = "SELECT p FROM Producto p";
    	//System.out.println(jpql);

    	Query q = em.createQuery(jpql, Producto.class);
    	 
    	//q.setParameter("cedula", cedula +"%");
    	return q.getResultList();
		//return null;
	}
	
	
	public void actualizarStock(int idCuenta, int cantidad) throws Exception {

		String jpql = "UPDATE Producto p SET p.stock = p.stock-" + cantidad + " WHERE id_producto='" + idCuenta + "'";

		Query query = em.createQuery(jpql);
		query.executeUpdate();

	}
	
}
