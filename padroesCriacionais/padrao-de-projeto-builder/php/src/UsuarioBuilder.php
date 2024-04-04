<?php

namespace Builder\Php;

class UsuarioBuilder
{
    private Usuario $usuario;

    public function __construct()
    {
        $this->usuario = new Usuario();
    }

    public function build(): Usuario
    {
        if($this->usuario->getNome() === '') {
            throw new \InvalidArgumentException('Nome inválido');
        }

        if($this->usuario->getEmail() === '') {
            throw new \InvalidArgumentException('Email inválido');
        }

        if($this->usuario->getSenha() === '') {
            throw new \InvalidArgumentException('Senha inválida');
        }

        return $this->usuario;
    }

    public function setNome(string $nome): UsuarioBuilder
    {
        $this->usuario->setNome($nome);
        return $this;
    }

    public function setEmail(string $email): UsuarioBuilder
    {
        $this->usuario->setEmail($email);
        return $this;
    }

    public function setSenha(string $senha): UsuarioBuilder
    {
        $this->usuario->setSenha($senha);
        return $this;
    }

    public function setEndereco(string $endereco): UsuarioBuilder
    {
        $this->usuario->setEndereco($endereco);
        return $this;
    }

    public function setApelido(string $apelido): UsuarioBuilder
    {
        $this->usuario->setApelido($apelido);
        return $this;
    }

    public function setDicaSenha(string $dicaSenha): UsuarioBuilder
    {
        $this->usuario->setDicaSenha($dicaSenha);
        return $this;
    }

}