package br.gov.prodemge.api.sipro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.prodemge.api.sipro.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	Produto findById(long id);
}
