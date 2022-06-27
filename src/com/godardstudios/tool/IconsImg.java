/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.godardstudios.tool;

import javax.swing.ImageIcon;

/**
 *
 * @author cflor
 */
public class IconsImg {
    private ImageIcon icon ;

    public IconsImg(String dir) {
        try {
            icon = new ImageIcon(IconsImg.class.getResource(dir));
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ImageIcon getIcon() {
        return icon;
    }
    
    
    
    
}
