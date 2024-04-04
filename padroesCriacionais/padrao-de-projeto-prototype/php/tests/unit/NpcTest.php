<?php

namespace tests;

use PHPUnit\Framework\TestCase;
use Prototype\Php\Map;
use Prototype\Php\Npc;

class NpcTest extends TestCase
{
    public function testDeveClonarNpcComSucesso(): void
    {
        $npc = new Npc("teste", "1", new Map("mapa de teste", "1", "999", "999"));
        $npcClone = clone $npc;
        $npcClone->setName("testeClone");
        $npcClone->setLevel("5");
        $npcClone->getMap()->setCoordinateNpcX("123");
        $npcClone->getMap()->setCoordinateNpcY("321");

        $this->assertEquals("Npc{name=teste, level=1, map='Map{name='mapa de teste', level minimo='1', coordenada x='999', coordenada y='999'}'}", $npc);
        $this->assertEquals("Npc{name=testeClone, level=5, map='Map{name='mapa de teste', level minimo='1', coordenada x='123', coordenada y='321'}'}", $npcClone);
    }
}