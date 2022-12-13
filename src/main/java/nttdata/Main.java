package nttdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import nttdata.services.PedidoManagementServiceI;
import nttdata.services.ProductoManagementServiceI;

@SpringBootApplication
public class Main implements CommandLineRunner {
	@SuppressWarnings("unused")
	@Autowired
	private PedidoManagementServiceI pedido;
	@SuppressWarnings("unused")
	@Autowired
	private ProductoManagementServiceI producto;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		
	}
	
	public void run(String... args) throws Exception {

	}

}
