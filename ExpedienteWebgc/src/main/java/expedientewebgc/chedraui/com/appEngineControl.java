package expedientewebgc.chedraui.com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import expedientewebgc.chedraui.com.cliente.Cliente;
import expedientewebgc.chedraui.com.cliente.Correo;
import expedientewebgc.chedraui.com.cliente.Monedero;
import expedientewebgc.com.cliente.msj.Mensaje;




@SpringBootApplication
@RestController
@RequestMapping("/api")
public class appEngineControl {
		
	private final Logger logger = LoggerFactory.getLogger(this.getClass());		

		public static void main(String[] args) {
			SpringApplication.run(appEngineControl.class, args);
		}

	 
	    @RequestMapping("/greeting")
	    public String greeting() {
	        return "hi controler ";
	    }

	 	@RequestMapping( path = "/segundo",method = RequestMethod.GET)
         public String hello() {
                  return "Hello Spring Boot with restController, I'm on App Engine!!!";
          }
	
	
	
	/**
	 * Operacion de busqueda cliente por correo  y password.
	 * @param correo 
	 * @param password
	 */

	@RequestMapping(path = "/consultaCorreo",
	method = RequestMethod.GET,
	produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Mensaje consultaCorreo(@RequestParam(name = "correo") String correo, @RequestParam(name = "password") String password){
		Mensaje response = new Mensaje();
		
		long inicio = System.currentTimeMillis();
		
		logger.info("Parametros de entrada: valor:"+"|correo"+correo+"|password:"+password);
		logger.trace("Parametros de entrada: valor:"+"|correo"+correo+"|password:"+password);
		
		if (correo != null && !(correo.isEmpty())) {

				if(correo.equals("faraond1@gmail.com")	) {
					
					Cliente clienteFav= new Cliente();
					clienteFav.setApellidoMaterno("aguilar");
					clienteFav.setApellidoMaterno("aguilar");
					clienteFav.setCanal("uno");
					clienteFav.setCompania("chedraui");
					clienteFav.setCurp("auha851230grluv8");
					Correo correoP = new Correo ();
					correoP.setCorreoId("1");
					correoP.setDireccion(correo);
					correoP.setPrincipal(true);
					Correo[] correos = {correoP};
					
				   clienteFav.setCorreos(correos);
				   clienteFav.setDoNotCall(false);
				   clienteFav.setDomicilio("calle escudo nacional");
				   clienteFav.setFacebook("faraon@facebook.com");
				   clienteFav.setFechaNacimiento("30,12,85");
				   clienteFav.setFechaNacimiento("30,12,85");
				   clienteFav.setGenero("masculino");
				   Monedero monedero = new Monedero();
				   monedero.setMonedero("1234567891");
				   monedero.setMonederoId("1234567891");
				   monedero.setPrincipal(true);
				   Monedero[] monederos= {monedero};
				clienteFav.setMonederos(monederos);
				clienteFav.setRfc("auha851230uv8");
				clienteFav.setSegmento("123");
				clienteFav.setTelefonoCasa("1234568749");
				clienteFav.setTelefonoCelular("123456789456");
				clienteFav.setTwitter("hola@twter");
				clienteFav.setTelefonoFax("");
				clienteFav.setTelefonoOtro("");
				clienteFav.setTelefonoTrabajo("1234567891");
					
					response.setAtributoBusqueda("correo");
					response.setCliente(clienteFav);
					
					
				}
					
		}else {
		response = null;
		logger.trace("Tiempo total[" + (System.currentTimeMillis() - inicio) + "]");
		}
		
		logger.info("Tiempo total[" + (System.currentTimeMillis() - inicio) + "]");
		logger.trace("Tiempo total[" + (System.currentTimeMillis() - inicio) + "]");
		return response;
	}
	
	
	
	
	
	@RequestMapping(path = "/consultaCorreo2",
			method = RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
			public  String consultaCorreo2(@RequestParam(name = "correo") String correo, @RequestParam(name = "password") String password){
				Mensaje response = new Mensaje();
				
				long inicio = System.currentTimeMillis();
				
				logger.info("Parametros de entrada: valor:"+"|correo"+correo+"|password:"+password);
				logger.trace("Parametros de entrada: valor:"+"|correo"+correo+"|password:"+password);
				
				if (correo != null && !(correo.isEmpty())) {

						if(correo.equals("faraond1@gmail.com")	) {
							
							Cliente clienteFav= new Cliente();
							clienteFav.setApellidoMaterno("aguilar");
							clienteFav.setApellidoMaterno("aguilar");
							clienteFav.setCanal("uno");
							clienteFav.setCompania("chedraui");
							clienteFav.setCurp("auha851230grluv8");
							Correo correoP = new Correo ();
							correoP.setCorreoId("1");
							correoP.setDireccion(correo);
							correoP.setPrincipal(true);
							Correo[] correos = {correoP};
							
						   clienteFav.setCorreos(correos);
						   clienteFav.setDoNotCall(false);
						   clienteFav.setDomicilio("calle escudo nacional");
						   clienteFav.setFacebook("faraon@facebook.com");
						   clienteFav.setFechaNacimiento("30,12,85");
						   clienteFav.setFechaNacimiento("30,12,85");
						   clienteFav.setGenero("masculino");
						   Monedero monedero = new Monedero();
						   monedero.setMonedero("1234567891");
						   monedero.setMonederoId("1234567891");
						   monedero.setPrincipal(true);
						   Monedero[] monederos= {monedero};
						clienteFav.setMonederos(monederos);
						clienteFav.setRfc("auha851230uv8");
						clienteFav.setSegmento("123");
						clienteFav.setTelefonoCasa("1234568749");
						clienteFav.setTelefonoCelular("123456789456");
						clienteFav.setTwitter("hola@twter");
						clienteFav.setTelefonoFax("");
						clienteFav.setTelefonoOtro("");
						clienteFav.setTelefonoTrabajo("1234567891");
							
							response.setAtributoBusqueda("correo");
							response.setCliente(clienteFav);
							
							
						}
							
				}else {
				response = null;
				logger.trace("Tiempo total[" + (System.currentTimeMillis() - inicio) + "]");
				}
				
				logger.info("Tiempo total[" + (System.currentTimeMillis() - inicio) + "]");
				logger.trace("Tiempo total[" + (System.currentTimeMillis() - inicio) + "]");
				return response.toString();
			}
	

}




