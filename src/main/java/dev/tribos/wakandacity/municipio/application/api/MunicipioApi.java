package dev.tribos.wakandacity.municipio.application.api;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/v1/municipio")
public interface MunicipioApi {

	@GetMapping(value = "/{nome}")
	@ResponseStatus(value = HttpStatus.OK)
	List<MunicipiosDTO> buscaMunicipios(@PathVariable(required = false) @Valid @NotBlank @Min(1) String nome);

}
