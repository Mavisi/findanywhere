package acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AreaDAO;
import model.Area;

public class AreaObtencaoAcao implements Acao {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        Area area = new AreaDAO()
                .getArea(Integer.parseInt(req.getParameter("id")));
        
        req.setAttribute("area", area);
        
        return "WEB-INF/jsp/" + req.getParameter("view");
    }

}
