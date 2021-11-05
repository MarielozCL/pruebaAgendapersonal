package com.agendapersonal.demomiagendapersonal.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
@Entity
public class Contacto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcontacto;
	
	@NotBlank
	private String nombrecontacto;
	
	@NotBlank
	private String telefono;
	
	@NotBlank
	private String celular;
	
	
	@NotNull
	@Email
	private String email;
	
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@NotNull
	private LocalDateTime citas;
	
	@NotBlank
	private String tipocontacto;		
	
	@NotBlank
	private String direccion;
	

}
