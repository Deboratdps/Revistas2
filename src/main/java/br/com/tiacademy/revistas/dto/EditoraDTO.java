package br.com.tiacademy.revistas.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EditoraDTO implements Serializable {
	
	private Long id;
	private String nome;
	private Integer ano;
	private String cidade;
	private String uf;
	private List<RevistaDTO> revistas = new ArrayList<>();
}
