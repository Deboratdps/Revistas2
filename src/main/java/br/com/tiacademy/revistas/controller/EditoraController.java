package br.com.tiacademy.revistas.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiacademy.revistas.domain.Editora;
import br.com.tiacademy.revistas.dto.EditoraDTO;
import br.com.tiacademy.revistas.core.crud.CrudController;

@RestController
@RequestMapping(value = "/editora")
public class EditoraController extends CrudController<Editora, EditoraDTO, Long> {
	
}
