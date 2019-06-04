package expedientewebgc.chedraui.com.cliente;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Cliente {

    private String clienteId;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String fechaNacimiento;
    private String genero;
    private String canal;
    private String telefonoCelular;
    private String telefonoCasa;
    private String telefonoTrabajo;
    private String telefonoOtro;
    private String telefonoFax;
    private String compania;
    private String segmento;
    private String rfc;
    private String curp;
    private String domicilio;
    private String facebook;
    private String twitter;
    private String googlePlus;
    private Boolean doNotCall;
    private Correo[] correos;
    private Monedero[] monederos;
    
    

	
}
