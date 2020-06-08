package pe.upc.rest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import pe.upc.entidad.MI_Cliente;

import pe.upc.servicio.servicioRegistrar;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class RegistroRest {

	@Autowired
	servicioRegistrar servicioRegistro;
		
	
	@PostMapping("/registrarcliente")
	public MI_Cliente registrarCliente(@RequestBody MI_Cliente cliente){
		MI_Cliente c = null;
		try {
			c = servicioRegistro.registrarCliente(cliente);
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Imposible de concretar");
		}
		return c;
	}
	
	
}
