<?php

namespace Abstractfactory\Php;

class AbstractHardGameFactory implements iAbstractGameFactory
{
    public function getEnemies(): iEnemies
    {
        return new HardEnemies();
    }

    public function getMap(): iMap
    {
        return new HardMap();
    }
}