package dev.tribos.wakandacity.cidadao.application.api;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/v1/cidadao")
public interface CidadaoAPI {

	@PostMapping("/pre-cadastro")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<CidadaoDTO> preCadastraCidadao(@RequestBody @Valid CidadaoForm cidadaoForm,
			UriComponentsBuilder uriBuilder);
}
