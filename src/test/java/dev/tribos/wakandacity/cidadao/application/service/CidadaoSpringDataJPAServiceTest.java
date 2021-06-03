package dev.tribos.wakandacity.cidadao.application.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import dev.tribos.wakandacity.cidadao.application.repository.CidadaoRepository;
import dev.tribos.wakandacity.cidadao.domain.Cidadao;

class CidadaoSpringDataJPAServiceTest {
	
	private CidadaoSpringDataJPAService cidadaoSpringDataJPAService;
	
	@Mock
	private CidadaoRepository cidadaoRepository;
	
	private Cidadao cidadao;

	@BeforeEach
	void setUp() {
		MockitoAnnotations.initMocks(this);
		this.cidadaoSpringDataJPAService = new CidadaoSpringDataJPAService(cidadaoRepository);
		this.cidadao = Cidadao.builder()
				.apelido("breno")
				.codigoMunicipio("jequié")
				.email("breno.bpa@hotmail.com")
				.whatsapp("73991463540")
				.build();
	}

	@Test
	void deveSalvarEhRetornarUmCidadaoCasoSejaPassadoUmCidadaoValido() {
		Mockito.when(cidadaoRepository.save(cidadao)).thenReturn(cidadao);
		
		Cidadao cidadaoRetornado = cidadaoSpringDataJPAService.preCadastraCidadao(cidadao);
		
		assertEquals(cidadao, cidadaoRetornado);
		Mockito.verify(cidadaoRepository).save(cidadao);
	}

}
