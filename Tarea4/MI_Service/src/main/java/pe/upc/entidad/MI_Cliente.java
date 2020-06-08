package pe.upc.entidad;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TP_CLIENTE")
public class MI_Cliente {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CODIGO_CLIENTE")
	private Long codigo;
	@Column(unique = true, length = 20)
	private String contrasena;
	@Column(length = 20)
	private String nombre;
	@Column(length = 20)
	private String apellido;
	@Column(length = 20)
	private String distrito;
	@Column(length = 20)
	private String numero;
	@Column(unique = true, length = 20)
	private String correo;
	
	
	public MI_Cliente(Long codigo, String contrasena, String nombre, String apellido, String distrito, String numero,
			String correo) {
		super();
		this.codigo = codigo;
		this.contrasena = contrasena;
		this.nombre = nombre;
		this.apellido = apellido;
		this.distrito = distrito;
		this.numero = numero;
		this.correo = correo;
	}

	public MI_Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MI_Cliente other = (MI_Cliente) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

	
	
