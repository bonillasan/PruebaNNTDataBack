package com.example.gestionUsuarios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gestionUsuarios.dto.UsuarioDTO;
import com.example.gestionUsuarios.persistencia.UsuarioDAO;
import com.example.gestionUsuarios.response.UsuarioResponse;


/**
 * The Class UsuarioServiceImpl.
 */
/*
 * @author S.A.B
 * @since 16/09/2022
 */
@Service
public class UsuarioServiceImpl implements UsuarioService{

	/** The usuario DAO. */
	@Autowired
	UsuarioDAO usuarioDAO;
	
	
	
	/**
	 * Consultar usuario X filtros.
	 *
	 * @param numeroCedula the numero cedula
	 * @param tipoDoc the tipo doc
	 * @return the usuario response
	 * @throws Exception the exception
	 */
	@Override
	public UsuarioResponse ConsultarUsuarioXFiltros(Integer numeroCedula,String tipoDoc) throws Exception {
		UsuarioResponse respuesta = new UsuarioResponse();
		try {			
			UsuarioDTO consulta = usuarioDAO.ConsultarUsuarioXFiltros(numeroCedula, tipoDoc);
			respuesta.setPrimerNombre(consulta.getPrimerNombre());
			respuesta.setSegundoNombre(consulta.getSegundoNombre());
			respuesta.setPrimerApellido(consulta.getPrimerApellido());
			respuesta.setSegundoApellido(consulta.getSegundoApellido());
			respuesta.setTelefono(consulta.getTelefono());
			respuesta.setDireccion(consulta.getDireccion());
			respuesta.setCiudadResidencia(consulta.getCiudadResidencia());
		}catch (Exception e) {
			throw new Exception(e.getLocalizedMessage(), e.getCause());
		}		
		return respuesta;
	}
}
