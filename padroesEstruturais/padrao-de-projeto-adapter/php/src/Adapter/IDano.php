<?php

namespace Adapter\Php\Adapter;

interface IDano
{
    public function setDano(Float $dano): IDano;
    public function getDano(): float;
}