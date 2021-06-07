package dev.tribos.wakandacity.municipio.domain;

import javax.persistence.Id;
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
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//private UUID id;
	@Id
	private Integer codigo;
	private String nome;
	private String uf;
	

}
