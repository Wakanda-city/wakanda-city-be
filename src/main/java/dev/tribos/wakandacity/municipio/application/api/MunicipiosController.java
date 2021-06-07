package dev.tribos.wakandacity.municipio.application.api;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import dev.tribos.wakandacity.municipio.application.service.MunicipioService;
import dev.tribos.wakandacity.municipio.domain.Municipio;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class MunicipiosController implements MunicipioApi {
	
  private MunicipioService municipiosService;
  
	@Override
	public List<MunicipiosDTO> buscaMunicipios(String name) {
		List<Municipio> buscaMunicipiosPorDescricao = municipiosService.buscaMunicipioService(name);
		List<MunicipiosDTO> ListaDeMunicipiosPorDescricao = MunicipiosDTO.convert(buscaMunicipiosPorDescricao);
		
		return ListaDeMunicipiosPorDescricao;
	}

}
