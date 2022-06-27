/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.godardstudios.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;


/**
 *
 * @author cflor
 */
public class JCheckbox extends JCheckBox {

    private  String nombreTarea;

    public JCheckbox(String str, boolean estado) {
        super(str, estado);
        this.nombreTarea = str;

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AccionCheckbox(e); //Click(btnNuevo);
            }
        });

    }

    protected void AccionCheckbox(ActionEvent e) {
       
        //System.out.println("Hola pndjo ");
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

}
