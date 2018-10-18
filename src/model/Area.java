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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="areas")
public class Area {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="idarea")
    private int id;
    private String descricao;
    @OneToMany(mappedBy = "areaBeacon", fetch = FetchType.EAGER)
    private List<Beacon> beacons = new ArrayList<Beacon>();
    
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
    public List<Beacon> getBeacons() {
        return Collections.unmodifiableList(beacons);
    }
    
    public void addBeacon(Beacon beacon) {
        this.beacons.add(beacon);
    }
    
    public String getBeaconsExtenso() {
        String beacons = "";
        
        for (Beacon beacon : this.beacons) {
            if (this.beacons.indexOf(beacon) == this.beacons.size() - 1) {
                beacons += beacon.getDescricao();
            }
            else if (this.beacons.indexOf(beacon) == this.beacons.size() - 2) {
                beacons += beacon.getDescricao()+ " e ";
            }
            else {
                beacons += beacon.getDescricao()+ ", ";
            }
        }
        
        return beacons;
    }
    
}
