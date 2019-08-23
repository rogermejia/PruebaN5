package Entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "datos")
public class Datos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_persona")
	private Integer idPersona;

	@Column(name= "nombre")
	private String nombre;
	
	@Column(name= "apellido")
	private String apellido;
	
	@Column(name= "nacimiento")
	private String nacimiento;
	
	@Column(name= "id_genero")
	private Integer idGenero;
	
	
	@Column(name= "correo")
	private String correo;
	
	@JoinColumn(name = "id_genero", referencedColumnName = "id_genero", insertable=false, updatable = false)
    @ManyToOne
    private Genero id_genero;

	public Datos() {
	
	}

	

	public Datos(Integer idPersona, String nombre, String apellido, String nacimiento, Integer idGenero, String correo) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
		this.idGenero = idGenero;
		this.correo = correo;
	}



	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
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

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	

	public Integer getIdGenero() {
		return idGenero;
	}



	public void setIdGenero(Integer idGenero) {
		this.idGenero = idGenero;
	}



	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}



	public Genero getId_genero() {
		return id_genero;
	}



	public void setId_genero(Genero id_genero) {
		this.id_genero = id_genero;
	}


	
}
