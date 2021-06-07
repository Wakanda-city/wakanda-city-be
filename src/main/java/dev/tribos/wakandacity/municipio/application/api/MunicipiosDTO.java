package dev.tribos.wakandacity.municipio.application.api;

import java.util.List;
import java.util.stream.Collectors;

import dev.tribos.wakandacity.municipio.domain.Municipio;
import lombok.Getter;

@Getter
public class MunicipiosDTO {

	private String name;
	private Integer codigo;
	private String uf;
	private String descricao;

	public MunicipiosDTO(Municipio municipio) {
		this.name = municipio.getName();
		this.codigo = municipio.getCodigo();
		this.uf = municipio.getUf();
		this.descricao = municipio.getDescricao();
	}

	public static List<MunicipiosDTO> convert(List<Municipio> buscaMunicipiosPorDescricao) {
		return buscaMunicipiosPorDescricao.stream().map(MunicipiosDTO::new).collect(Collectors.toList());

	}

}
