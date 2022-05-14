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
public class ReseniaTest {

    Resenia resenia;

    public static final Usuario usuario = new Usuario(1010);
    public static final String cabecera = "Manzana";
    public static final String cuerpo = "esta manzana me gusto bastanate";

    @BeforeEach
    public void before() {
        if (resenia == null) {
            resenia = new Resenia(usuario, cabecera, cuerpo);
        }
    }

    @Test
    public void constructorTest() {
        Assertions.assertNotNull(resenia, "El objeto resenia no puede ser nulo");
    }

}
