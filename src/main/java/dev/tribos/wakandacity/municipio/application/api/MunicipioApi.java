package dev.tribos.wakandacity.municipio.application.api;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "/v1/municipio")
public interface MunicipioApi {
	
	@GetMapping(value = "/{nome}")
	@ResponseStatus(value = HttpStatus.OK)
		List<MunicipiosDTO> buscaMunicipios(@PathVariable String nome);


}
