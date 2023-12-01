/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package reloj;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;

/**
 * Desarrollo de Interfaces - DAM
 * Unidad 03
 * Clase Reloj
 *  Clase que implementa el componente reloj según descripción
 *  solicitada en el enunciado
 *
 * @version 2.0 - Corregida según comentario de corrección
 * @author Carlos Sainz-Pardo Ortiz
 */
public class Reloj extends JLabel implements Serializable {
    
    private boolean timeFormat24;
    private Alarma alarma;
    private boolean alarmaActiva = false;
    private AlarmaListener alarmaListener;
 
    /**
     *
     */
    public Reloj() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                LocalDateTime now = LocalDateTime.now();
                if(timeFormat24){
                    setText(now.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
                } else {
                    setText(now.format(DateTimeFormatter.ofPattern("hh:mm:ss a")));
                }
                
                if(alarma != null){
                    if(alarmaActiva && alarma.getHora() == now.getHour() && alarma.getMinutos() == now.getMinute()){
                        // ALARMA!
                        if(alarmaListener != null){
                            alarmaListener.capturarAlarmaEvent(new AlarmaEvent(this));
                            alarmaActiva = false;
                        }
                    }
                }
            }
        }, 0, 1000);
    }
    
    /**
     * Get the value of timeFormat24
     *
     * @return the value of timeFormat24
     */
    public boolean isTimeFormat24() {
        return timeFormat24;
    }

    /**
     * Set the value of timeFormat24
     *
     * @param timeFormat24 new value of timeFormat24
     */
    public void setTimeFormat24(boolean timeFormat24) {
        this.timeFormat24 = timeFormat24;
    }
    
    /**
     * Get the value of alarma
     *
     * @return the value of alarma
     */
    public Alarma getAlarma() {
        return alarma;
    }

    /**
     * Set the value of alarma
     *
     * @param alarma new value of alarma
     */
    public void setAlarma(Alarma alarma) {
        this.alarma = alarma;
        alarmaActiva = true;
    }

    /**
     * Get the value of alarmaActiva
     *
     * @return the value of alarmaActiva
     */
    public boolean isAlarmaActiva() {
        return alarmaActiva;
    }

    /**
     * Set the value of alarmaActiva
     *
     * @param alarmaActiva new value of alarmaActiva
     */
    public void setAlarmaActiva(boolean alarmaActiva) {
        this.alarmaActiva = alarmaActiva;
    }
    
    /**
     * Método que añade un listener de alarma
     * 
     * @param al
     */
    public void addAlarmaListener(AlarmaListener al){
        this.alarmaListener = al;
    }
    
    /**
     * Método que elimina un listener de alarma
     * 
     * @param al
     */
    public void removeAlarmaListener(AlarmaListener al){
        this.alarmaListener = null;
    }
}
