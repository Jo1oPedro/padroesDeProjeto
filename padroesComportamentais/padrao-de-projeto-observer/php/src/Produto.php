<?php

namespace Observer\Php;

class Produto
{
    private string $nome;
    private float $preco;
    private float $promocao;

    public function getNome(): string
    {
        return $this->nome;
    }

    public function setNome(string $nome): Produto
    {
        $this->nome = $nome;
        return $this;
    }

    public function getPreco(): float
    {
        return $this->preco - $this->preco * $this->promocao / 100;
    }

    public function setPreco(float $preco): Produto
    {
        $this->preco = $preco;
        return $this;
    }

    public function getPromocao(): float
    {
        return $this->promocao;
    }

    public function setPromocao(float $promocao): Produto
    {
        $this->promocao = $promocao;
        return $this;
    }
}