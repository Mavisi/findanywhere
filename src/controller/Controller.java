package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.util.StringUtils;

import acao.Acao;

public abstract class Controller extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        
        String acao = req.getParameter("acao");
        String nomeClasse = "acao." + this.getClass().getSimpleName().replaceAll("Controller", "") + StringUtils.capitalize(acao) + "Acao";
        
        System.out.println(nomeClasse);
        
        try {
            if (acao != null) {
                Class<?> classe = Class.forName(nomeClasse);
                Acao logica = (Acao) classe.newInstance();
                String pagina = logica.executa(req, res);
                
                if (pagina != null)
                    req.getRequestDispatcher(pagina).forward(req, res);
            }
            else {
                this.redirectToDefaultPage(req, res);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    protected abstract void redirectToDefaultPage(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException;

}