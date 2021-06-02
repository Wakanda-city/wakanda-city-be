package dev.tribos.wakandacity.cidadao.application.service;

import org.springframework.stereotype.Service;

import dev.tribos.wakandacity.cidadao.domain.Cidadao;
import dev.tribos.wakandacity.cidadao.repository.CidadaoRepository;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@AllArgsConstructor
public class CidadaoSpringDataJPAService implements CidadaoService {
	private CidadaoRepository cidadaoRepository;

	@Override
	public Cidadao preCadastraCidadao(Cidadao cidadao) {
		log.info("[Inicia] CidadaoSpringDataJPAService - preCadastraCidadao");
		Cidadao cidadaoSalvo = salvaCidadao(cidadao);
		log.info("[Finaliza] CidadaoSpringDataJPAService - preCadastraCidadao");
		return cidadaoSalvo;
	}
	
	private Cidadao salvaCidadao(Cidadao cidadao) {
			return cidadaoRepository.save(cidadao);
	}

}
