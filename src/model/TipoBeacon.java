package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_beacons")
public class TipoBeacon {
    
    @Id
    @Column(name="idtipo_beacon")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String descricao;
    private String layout;
    
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
    public String getLayout() {
        return layout;
    }
    public void setLayout(String layout) {
        this.layout = layout;
    }

}
