<?php

namespace Iterator\Php;

class Produto
{
    private string $nome;
    private float $valor;

    public function getNome(): string
    {
        return $this->nome;
    }

    public function setNome(string $nome): Produto
    {
        $this->nome = $nome;
        return $this;
    }

    public function getValor(): float
    {
        return $this->valor;
    }

    public function setValor(float $valor): Produto
    {
        $this->valor = $valor;
        return $this;
    }

}