package dev.tribos.wakandacity.cidadao.application.api.controller;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import dev.tribos.wakandacity.cidadao.application.api.data.request.CidadaoForm;
import dev.tribos.wakandacity.cidadao.application.api.data.response.CidadaoDTO;
import dev.tribos.wakandacity.cidadao.domain.Cidadao;
import dev.tribos.wakandacity.cidadao.service.CidadaoService;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@RequestMapping("/v1/cidadao")
public class CidadaoController implements CidadaoAPI {

	private CidadaoService cidadaoService;

	public CidadaoController(CidadaoService cidadaoService) {
		this.cidadaoService = cidadaoService;
	}

	@Override
	public ResponseEntity<CidadaoDTO> preCadastraCidadao(@Valid CidadaoForm cidadaoForm,
			UriComponentsBuilder uriBuilder) {
		log.info("Starting Method preCadastraCidadao in CidadaoController!");
		log.info("Form: {}", cidadaoForm);
		Cidadao cidadao = cidadaoService.preCadastraCidadao(cidadaoForm);
		log.info("Finishing Method  preCadastraCidadao in CidadaoController!");
		URI uri = uriBuilder.path("/cidadao/{id}").buildAndExpand(cidadao.getId()).toUri();
		return ResponseEntity.created(uri).body(new CidadaoDTO(cidadao));
	}

}
