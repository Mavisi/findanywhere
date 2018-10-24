package dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import connection.ConnectionFactory;
import model.GerenteControle;

public class GerenteControleDAO {

    @SuppressWarnings("unchecked")
    public List<GerenteControle> getGerenteControle(){
        EntityManager em =  new ConnectionFactory().getConnection();
        
        List<GerenteControle> gerenteControles = new ArrayList<GerenteControle>();
    try {
        gerenteControles =  em.createQuery("from GerenteControle g").getResultList();
    }catch (Exception e) {
        System.err.println(e);
    }finally {
        em.close();
    }
    return gerenteControles;
    }
    
    public GerenteControle getGerenteControle(int id) {
        EntityManager em = new ConnectionFactory().getConnection();
        GerenteControle gerenteControles = null;
        
        try {
            gerenteControles = em.find(GerenteControle.class, id);
        }catch (Exception e) {
            System.err.println(e);
        }finally {
            em.close();
        }
        return gerenteControles;
    }
    
    public void  addGerenteControle(GerenteControle gerenteControles) {
        EntityManager em =  new ConnectionFactory().getConnection();
     
        try {
            em.getTransaction().begin();
            em.persist(gerenteControles);
            em.getTransaction().commit();
          }catch (Exception e) {
              System.err.println(e);
              em.getTransaction().rollback();
          }finally {
              em.close();
          }
    }
    
    public void updateGerenteControle(GerenteControle gerenteControles) {
      
        EntityManager em = new ConnectionFactory().getConnection();
        try {
            em.getTransaction().begin();
            em.merge(gerenteControles);
            em.getTransaction().commit();
        }catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        }finally {
            em.close();
        }
    }
    
    
   public void deleteGerenteControle(int id) {
       EntityManager em = new ConnectionFactory().getConnection();
       GerenteControle gerenteControles = em.find(GerenteControle.class, id);
       
       try {
           em.getTransaction().begin();
           em.remove(gerenteControles);
           em.getTransaction().commit();
       }catch (Exception e) {
           em.getTransaction().rollback();
       }finally {
           em.close();
       }
   }
    
}
