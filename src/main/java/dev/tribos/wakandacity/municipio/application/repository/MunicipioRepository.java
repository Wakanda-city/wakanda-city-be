package dev.tribos.wakandacity.municipio.application.repository;

import java.util.Optional;


import dev.tribos.wakandacity.municipio.domain.Municipio;

public interface MunicipioRepository {
	
	Municipio buscaMunicipio (String municipio);
	//	Optional<Orcamento> buscaPorId(String idOrcamento);

}
