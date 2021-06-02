package dev.tribos.wakandacity.cidadao.application.api;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import dev.tribos.wakandacity.cidadao.domain.Cidadao;
import lombok.Getter;

@Getter
public class CidadaoForm {
	@Size(min = 3, message = "Quantidade de caracteres não bate no limite minimo de 3 caracteres!")
	@Size(max = 260, message = "Quantidade de caracteres excede o limite de 260 caracteres!")
	@NotNull(message = "apelido não pode ser null")
	@NotEmpty(message = "Campo obrigatório")
	private String apelido;

	@NotNull(message = "whatsapp não pode ser null")
	@NotEmpty(message = "Campo obrigatório")
	@Pattern(regexp = "^\\(?(?:[14689][1-9]|2[12478]|3[1234578]|5[1345]|7[134579])\\)? ?(?:[2-8]|9[1-9])[0-9]{3}\\-?[0-9]{4}$", message = "“O numero de WhatsApp não está em um formato válido!")
	private String whatsapp;

	@NotNull(message = "email não pode ser null")
	@NotEmpty(message = "Campo obrigatório")
	@Email(message = "E-mail no formato inválido")
	private String email;

	@NotNull(message = "cidadeUF não pode ser null")
	@NotEmpty(message = "Campo obrigatório")
	private String cidadeUF;

	public Cidadao toCidadao() {
		return Cidadao.builder()
				.apelido(apelido)
				.whatsapp(whatsapp)
				.email(email)
				.cidadeUF(cidadeUF)
				.build();
	}
}
