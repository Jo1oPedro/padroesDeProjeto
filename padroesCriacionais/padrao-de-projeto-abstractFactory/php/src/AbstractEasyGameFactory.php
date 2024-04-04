<?php

namespace Abstractfactory\Php;

class AbstractEasyGameFactory implements iAbstractGameFactory
{
    public function getEnemies(): iEnemies
    {
        return new EasyEnemies();
    }

    public function getMap(): iMap
    {
        return new EasyMap();
    }
}