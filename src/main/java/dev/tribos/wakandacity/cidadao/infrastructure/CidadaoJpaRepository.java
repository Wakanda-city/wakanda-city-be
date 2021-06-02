package dev.tribos.wakandacity.cidadao.infrastructure;

import org.springframework.stereotype.Component;

import dev.tribos.wakandacity.cidadao.application.repository.CidadaoRepository;
import dev.tribos.wakandacity.cidadao.domain.Cidadao;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;

@AllArgsConstructor
@Log4j2
@Component
public class CidadaoJpaRepository implements CidadaoRepository {
	private CidadaoSpringDataJPARepository cidadaoSpringDataJPARepository;

	@Override
	public Cidadao save(Cidadao cidadao) {
		log.info("[Inicia] CidadaoJpaRepository - save");
		Cidadao cidadaoSalvo = cidadaoSpringDataJPARepository.save(cidadao);
		log.info("[Finaliza] CidadaoJpaRepository - save");
		return cidadaoSalvo;
	}

}
