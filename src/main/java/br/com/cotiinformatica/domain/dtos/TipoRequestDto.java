package br.com.cotiinformatica.domain.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TipoRequestDto {

	@Size(min = 5, max = 50, message = "Por favor, informe um nome com no mínimo 5 e no máximo 50 caracteres.")
	@NotEmpty(message = "Por favor, informe o nome do tipo.")
	private String nome;
}
