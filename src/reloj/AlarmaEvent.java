/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reloj;

import java.util.EventObject;

/**
 * Desarrollo de Interfaces - DAM
 * Unidad 03
 * Clase AlarmaEvent
 *  Para controlar los eventos de la alarma
 *
 * @author Carlos Sainz-Pardo Ortiz
 */
public class AlarmaEvent extends EventObject {
    
    /**
     *
     * @param source
     */
    public AlarmaEvent(Object source) {
        super(source);
    }
    
}
