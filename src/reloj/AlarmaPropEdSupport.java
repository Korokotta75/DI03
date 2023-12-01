/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reloj;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 * Desarrollo de Interfaces - DAM
 * Unidad 03
 * Clase AlarmaPropEdSupport
 *  Extiende PropertyEditorSupport para añadir el panel personalizado
 *  de edición de propiedad
 *
 * @author Carlos Sainz-Pardo Ortiz
 */
public class AlarmaPropEdSupport extends PropertyEditorSupport {
    private PanelAlarma panelAlarma = new PanelAlarma();
    
    /**
     *
     * @return
     */
    @Override
    public boolean supportsCustomEditor(){
        return true;
    }
    
    /**
     *
     * @return
     */
    @Override
    public Component getCustomEditor(){
        return panelAlarma;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getJavaInitializationString(){
        int horaAlarma = panelAlarma.getSelectedValue().getHora();
        int minutosAlarma = panelAlarma.getSelectedValue().getMinutos();
        String mensajeAlarma = panelAlarma.getSelectedValue().getMensaje();
        return "new reloj.Alarma(" + horaAlarma + ", " + minutosAlarma +
                    ", \"" + mensajeAlarma + "\")";
    }
    
    /**
     *
     * @return
     */
    @Override
    public Object getValue(){
        return panelAlarma.getSelectedValue();
    }
   
}
