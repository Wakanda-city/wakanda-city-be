package dev.tribos.wakandacity.municipio.domain;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Municipio {

	@Id
	private Integer codigo;
	@NotNull
	private String nome;
	@NotNull
	private String uf;
	

}
