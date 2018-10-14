package acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TipoBeaconDAO;
import model.TipoBeacon;

public class TipoBeaconCadastroAcao implements Acao {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        TipoBeacon tipoBeacon = new TipoBeacon();
        tipoBeacon.setDescricao(req.getParameter("descricao"));
        tipoBeacon.setLayout(req.getParameter("layout"));
        
        TipoBeaconDAO tipoBeaconDAO = new TipoBeaconDAO();
        tipoBeaconDAO.addTipoBeacon(tipoBeacon);
        
        res.sendRedirect("/tipobeacon");
        return null;
    }
    
}
