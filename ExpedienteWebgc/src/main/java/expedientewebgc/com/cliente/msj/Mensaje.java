package expedientewebgc.com.cliente.msj;


	

import expedientewebgc.chedraui.com.cliente.Cliente;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Mensaje {
		
	private String atributoBusqueda;
	
	private Cliente cliente;



	@Override
	public String toString() {
		return "Mensaje [atributoBusqueda=" + atributoBusqueda + ", cliente=" + cliente + "]";
	}
	



}



