<?php

namespace Iterator\Php;

class Loja
{
    public function contaValorTotalCarrinho(Carrinho $carrinho): float
    {
        $quantidade = 0.0;
        /** @var Produto $produto */
        foreach($carrinho as $produto) {
            $quantidade += $produto->getValor();
        }
        return $quantidade;
    }

    public function contaTotalProdutosCarrinho(Carrinho $carrinho): int
    {
        $quantidade = 0;
        /** @var Produto $produto */
        foreach($carrinho as $produto) {
            $quantidade++;
        }
        return $quantidade;
    }
}