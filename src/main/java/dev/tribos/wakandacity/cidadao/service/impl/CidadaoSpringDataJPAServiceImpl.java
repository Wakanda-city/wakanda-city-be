package dev.tribos.wakandacity.cidadao.service.impl;

import org.springframework.stereotype.Service;

import dev.tribos.wakandacity.cidadao.Repository.CidadaoRepository;
import dev.tribos.wakandacity.cidadao.application.api.data.request.CidadaoForm;
import dev.tribos.wakandacity.cidadao.domain.Cidadao;
import dev.tribos.wakandacity.cidadao.service.CidadaoService;

@Service
public class CidadaoSpringDataJPAServiceImpl implements CidadaoService {

	private CidadaoRepository cidadaoRepository;

	public CidadaoSpringDataJPAServiceImpl(CidadaoRepository cidadaoRepository) {
		this.cidadaoRepository = cidadaoRepository;
	}

	@Override
	public Cidadao preCadastraCidadao(CidadaoForm cidadaoForm) {
		Cidadao cidadao = cidadaoForm.toCidadao();
		return cidadaoRepository.save(cidadao);
	}

}
