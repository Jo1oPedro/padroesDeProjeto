<?php

namespace Abstractfactory\Php;

class Game
{
    private ?iEnemies $enemies = null;
    private ?iMap $map = null;

    public function __construct(iAbstractGameFactory $abstractGameFactory)
    {
        $this->enemies = $abstractGameFactory->getEnemies();
        $this->map = $abstractGameFactory->getMap();
    }

    public function getEnemies(): String
    {
        return $this->enemies->makeEnemies();
    }

    public function getMap(): String
    {
        return $this->map->makeMap();
    }
}