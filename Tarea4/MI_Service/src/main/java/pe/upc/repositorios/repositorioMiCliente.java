package pe.upc.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.upc.entidad.MI_Cliente;

public interface repositorioMiCliente extends JpaRepository<MI_Cliente, Long> {

}
