<?php

namespace Composite\Php\Pecas;

abstract class Peca
{
    private string $descricao = '';

    public function setDescricao(string $descricao): self
    {
        $this->descricao = $descricao;
        return $this;
    }

    public function getDescricao(): string
    {
        return $this->descricao;
    }
}