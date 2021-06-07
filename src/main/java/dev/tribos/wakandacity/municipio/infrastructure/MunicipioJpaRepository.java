package dev.tribos.wakandacity.municipio.infrastructure;

import java.util.List;

import org.springframework.stereotype.Component;

import dev.tribos.wakandacity.municipio.application.repository.MunicipioRepository;
import dev.tribos.wakandacity.municipio.domain.Municipio;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@AllArgsConstructor
@Component
public class MunicipioJpaRepository implements MunicipioRepository{
	private MunicipioSpringDataJpaRepository orcamentoSpringDataJPARepository;

	@Override
	public List<Municipio> buscaMunicipio(String name) {
		log.info("[Inicia] MunicipioJpaRepository - buscaMunicipio");
				List<Municipio> retonarMunicipio = orcamentoSpringDataJPARepository.findByNameContainingIgnoreCase(name); 
		log.info("[Finaliza] MunicipioJpaRepository - buscaMunicipio");
		return retonarMunicipio ;
	}
	
	

}
