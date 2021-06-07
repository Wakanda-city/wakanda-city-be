package dev.tribos.wakandacity.municipio.application.repository;


import java.util.List;

import dev.tribos.wakandacity.municipio.domain.Municipio;

public interface MunicipioRepository {
	
	List<Municipio> buscaMunicipio(String name);
	

}
