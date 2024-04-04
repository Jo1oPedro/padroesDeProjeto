<?php

namespace Abstractfactory\tests\unit;

use Abstractfactory\Php\AbstractEasyGameFactory;
use Abstractfactory\Php\AbstractHardGameFactory;
use Abstractfactory\Php\Game;
use PHPUnit\Framework\TestCase;

class GameTest extends TestCase
{
    public function testShouldReturnEasyEnemies(): void
    {
        $easyGameFactory = new AbstractEasyGameFactory();
        $game = new Game($easyGameFactory);
        $this->assertEquals("gera inimigos no modo facil", $game->getEnemies());
    }

    public function testShouldReturnEasyMap(): void
    {
        $easyGameFactory = new AbstractEasyGameFactory();
        $game = new Game($easyGameFactory);
        $this->assertEquals("gera mapa no modo facil", $game->getMap());
    }

    public function testShouldReturnHardEnemies(): void
    {
        $hardGameFactory = new AbstractHardGameFactory();
        $game = new Game($hardGameFactory);
        $this->assertEquals("gera inimigos no modo dificil", $game->getEnemies());
    }

    public function testShouldReturnHardMap(): void
    {
        $hardGameFactory = new AbstractHardGameFactory();
        $game = new Game($hardGameFactory);
        $this->assertEquals("gera mapa no modo dificil", $game->getMap());
    }
}