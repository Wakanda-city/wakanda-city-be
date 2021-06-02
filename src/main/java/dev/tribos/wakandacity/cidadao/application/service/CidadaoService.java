package dev.tribos.wakandacity.cidadao.application.service;



import dev.tribos.wakandacity.cidadao.application.api.CidadaoForm;
import dev.tribos.wakandacity.cidadao.domain.Cidadao;

public interface CidadaoService {

	Cidadao preCadastraCidadao(CidadaoForm cidadaoForm);

}
