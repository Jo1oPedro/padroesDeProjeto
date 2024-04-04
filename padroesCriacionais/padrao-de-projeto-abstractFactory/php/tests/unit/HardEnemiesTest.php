<?php

namespace Abstractfactory\tests\unit;

use Abstractfactory\Php\HardEnemies;
use PHPUnit\Framework\TestCase;

class HardEnemiesTest extends TestCase
{
    public function testShouldReturnHardEnemies(): void
    {
        $hardEnemies = new HardEnemies();
        $this->assertEquals("gera inimigos no modo dificil", $hardEnemies->makeEnemies());
    }
}