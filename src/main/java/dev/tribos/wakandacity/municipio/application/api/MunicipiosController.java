package dev.tribos.wakandacity.municipio.application.api;

import java.util.List;

public class MunicipiosController implements MunicipioApi {
  private MunicipiosService municipiosService;
	@Override
	public List<MunicipiosDTO> buscaMunicipios(String descricao) {
		List<MunicipiosDTO> buscaMunicipiosPorDescricao =
				municipiosService.buscaMunicipiosPorDescricao(descricao);
		return null;
	}

}
