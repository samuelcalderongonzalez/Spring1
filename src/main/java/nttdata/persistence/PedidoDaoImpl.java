package nttdata.persistence;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PedidoDaoImpl implements PedidoDaoI {
	@Autowired
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public List<Pedido> getAllPedidos() {
		Session session = entityManager.unwrap(Session.class);
		return (List<Pedido>) session.createQuery("FROM Pedido").list();
	}

	public Pedido getPedido(int id) {
		Session session = entityManager.unwrap(Session.class);

		return session.get(Pedido.class, id);
	}

	public void insertPedido(Pedido pedido) {
		Session session = entityManager.unwrap(Session.class);

		session.save(pedido);
		session.getTransaction().commit();
	}

	public void updatePedido(Pedido pedido) {
		Session session = entityManager.unwrap(Session.class);

		session.saveOrUpdate(pedido);
		session.getTransaction().commit();
	}

	public void deletePedido(Pedido pedido) {
		Session session = entityManager.unwrap(Session.class);

		session.delete(pedido);
		session.getTransaction().commit();
	}

}
