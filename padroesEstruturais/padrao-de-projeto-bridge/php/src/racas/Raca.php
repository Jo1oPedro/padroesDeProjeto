<?php

namespace Bridge\Php\racas;

use Bridge\Php\classes\Classe;

abstract class Raca
{
    private Classe $classe;
    public function __construct(Classe $classe)
    {
        $this->classe = $classe;
    }

    protected function getClasse(): Classe
    {
        return $this->classe;
    }
    public abstract function calculaPoder(): float;
}