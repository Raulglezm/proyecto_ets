package com.controller;

import java.util.Random;

import com.mycompany.proyecto_ets.Almacen;
import com.mycompany.proyecto_ets.Tienda;
import com.mycompany.proyecto_ets.Usuario;

public class Controller {

    Tienda tienda;
    Almacen almacen;
    Usuario usuario;

    Random rnd;
    int id;

    public Controller(){
        tienda = new Tienda(101010, "SopGaming");
        rnd = new Random();
    }

    public void generadorId(){
        this.id = rnd.nextInt(9);
    }

    // PARTE DE LA TIENDA

    /**
     * Metodo que controla que se cree una tienda
     * @param nombre de la tienda
     */
    public void crearTienda(String nombre) {
        generadorId();
        tienda = new Tienda(id, nombre);
    }

    public void crearAlmacen(String nombre) {
        if(tienda != null){
            generadorId();
            tienda.addAlmacen(id, nombre);
        }
    }

    public void crearProducto(int idAlmacen, int id, String nombre, int valoracion, int precio) {
        
        almacen = tienda.almacenes.get(idAlmacen);

        if(almacen != null){
            almacen.addProducto(id, nombre, valoracion, precio);
        }
    }

    /**
     * Este metodo comprueba si esta intentando acceder un admin
     * @param usuario del admin
     * @param contrasenia del admin
     * @return 
     */
    public boolean comprobarAdmin(String usuarioName, String contrasenia){
        if(usuarioName.equals(tienda.getAdmin()) && contrasenia.equals(tienda.getContra())){
            return true;
        }
        return false;
    }

    /**
     * Este metod comprueba si un cliente existe
     * @param nombre del cliente
     * @param contra del cliente
     * @return verdadero si existe
     */
    public boolean comprobarCliente(String nombre, String contra){
        if (usuario.clienteExiste(contra, nombre)){
            return true;   
        }
        return false;
    }

    /**
     * Este metodo devuelve la cadena de texto de almacenes
     * @return almacenes en texto
     */
    public String listarAlmacenes(){
        return tienda.listarAlmacenes();
    }

    /**
     * Este metodo devuelve todos los productos de un almacen
     * @return productos de un almacen
     */
    public String listarProductos(int id){
        almacen = tienda.almacenes.get(id);
        return almacen.listarProductoAlmacen();
    }

}
