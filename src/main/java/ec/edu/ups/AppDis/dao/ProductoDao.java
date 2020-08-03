package ec.edu.ups.AppDis.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.AppDis.model.Producto;

@Stateless
public class ProductoDao {

	@PersistenceContext
	private EntityManager em;
	
	public void crearProducto(Producto p) {
		em.persist(p);
		
	}
	
	
	public List<Producto> lsiatrP(){
		
		
		return null;
	}
	
	
}
