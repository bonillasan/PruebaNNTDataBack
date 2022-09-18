
package com.example.gestionUsuarios.persistencia;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import com.example.gestionUsuarios.dto.UsuarioDTO;

import lombok.extern.log4j.Log4j2;

/** The Constant log. */
@Log4j2
@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

	/** The personas. */
	private List<UsuarioDTO> personas = null;

	/**
	 * Iniciar.
	 */
	@PostConstruct
	public void iniciar() {
		personas = null;
		personas = new ArrayList<>();
		UsuarioDTO usuario = UsuarioDTO.builder().id(23445322).tipoDoc("C").primerNombre("Santiago")
				.segundoNombre("Alejandro").primerApellido("Bonilla").segundoApellido("Idrobo").telefono("3187708337")
				.direccion("Cra1CE#877").ciudadResidencia("Popayán").build();

		personas.add(usuario);
	}

	/**
	 * Consultar usuario X filtros.
	 *
	 * @param numeroCedula the numero cedula
	 * @param tipoDoc      the tipo doc
	 * @return the usuario DTO
	 * @throws Exception the exception
	 */
	@Override
	public UsuarioDTO ConsultarUsuarioXFiltros(Integer numeroCedula, String tipoDoc) throws Exception {
		log.info("Valores:" + numeroCedula + " " + tipoDoc);
		Integer cedula = numeroCedula;
		try {
			return personas.stream().filter(x -> x.getId().equals(cedula) && x.getTipoDoc().equals(tipoDoc)).findFirst()
					.get();
		} catch (Exception e) {
			throw new Exception(e.getLocalizedMessage(), e.getCause());
		}
	}
}
