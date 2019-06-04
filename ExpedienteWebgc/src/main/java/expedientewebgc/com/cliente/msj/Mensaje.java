package expedientewebgc.com.cliente.msj;


	

import expedientewebgc.chedraui.com.cliente.Cliente;
import lombok.Getter;
import lombok.Setter;


public class Mensaje {
		
	private String atributoBusqueda;
	
	private Cliente cliente;

	public String getAtributoBusqueda() {
		return atributoBusqueda;
	}

	public void setAtributoBusqueda(String atributoBusqueda) {
		this.atributoBusqueda = atributoBusqueda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Mensaje [atributoBusqueda=" + atributoBusqueda + ", cliente=" + cliente + "]";
	}
	



}



