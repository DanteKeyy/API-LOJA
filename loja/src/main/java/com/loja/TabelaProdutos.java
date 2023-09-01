package com.loja;

import java.util.ArrayList;
import java.util.List;

public class TabelaProdutos {
    List<Produto> produtos = new ArrayList<>();

    /**
     * No construtor a lista de produtos será preenchida
     */
    public TabelaProdutos() {
        Produto caneta = new Produto(1, "Caneta Bic",
                "Caneta bic na cor preta", 1.99);
    Produto borracha = new Produto(2, "Borracha branca ",
            "Borracha branca comum", 3.99);
    Produto lapis = new Produto(3, "Lapis faber castel",
            "Lapis faber castel comum", 2.99);
    Produto apontador = new Produto(4, "Apontador",
            "Apontador comum com reservatorio", 7.99);
    Produto caderno = new Produto(5, "Caderno espiral",
            "Caderno espiral de 96 folhas", 15.99);

    this.produtos.add(caneta);
    this.produtos.add(borracha);
    this.produtos.add(lapis);
    this.produtos.add(apontador);
    this.produtos.add(caderno);


    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    /**
     * Metodo que retorna todos os produtos da lista
     */
    public List<Produto> buscarTodososProdutos() {
        return this.getProdutos();
    }

    /**
     * Metodo que busca um produto pelo seu ID
     * Caso não encontre, irá retornar nulo
     *
     * @return
     */
    public Produto buscarProdutoID(int produtoId) {
        Produto produtoProcurado = null;
        for (Produto p: this.produtos) {
            if (p.getId() == produtoId) {
                produtoProcurado = p;
                break;
            }
        }
        return produtoProcurado;
    }

    public Produto cadastrarNovoProduto(Produto novoProduto) {
    int ultimoIndex = this.produtos.size() -1;
    Produto ultimoProduto = this.produtos.get(ultimoIndex);
    int proximoID = ultimoProduto.getId() + 1;
    novoProduto.setId(proximoID);
    this.produtos.add(novoProduto);
    return novoProduto;

    }

    /**
     * Metodo que atualiza um produto
     * Primeiro busca o produto a atualizar pelo ID
     * Depois atribui as novas informações:
     * Nome, Descrição e Valor Unitario
     * FInalmente salva o produto atualizado
     * @param produtoID
     * @param produtoAtualizar
     */
    public void atualizarProduto( int produtoID, Produto produtoAtualizar) {
        Produto produtoProcurado = this.buscarProdutoID(produtoID);
        if (produtoProcurado != null) {
            produtoProcurado.setNome(produtoAtualizar.getNome());
            produtoProcurado.setDescricao(produtoAtualizar.getDescricao());
            produtoProcurado.setValorUnitario(produtoAtualizar.getValorUnitario());
        }
    }

    /**
     * Metodo que remove um produto da lista
     * Utiliza como base o proprio prodyto para remover
     * @param produtoID
     */
    public void removerProduto(int produtoID) {
        Produto produtoRemover = this.buscarProdutoID(produtoID);
        this.produtos.remove(produtoRemover);

}


}
