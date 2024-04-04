<?php

namespace Builder\Php;

class Usuario
{
    public String $nome = "";
    public String $email = "";
    public String $senha = "";
    public String $endereco;
    public String $apelido;
    public String $dicaSenha;

    /**
     * @return String
     */
    public function getNome(): string
    {
        return $this->nome;
    }

    /**
     * @param String $nome
     */
    public function setNome(string $nome): void
    {
        $this->nome = $nome;
    }

    /**
     * @return String
     */
    public function getEmail(): string
    {
        return $this->email;
    }

    /**
     * @param String $email
     */
    public function setEmail(string $email): void
    {
        $this->email = $email;
    }

    /**
     * @return String
     */
    public function getSenha(): string
    {
        return $this->senha;
    }

    /**
     * @param String $senha
     */
    public function setSenha(string $senha): void
    {
        $this->senha = $senha;
    }

    /**
     * @return String
     */
    public function getEndereco(): string
    {
        return $this->endereco;
    }

    /**
     * @param String $endereco
     */
    public function setEndereco(string $endereco): void
    {
        $this->endereco = $endereco;
    }

    /**
     * @return String
     */
    public function getApelido(): string
    {
        return $this->apelido;
    }

    /**
     * @param String $apelido
     */
    public function setApelido(string $apelido): void
    {
        $this->apelido = $apelido;
    }

    /**
     * @return String
     */
    public function getDicaSenha(): string
    {
        return $this->dicaSenha;
    }

    /**
     * @param String $dicaSenha
     */
    public function setDicaSenha(string $dicaSenha): void
    {
        $this->dicaSenha = $dicaSenha;
    }


}