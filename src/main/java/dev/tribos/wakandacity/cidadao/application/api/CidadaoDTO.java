package dev.tribos.wakandacity.cidadao.application.api;

import dev.tribos.wakandacity.cidadao.domain.Cidadao;
import lombok.Getter;

@Getter
public class CidadaoDTO {

	private String apelido;

	private String whatsapp;

	private String email;

	private String codigoMunicipio;

	public CidadaoDTO(Cidadao cidadao) {
		this.apelido = cidadao.getApelido();
		this.whatsapp = cidadao.getWhatsapp();
		this.email = cidadao.getEmail();
		this.codigoMunicipio = cidadao.getCodigoMunicipio();
	}

}
