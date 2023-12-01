/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reloj;

import java.io.Serializable;

/**
 * Desarrollo de Interfaces - DAM
 * Unidad 03
 * Clase Alarma
 *
 * @author Carlos Sainz-Pardo Ortiz
 */
public class Alarma implements Serializable{
    
    // Hora y minutos
    private int hora;
    private int minutos;
    // Mensaje
    private String mensaje;

    /**
     * Constructor
     * 
     * @param hora
     * @param minutos
     * @param mensaje
     */
    public Alarma(int hora, int minutos, String mensaje) {
        this.hora = hora;
        this.minutos = minutos;
        this.mensaje = mensaje;
    }

    /**
     * Get the value of mensaje
     *
     * @return the value of mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Set the value of mensaje
     *
     * @param mensaje new value of mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Get the value of minutos
     *
     * @return the value of minutos
     */
    public int getMinutos() {
        return minutos;
    }

    /**
     * Set the value of minutos
     *
     * @param minutos new value of minutos
     */
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    /**
     * Get the value of hora
     *
     * @return the value of hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * Set the value of hora
     *
     * @param hora new value of hora
     */
    public void setHora(int hora) {
        this.hora = hora;
    }
}
