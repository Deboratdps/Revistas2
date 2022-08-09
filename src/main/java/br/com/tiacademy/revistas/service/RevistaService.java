package br.com.tiacademy.revistas.service;

import org.springframework.stereotype.Service;

import br.com.tiacademy.revistas.domain.Revista;
import br.com.tiacademy.revistas.core.crud.CrudService;

@Service
public class RevistaService extends CrudService<Revista, Long> {
	@Override
	protected Revista editarEntidade(Revista recuperado, Revista entidade) {
		recuperado.setNome(entidade.getNome());
		return recuperado;
	}
}