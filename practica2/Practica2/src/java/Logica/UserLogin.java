/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Usuario;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;



/**
 *
 * @author carlos
 */
public class UserLogin {
    private Session sesion;
    
    public UserLogin() {
        sesion = HibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    public Usuario getSesionUsuario(String nombre, String contrasenia) {
        Usuario us;
        try {
            Transaction t = sesion.beginTransaction();
            String qs = "FROM Usuario WHERE nombre = "+nombre+ "AND contrasenia = "+contrasenia;
            Query q = sesion.createQuery(qs);
            return (Usuario) q.uniqueResult();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
