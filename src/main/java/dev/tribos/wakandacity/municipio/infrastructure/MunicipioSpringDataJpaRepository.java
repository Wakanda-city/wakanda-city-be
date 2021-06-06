package dev.tribos.wakandacity.municipio.infrastructure;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.tribos.wakandacity.municipio.domain.Municipio;

@Repository
public interface MunicipioSpringDataJpaRepository extends JpaRepository<Municipio,String>{

	
		Municipio findbymunicipio (String municipio);
}
