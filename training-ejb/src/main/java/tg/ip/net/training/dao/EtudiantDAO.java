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
import tg.ip.net.training.entities.Etudiant;

/**
 *
 * @author delaCruz
 */
@Stateless
public class EtudiantDAO {
    
    @PersistenceContext(unitName = "tg.ip.net_training-web_war_1.0PU")
    protected EntityManager em;
    
    public Boolean ajouter(Etudiant e) {
        
        em.persist(e);
        
        return true;
    }
    
    public Etudiant chercherUn(Long id) {
        Etudiant e = em.find(Etudiant.class, id);
        return e;
    }

    public List<Etudiant> lister() {
        String query = "SELECT e FROM Etudiant e";
        List<Etudiant> listEtudiants = em.createQuery(query).getResultList();
        return listEtudiants;
    }
    
    
}
