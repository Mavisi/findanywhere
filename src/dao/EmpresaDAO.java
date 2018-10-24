package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionFactory;
import model.Empresa;

public class EmpresaDAO {
    
    @SuppressWarnings("unchecked")
    public List<Empresa> getEmpresas() {
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        List<Empresa> empresas = new ArrayList<Empresa>();
        
        try {
            empresas = em.createQuery("from Empresa e").getResultList();
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            em.close();
        }
        return empresas;
    }
    
    public Empresa getEmpresa(int id) {
        
        EntityManager em = new ConnectionFactory().getConnection();
        
        Empresa empresas = null;
        try {
            empresas = em.find(Empresa.class, id);
        }catch (Exception e) {
            System.err.println(e);
        }finally {
            em.close();
        }
        return empresas;
    }

    public void addEmpresa(Empresa empresas) {
        EntityManager em = new ConnectionFactory().getConnection();
        try {
            em.getTransaction().begin();
            em.persist(empresas);
            em.getTransaction().commit();
        }catch(Exception e) {
            System.err.println(e);
            em.getTransaction().rollback();
        }finally {
            em.close();
        }
    }
    
    public void deleteEmpresa( int id) {
        EntityManager em = new ConnectionFactory().getConnection();
        Empresa empresas = em.find(Empresa.class, id);
    
    try {
        em.getTransaction().begin();
        em.remove(empresas);
        em.getTransaction().commit();
    }catch (Exception e) {
        em.getTransaction().rollback();
    }finally { 
        em.close();
        }
    
    }
    
}
