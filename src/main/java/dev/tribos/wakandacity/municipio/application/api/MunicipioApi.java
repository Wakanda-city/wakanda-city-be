package dev.tribos.wakandacity.municipio.application.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public interface MunicipioApi {
	
	@GetMapping("/municipio")
	@ResponseStatus(value = HttpStatus.OK)
	MunicipiosDTO buscaMunicipios(@RequestParam String descricao);


}
