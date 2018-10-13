package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="grupos")
public class GrupoControle {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idgrupo")
    private int id;
    private String descricao;
    @OneToMany(fetch=FetchType.EAGER)
    @JoinColumn(name="idgrupo")
    private List<Pessoa> pessoasGrupo = new ArrayList<Pessoa>();
    @ManyToMany
    @JoinTable(
        name="grupos_areas", 
        joinColumns = @JoinColumn(name="idgrupo"),
        inverseJoinColumns = @JoinColumn(name="idarea")
    )
    private List<Area> areasPermitidas = new ArrayList<Area>();
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public List<Pessoa> getPessoasGrupo() {
        return pessoasGrupo;
    }
    public void setPessoasGrupo(List<Pessoa> pessoasGrupo) {
        this.pessoasGrupo = pessoasGrupo;
    }
    public List<Area> getAreasPermitidas() {
        return Collections.unmodifiableList(areasPermitidas);
    }
    public void addArea(Area area) {
        this.areasPermitidas.add(area);
    }    
}

