/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto_ets;

import java.util.ArrayList;

/**
 *
 * @author Raúl González Martín<Raulglezmartin@gmail.com>
 */
class Usuario {

    int id;
    ArrayList<Cliente> clientes;
    Cliente cliente;

    /**
     * Constructor de la clase Usuario
     * @param id de usuario
     */
    public Usuario(int id){
        this.id = id;
        clientes = new ArrayList<>();
    }


    /**
     * Metodo para aniadir clientes a la tienda
     * @param id del cliente
     * @param nombre del cliente
     * @param apellido del cliente
     */
    public void addCliente(int id, String nombre, String apellido){
        cliente = new Cliente(id, nombre, apellido);
        clientes.add(cliente);
    }

}
