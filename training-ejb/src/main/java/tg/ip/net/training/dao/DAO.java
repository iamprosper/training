/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.training.dao;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import tg.ip.net.training.idao.IDAO;

/**
 *
 * @author delaCruz
 * @param <T>
 * @param <PK>
 */
public class DAO<T extends Object, PK extends Serializable> implements IDAO<T, PK>{

    @PersistenceContext(unitName = "tg.ip.net_training-web_war_1.0PU")
    private EntityManager em;
    
    private Class<T> entity;
    
    @Override
    public Boolean ajouter(T t) {
        
        entity = (Class<T>) t;
        em.persist(entity);
        
        return true;
    }

    @Override
    public Boolean supprimer(T t) {
        
        entity = (Class<T>) t;
        em.remove(entity);
        return true;
    }

    @Override
    public T modifier(T t) {
        
        entity = (Class<T>) t;
        em.merge(entity);
        return t;
    }

    
}
