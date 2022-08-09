package br.com.tiacademy.revistas.converter;

import org.springframework.stereotype.Component;

import br.com.tiacademy.revistas.core.crud.CrudConverter;
import br.com.tiacademy.revistas.domain.Revista;
import br.com.tiacademy.revistas.dto.RevistaDTO;

@Component
public class RevistaConverter implements CrudConverter<Revista, RevistaDTO> {
	@Override
	public RevistaDTO entidadeParaDto(Revista entidade) {
		var dto = new RevistaDTO();
		dto.setId(entidade.getId());
		dto.setNome(entidade.getNome());
		
		return dto;
	}

	@Override
	public Revista dtoParaEntidade(RevistaDTO dto) {
		var revista = new Revista();
		revista.setId(dto.getId());
		revista.setNome(dto.getNome());
		
		return revista;
	}
}
