package model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import model.interfaces.Rastreavel;

@Entity
@Table(name="pessoas")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="classe_java")
public class Pessoa implements Rastreavel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idpessoa")
    private int id;
    private String nome;
    @Column(length=11)
    private String cpf;
    @Column(length=14)
    private String telefone;
    @Column(name="endereco_bluetooth", length=17)
    private String enderecoBluetooth;
    @ManyToOne
    @JoinColumn(name="idtipo_pessoa")
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
