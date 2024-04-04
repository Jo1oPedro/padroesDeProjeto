<?php

namespace unit;
use Composite\Php\Builders\ComputadorBuilder;
use Composite\Php\Componentes\Fonte;
use Composite\Php\Componentes\PlacaMae;
use Composite\Php\Componentes\Processador;
use Composite\Php\Pecas\Parafuso;
use PHPUnit\Framework\TestCase;


class computadorBuilderTest extends TestCase
{

    public function testDeveRetornarExcecaoParaComputadorSemPecas(): void
    {
        $this->expectException(\InvalidArgumentException::class);
        $this->expectExceptionMessage("Computador sem peças");
        $computadorBuilder = new ComputadorBuilder();
        $computadorBuilder->build();
    }

    public function testDeveRetornarExcecaoParaComputadorIncompletoSemPlacaMae(): void
    {
        try {
            $computadorBuilder = (new ComputadorBuilder())
                ->setComponentes(new Processador())
                ->setComponentes(new Fonte());

            $computadorBuilder->build();
            fail();
        } catch (\InvalidArgumentException $exception) {
            $this->assertEquals("Computador incompleto", $exception->getMessage());
        }
    }

    public function testDeveRetornarExcecaoParaComputadorIncompletoSemProcessador(): void
    {
        try {
            $computadorBuilder = (new ComputadorBuilder())
                ->setComponentes(new PlacaMae())
                ->setComponentes(new Fonte());

            $computadorBuilder->build();
            fail();
        } catch (\InvalidArgumentException $exception) {
            $this->assertEquals("Computador incompleto", $exception->getMessage());
        }
    }

    public function testDeveRetornarExcecaoParaComputadorIncompletoSemFonte(): void
    {
        try {
            $computadorBuilder = (new ComputadorBuilder())
                ->setComponentes(new PlacaMae())
                ->setComponentes(new Processador());

            $computadorBuilder->build();
            fail();
        } catch (\InvalidArgumentException $exception) {
            $this->assertEquals("Computador incompleto", $exception->getMessage());
        }
    }

    public function testDeveRetornarComputadorComComponentes(): void
    {
        $computadorBuilder = new ComputadorBuilder();
        $computadorBuilder
            ->setComponentes(
                (new PlacaMae())->setDescricao("Placa mãe")->setValor(1000)->setPecas((new Parafuso())->setDescricao("parafuso"))
            )
            ->setComponentes(
                (new Processador())->setDescricao("Processador")->setValor(500)->setPecas((new Parafuso())->setDescricao("parafuso"))
            )
            ->setComponentes(
                (new Fonte())->setDescricao("Fonte")->setValor(200)->setPecas((new Parafuso())->setDescricao("parafuso"))
            );

        $computador = $computadorBuilder->build();
        $this->assertEquals("Descrição: \n" .
            "Placa mãe / valor: 1000\n" .
            "Peças: \n" .
            "parafuso\n" .
            "\n" .
            "Processador / valor: 500\n" .
            "Peças: \n" .
            "parafuso\n" .
            "\n" .
            "Fonte / valor: 200\n" .
            "Peças: \n" .
            "parafuso\n\n",
            $computador->getDescricao()
        );
    }
}