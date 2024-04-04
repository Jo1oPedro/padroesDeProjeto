<?php

namespace Adapter\tests\unit;

use PHPUnit\Framework\TestCase;
use Adapter\Php\Adapter\Partida;

class PartidaTest extends TestCase
{
    public function testDeveRetornarDanoPorcentagem(): void
    {
        $partida = new Partida();
        $partida->setDano(1000);
        $this->assertEquals("100%", $partida->getDanoPorcentagem());
    }
}