package dev.tribos.wakandacity.cidades.domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Builder;
import lombok.Getter;
@Entity
@Builder
@Getter
public class Municipio {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;
	private String nome;
	private Integer codigo;
	private String uf;

}
