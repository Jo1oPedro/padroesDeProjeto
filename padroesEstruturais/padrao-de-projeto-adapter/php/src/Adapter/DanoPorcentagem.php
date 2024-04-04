<?php

namespace Adapter\Php\Adapter;

class DanoPorcentagem
{
    private String $dano;

    public function setDano(String $dano): DanoPorcentagem
    {
        $this->dano = $dano;
        return $this;
    }

    public function getDano()
    {
        return $this->dano;
    }
}