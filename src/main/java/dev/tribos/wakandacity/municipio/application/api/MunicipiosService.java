package dev.tribos.wakandacity.municipio.application.api;

import java.util.List;

public interface MunicipiosService {

	List<MunicipiosDTO> buscaMunicipiosPorDescricao(String descricao);

}
