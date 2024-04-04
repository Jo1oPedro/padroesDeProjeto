<?php

namespace Abstractfactory\Php;

use Abstractfactory\Php\iEnemies;

/**
 * @codeCoverageIgnore
 */
interface iAbstractGameFactory
{
    public function getEnemies(): iEnemies;
    public function getMap(): iMap;
}