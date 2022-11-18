/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.paranoreprobar.entidades;

/**
 *
 * @author Hector
 */
public class Compra {
    
    private int cantidad;
    private String descripcion;
    private Double VUnitario;
    private Double VTotal;

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the VUnitario
     */
    public Double getVUnitario() {
        return VUnitario;
    }

    /**
     * @param VUnitario the VUnitario to set
     */
    public void setVUnitario(Double VUnitario) {
        this.VUnitario = VUnitario;
    }

    /**
     * @return the VTotal
     */
    public Double getVTotal() {
        return VTotal;
    }

    /**
     * @param VTotal the VTotal to set
     */
    public void setVTotal(Double VTotal) {
        this.VTotal = VTotal;
    }
    
}
