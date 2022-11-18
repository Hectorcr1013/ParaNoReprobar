/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.paranoreprobar.entidades;

import com.google.gson.Gson;
import java.util.Date;
import java.util.List;
import mx.itson.paranoreprobar.enumeradores.FormaPago;

/**
 *
 * @author Hector
 */
public class Recibo {
    
    private Date hora;
    private Date fecha;
    private FormaPago formaPago;
    
    private List<Compra> compra;
    private Restaurante restaurante;

    /**
     * @return the hora
     */
    public Date getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Date hora) {
        this.hora = hora;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    /**
     * @return the formaPago
     */
    public FormaPago getFormaPago() {
        return formaPago;
    }

    /**
     * @return the compra
     */
    public List<Compra> getCompra() {
        return compra;
    }

    /**
     * @return the restaurante
     */
    public Restaurante getRestaurante() {
        return restaurante;
    }
    
    public Recibo deserializar(String json){
        Recibo recibo = new Recibo();
        try{
            recibo = new Gson().fromJson(json, Recibo.class);
        } catch(Exception ex){
            System.err.println("Ocurrio un error: " + ex.getMessage());
        }
        return recibo;
    }

    
    
}
