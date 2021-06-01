package dev.tribos.wakandacity.cidadao.service;



import dev.tribos.wakandacity.cidadao.application.api.data.request.CidadaoForm;
import dev.tribos.wakandacity.cidadao.domain.Cidadao;

public interface CidadaoService {

	Cidadao preCadastraCidadao(CidadaoForm cidadaoForm);

}
