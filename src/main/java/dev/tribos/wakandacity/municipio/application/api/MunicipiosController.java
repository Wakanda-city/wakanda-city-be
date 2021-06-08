package dev.tribos.wakandacity.municipio.application.api;

import java.util.List;
import org.springframework.web.bind.annotation.RestController;


import dev.tribos.wakandacity.municipio.application.service.MunicipioService;
import dev.tribos.wakandacity.municipio.domain.Municipio;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@AllArgsConstructor
public class MunicipiosController implements MunicipioApi {
	
  private MunicipioService municipiosService;
  
	@Override
	public List<MunicipiosDTO> buscaMunicipios(String nome  ) { 
		
		log.info("[Inicia] MunicipiosController - buscaMunicipios");
				List<Municipio> buscaMunicipiosPorDescricao = municipiosService.buscaMunicipioService(nome); 
			
		log.info("[Finaliza] MunicipiosController - buscaMunicipios");
		return MunicipiosDTO.parseListDTO(buscaMunicipiosPorDescricao);
	}

}
