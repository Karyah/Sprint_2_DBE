package com.fiap.soulCoderz.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fiap.soulCoderz.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	Page<Usuario> findAllByAtivoUsuarioTrue(Pageable paginacao);
	Usuario findReferenceByNomeUsuario(String nome);
}
