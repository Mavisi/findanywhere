package acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AreaDAO;

public class AreaExclusaoAcao implements Acao {

    @Override
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
        AreaDAO areaDAO = new AreaDAO();
        
        areaDAO.deleteArea(Integer.parseInt(req.getParameter("id")));
        
        res.sendRedirect("area");
        return null;
    }

}
