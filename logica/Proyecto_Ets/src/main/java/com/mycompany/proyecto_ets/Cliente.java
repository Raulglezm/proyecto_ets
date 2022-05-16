package com.mycompany.proyecto_ets;

public class Cliente {

    int id;
    String nombre;
    String contra;

    /**
     * Constructor con tres parametrod de Cliente
     * @param id del cliente
     * @param nombre del cliente
     * @param apellido del cliente
     */
    public Cliente(int id, String nombre, String contra) {
        this.id = id;
        this.nombre = nombre;
        this.contra = contra;
    }

    

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
