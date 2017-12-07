/**
 *
 * @author Kevin Daniel Basto Anquino
 */
package View.Caja;

public class ConstructorCaja {
    
    private String elemento;
    private int cantidad;
    private float precio;
    private String tabla;

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    
    //incluir setters y getters
    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }
    
    //--------------------------------------------------------------------------
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    //--------------------------------------------------------------------------
    
    public float getPrecio() {
        return precio;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    //--------------------------------------------------------------------------
}
