/**
 *
 * @author Kevin Daniel Basto Anquino
 */
package View.Caja;

public class ConstructorCaja {
    private String nombre;
    private String base;
    private int cantidad;
    private int idbase;

    public int getIdbase() {
        return idbase;
    }

    public void setIdbase(int idbase) {
        this.idbase = idbase;
    }
    
    //--------------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //--------------------------------------------------------------------------
    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
        
    }

    //--------------------------------------------------------------------------
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
