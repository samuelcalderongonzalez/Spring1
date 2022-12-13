package nttdata.persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Producto")
public class Producto extends AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String nombre;
	private double pvp;
	private double sinImpuestos;
	private Pedido pedido;

	public Producto(String nombre, double sinImpuestos, Pedido pedido) {
		super();
		this.nombre = nombre;
		if(pedido.getLugarDestino().equalsIgnoreCase("Ceuta") || pedido.getLugarDestino().equalsIgnoreCase("Melilla") || pedido.getLugarDestino().equalsIgnoreCase("Canarias")) {
			this.pvp = sinImpuestos * 1.04;
		} else {
			this.pvp = sinImpuestos * 1.21;
		}
		
		this.sinImpuestos = sinImpuestos;
		this.pedido = pedido;
	}
	
	public Producto(String nombre, double sinImpuestos) {
		this.nombre = nombre;
		this.sinImpuestos = sinImpuestos;

	}

	public Producto() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "pvp")
	public double getPvp() {
		return pvp;
	}

	public void setPvp() {
		if(this.pedido.getLugarDestino().equalsIgnoreCase("Ceuta") || this.pedido.getLugarDestino().equalsIgnoreCase("Melilla") || this.pedido.getLugarDestino().equalsIgnoreCase("Canarias")) {
			this.pvp = sinImpuestos * 1.04;
		} else {
			this.pvp = sinImpuestos * 1.21;
		}
	}

	@Column(name = "sinImpuestos")
	public double getSinImpuestos() {
		return sinImpuestos;
	}

	public void setSinImpuestos(double sinImpuestos) {
		this.sinImpuestos = sinImpuestos;
	}
	
	@ManyToOne
	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", pvp=" + pvp + ", sinImpuestos=" + sinImpuestos + "]";
	}

	

}
