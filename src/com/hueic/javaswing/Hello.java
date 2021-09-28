/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hueic.javaswing;
import javax.swing.JFrame;

/**
 *
 * @author tthan
 */
public class Hello {
    public Hello() {
        JFrame frame;
        frame = new JFrame("Hello Java Swing");
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Hello();
    }
    
}