package dev.tribos.wakandacity.municipio.application.service;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


import dev.tribos.wakandacity.municipio.application.repository.MunicipioRepository;
import dev.tribos.wakandacity.municipio.domain.Municipio;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;


@AllArgsConstructor
@Log4j2
@Service
public class MunicipioSpringDataJPAService implements MunicipioService {

	private MunicipioRepository municipioRepository;
	
	@Override
	public List<Municipio> buscaMunicipioService (String municipio) {
		log.info("[Inicia] MunicipioSpringDataJPAService - buscaMunicipio");
		if(municipio == null || municipio.isEmpty()) {return null;}
		List<Municipio> respMunicipio = this.municipioRepository.buscaMunicipio(municipio);
							
		log.info("[Finaliza] MunicipioSpringDataJPAService - buscaMunicipio");
		return respMunicipio; 
		
	}
	
}
