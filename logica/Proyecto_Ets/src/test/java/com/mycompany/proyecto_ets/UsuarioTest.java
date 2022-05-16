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
    public static final String nombre = "juan";
    public static final String contra = "1q2w3e4r";

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
        usuario.addCliente(id, nombre, contra);

        Assertions.assertNotNull(usuario.clientes, "Los usuarios no deben ser nulos");
    }

    @Test
    public void clienteExisteTest(){
        usuario.addCliente(id, nombre, contra);
        Assertions.assertTrue(usuario.clienteExiste(contra, nombre), "El cliente no debe existir" );
    }

    @Test
    public void clienteNoExisteTest(){
        usuario.addCliente(id, nombre, contra);
        Assertions.assertFalse(usuario.clienteExiste("212121", nombre), "El cliente si debe existir" );
    }


}