package dev.tribos.wakandacity.municipio.application.api;

import java.util.List;
import java.util.stream.Collectors;

import dev.tribos.wakandacity.municipio.domain.Municipio;
import lombok.Getter;

@Getter
public class MunicipiosDTO {

	private String nome;
	private Integer codigo;
	private String uf;

	public MunicipiosDTO(Municipio municipio) {
		this.nome = municipio.getNome();
		this.codigo = municipio.getCodigo();
		this.uf = municipio.getUf();

	}

	public static List<MunicipiosDTO> parseListDTO(List<Municipio> buscaMunicipiosPorDescricao) {
		return buscaMunicipiosPorDescricao.stream().map(MunicipiosDTO::new).collect(Collectors.toList());

	}

}
