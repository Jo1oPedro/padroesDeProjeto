<?php

namespace tests;

use Builder\Php\Usuario;
use Builder\Php\UsuarioBuilder;
use PHPUnit\Framework\TestCase;

class UsuarioTest extends TestCase
{
    public function testDeveRetornarExcecaoParaNomeInvalido(): void
    {
        $usuarioBuilder = new UsuarioBuilder();
        $this->expectException(\InvalidArgumentException::class);
        $this->expectExceptionMessage('Nome inválido');
        $usuarioBuilder->build();
    }

    public function testDeveRetornarExcecaoParaEmailInvalido(): void
    {
        $usuarioBuilder = new UsuarioBuilder();
        $usuarioBuilder->setNome("joão");
        $this->expectException(\InvalidArgumentException::class);
        $this->expectExceptionMessage('Email inválido');
        $usuarioBuilder->build();
    }

    public function testDeveRetornarExcecaoParaSenhaInválida(): void
    {
        $usuarioBuilder = new UsuarioBuilder();
        $usuarioBuilder->setNome("joão");
        $usuarioBuilder->setEmail("joao@gmail.com");
        $this->expectException(\InvalidArgumentException::class);
        $this->expectExceptionMessage('Senha inválida');
        $usuarioBuilder->build();
    }

    public function testDeveRetornarUsuarioComSucesso(): void
    {
        $usuarioBuilder = new UsuarioBuilder();
        $usuarioBuilder->setNome("joão");
        $usuarioBuilder->setEmail("joao@gmail.com");
        $usuarioBuilder->setSenha("123456");
        $usuario = $usuarioBuilder->build();
        $this->assertInstanceOf(Usuario::class, $usuario);
    }
}