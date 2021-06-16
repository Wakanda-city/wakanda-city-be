package dev.tribos.wakandacity.municipio.infrastructure;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.tribos.wakandacity.municipio.domain.Municipio;

@Repository
public interface MunicipioSpringDataJpaRepository extends JpaRepository<Municipio, String> {


	List<Municipio> findByNomeStartingWithIgnoreCase(String name);
	//List<Municipio> findByNomeContainingIgnoreCase(String name);
}
