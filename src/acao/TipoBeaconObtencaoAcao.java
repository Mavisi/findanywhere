package acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TipoBeaconDAO;
import model.TipoBeacon;

public class TipoBeaconObtencaoAcao implements Acao {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        
        TipoBeacon tipoBeacon = new TipoBeaconDAO()
                .getTipoBeacon(Integer.parseInt(req.getParameter("id")));
        
        req.setAttribute("tipoBeacon", tipoBeacon);
        
        return "WEB-INF/jsp/" + req.getParameter("view");
    }

}
