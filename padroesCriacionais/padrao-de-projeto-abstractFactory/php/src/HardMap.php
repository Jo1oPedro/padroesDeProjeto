<?php

namespace Abstractfactory\Php;

class HardMap implements iMap
{
    public function makeMap(): string
    {
        return "gera mapa no modo dificil";
    }
}