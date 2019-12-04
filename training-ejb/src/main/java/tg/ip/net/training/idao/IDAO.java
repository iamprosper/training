/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.training.idao;

import java.io.Serializable;

/**
 *
 * @author delaCruz
 * @param <T>
 * @param <PK>
 */
public interface IDAO<T extends Object, PK extends Serializable>{
    
    public Boolean ajouter(T t);
    public Boolean supprimer(T t);
    public T modifier(T t);
}
