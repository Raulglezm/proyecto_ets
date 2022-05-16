/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto_ets;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * @author Raúl González Martín<Raulglezmartin@gmail.com>
 */
public class Almacen {

    TreeMap<Integer, Resenia> resenias;
    HashMap<Integer, Producto> productos;

    Resenia resenia;
    Producto producto;
    
    int id;
    String nombre;

    /**
     * Constructor con parametros de la clase almacen
     * @param id del almacen
     * @param nombre del almacen
     */
    public Almacen(int id, String nombre) {
        resenias = new TreeMap<>();
        productos = new HashMap<>();
        this.id = id;
        this.nombre = nombre;
    }
    
    /**
     * En este metodo se añaden las 
     * @param cabecera de la resenia
     * @param cuerpo de la resenia
     * @param usuario que hace la resenia
     * @param producto al que se le hace la resenia
     */
    public void addResenia(String cabecera, String cuerpo, Usuario usuario, int idProducto) {
        resenia = new Resenia(usuario, cabecera, cuerpo);
        resenias.put(idProducto, resenia);
    }

    /**
     * En este metodo se añaden los productos al almacen
     * @param id del producto
     * @param nombre del producto
     * @param valoracion del producto
     * @param precio del producto
     */
    public void addProducto(int id, String nombre, double valoracion, double precio){
        producto = new Producto(id, nombre, valoracion, precio);
        productos.put(id, producto);
    }

    /**
     * Metodo para listar los productos
     * @return lista de productos
     */
    public String listarProductoAlmacen(){
        String lista ="";
        for (Integer clave : productos.keySet()) {
            lista += productos.get(clave) + "\n";
        }
        return lista;
    }

    @Override
    public String toString() {
        return "Almacen [id=" + id + ", nombre=" + nombre + "]";
    }
}
