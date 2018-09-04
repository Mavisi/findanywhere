package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.interfaces.Rastreavel;

public class GrupoControle {
    
    private int id;
    private List<Rastreavel> rastreaveis = new ArrayList<Rastreavel>();
    private List<Area> areasPermitidas = new ArrayList<Area>();
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public List<Rastreavel> getRastreaveis() {
        return Collections.unmodifiableList(rastreaveis);
    }    
    public void addRastreavel(Rastreavel rastreavel) {
        this.rastreaveis.add(rastreavel);
    }
    public List<Area> getAreasPermitidas() {
        return Collections.unmodifiableList(areasPermitidas);
    }
    public void addArea(Area area) {
        this.areasPermitidas.add(area);
    }    
}

