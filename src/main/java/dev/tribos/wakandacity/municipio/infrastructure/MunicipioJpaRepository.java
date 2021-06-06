package dev.tribos.wakandacity.municipio.infrastructure;

import java.util.Optional;

import dev.tribos.wakandacity.municipio.application.repository.MunicipioRepository;
import dev.tribos.wakandacity.municipio.domain.Municipio;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@AllArgsConstructor
@Component
public class MunicipioJpaRepository implements MunicipioRepository{
	private final  MunicipioSpringDataJpaRepository orcamentoSpringDataJPARepository;

	@Override
	public Municipio buscaMunicipio(String municipio) {
		log.info("[Inicia] MunicipioJpaRepository - buscaMunicipio");
		Municipio retonarMunicipio = orcamentoSpringDataJPARepository.buscaMunicipio(municipio) ; 
		log.info("[Finaliza] MunicipioJpaRepository - buscaMunicipio");
		return retonarMunicipio ;
	}
	
	

}
