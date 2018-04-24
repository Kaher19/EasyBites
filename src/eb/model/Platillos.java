/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eb.model;

/**
 *
 * @author Kirbey
 */
public class Platillos {
    private String nombre;
    private double precio;
    private String tipo;

    public Platillos(String nombre, double precio, String tipo) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Platillos{" + "nombre=" + nombre + ", precio=" + precio +  ", tipo=" + tipo + '}';
    }
    
    
}
