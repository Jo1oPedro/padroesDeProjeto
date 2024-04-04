<?php

namespace tests;

use Bridge\Php\classes\Guerreiro;
use Bridge\Php\racas\Humano;
use PHPUnit\Framework\TestCase;

class HumanoTest extends TestCase
{
    public function testDeveRetornarPoderHumanoGuerreiro(): void
    {
        $humano = new Humano(new Guerreiro(1000));
        $this->assertEquals(1000000, $humano->calculaPoder(), 0.01);
    }
}