package nttdata.persistence;

import java.util.List;

public interface ProductoDaoI {
	public List<Producto> getAllProductos();

	public Producto getProducto(int id);

	public void insertProducto(Producto producto);

	public void updateProducto(Producto producto);

	public void deleteProducto(Producto producto);
}
