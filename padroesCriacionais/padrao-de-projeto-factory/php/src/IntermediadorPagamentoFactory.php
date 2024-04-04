<?php

namespace Factory\Php;

class IntermediadorPagamentoFactory
{
    private ?iIntermediadorPagamento $intermediadorPagamento = null;

    public function __construct(String $nomeIntermediador) {
        $fullClassName = "Factory\Php\\$nomeIntermediador";

        if(!class_exists($fullClassName)) {
            throw new \InvalidArgumentException("Classe {$nomeIntermediador} não existente");
        }

        $reflection = new \ReflectionClass($fullClassName);

        if(!$reflection->implementsInterface('Factory\Php\iIntermediadorPagamento')) {
            throw new \RuntimeException("{$nomeIntermediador} deve implementar a interface iIntermediadorPagamento");
        }

        $this->intermediadorPagamento = $reflection->newInstance();
    }

    public function recuperaIntermediador(): iIntermediadorPagamento {
        return $this->intermediadorPagamento;
    }
}