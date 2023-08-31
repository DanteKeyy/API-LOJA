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
}
