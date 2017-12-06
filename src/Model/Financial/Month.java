/**
 *
 * @author Kevin Daniel Basto Anquino
 */
package Model.Financial;

public class Month {
    
    private int id;
    private String mes;
    private float ingreso;
    
    //setters y getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public float getIngreso() {
        return ingreso;
    }

    public void setIngreso(float ingreso) {
        this.ingreso = ingreso;
    }
    
}
