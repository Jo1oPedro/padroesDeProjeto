package org.example;

public class Usuario {

    public String nome = "";
    public String email = "";
    public String senha = "";
    public String endereco;
    public String apelido;
    public String dicaSenha;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setDicaSenha(String dicaSenha) {
        this.dicaSenha = dicaSenha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getApelido() {
        return apelido;
    }

    public String getDicaSenha() {
        return dicaSenha;
    }
}
