package nttdata.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Pedido")
public class Pedido extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String destinatario;
	private String direccionEntrega;
	private String lugarDestino;
	private List<Producto> productos;
	
	public Pedido(String destinatario, String direccionEntrega, String lugarDestino, List<Producto> productos) {
		super();
		this.destinatario = destinatario;
		this.direccionEntrega = direccionEntrega;
		this.lugarDestino = lugarDestino;
		this.productos = productos;
	}

	public Pedido() {
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Column(name="destinatario")
	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	@Column(name="direccionEntrega")
	public String getDireccionEntrega() {
		return direccionEntrega;
	}

	public void setDireccionEntrega(String direccionEntrega) {
		this.direccionEntrega = direccionEntrega;
	}
	@Column(name="lugarDestino")
	public String getLugarDestino() {
		return lugarDestino;
	}

	public void setLugarDestino(String lugarDestino) {
		this.lugarDestino = lugarDestino;
	}
	
	@OneToMany
	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", destinatario=" + destinatario + ", direccionEntrega=" + direccionEntrega
				+ ", lugarDestino=" + lugarDestino + "]";
	}
	
	
}
