import org.example.Usuario;

public class UsuarioBuilder {

    private Usuario usuario = null;
    public UsuarioBuilder() {
        this.usuario = new Usuario();
    }

    public Usuario build()
    {
        if(this.usuario.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }

        if(this.usuario.getEmail().equals("")) {
            throw new IllegalArgumentException("Email inválido");
        }

        if(this.usuario.getSenha().equals("")) {
            throw new IllegalArgumentException("Senha inválida");
        }

        return this.usuario;
    }

    public UsuarioBuilder setNome(String nome) {
        this.usuario.setNome(nome);
        return this;
    }

    public UsuarioBuilder setEmail(String email) {
        this.usuario.setEmail(email);
        return this;
    }

    public UsuarioBuilder setSenha(String senha) {
        this.usuario.setSenha(senha);
        return this;
    }

    public UsuarioBuilder setEndereco(String endereco) {
        this.usuario.setEndereco(endereco);
        return this;
    }

    public UsuarioBuilder setApelido(String apelido) {
        this.usuario.setApelido(apelido);
        return this;
    }

    public UsuarioBuilder setDicaSenha(String dicaSenha) {
        this.usuario.setDicaSenha(dicaSenha);
        return this;
    }
}
