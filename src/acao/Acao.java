package acao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Acao {
    public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception;
}
