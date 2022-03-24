import java.util.HashMap;

public class Tienda {

    int ID;
    String nombre;
    HashMap <String, Almacen> almacenes = new HashMap<String, Almacen>();
    HashMap <String, Cliente> clientes = new HashMap<String, Cliente>();

    public boolean addAlmacen(Almacen almacen){
        return false;
    }

    public boolean dropAlmacen(Almacen almacen){
        return false;
    }

}
