import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.TreeMap;

public class Almacen {

    Integer ID;
    String nombre;
    HashMap<Integer, Producto> productos = new HashMap<Integer, Producto>();

    public boolean addAlmacen(Producto producto){
        return false;
    }

    /**
     * Eliminar producto del almacen
     * @param producto
     * @return
     */
    public boolean dropProducto(Producto producto){
        return false;
    }

    /**
     * Clase anidada Producto de Almacen
     */
    class Producto{
        Integer ID;
        double valoracion;
        double precio;
        String nombre;
        TreeMap <Producto, Resenea> resenas = new TreeMap<>();

        class Resenea{
            Integer ID;
            Cliente.Usuario usuario;
            String cuerpo;
            Date fecha;
        }
    }

}
