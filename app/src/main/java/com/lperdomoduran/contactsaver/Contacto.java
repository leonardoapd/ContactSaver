package com.lperdomoduran.contactsaver;

/**
 * Created by lperdomoduran on 5/11/16.
 */

public class Contacto {

    private String nombre;
    private String celular;
    private String mail;
    private String descripcion;

    public Contacto(String nombre, String celular, String mail, String descripcion) {
        this.nombre = nombre;
        this.celular = celular;
        this.mail = mail;
        this.descripcion = descripcion;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
