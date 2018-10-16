package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionFactory;
import model.Area;

public class AreaDAO {
    
    @SuppressWarnings("unchecked")
    public List<Area> getAreas() {
       
        EntityManager em = new ConnectionFactory().getConnection();
        
        List<Area> areas = new ArrayList<Area>();
        try {
            areas = em.createQuery("from Area a").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return areas;
        
    }
    
    public Area getArea(int id) {
        EntityManager em = new ConnectionFactory().getConnection();
        
        Area area = null;
        try {
            area = em.find(Area.class, id); 
        } catch (Exception e) {
          System.err.println(e);
        } finally {
          em.close();  
        }
        return area;
        
    }
    
    public void addArea(Area area) {
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            em.persist(area);          
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        
    }
    
    public void updateArea(Area area) {
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            em.merge(area);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
                
    }
    
    public void deleteArea(int id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Area area = em.find(Area.class, id);
        
        try {
            em.getTransaction().begin();
            em.remove(area);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        
    }
    
}
