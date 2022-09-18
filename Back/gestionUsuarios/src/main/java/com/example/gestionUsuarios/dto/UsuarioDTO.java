package com.example.gestionUsuarios.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * The Class UsuarioDTO.
 *
 * @author S.A.B
 */


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

	/** The primer nombre. */
	private String primerNombre;
	
	/** The segundo nombre. */
	private String segundoNombre;
	
	/** The primer apellido. */
	private String primerApellido;
	
	/** The segundo apellido. */
	private String segundoApellido;

	/** The id. */
	private Integer id;
	
	/** The tipo doc. */
	private String tipoDoc;

	/** The telefono. */
	private String telefono;
	
	/** The direccion. */
	private String direccion;
	
	/** The ciudad residencia. */
	private String ciudadResidencia;
}
