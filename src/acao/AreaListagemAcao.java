package acao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AreaDAO;
import model.Area;

public class AreaListagemAcao implements Acao {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        List<Area> areas = new AreaDAO().getAreas();
        
        req.setAttribute("areas", areas);
        
        return "WEB-INF/jsp/" + req.getParameter("view");
    }

}
