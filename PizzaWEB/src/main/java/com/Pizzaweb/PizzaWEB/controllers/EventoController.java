package com.Pizzaweb.PizzaWEB.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoController {
	
	@RequestMapping("/CadastrarEvento")
	public String form() {
		return"evento/formEvento";
	}
}
