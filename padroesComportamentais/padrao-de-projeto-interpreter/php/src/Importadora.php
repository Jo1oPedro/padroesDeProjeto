<?php

namespace Interpreter\Php;

use MathParser\Interpreting\Evaluator;
use MathParser\StdMathParser;

class Importadora
{
    public static string $formula = "(precoProduto + pesoProduto) * 2";

    public static function calcularImposto(float $preco, float $peso): float
    {
        $formula = str_replace(
            ["precoProduto", "pesoProduto"],
            [$preco, $peso],
            self::$formula
        );

        $mathParser = new StdMathParser();
        $evaluator = new Evaluator();
        $result = $mathParser->parse($formula);
        return $result->evaluate($evaluator);
    }
}