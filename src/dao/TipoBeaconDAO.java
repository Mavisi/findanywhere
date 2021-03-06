package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionFactory;
import model.TipoBeacon;

public class TipoBeaconDAO {
    
    @SuppressWarnings("unchecked")
    public List<TipoBeacon> getTiposBeacon() {
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        List<TipoBeacon> tipoBeacons = new ArrayList<TipoBeacon>();
        try {
            tipoBeacons = em.createQuery("from TipoBeacon t").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return tipoBeacons;
        
    }
    
    public TipoBeacon getTipoBeacon(int id) {
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        TipoBeacon tipoBeacon = null;
        try {
            tipoBeacon = em.find(TipoBeacon.class, id); 
        } catch (Exception e) {
          System.err.println(e);
        } finally {
          em.close();  
        }
        return tipoBeacon;
    }
    
    public void addTipoBeacon(TipoBeacon tipoBeacon) {
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            em.persist(tipoBeacon);          
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        
    }
    
    public void updateTipoBeacon(TipoBeacon tipoBeacon) {
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            em.merge(tipoBeacon);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        
    }
    
    public void deleteTipoBeacon(int id) {
        
        EntityManager em = new ConnectionFactory().getConnection();
        TipoBeacon tipoBeacon = em.find(TipoBeacon.class, id);
        
        try {
            em.getTransaction().begin();
            em.remove(tipoBeacon);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        
    }
    
}
