<?php

namespace Iterator\Php;

use ArrayIterator;
use Ds\Vector;
use IteratorAggregate;

class Carrinho implements IteratorAggregate
{
    /** @var Produto[] */
    private Vector $produtos;

    public function __construct()
    {
        $this->produtos = new Vector();
    }

    public function adicionarProduto(Produto $produto): Carrinho
    {
        $this->produtos->push($produto);
        return $this;
    }

    public function getIterator(): \Iterator
    {
        return new CarrinhoIterator($this->produtos, false);
    }
}