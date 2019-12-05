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
import tg.ip.net.training.dao.FiliereDAO;
import tg.ip.net.training.entities.Filiere;

/**
 *
 * @author delaCruz
 */
public class FiliereController extends HttpServlet {
    
    @EJB
    FiliereDAO filiereDAO;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("filiere\\add.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String nom = req.getParameter("nom_filiere");
        Filiere f = new Filiere();
        f.setNom(nom);
        
        filiereDAO.ajouter(f);
        
        req.getRequestDispatcher("filiere\\list.jsp").forward(req, resp);
    }
    
    
    
}
