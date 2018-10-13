package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import model.interfaces.Autenticavel;

@Entity
@Table(name = "empresas")
public class Empresa implements Autenticavel {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idempresa")
    private int id;
    private String cnpj;
    @Column(name="razao_social")
    private String razaoSocial;
    @Column(name="nome_fantasia")
    private String nomeFantasia;
    @Column(name="inscricao_estadual", length=12)
    private String inscricaoEstadual;
    @Column(length=14)
    private String telefone;
    @OneToOne
    @JoinColumn(name="idendereco")
    private Endereco endereco;
    @Column(name="nome_usuario", length=8)
    private String nomeUsuario;
    private String email;
    @Column(length=12)
    private String senha;
    @OneToMany
    @JoinColumn(name="idempresa")
    private List<Area> areas = new ArrayList<Area>();
    @OneToMany
    @JoinColumn(name="idempresa")
    private List<Pessoa> pessoas = new ArrayList<Pessoa>();
    @OneToMany
    @JoinColumn(name="idempresa")
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
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
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
