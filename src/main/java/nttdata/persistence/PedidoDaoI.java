package nttdata.persistence;

import java.util.List;

public interface PedidoDaoI {
	
	public List<Pedido> getAllPedidos();

	public Pedido getPedido(int id);

	public void insertPedido(Pedido pedido);

	public void updatePedido(Pedido pedido);

	public void deletePedido(Pedido pedido);
}
