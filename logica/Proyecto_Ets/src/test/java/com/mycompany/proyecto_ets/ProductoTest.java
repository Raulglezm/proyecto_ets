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
public class ProductoTest {

    Producto producto;
    
    public static final int id = 1010;
    public static final String nombre = "Manzana";
    public static final double valoracion = 1;
    public static final double precio = 10;

    @BeforeEach
    public void before() {
        if (producto == null) {
            producto = new Producto(id, nombre, valoracion, precio);

        }
    }
    
    @Test
    public void constructorTest() {
        Assertions.assertNotNull(producto, "El objeto producto no puede ser nulo");
    }
    
   

}
