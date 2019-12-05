/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.ip.net.training.web.controllers;

import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tg.ip.net.training.dao.EtudiantDAO;
import tg.ip.net.training.entities.Etudiant;

/**
 *
 * @author delaCruz
 */
public class EtudiantController extends HttpServlet {
    
    @EJB
    EtudiantDAO etudiantDAO;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Etudiant etudiant = new Etudiant();
        etudiant.setNom("James");
        
        etudiantDAO.ajouter(etudiant);
        
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
    

}
