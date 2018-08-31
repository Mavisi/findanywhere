package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Area {
    
    private int id;
    private String descricao;
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
    
}
