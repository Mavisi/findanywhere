package acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AreaDAO;
import model.Area;

public class AreaEdicaoAcao implements Acao {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        Area area = new Area();
        
        area.setId(Integer.parseInt(req.getParameter("id")));
        area.setDescricao(req.getParameter("descricao"));
        
        AreaDAO areaDAO = new AreaDAO();
        areaDAO.updateArea(area);
        
        res.sendRedirect("area");
        return null;
    }

}
