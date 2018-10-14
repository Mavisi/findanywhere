package acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TipoBeaconDAO;
import model.TipoBeacon;

public class TipoBeaconEdicaoAcao implements Acao {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        
        TipoBeacon tipoBeacon = new TipoBeacon();
        tipoBeacon.setId(Integer.parseInt(req.getParameter("id")));
        tipoBeacon.setDescricao(req.getParameter("descricao"));
        tipoBeacon.setLayout(req.getParameter("layout"));
        
        TipoBeaconDAO tipoBeaconDAO = new TipoBeaconDAO();
        tipoBeaconDAO.updateTipoBeacon(tipoBeacon);
        
        res.sendRedirect("tipobeacon");
        
        return null;
    }

}
