<?php

namespace Interpreter\Php;

class Cliente
{
    public function importaProduto(float $preco, float $peso) {
        return Importadora::calcularImposto($preco, $peso);
    }
}