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
public class TiendaTest {

    Tienda tienda;

    public static final String nombre = "Manzana";
    public static final int id = 1010;

    @BeforeEach
    public void before() {
        if (tienda == null) {
            tienda = new Tienda(id, nombre);
        }
    }

    @Test
    public void constructorTest() {
        Assertions.assertNotNull(tienda, "El objeto tienda no puede ser nulo");
    }

    @Test
    public void addAlmacenTest(){
        tienda.addAlmacen(id, nombre);
        Assertions.assertNotNull(tienda.almacenes, "Los almacenes no deberian ser nulos");
    }


    @Test
    public void addUsuarioTest() {
        tienda.addUsuario(1212);
        Assertions.assertNotNull(tienda.usuarios, "Los usuarios no deben ser nulos");
    }

    @Test
    public void listarAlmacenesTest(){
        tienda.addAlmacen(id, nombre);
        Assertions.assertTrue(tienda.listarAlmacenes().contains(nombre) && tienda.listarAlmacenes().contains(id+""), "La lista deberia contener el nombre");
    }
}

