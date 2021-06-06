package dev.tribos.wakandacity.municipio.application.api;

import java.util.List;

import dev.tribos.wakandacity.municipio.application.service.MunicipioService;
import dev.tribos.wakandacity.municipio.domain.Municipio;

public class MunicipiosController implements MunicipioApi {
	
  private MunicipioService municipiosService;
  
	@Override
	public MunicipiosDTO buscaMunicipios(String descricao) {
		Municipio buscaMunicipiosPorDescricao = municipiosService.buscaMunicipioService(descricao);
		
		return new MunicipiosDTO(buscaMunicipiosPorDescricao);
	}

}
