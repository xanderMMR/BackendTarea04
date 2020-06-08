package pe.upc.servicio;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.upc.entidad.MI_Cliente;
import pe.upc.repositorios.repositorioMiCliente;


@Service
public class servicioRegistrar {
	
	@Autowired
	repositorioMiCliente repositorioCliente;

	
	@Transactional(rollbackFor = Exception.class)
	public MI_Cliente mostrarCliente(Long codigo) throws Exception{
		MI_Cliente cliente = repositorioCliente.findById(codigo).orElseThrow(() -> new Exception("No se encontro entidad"));
		return cliente;
	}
	
	@Transactional(rollbackFor = Exception.class)
	public MI_Cliente registrarCliente(MI_Cliente cliente) {
		return repositorioCliente.save(cliente);
	}

	


}


