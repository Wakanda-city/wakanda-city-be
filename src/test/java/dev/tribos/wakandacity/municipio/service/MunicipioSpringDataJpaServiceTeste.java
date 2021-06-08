package dev.tribos.wakandacity.municipio.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import dev.tribos.wakandacity.municipio.application.repository.MunicipioRepository;
import dev.tribos.wakandacity.municipio.application.service.MunicipioSpringDataJPAService;
import dev.tribos.wakandacity.municipio.domain.Municipio;

public class MunicipioSpringDataJpaServiceTeste {
	
	private MunicipioSpringDataJPAService municipioSpringDataJPAService;
	
	@Mock
	private MunicipioRepository municipioRepository;
	
	private Municipio municipio;
	
	@SuppressWarnings("deprecation")
	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
		this.municipioSpringDataJPAService = new MunicipioSpringDataJPAService(municipioRepository);
		this.municipio = municipio.builder()
				.codigo(11)
				.nome("suzano")
				.uf("sp")
				.build();
	}
	
	@Test
	void deveListaDeCidadesPeloNomeO() {
		
		Mockito.when(municipioRepository.buscaMunicipio(municipio.getNome())).thenReturn(List.of(municipio));
		
		List<Municipio> cidadeRetornada = municipioSpringDataJPAService.buscaMunicipioService(municipio.getNome());
		
		assertEquals(municipio.getNome(), cidadeRetornada);
		
		
		
	}
	
	
	
	
	

}
