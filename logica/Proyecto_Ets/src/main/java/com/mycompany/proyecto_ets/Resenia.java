/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto_ets;


/**
 *
 * @author Raúl González Martín<Raulglezmartin@gmail.com>
 */
public class Resenia{
    
    //Integer id;
    Usuario usuario;
    String cabecera;
    String cuerpo;
    //Date fecha;
    
    /**
     * Constructor de la clase Resenia
     * @param usuario que hace la resenia
     * @param cabecera de la resenia
     * @param cuerpo de la resenia
     */
    public Resenia(Usuario usuario, String cabecera, String cuerpo) {
        this.cabecera = cabecera;
        this.usuario = usuario;
        this.cuerpo = cuerpo;
    }
   
}
