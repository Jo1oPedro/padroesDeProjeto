<?php

require __DIR__ . "/vendor/autoload.php";

$cliente = new \Interpreter\Php\Cliente();
$cliente->importaProduto(preco:10, peso:20);

//vendor/bin/phpunit tests --colors