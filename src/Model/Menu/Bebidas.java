/**
 *
 * @author Kevin Daniel Basto Anquino
 */
package Model.Menu;

public class Bebidas {
    private int id;
    private int cantidad;
    private float precio;
    private String Bebida;
    
    //inserccion de setters y getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getBebida() {
        return Bebida;
    }

    public void setBebida(String Bebida) {
        this.Bebida = Bebida;
    }
    
}
