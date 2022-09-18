package com.example.gestionUsuarios.controller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("showconsole")
class UsuarioControllerTest {

	private final String URL_BASE = "/api-ms-usuarios/gestion-usuarios";

	@Autowired
	private MockMvc mockMvc;

	@Test
	void testConsultarTiposPapeleriaPorFiltros() throws JsonProcessingException, Exception {
		mockMvc.perform(MockMvcRequestBuilders.post(URL_BASE + "/consultar-usuarios").param("numeroCedula", "23445322")
				.param("tipoDoc", "C")).andReturn();
	}

}
