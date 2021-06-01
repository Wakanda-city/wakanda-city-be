package dev.tribos.wakandacity.cidadao.service.impl;

import org.springframework.stereotype.Service;

import dev.tribos.wakandacity.cidadao.Repository.CidadaoRepository;
import dev.tribos.wakandacity.cidadao.application.api.data.request.CidadaoForm;
import dev.tribos.wakandacity.cidadao.domain.Cidadao;
import dev.tribos.wakandacity.cidadao.service.CidadaoService;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class CidadaoSpringDataJPAServiceImpl implements CidadaoService {

	private CidadaoRepository cidadaoRepository;

	public CidadaoSpringDataJPAServiceImpl(CidadaoRepository cidadaoRepository) {
		this.cidadaoRepository = cidadaoRepository;
	}

	@Override
	public Cidadao preCadastraCidadao(CidadaoForm cidadaoForm) {
		log.info("Starting Method insert in CidadaoSpringDataJPAServiceImpl");
		Cidadao cidadao = cidadaoForm.toCidadao();
		log.info("finishing Method insert in CidadaoSpringDataJPAServiceImpl");
		return cidadaoRepository.save(cidadao);
	}

}
