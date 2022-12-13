package nttdata.services;

import java.util.List;

import nttdata.persistence.Producto;

public interface ProductoManagementServiceI {

	public void insertNewProducto(final Producto newProducto);

	public void updateProducto(final Producto updatedProducto);

	public void deleteProducto(final Producto deletedProducto);

	public Producto searchProducto(final Producto producto);

	public List<Producto> searchAll();
}
