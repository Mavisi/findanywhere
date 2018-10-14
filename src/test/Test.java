package test;

import dao.TipoBeaconDAO;
import model.TipoBeacon;

public class Test {

    public static void main(String[] args) {

        TipoBeacon tipoBeacon = new TipoBeacon();
        tipoBeacon.setDescricao("AltBeacon");
        tipoBeacon.setLayout("m:2-3=REDACTED,i:4-19,i:20-21,i:22-23,p:24-24,d:25-25");
        
        TipoBeaconDAO tipoBeaconDAO = new TipoBeaconDAO();
        
        tipoBeaconDAO.addTipoBeacon(tipoBeacon);
    }

}
