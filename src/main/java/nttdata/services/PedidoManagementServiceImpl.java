package nttdata.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nttdata.persistence.Pedido;
import nttdata.persistence.PedidoDaoI;


@Service
public class PedidoManagementServiceImpl implements PedidoManagementServiceI {
	@Autowired
	private PedidoDaoI pedidoDao;


	public void insertNewPedido(Pedido newPedido) {
		if (newPedido != null) {
			pedidoDao.insertPedido(newPedido);
		}
	}

	public void updatePedido(Pedido updatedPedido) {
		if (updatedPedido != null) {
			pedidoDao.updatePedido(updatedPedido);
		}
	}

	public void deletePedido(Pedido deletedPedido) {
		if (deletedPedido != null) {
			pedidoDao.deletePedido(deletedPedido);
		}
	}

	public List<Pedido> searchAll() {
		List<Pedido> pedido = new ArrayList<Pedido>();

		pedido = pedidoDao.getAllPedidos();

		return pedido;
	}

	public Pedido searchPedido(Pedido pedido) {
		return pedidoDao.getPedido(pedido.getId());
	}

}
