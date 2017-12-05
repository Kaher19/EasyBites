/**
 * esta clase fue creada con el objetivo de crear los constructores utilizados
 * tanto en las consultas como en cualquier parte de la aplicacion que requiera el uso de  un
 * elemento de la base de datos
 * @author Kevin Daniel Basto Anquino
 */
package Model;

public class Productos {
    
    //declaracion de las variables utilizadas
    private int idBebida;
    private int idPlatillo;
    private int cantidad;
    private String bebida;
    private String platillo;
    private float precioB;          //B:bebida
    private float precioP;          //P: platillo

    
    //inicio de constructores
    public int getIdBebida() {
        return idBebida;
    }

    public void setIdBebida(int idBebida) {
        this.idBebida = idBebida;
    }

    public int getIdPlatillo() {
        return idPlatillo;
    }

    public void setIdPlatillo(int idPlatillo) {
        this.idPlatillo = idPlatillo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getPlatillo() {
        return platillo;
    }

    public void setPlatillo(String platillo) {
        this.platillo = platillo;
    }

    public float getPrecioB() {
        return precioB;
    }

    public void setPrecioB(float precioB) {
        this.precioB = precioB;
    }

    public float getPrecioP() {
        return precioP;
    }

    public void setPrecioP(float precioP) {
        this.precioP = precioP;
    }
   
}//termina la clase de Productos
