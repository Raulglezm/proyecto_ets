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
public class UsuarioTest {

    Usuario usuario;

    public static final int id = 1010;

    @BeforeEach
    public void before() {
        if (usuario == null) {
            usuario = new Usuario(id);

        }
    }

    @Test
    public void constructorTest() {
        Assertions.assertNotNull(usuario, "El objeto usuario no puede ser nulo");
    }

    @Test
    public void addClienteTest() {
        String nombre = "juan";
        String apellido = "martin";
        usuario.addCliente(id, nombre, apellido);

        Assertions.assertNotNull(usuario.clientes, "Los usuarios no deben ser nulos");
    }

}