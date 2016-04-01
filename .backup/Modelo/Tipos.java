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
public class Tipos {
    private int id;
    private String tiposangre;

    public Tipos(int id, String tiposangre) {
	this.id = id;
	this.tiposangre = tiposangre;
    }

    public int getId() {
        return id;
    }

    public String getTiposangre() {
        return tiposangre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTiposangre(String tiposangre) {
        this.tiposangre = tiposangre;
    }

   
}
