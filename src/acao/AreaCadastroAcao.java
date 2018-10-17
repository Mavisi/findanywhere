package acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AreaDAO;
import model.Area;

public class AreaCadastroAcao implements Acao {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        Area area = new Area();
        AreaDAO areaDAO = new AreaDAO();
        area.setDescricao(req.getParameter("descricao"));
        
        areaDAO.addArea(area);
        res.sendRedirect("area");
        return null;
    }

}
