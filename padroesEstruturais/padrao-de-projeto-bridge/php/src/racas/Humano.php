<?php

namespace Bridge\Php\racas;


use Bridge\Php\classes\Classe;

class Humano extends Raca
{
    const PODER_BASE = 1000.0;
    public function __construct(Classe $classe)
    {
        parent::__construct($classe);
    }


    public function calculaPoder(): float
    {
        return self::PODER_BASE * $this->getClasse()->getPoderBase();
    }

}