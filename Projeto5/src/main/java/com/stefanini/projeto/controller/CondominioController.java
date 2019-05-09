package com.stefanini.projeto.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.stefanini.projeto.exception.TreinaException;
import com.stefanini.projeto.model.Condominio;
import com.stefanini.projeto.service.CondominioService;

@CrossOrigin
@Controller
@RequestMapping(value = "/condominio")
public class CondominioController {

	@Autowired
	private CondominioService service;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Condominio> findAll() throws TreinaException {
		return service.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/salvar", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Condominio salvar(@RequestBody Condominio condominio) throws TreinaException {
		service.salvar(condominio);
		return condominio;
	}
	@RequestMapping(method = RequestMethod.DELETE, path = "/deletar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void excluir(@PathParam("id")long id) throws TreinaException {
		service.excluir(id);
	}
	
}