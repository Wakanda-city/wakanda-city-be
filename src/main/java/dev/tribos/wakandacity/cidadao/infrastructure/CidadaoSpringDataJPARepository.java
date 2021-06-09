package dev.tribos.wakandacity.cidadao.infrastructure;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.tribos.wakandacity.cidadao.domain.Cidadao;

@Repository
public interface CidadaoSpringDataJPARepository extends JpaRepository<Cidadao, UUID> {

}