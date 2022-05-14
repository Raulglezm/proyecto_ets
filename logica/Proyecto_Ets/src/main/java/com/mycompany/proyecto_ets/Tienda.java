package com.mycompany.proyecto_ets;

import java.util.HashMap;

public class Tienda {

    String admin = "root";
    String contra = "1q2w3e4r";

    int id;
    String nombre;

    Almacen almacen;
    Usuario usuario;

    HashMap<Integer, Almacen> almacenes;
    HashMap<Integer, Usuario> usuarios;

    /**
     * Constructor con dos parametros de Tienda
     * @param id de la tienda
     * @param nombre de la tienda
     */
    public Tienda(int id, String nombre) {
        usuarios = new HashMap<>();
        almacenes = new HashMap<>();
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * Metodo para añadir nuevos almacenes(categorias de productos) a nuestra tienda
     * @param id del almacen
     * @param nombre del almacen
     */
    public void addAlmacen(int id, String nombre){
        almacen = new Almacen(id, nombre);
        almacenes.put(id, almacen);
    }

    public void addUsuario(int id){
        usuario = new Usuario(id);
        usuarios.put(id, usuario);
    }

    //GETERS Y SETTERS


    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
    
    
}
