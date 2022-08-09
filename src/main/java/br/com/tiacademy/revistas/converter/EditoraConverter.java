package br.com.tiacademy.revistas.converter;

import org.springframework.stereotype.Component;

import br.com.tiacademy.revistas.core.crud.CrudConverter;
import br.com.tiacademy.revistas.domain.Editora;
import br.com.tiacademy.revistas.dto.EditoraDTO;

@Component
public class EditoraConverter implements CrudConverter<Editora, EditoraDTO> {
	@Override
	public EditoraDTO entidadeParaDto(Editora entidade) {
		var dto = new EditoraDTO();
		dto.setId(entidade.getId());
		dto.setNome(entidade.getNome());
		
		return dto;
	}

	@Override
	public Editora dtoParaEntidade(EditoraDTO dto) {
		var editora = new Editora();
		editora.setId(dto.getId());
		editora.setNome(dto.getNome());
		
		return editora;
	}
}
