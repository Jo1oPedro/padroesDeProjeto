<?php

namespace Adapter\Php\Adapter;

class DanoNumerico implements IDano
{
    private float $dano = 0;
    public function setDano(float $dano): IDano
    {
        $this->dano = $dano;
        return $this;
    }

    public function getDano(): float
    {
        return $this->dano;
    }
}