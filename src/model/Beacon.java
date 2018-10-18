package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="beacons")
public class Beacon {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idbeacon")
    private int id;
    private String descricao;
    @ManyToOne
    @JoinColumn(name="idtipo_beacon")
    private TipoBeacon tipoBeacon;    
    @ManyToOne
    @JoinColumn(name="idarea")
    private Area areaBeacon;
    @Column(length=36)
    private String uuid;
    private int major;
    private int minor;
    @Column(name="tx_power")
    private int txPower;
    
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
    public TipoBeacon getTipoBeacon() {
        return tipoBeacon;
    }
    public void setTipoBeacon(TipoBeacon tipoBeacon) {
        this.tipoBeacon = tipoBeacon;
    }
    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    public int getMajor() {
        return major;
    }
    public void setMajor(int major) {
        this.major = major;
    }
    public int getMinor() {
        return minor;
    }
    public void setMinor(int minor) {
        this.minor = minor;
    }
    public int getTxPower() {
        return txPower;
    }
    public void setTxPower(int txPower) {
        this.txPower = txPower;
    }
    public Area getAreaBeacon() {
        return areaBeacon;
    }
    public void setAreaBeacon(Area areaBeacon) {
        this.areaBeacon = areaBeacon;
    }
    
}
