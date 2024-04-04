<?php

namespace Composite\Php\Componentes;

use Composite\Php\Pecas\Peca;
use Ds\Vector;

abstract class Componente
{
    public function __construct(
        private Vector $pecas = new Vector(),
        private float $valor = 0.0,
        private string $descricao = '',
    ) {
    }

    public function setPecas(Peca $peca): Componente
    {
        $this->pecas->push($peca);
        return $this;
    }

    public function getPecas(): string
    {
        $saida = '';
        /** @var Peca $peca */
        foreach($this->pecas as $peca) {
            $saida .= $peca->getDescricao();
        }

        return $saida;
    }

    public function setDescricao(string $descricao): Componente
    {
        $this->descricao = $descricao;
        return $this;
    }

    public function getDescricao(): string
    {
        $saida = $this->descricao . " / valor: " . $this->getValor() . "\nPeças: \n";
        /** @var Peca $peca */
        foreach($this->pecas as $peca) {
            $saida .= $peca->getDescricao() . "\n";
        }
        return $saida;
    }

    public function setValor(float $valor): Componente
    {
        $this->valor = $valor;
        return $this;
    }

    public function getValor(): float
    {
        return $this->valor;
    }
}