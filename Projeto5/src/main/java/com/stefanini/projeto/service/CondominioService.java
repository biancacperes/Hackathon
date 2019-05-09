package com.stefanini.projeto.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stefanini.projeto.exception.TreinaException;
import com.stefanini.projeto.model.Condominio;
import com.stefanini.projeto.repository.CondominioRepository;

@Service
public class CondominioService {

	@Autowired
	private CondominioRepository repository;
	
	public List<Condominio> findAll() throws TreinaException {
		return (List<Condominio>) repository.findAll();
	}

	public Condominio salvar(Condominio condominio) throws TreinaException {
		if(condominio.getNome().length() > 20) {
			throw new TreinaException("Tamanho digitado invalido");
		}
		repository.save(condominio);
		return condominio;
	}
	public void excluir(long id) throws TreinaException {
		repository.deleteById(id);
	}
}