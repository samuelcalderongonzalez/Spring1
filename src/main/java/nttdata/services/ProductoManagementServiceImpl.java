package nttdata.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nttdata.persistence.Producto;
import nttdata.persistence.ProductoDaoI;

@Service
public class ProductoManagementServiceImpl implements ProductoManagementServiceI {

	@Autowired
	private ProductoDaoI productoDao;


	public void insertNewProducto(Producto newProducto) {
		if (newProducto != null) {
			productoDao.insertProducto(newProducto);
		}
	}

	public void updateProducto(Producto updatedProducto) {
		if (updatedProducto != null) {
			productoDao.updateProducto(updatedProducto);
		}
	}

	public void deleteProducto(Producto deletedProducto) {
		if (deletedProducto != null) {
			productoDao.deleteProducto(deletedProducto);
		}
	}

	public List<Producto> searchAll() {
		List<Producto> productos = new ArrayList<Producto>();

		productos = productoDao.getAllProductos();

		return productos;
	}

	public Producto searchProducto(Producto producto) {
		return productoDao.getProducto(producto.getId());
	}

}
