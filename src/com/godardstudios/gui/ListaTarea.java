/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.godardstudios.gui;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author cflor
 */
public class ListaTarea {

    private ArrayList<JCheckbox> jboxTareas = new ArrayList<>();

    public ListaTarea() {
    }

    public boolean eliminarTareasConcluidas() {
        boolean bandera = false;
        // Remueve elementos q esten marcados como concluidos 
        int modificaciones = 0;
        Iterator it = jboxTareas.iterator();
        while (it.hasNext()) {

            JCheckbox jboxTarea = (JCheckbox) it.next();
            //boolean n = jboxTarea.isSelected();
            if (jboxTarea.isSelected()) {
                it.remove();
                modificaciones++;
            }
        }
        if (modificaciones > 0) {
            bandera = true;
            // repintarTareas();
        }
        return bandera;
    }

    public JCheckbox agregarTarea(String msj) {

        JCheckbox tarea = new JCheckbox(msj, false);
        tarea.setFont(new Font("Tahoma", Font.PLAIN, 16));
        jboxTareas.add(tarea);
        return tarea;

    }

    public void infListTareas() {
        int contador = 0;
        System.out.println(jboxTareas.size());
        for (JCheckbox jbox : jboxTareas) {

            if (jbox.isSelected()) {
                contador++;
            }
        }
        if (!jboxTareas.isEmpty()) {
            if (contador == jboxTareas.size()) {
                System.out.println("Todas las tareas terminadas :>");
            } else {
                System.out.println("Tareas terminadas : " + contador);
            }
        } else {
            System.out.println("No hay tareas ");
        }

    }

    public Boolean hayTareasConcluidas() {
        Boolean bandera = false;
        for (JCheckbox jboxTarea : jboxTareas) {
            //boolean n = jboxTarea.isSelected();
            if (jboxTarea.isSelected()) {
                bandera = true;
                break;

            }
        }
        return bandera;
    }

    public ArrayList<JCheckbox> getJboxTareas() {
        return jboxTareas;
    }

}
