package br.com.tiacademy.revistas.service;

import org.springframework.stereotype.Service;

import br.com.tiacademy.revistas.domain.Editora;
import br.com.tiacademy.revistas.core.crud.CrudService;

@Service
public class EditoraService extends CrudService<Editora, Long> {
	@Override
	protected Editora editarEntidade(Editora recuperado, Editora entidade) {
		recuperado.setNome(entidade.getNome());
		return recuperado;
	}
}