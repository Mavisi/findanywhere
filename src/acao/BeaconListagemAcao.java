package acao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BeaconDAO;
import model.Beacon;

public class BeaconListagemAcao implements Acao {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        List<Beacon> beacons = new BeaconDAO().getBeacons();
        
        req.setAttribute("beacons", beacons);
        
        return "WEB-INF/jsp/" + req.getParameter("view");
    }

}
