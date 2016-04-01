/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author carlos
 */
public class Usuario {
    private int id;
    private String nombre;
    private String app;
    private String apm;
    private String correo;
    private String fecha_nac;
    private String contrasenia;
    private int id_telefono;
    private int id_tiposangre;

    public Usuario() {
    }

    
    public Usuario(int id, String nombre, String app, String apm, String correo, String fecha_nac, String contrasenia, int id_telefono, int id_tiposangre) {
        this.id = id;
        this.nombre = nombre;
        this.app = app;
        this.apm = apm;
        this.correo = correo;
        this.fecha_nac = fecha_nac;
        this.contrasenia = contrasenia;
        this.id_telefono = id_telefono;
        this.id_tiposangre = id_tiposangre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApp() {
        return app;
    }

    public String getApm() {
        return apm;
    }

    public String getCorreo() {
        return correo;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public int getId_telefono() {
        return id_telefono;
    }

    public int getId_tiposangre() {
        return id_tiposangre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public void setApm(String apm) {
        this.apm = apm;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setId_telefono(int id_telefono) {
        this.id_telefono = id_telefono;
    }

    public void setId_tiposangre(int id_tiposangre) {
        this.id_tiposangre = id_tiposangre;
    }
    
    
    
}


