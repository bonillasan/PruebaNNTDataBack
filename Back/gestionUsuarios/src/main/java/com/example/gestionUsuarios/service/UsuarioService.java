package com.example.gestionUsuarios.service;

import com.example.gestionUsuarios.response.UsuarioResponse;

/*
 * @author S.A.B
 * @since 16/09/2022
 */
public interface UsuarioService {

	UsuarioResponse ConsultarUsuarioXFiltros(Integer numeroCedula, String tipoDoc) throws Exception;
}
