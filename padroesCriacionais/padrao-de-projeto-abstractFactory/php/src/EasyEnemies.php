<?php

namespace Abstractfactory\Php;

class EasyEnemies implements iEnemies
{
    public function makeEnemies(): string
    {
        return "gera inimigos no modo facil";
    }
}