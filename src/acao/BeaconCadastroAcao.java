package acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BeaconDAO;
import model.Area;
import model.Beacon;
import model.TipoBeacon;

public class BeaconCadastroAcao implements Acao {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        
        Beacon beacon = new Beacon();
        Area areaBeacon = new Area();
        TipoBeacon tipoBeacon = new TipoBeacon();
        BeaconDAO beaconDAO = new BeaconDAO();
        
        areaBeacon.setId(Integer.parseInt(req.getParameter("area")));
        tipoBeacon.setId(Integer.parseInt(req.getParameter("tipoBeacon")));
        
        beacon.setAreaBeacon(areaBeacon);
        beacon.setTipoBeacon(tipoBeacon);
        beacon.setUuid(req.getParameter("uuid"));
        beacon.setDescricao(req.getParameter("descricao"));
        beacon.setTxPower(Integer.parseInt(req.getParameter("txPower")));
        beacon.setMajor(Integer.parseInt(req.getParameter("major")));
        beacon.setMinor(Integer.parseInt(req.getParameter("minor")));
        
        beaconDAO.addBeacon(beacon);
        
        res.sendRedirect("beacon");
        return null;
    }

}
