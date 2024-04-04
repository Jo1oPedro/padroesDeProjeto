<?php

namespace singleton\php;

use Singleton\Php\Email;
use Singleton\Php\Pessoa;
use PHPUnit\Framework\TestCase;

class EmailTest extends TestCase
{
    public function testDeveRetornarUmaInstanciaDeEmail(): void {
        $email = Email::getInstance();
        $this->assertInstanceOf(Email::class, $email);
    }

    public function testDeveRetornarMesmoObjetoEmailSempre(): void {
        $email1 = Email::getInstance();
        $email2 = Email::getInstance();
        $this->assertSame($email1, $email2);
    }

    public function testDeveLancarEmailComSucesso(): void {
        $email = Email::getInstance();
        $this->assertEquals(
            "...realiza a lógica de enviar os dados a partir de alguma biblioteca de envio de email",
            $email->send(
                "matricula",
                "matricula aprovada",
                (new Pessoa()),
                (new Pessoa())
            )
        );
    }
}
