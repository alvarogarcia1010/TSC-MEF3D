package com.agarcia.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class Dominio extends JFrame {

    public static int height = 700;
    public static int width = 1000;
    private JButton siguiente;
    private JButton home;
    private JLabel titulo, desc;
    private BufferedImage image1;
    Container container;

    public Dominio(){
        super("Dominio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        initialComponent();
        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void initialComponent() {

        container = getContentPane();

        desc = new JLabel("<html>Ya que hemos definido el problema a resolver por el MEF pasamos a la\n" +
                "definición del dominio al cual se le aplicará el problema, en este caso el\n" +
                "dominio será un cubo.</html>");;
        desc.setFont(new Font("Serif", Font.PLAIN, 20));
        desc.setForeground(Color.BLACK);
        desc.setBounds(100, 70, 800, 80);

        siguiente = new JButton(new ImageIcon(getClass().getResource("/resources/images/adelante.png")));
        home = new JButton(new ImageIcon(getClass().getResource("/resources/images/home.png")));

        siguiente.setBounds(400, 570, 100, 60);
        siguiente.setBorder(BorderFactory.createEmptyBorder());
        siguiente.setContentAreaFilled(false);

        home.setBounds(500, 570, 100, 60);
        home.setBorder(BorderFactory.createEmptyBorder());
        home.setContentAreaFilled(false);

        titulo = new JLabel("Definición del dominio");
        titulo.setFont(new Font("Serif", Font.BOLD, 21));
        titulo.setForeground(Color.BLACK);
        titulo.setBounds(50, 15, 900, 30);

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/resources/images/Dominio/Dominio1-320x200.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(100, 200, 360, 225);

        ImageIcon imageIcon2 = new ImageIcon(getClass().getResource("/resources/images/Dominio/Dominio2-320x200.gif"));
        JLabel label2 = new JLabel(imageIcon2);
        label2.setBounds(500, 200, 360, 225);


        container.setBackground(Color.WHITE);
        container.add(siguiente);
        container.add(home);
        container.add(label);
        container.add(label2);
        container.add(titulo);
        container.add(desc);

        siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Malla m = new Malla();
                m.setVisible(true);
                dispose();
            }
        });

        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MEF3D m = new MEF3D();
                m.setVisible(true);
                dispose();
            }
        });
    }

}
