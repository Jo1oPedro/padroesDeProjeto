<?php

namespace Proxy\tests;

use PHPUnit\Framework\TestCase;
use Proxy\Php\EmailProxy;

class EmailProxyTest extends TestCase
{
    public function testDeveGerarLogDosDadosEnviadosPorEmail(): void
    {
        $emailProxy = new EmailProxy();
        $emailProxy->enviaEmail("dale1", "dale2", "dale3", "dale4");
        $this->assertNotFalse($this->consultaLog("dale1 dale2 dale3 dale4"));
    }

    public function consultaLog(string $conteudo): bool
    {
        $conteudo_log = file_get_contents("log.txt");
        if(strpos($conteudo_log, $conteudo) === false) {
            return false;
        }
        return true;
    }
}