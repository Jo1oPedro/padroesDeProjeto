<?php

namespace interpreter\tests;

use Interpreter\Php\Cliente;
use PHPUnit\Framework\TestCase;

class ClienteTest extends TestCase
{
    /** @test */
    public function deveCalcularPrecoProduto(): void
    {
        $cliente = new Cliente();
        $this->assertEquals(
            60,
            $cliente->importaProduto(10, 20)
        );
    }
}