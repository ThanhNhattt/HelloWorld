/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hueic.javaswing;

import java.awt.Color;
import javax.swing.JFrame;
import java.awt.HeadlessException;

/**
 *
 * @author tthan
 */
public class HelloWorld extends JFrame {
    public HelloWorld() {
        setTitle("Duong Huu Thanh Nhat");
        setSize(400, 500);
        getContentPane().setBackground(Color.yellow);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new HelloWorld();
    }
}