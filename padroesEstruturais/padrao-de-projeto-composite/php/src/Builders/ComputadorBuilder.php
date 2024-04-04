<?php

namespace Composite\Php\Builders;

use Composite\Php\Componentes\Componente;
use Composite\Php\Componentes\Fonte;
use Composite\Php\Componentes\PlacaMae;
use Composite\Php\Componentes\Processador;
use Composite\Php\Computador;

class ComputadorBuilder
{
    public function __construct(
        private Computador $computador = new Computador()
    ) {
    }

    public function build(): Computador
    {
        $contemPlacaMae = false;
        $contemProcessador = false;
        $contemFonte = false;
        if($this->computador->getComponentes()->isEmpty()) {
            throw new \InvalidArgumentException("Computador sem peças");
        }

        /** @var Componente $componente */
        foreach($this->computador->getComponentes() as $componente) {
            if ($componente instanceof PlacaMae) {
                $contemPlacaMae = true;
            } else if ($componente instanceof Processador) {
                $contemProcessador = true;
            } else if ($componente instanceof Fonte) {
                $contemFonte = true;
            }
        }

        if(!$contemPlacaMae || !$contemProcessador || !$contemFonte) {
            throw new \InvalidArgumentException("Computador incompleto");
        }

        return $this->computador;
    }

    public function setComponentes(Componente $componente): ComputadorBuilder
    {
        $this->computador->setComponentes($componente);
        return $this;
    }
}