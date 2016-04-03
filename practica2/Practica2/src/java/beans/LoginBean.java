/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author carlos
 */

@ManagedBean
@RequestScoped
public class LoginBean {
    private FacesMessage mensaje;
    private final FacesContext faceContext;
    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
        faceContext = FacesContext.getCurrentInstance();
    }
    
    public String inicio(){
        return "index";
    }
    
    public String cerrarSesion(){
        mensaje = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Sesión cerrada", null);
        faceContext.addMessage(null, mensaje);
        faceContext.getExternalContext().invalidateSession();
        return "index";
    }
    
    public String motin(){
        return "";
    }
    
    
}
