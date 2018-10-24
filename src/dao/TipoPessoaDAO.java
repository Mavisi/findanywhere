package dao;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionFactory;
import model.TipoPessoa;

public class TipoPessoaDAO {

    @SuppressWarnings("unchecked")
    public List<TipoPessoa> getTiposPessoa(){
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        List<TipoPessoa> tipoPessoas =  new ArrayList<TipoPessoa>();
        
        try {
            tipoPessoas = em.createQuery("from TipoPessoa t").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        }finally {
            em.close();
        }
        return tipoPessoas; 
    }
    
    public TipoPessoa getTipoPessoa(int id) {
        
        EntityManager em = new ConnectionFactory().getConnection();
    
        TipoPessoa tipoPessoa = null; 
        
        try {
            tipoPessoa =  em.find(TipoPessoa.class, id);
        }catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return tipoPessoa;
    
    }
    
    
}
