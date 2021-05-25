package com.habilidades.habilidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	
@RequestMapping("/habilidades")

public class HabilidadesController {
	
@GetMapping
public String habilidades() {
		return "As habilidades colocadas em pratica na execução dessa tarefa são, persistencia, gerenciamento de tempo e atenção aos detalhes \n as mentalidades são principalmente a de crescimento e foco";
				
}
}
