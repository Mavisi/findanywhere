package dao;

import java.net.ConnectException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionFactory;
import model.Seguranca;

@SuppressWarnings("unused")
public class SegurancaDAO {

    @SuppressWarnings("unchecked")
    public List<Seguranca> getSeguranca() {
        EntityManager em = new ConnectionFactory().getConnection();
        
        List<Seguranca> segurancas = new ArrayList<Seguranca>();
        try {
            segurancas = em.createQuery("from Seguranca t").getResultList();    
        }catch (Exception e) {
            System.err.println(e);
        }finally {
            em.close();
        }
        return segurancas;
    }
  
    
    public Seguranca getSeguranca(int id) {
        EntityManager em = new ConnectionFactory().getConnection();
        
        Seguranca segurancas =  null;
        
        try {
            segurancas = em.find(Seguranca.class,id);
        }catch (Exception e) {
            System.err.println(e);
        }finally {
            em.close();
        }
        return segurancas;
    }
    
   public void addSeguranca(Seguranca segurancas) {
       EntityManager em = new ConnectionFactory().getConnection();
       
       try {
           em.getTransaction().begin();
           em.persist(segurancas);
           em.getTransaction().commit();
       }catch (Exception e) {
           System.err.println(e);
           em.getTransaction().rollback();
       }finally{
           em.close();
       }
   }
    
   
   public void upadateSeguranca(Seguranca segurancas) {
       
       EntityManager em = new ConnectionFactory().getConnection();
       
       try {
           em.getTransaction().begin();
           em.merge(segurancas);
           em.getTransaction().commit();
       }catch (Exception e) {
           System.err.println(e);
           em.getTransaction().rollback();
       }finally {
           em.close();
       }
   }
    
   public void deleteSeguranca(int id) {
       EntityManager em = new ConnectionFactory().getConnection();
       Seguranca segurancas = em.find(Seguranca.class,id);
       
       try {
           em.getTransaction().begin();
           em.remove(segurancas);
           em.getTransaction().commit();
       }catch (Exception e) {
           em.getTransaction().rollback();
       }finally {
           em.close();
       }
   }
}
