package nttdata.persistence;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class ProductoDaoImpl implements ProductoDaoI {
	@Autowired
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Producto> getAllProductos() {
		Session session = entityManager.unwrap(Session.class);

		return (List<Producto>) session.createQuery("FROM Producto").list();
	}

	public Producto getProducto(int id) {
		Session session = entityManager.unwrap(Session.class);

		return session.get(Producto.class, id);
	}

	public void insertProducto(Producto producto) {
		Session session = entityManager.unwrap(Session.class);

		session.save(producto);
		session.getTransaction().commit();
	}

	public void updateProducto(Producto producto) {
		Session session = entityManager.unwrap(Session.class);

		session.saveOrUpdate(producto);
		session.getTransaction().commit();
	}

	public void deleteProducto(Producto producto) {
		Session session = entityManager.unwrap(Session.class);

		session.delete(producto);
		session.getTransaction().commit();
	}


}
