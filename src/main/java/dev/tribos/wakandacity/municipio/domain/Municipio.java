package dev.tribos.wakandacity.municipio.domain;

import java.util.UUID;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.persistence.Entity;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Builder
@Getter

public class Municipio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@NotNull
	@NotBlank
	private String name;
	
	@NotNull
	@NotBlank
	private Integer codigo;
	
	@NotNull
	@NotBlank
	private String uf;
    
	@NotNull
	@NotBlank
	private String descricao;

}
