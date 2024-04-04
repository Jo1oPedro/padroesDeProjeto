<?php

namespace Bridge\Php\classes;

abstract class Classe
{
    private float $poderBase;
    public function __construct(float $poderBase)
    {
        $this->poderBase = $poderBase;
    }

    public function getPoderBase()
    {
        return $this->poderBase;
    }
}