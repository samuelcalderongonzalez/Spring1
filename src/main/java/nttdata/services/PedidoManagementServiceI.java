package nttdata.services;

import java.util.List;

import nttdata.persistence.Pedido;

public interface PedidoManagementServiceI {
	public void insertNewPedido(final Pedido newPedido);

	public void updatePedido(final Pedido updatedPedido);

	public void deletePedido(final Pedido deletedPedido);

	public Pedido searchPedido(final Pedido pedido);

	public List<Pedido> searchAll();
}
