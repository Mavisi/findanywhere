package model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import model.interfaces.Autenticavel;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name="usuarios")
public abstract class Usuario extends Pessoa implements Autenticavel {
    
    private String email;
    private String nomeUsuario;
    private String senha;
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
    
}
