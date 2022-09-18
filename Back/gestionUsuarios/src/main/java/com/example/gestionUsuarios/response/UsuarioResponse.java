package com.example.gestionUsuarios.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * @author S.A.B
 * @since 16/09/2022
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String primerNombre;
	
	private String segundoNombre;
	
	private String primerApellido;
	
	private String segundoApellido;

	private String telefono;
	
	private String direccion;
	
	private String ciudadResidencia;
	
	
}
