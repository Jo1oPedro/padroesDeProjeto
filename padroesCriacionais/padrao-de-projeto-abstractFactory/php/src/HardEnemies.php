<?php

namespace Abstractfactory\Php;

class HardEnemies implements iEnemies
{
    public function makeEnemies(): string
    {
        return "gera inimigos no modo dificil";
    }
}