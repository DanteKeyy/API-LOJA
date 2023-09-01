package com.loja;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loja/produtos") 
public class ProdutoController {
    private TabelaProdutos tabelaProdutos;

    public ProdutoController() {
    this.tabelaProdutos = new TabelaProdutos();

    }
@GetMapping
    public List<Produto> buscarTodosProdutosdaLoja() {
        return this.tabelaProdutos.buscarTodososProdutos();

    }

    @GetMapping("/{produtoID}")
    public Produto  buscarProdutoPeloIDLoja(@PathVariable int produtoID) {
    Produto produtoProcurado = this.tabelaProdutos.buscarProdutoID(produtoID);
    return produtoProcurado;
    }

    @PostMapping
    public Produto cadastrarNovoProduto(@RequestBody Produto dadosNovoProduto) {
        return this.tabelaProdutos.cadastrarNovoProduto(dadosNovoProduto);
    }
    @PutMapping("/{produtoID}")
    public void atualizarProdutoLoja(@PathVariable int produtoID, @RequestBody Produto dadosAtualizarProduto) {
        this.tabelaProdutos.atualizarProduto(produtoID, dadosAtualizarProduto);
    }
    @DeleteMapping("/{produtoID}")
    public void removerProdutoLoja(@PathVariable int produtoID) {
        this.tabelaProdutos.removerProduto(produtoID);
    }

}
