/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.training.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tg.ip.net.training.entities.Filiere;

/**
 *
 * @author delaCruz
 */
@Stateless
public class FiliereDAO {
    
    @PersistenceContext(unitName = "tg.ip.net_training-web_war_1.0PU")
    protected EntityManager em;
    
    public Boolean ajouter(Filiere f) {
        
        em.persist(f);
        
        return true;
    }

    public List<Filiere> lister() {
        String query = "SELECT f FROM FILIERE f";
        List<Filiere> listFiliere = em.createQuery(query).getResultList();
        return listFiliere;
    }
    
}
