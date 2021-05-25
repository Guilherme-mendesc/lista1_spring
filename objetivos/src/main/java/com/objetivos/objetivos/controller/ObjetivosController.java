package com.objetivos.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {
	
	@GetMapping
	public String objetivos() {
		return "Os objetivo de aprendizagem da semana estão concontrados em: \n manter o foco, dedicar-se mais a execução das tarefas e gerencias melhor o tempo";
	}
}
