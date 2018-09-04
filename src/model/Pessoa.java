package model;

import model.interfaces.Rastreavel;

public class Pessoa implements Rastreavel {

    private int id;
    private String nome;
    private String cpf;
    private String telefone;
    private String enderecoBluetooth;
    private TipoPessoa tipoPessoa;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEnderecoBluetooth() {
        return enderecoBluetooth;
    }
    public void setEnderecoBluetooth(String enderecoBluetooth) {
        this.enderecoBluetooth = enderecoBluetooth;
    }
    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }
    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
    
    @Override
    public Area getAreaAtual() {
        // TODO Auto-generated method stub
        return null;
    }

}
