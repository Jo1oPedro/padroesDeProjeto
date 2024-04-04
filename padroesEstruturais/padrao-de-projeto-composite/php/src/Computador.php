<?php

namespace Composite\Php;

use Composite\Php\Componentes\Componente;
use Ds\Vector;

class Computador
{
    public function __construct(
        private Vector $componentes = new Vector(),
    ) {
    }

    public function setComponentes(Componente $componente): Computador
    {
        $this->componentes->push($componente);
        return $this;
    }

    public function getDescricao(): string
    {
        $saida = "Descrição: \n";
        /** @var Componente $componente */
        foreach($this->componentes as $componente) {
            $saida .= $componente->getDescricao() . "\n";
        }

        return $saida;
    }

    public function getComponentes(): Vector
    {
        return $this->componentes;
    }
}