<?php

namespace Abstractfactory\tests\unit;

use Abstractfactory\Php\EasyMap;
use PHPUnit\Framework\TestCase;

class EasyMapTest extends TestCase
{
    public function testShouldReturnEasyMap(): void
    {
        $easyMap = new EasyMap();
        $this->assertEquals("gera mapa no modo facil", $easyMap->makeMap());
    }
}