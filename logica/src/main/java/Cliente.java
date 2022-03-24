import java.util.ArrayList;
import java.util.HashMap;

public class Cliente {

    Integer ID;
    String correo;
    String nombre;
    ArrayList <Usuario> usuarios = new ArrayList<>();

    /**
     * Metodo para añadir un cliene
     * @param cliente
     * @return
     */
    public boolean addCliente(Cliente cliente){
        return false;
    }

    /**
     * Metodo para eliminar cliente
     * @param cliente
     * @return
     */
    public boolean dropCliente(Cliente cliente){
        return false;
    }

    /**
     * Clase anidada Huesped de Cliente
     */
    class Huesped{
        int ID;
        ArrayList<Almacen.Producto> cesta = new ArrayList<>();
    }

    /**
     * Clase anidada Usuario de Cliente
     */
    class Usuario {
        int ID;
        String nombre;
        String Apellido;
        ArrayList<Almacen.Producto> cesta = new ArrayList<>();
    }
}
