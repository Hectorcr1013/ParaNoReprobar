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
    private Double vUnitario;
    private Double vTotal;
    
    
    /**
     * @return the vTotal
     */
    public Double getvTotal() {
        vTotal = this.cantidad * this.vUnitario;
        return vTotal;
    }

    /**
     * @param vTotal the vTotal to set
     */
    public void setvTotal(Double vTotal) {
        this.vTotal = vTotal;
    }
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
    public Double getvUnitario() {
        return vUnitario;
    }

    /**
     * @param VUnitario the VUnitario to set
     */
    public void setvUnitario(Double VUnitario) {
        this.vUnitario = VUnitario;
    }

    
}
