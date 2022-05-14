/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto_ets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Raúl González Martín<Raulglezmartin@gmail.com>
 */
public class ClienteTest {

    Cliente cliente;
    
    public static final int id = 1010;
    public static final String nombre = "nombre";
    public static final String apellido = "apellido";

    @BeforeEach
    public void before() {
        if (cliente == null) {
            cliente = new Cliente(id, nombre, apellido);

        }
    }
    
    @Test
    public void constructorTest() {
        Assertions.assertNotNull(cliente, "El objeto cliente no puede ser nulo");
    }

}