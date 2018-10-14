package acao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TipoBeaconDAO;
import model.TipoBeacon;

public class TipoBeaconListagemAcao implements Acao {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        
        List<TipoBeacon> tipoBeacons = new TipoBeaconDAO().getTiposBeacon();
        req.setAttribute("tipobeacons", tipoBeacons);
        
        return "WEB-INF/jsp/" + req.getParameter("view");
    }

}
