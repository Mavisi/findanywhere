package acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.TipoBeaconDAO;

public class TipoBeaconExclusaoAcao implements Acao {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        TipoBeaconDAO tipoBeaconDAO = new TipoBeaconDAO();
        
        tipoBeaconDAO.deleteTipoBeacon(Integer.parseInt(req.getParameter("id")));
        
        
        res.sendRedirect("tipobeacon");
        return null;
    }

}
