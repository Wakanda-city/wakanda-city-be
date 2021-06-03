package dev.tribos.wakandacity.municipio.application.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface MunicipioApi {
	
	@GetMapping("/v1/municipio")
	@ResponseStatus(value = HttpStatus.OK)
	List<MunicipiosDTO> buscaMunicipios(@RequestParam String descricao);


}
