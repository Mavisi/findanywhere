package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import connection.ConnectionFactory;
import model.Endereco;
import model.TipoBeacon;

public class EnderecoDAO {

    public List<Endereco> getEnderecos() {
    
        EntityManager em =  new ConnectionFactory().getConnection();
        
        List<Endereco> enderecos = new ArrayList<Endereco>();
    
    try {
        enderecos = em.createQuery("from Endereco t").getResultList();
    }catch (Exception e) {
        System.err.println(e);
    }finally {
        em.close();
    }
    return enderecos;
    
    }      

public Endereco getEndereco(int id) {
    
    EntityManager em = new ConnectionFactory().getConnection();
    
    Endereco enderecos = null;
    
    try {
        enderecos = em.find(Endereco.class, id );
    }catch (Exception e){
    System.err.println(e);    
    }finally {
        em.close();
    }
    return enderecos;
}

public void updateEndereco(Endereco enderecos) {
    
    EntityManager em =  new ConnectionFactory().getConnection();
    
    try {
        em.getTransaction().begin();
        em.merge(enderecos);
        em.getTransaction().commit();
    }catch (Exception e) {
        System.err.println(e);
        em.getTransaction().rollback();
    }finally {
        em.close();
    }
}

public void deleteEndereco(int id) {
     EntityManager em =  new ConnectionFactory().getConnection();
     Endereco enderecos =  em.find(Endereco.class, id);

     try { 
         em.getTransaction().begin();
         em.remove(enderecos);
         em.getTransaction().commit();
     }catch (Exception e) {
         em.getTransaction().rollback();   
     }finally {
         em.close();
       }
    }
}
