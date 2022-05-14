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

public class AlmacenTest {

    Almacen almacen;

    public static final String nombre = "Manzananero";
    public static final int id = 1010;

    @BeforeEach
    public void before() {
        if (almacen == null) {
            almacen = new Almacen(id, nombre);
        }
    }

    @Test
    public void constructorTest() {
        Assertions.assertNotNull(almacen, "El objeto almacen no puede ser nulo");
    }

    @Test
    public void addReseniaTest() {
        Producto producto = new Producto(1, "Manzana", 1, 1);
        Usuario usuario = new Usuario(id);
        String cabecera = "Prueba";
        String cuerpo = "Esto es un test";

        almacen.addResenia(cabecera, cuerpo, usuario, producto.id);

        Assertions.assertNotNull(almacen.resenias, "las resenias son nulas");
    }

}
