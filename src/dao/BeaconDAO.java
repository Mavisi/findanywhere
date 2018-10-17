package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionFactory;
import model.Area;
import model.Beacon;

public class BeaconDAO {
    
    @SuppressWarnings("unchecked")
    public List<Beacon> getBeacons() {
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        List<Beacon> beacons = new ArrayList<Beacon>();
        try {
            beacons = em.createQuery("from Beacon b").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        
        return beacons;        
    }
    
    public Beacon getBeacon(int id) {
        EntityManager em = new ConnectionFactory().getConnection();
        
        Beacon beacon = null;
        try {
            beacon = em.find(Beacon.class, id); 
        } catch (Exception e) {
          System.err.println(e);
        } finally {
          em.close();  
        }
        return beacon;

    }
    
    public void addBeacon(Beacon beacon) {
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            em.persist(beacon);          
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        
    }
    
    public void updateBeacon(Beacon beacon) {
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        try {
            em.getTransaction().begin();
            em.merge(beacon);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
                        
    }
    
    public void deleteBeacon(int id) {

        EntityManager em = new ConnectionFactory().getConnection();
        Beacon beacon = em.find(Beacon.class, id);
        
        try {
            em.getTransaction().begin();
            em.remove(beacon);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        
    }
    
}
