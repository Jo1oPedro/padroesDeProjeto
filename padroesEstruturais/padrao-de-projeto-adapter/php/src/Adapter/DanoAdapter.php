<?php

namespace Adapter\Php\Adapter;

class DanoAdapter extends DanoPorcentagem
{
    private IDano $danoNumerico;

    public function __construct(IDano $danoNumerico)
    {
        $this->danoNumerico = $danoNumerico;
    }

    public function recuperarDano(): String
    {
        if($this->getDano() === "100%") {
            return $this->danoNumerico->setDano(1000)->getDano();
        }

        if($this->getDano() === "50%") {
            return $this->danoNumerico->setDano(500)->getDano();
        }

        if($this->getDano() === "10%") {
            return $this->danoNumerico->setDano(100)->getDano();
        }

        return $this->danoNumerico->getDano();
    }

    public function salvarDano(): DanoAdapter
    {
        if($this->danoNumerico->getDano() >= 1000) {
            $this->setDano("100%");
            return $this;
        }

        if($this->danoNumerico->getDano() >= 500) {
            $this->setDano("50%+");
            return $this;
        }

        if($this->danoNumerico->getDano() >= 100) {
            $this->setDano("10%+");
            return $this;
        }

        return $this;
    }
}