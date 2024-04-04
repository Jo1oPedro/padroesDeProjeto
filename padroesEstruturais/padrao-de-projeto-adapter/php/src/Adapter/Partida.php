<?php

namespace Adapter\Php\Adapter;

class Partida
{
    private ?IDano $dano = null;
    private ?DanoAdapter $danoAdapter = null;

    public function __construct()
    {
        $this->dano = new DanoNumerico();
        $this->danoAdapter = new DanoAdapter($this->dano);
    }

    public function setDano(float $dano): Partida
    {
        $this->dano->setDano($dano);
        $this->danoAdapter->salvarDano();
        return $this;
    }

    public function getDanoPorcentagem(): String
    {
        return $this->danoAdapter->getDano();
    }

    public function getDanoNumerico(): float
    {
        return $this->dano->getDano();
    }
}