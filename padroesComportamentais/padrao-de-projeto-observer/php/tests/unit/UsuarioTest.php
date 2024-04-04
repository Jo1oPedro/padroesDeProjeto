<?php

namespace unit;

use Observer\Php\Loja;
use Observer\Php\Produto;
use Observer\Php\Usuario;
use PHPUnit\Framework\TestCase;

class UsuarioTest extends TestCase
{
    public function testDeveNotificarUsuario()
    {
        $usuario = new Usuario();
        $loja = (new Loja())->attach($usuario);
        $produto = (new Produto())->setNome("camisa")->setPreco(10.0)->setPromocao(10);
        $loja->setProdutosEmPromocao($produto)->notify();
        $this->assertEquals("nome do produto: camisa | preco: 9", $usuario->getNotificacaoDesconto());
    }

    public function testDeveNotificarUsuarios()
    {
        $usuario = new Usuario();
        $usuario2 = new Usuario();
        $loja = (new Loja())->attach($usuario)->attach($usuario2);
        $produto = (new Produto())->setNome("camisa")->setPreco(10.0)->setPromocao(10);
        $loja->setProdutosEmPromocao($produto)->notify();
        $this->assertEquals("nome do produto: camisa | preco: 9", $usuario->getNotificacaoDesconto());
        $this->assertEquals("nome do produto: camisa | preco: 9", $usuario2->getNotificacaoDesconto());
    }

    public function testNaoDeveNotificarUsuario()
    {
        $usuario = new Usuario();
        $loja = new Loja();
        $produto = (new Produto())->setNome("camisa")->setPreco(10.0)->setPromocao(10);
        $loja->setProdutosEmPromocao($produto)->notify();
        $this->assertEquals("", $usuario->getNotificacaoDesconto());
    }

    public function testDeveNotificarSomenteUsuarioPrimeiraLoja()
    {
        $usuario = new Usuario();
        $usuario2 = new Usuario();
        $loja = (new Loja())->attach($usuario);
        $loja2 = (new Loja())->attach($usuario2);
        $produto = (new Produto())->setNome("camisa")->setPreco(10.0)->setPromocao(10);
        $loja->setProdutosEmPromocao($produto)->notify();
        $this->assertEquals("nome do produto: camisa | preco: 9", $usuario->getNotificacaoDesconto());
        $this->assertEquals("", $usuario2->getNotificacaoDesconto());
    }
}