package com.example.gestionUsuarios.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.gestionUsuarios.response.UsuarioResponse;
import com.example.gestionUsuarios.service.UsuarioService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/*
 * @author S.A.B
 * @since 16/09/2022
 */
@Api("Usuarios")
@RestController
@RequestMapping("/api-ms-usuarios/gestion-usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	/**
	 * Consultar tipos papeleria por filtros.
	 *
	 * @param numeroCedula the numero cedula
	 * @return the response entity
	 * @throws Exception the exception
	 */
	@ApiOperation(value = "Consultar usuarios por id", notes = "Método para consultar usuarios segun su id", nickname = "consultarUsuarioXFiltros")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Se realiza la consulta correctamente", response = UsuarioResponse.class),
			@ApiResponse(code = 404, message = "Error en la consulta") })
	@GetMapping(value = "/consultar-usuarios",  produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<UsuarioResponse> consultarUsuarioXFiltros(@RequestParam Integer numeroCedula, @Valid @RequestParam String tipoDoc) throws Exception {
		return new ResponseEntity<>(usuarioService.ConsultarUsuarioXFiltros(numeroCedula, tipoDoc), HttpStatus.OK);
	}
}
