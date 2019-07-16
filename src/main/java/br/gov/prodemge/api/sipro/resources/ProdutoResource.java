package br.gov.prodemge.api.sipro.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.prodemge.api.sipro.model.Produto;
import br.gov.prodemge.api.sipro.repository.ProdutoRepository;

@RestController
@RequestMapping(value = "/api")
public class ProdutoResource {
	@Autowired
	ProdutoRepository produtoRepository;

	@GetMapping("/produtos")
	public List<Produto> listaProdutos() {
		return produtoRepository.findAll();
	}

	@GetMapping("/produto/{id}")
	public Produto listaProdutoPorId(@PathVariable(value = "id") long id) {
		// Produto produto = null;

		// Optional<Produto> optional = produtoRepository.findById(id);
		// if(optional.isPresent())
		// produto = optional.get();

		return produtoRepository.findById(id);
	}

	@PostMapping("produto")
	public Produto salvarProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
}
