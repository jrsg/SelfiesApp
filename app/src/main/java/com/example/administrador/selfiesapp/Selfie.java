package com.example.administrador.selfiesapp;

/**
 * Created by Administrador on 18/02/2017.
 */

public class Selfie {
    private int id;
    private String titulo = "";

    public Selfie(int id, String titulo){
        this.id = id;
        this.titulo = titulo;
    }

    public int getId(){
        return this.id;
    }

    public String getTitulo(){
        return this.titulo;
    }
}
