package com.denisecastro.aplicacaoweb.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Primeira classe do projeto criada

@RestController
@RequestMapping(value="/categorias")//Endpoint
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST está funcionando.";
	}
}
