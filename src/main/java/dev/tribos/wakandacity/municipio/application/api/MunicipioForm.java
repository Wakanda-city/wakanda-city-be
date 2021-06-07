package dev.tribos.wakandacity.municipio.application.api;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import dev.tribos.wakandacity.municipio.domain.Municipio;
import lombok.Getter;

@Getter
public class MunicipioForm {
	
	@Size(max = 260, message = "Quantidade de caracteres excede o limite de 260 caracteres!")
	@NotNull(message = "apelido não pode ser null")
	@NotEmpty(message = "Campo obrigatório")
	private String nome;
	
	public Municipio toMunicipio() {
		return Municipio.builder()
			.nome(nome)
			.build();
	}

}
