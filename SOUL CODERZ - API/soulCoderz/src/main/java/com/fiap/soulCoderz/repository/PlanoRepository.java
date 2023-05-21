package com.fiap.soulCoderz.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fiap.soulCoderz.entity.Plano;

public interface PlanoRepository extends JpaRepository<Plano, Long>{
	Page<Plano> findAllByDisponivelTrue(Pageable paginacao);
}
