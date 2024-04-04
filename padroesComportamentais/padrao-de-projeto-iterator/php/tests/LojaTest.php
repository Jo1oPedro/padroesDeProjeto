<?php

namespace Iterator\tests;

use Iterator\Php\Carrinho;
use Iterator\Php\Loja;
use Iterator\Php\Produto;
use PHPUnit\Framework\TestCase;

class LojaTest extends TestCase
{
    public function testDeveRetornarValorTotalCarrinho(): void
    {
        $produto = (new Produto())->setNome('teste1')->setValor(10.0);
        $produto2 = (new Produto())->setNome('teste2')->setValor(15.0);
        $carrinho = (new Carrinho())
            ->adicionarProduto($produto)
            ->adicionarProduto($produto2);

        $loja = new Loja();

        $this->assertEquals(25.0, $loja->contaValorTotalCarrinho($carrinho), 0.01);
    }

    public function testDeveRetornarQuantidadeProdutoCarrinho(): void
    {
        $produto = (new Produto())->setNome('teste1')->setValor(10.0);
        $produto2 = (new Produto())->setNome('teste2')->setValor(15.0);
        $carrinho = (new Carrinho())
            ->adicionarProduto($produto)
            ->adicionarProduto($produto2);

        $loja = new Loja();

        $this->assertEquals(2, $loja->contaTotalProdutosCarrinho($carrinho));
    }
}