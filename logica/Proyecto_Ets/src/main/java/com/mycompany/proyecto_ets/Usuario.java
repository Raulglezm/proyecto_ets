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
public class Usuario {

    int id;
    public ArrayList<Cliente> clientes;
    Cliente cliente;

    /**
     * Constructor de la clase Usuario
     * 
     * @param id de usuario
     */
    public Usuario(int id) {
        this.id = id;
        clientes = new ArrayList<>();
    }

    /**
     * Metodo para aniadir clientes a la tienda
     * @param contra del cliente
     * @param id       del cliente
     * @param nombre   del cliente
     */
    public void addCliente(int id, String nombre, String contra) {
        cliente = new Cliente(id, nombre, contra);
        clientes.add(cliente);
    }

    /**
     * Este metodo comprueba si un cliente ya existe
     * 
     * @return verdadero si el cliente existe
     */
    public boolean clienteExiste(String contra, String nombre) {
        for (Cliente cliente : clientes) {
            if(nombre.equals(cliente.getNombre()) && contra.equals(cliente.getContra())){
                return true;
            }
        }
        return false;
    }


    

}
