/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hueic.javaswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author tthan
 */
public class jbuttonexample {
    public jbuttonexample() {
    JFrame f = new JFrame("JButton Example Test");
    
    JButton b = new JButton(new ImageIcon("image/lock.png"));
    b.setBounds(130, 100, 100, 50);
    
    f.add(b);
    
    f.setSize(400, 300);
    f.setLayout(null);
    f.setVisible(true);
    
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    b.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
        b.setVisible(false);
        }
    });
}
            
    public static void main(String[] args) {
        new jbuttonexample();
    }
}