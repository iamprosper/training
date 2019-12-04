/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.training.idao;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author delaCruz
 * @param <T>
 * @param <PK>
 */
public interface EtudiantIDAO<T extends Object, PK extends Serializable> extends IDAO<T, PK> {
    public T chercherUn(PK id);
    public List<T> lister();
}
