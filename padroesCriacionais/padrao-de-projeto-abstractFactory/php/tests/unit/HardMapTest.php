<?php

namespace Abstractfactory\tests\unit;

use Abstractfactory\Php\HardMap;
use PHPUnit\Framework\TestCase;

class HardMapTest extends TestCase
{
    public function testShouldReturnHardMap(): void
    {
        $hardMap = new HardMap();
        $this->assertEquals("gera mapa no modo dificil", $hardMap->makeMap());
    }
}