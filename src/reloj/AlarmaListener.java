/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package reloj;

import java.util.EventListener;

/**
 * Desarrollo de Interfaces - DAM
 * Unidad 03
 * Clase AlarmaListener
 *  Para implementar la funcionalidad de la alarma desde la aplicación principal
 *
 * @author Carlos Sainz-Pardo Ortiz
 */
public interface AlarmaListener extends EventListener{

    /**
     * Método a implementar desde aplicación principal
     *
     * @param event
     */
    public void capturarAlarmaEvent(AlarmaEvent event);
}
