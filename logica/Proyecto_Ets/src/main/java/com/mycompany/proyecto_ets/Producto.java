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
public class Producto {

    int id;
    String nombre;
    double valoracion;
    double precio;

    /**
     * Constructor con Parametros de la clase Producto
     *
     * @param id del producto
     * @param nombre del producto
     * @param valoracion del producto
     * @param precio del producto
     */
    public Producto(int id, String nombre, double valoracion, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.valoracion = valoracion;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", valoracion=" + valoracion + "]";
    }

}
