package dev.tribos.wakandacity.cidadao.application.api;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import dev.tribos.wakandacity.cidadao.application.service.CidadaoService;
import dev.tribos.wakandacity.cidadao.domain.Cidadao;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RestController
@AllArgsConstructor
public class CidadaoRestController implements CidadaoAPI {
	private CidadaoService cidadaoService;

	@Override
	public ResponseEntity<CidadaoDTO> preCadastraCidadao(CidadaoForm cidadaoForm, UriComponentsBuilder uriBuilder) {
		log.info("[Inicia] CidadaoRestController - preCadastraCidadao");
		log.info("Form: {}", cidadaoForm);
		Cidadao cidadao = cidadaoService.preCadastraCidadao(cidadaoForm.toCidadao());
		URI uri = uriBuilder.path("/cidadao/{id}").buildAndExpand(cidadao.getId()).toUri();
		log.info("[Finaliza] CidadaoRestController - preCadastraCidadao");
		return ResponseEntity.created(uri).body(new CidadaoDTO(cidadao));
	}

}
