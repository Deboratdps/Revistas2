package br.com.tiacademy.revistas.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RevistaDTO implements Serializable {

	private Long id;
	private String nome;
}
