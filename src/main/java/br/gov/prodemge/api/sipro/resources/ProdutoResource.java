package br.gov.prodemge.api.sipro.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.prodemge.api.sipro.model.Produto;
import br.gov.prodemge.api.sipro.repository.ProdutoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value="API Rest Produtos")
@CrossOrigin(origins="*" )
public class ProdutoResource {
	@Autowired
	ProdutoRepository produtoRepository;

	@GetMapping("/produtos")
	@ApiOperation(value="Retorna uma lista de produtos")
	public List<Produto> listaProdutos() {
		return produtoRepository.findAll();
	}

	@GetMapping("/produto/{id}")
	@ApiOperation(value="Retorna um unico Produto")
	public Produto getProdutoPorId(@PathVariable(value = "id") long id) {
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
