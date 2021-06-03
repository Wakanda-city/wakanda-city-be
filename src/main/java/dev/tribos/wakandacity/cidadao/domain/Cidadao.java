package dev.tribos.wakandacity.cidadao.domain;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;

@Entity
@Builder
@Getter
public class Cidadao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id; 
	
	private String apelido;
	
	@Column(unique=true)
	private String whatsapp;
	@Column(unique=true)
	private String email;
	
	private String codigoMunicipio;
}
