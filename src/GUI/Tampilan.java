/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.*;

/**
 *
 * @author katoa
 */
public class Tampilan extends JFrame {
    JLabel labelUname = new JLabel("Username : ");
    JLabel labelPassword = new JLabel("Password : ");
    JTextField formUname = new JTextField();
    JPasswordField formPassword = new JPasswordField();
    JButton tombolLogin = new JButton("Login");
    JButton tombolCancel = new JButton("Cancel");
    public Tampilan(){
        setTitle("Login");
        setSize(230,130);
        setVisible(true);
        setDefaultCloseOperation(3);
        setLocation(550,250);
        setLayout(null);
        add(labelUname);
        add(labelPassword);
        add(formUname);
        add(formPassword);
        add(tombolLogin);
        add(tombolCancel);
        
        labelUname.setBounds(10,10,70,20);
        formUname.setBounds(85,10,120,20);
        labelPassword.setBounds(10,35,70,20);
        formPassword.setBounds(85,35,120,20);
        tombolLogin.setBounds(10,60,95,20);
        tombolCancel.setBounds(110,60,95,20);
    }
}