/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.training.idao;

import java.io.Serializable;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author delaCruz
 * @param <T>
 * @param <PK>
 */
@Local
public interface FiliereIDAO <T extends Object, PK extends Serializable>{
    public List<T> lister();
}
