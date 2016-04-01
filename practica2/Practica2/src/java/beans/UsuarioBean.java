/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

//import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import Modelo.Usuario;
import Logica.UserLogin;
/**
 *
 * @author carlos
 */
@ManagedBean
@RequestScoped
public class UsuarioBean {
    //private Usuario user = new Usuario();
    private String nombre; // Representa el nombre de usuario.
    private String contrasenia; // Representa la contraseña. NO DEBERÍA de ser manejada como texto plano.
    //Obtiene información de todas las peticiones de usuario.
    private final FacesContext faceContext;
    private final UserLogin ul;

    public String getNombre() {
        return nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    
  
    
    /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {
        faceContext = FacesContext.getCurrentInstance();
        ul = new UserLogin();
    }
    
    public String validacionLogin() {
        String res = "";
        Usuario us = ul.getSesionUsuario(nombre,contrasenia);
        //Considerar el lanzamiento de excepcion 
        if(us == null)
            return "error";
        try {
            FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario",us);
            res = "exito";
        } catch(Exception e) {
            e.printStackTrace();
        }
        return res;
    }
    
}
