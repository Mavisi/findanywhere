package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.interfaces.Autenticavel;

public class Empresa implements Autenticavel {
    
    private int id;
    private String cnpj;
    private String razaoSocial;
    private String inscricaoEstadual;
    private String telefone;
    private Endereco endereco;
    private String nomeUsuario;
    private String email;
    private String senha;
    private List<Area> areas = new ArrayList<Area>();
    private List<Pessoa> pessoas = new ArrayList<Pessoa>();
    private List<GrupoControle> grupoControles = new ArrayList<GrupoControle>();
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }
    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public List<Area> getAreas() {
        return Collections.unmodifiableList(areas);
    }
    public void addArea(Area area) {
        this.areas.add(area);
    }
    public List<Pessoa> getPessoas() {
        return Collections.unmodifiableList(pessoas);
    }
    public void addPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }
    public List<GrupoControle> getGrupoControles() {
        return Collections.unmodifiableList(grupoControles);
    }
    public void addGrupoControle(GrupoControle grupoControle) {
        this.grupoControles.add(grupoControle);
    }
    
    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
    
}
