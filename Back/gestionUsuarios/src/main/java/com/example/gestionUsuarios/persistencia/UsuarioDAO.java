
package com.example.gestionUsuarios.persistencia;

import com.example.gestionUsuarios.dto.UsuarioDTO;
/*
 * @author S.A.B
 * @since 17/09/2022
 */
public interface UsuarioDAO {

	UsuarioDTO ConsultarUsuarioXFiltros(Integer numeroCedula, String tipoDoc) throws Exception;
	
}
