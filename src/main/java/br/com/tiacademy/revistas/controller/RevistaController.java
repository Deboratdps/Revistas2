package br.com.tiacademy.revistas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiacademy.revistas.domain.Revista;
import br.com.tiacademy.revistas.repository.RevistaRepository;
import br.com.tiacademy.revistas.core.crud.CrudController;
import br.com.tiacademy.revistas.dto.RevistaDTO;

@RestController
@RequestMapping("/revista")
public class RevistaController extends CrudController<Revista, RevistaDTO, Long> {
	
	public RevistaRepository getRepository() {
		return (RevistaRepository) this.repository;
	}
	
	@GetMapping("/caras")
	public Revista revistaCaras() {
		return this.getRepository().consultarPeloNome("Caras");
	}
	
	@GetMapping("/manequim")
	public Revista revistaManequim() {
		return this.getRepository().findByNome("Manequim");
	}
	
	@GetMapping("/2")
	public Revista consultarPeloId() {
		return this.getRepository().findByNome("Veja");
	}
}