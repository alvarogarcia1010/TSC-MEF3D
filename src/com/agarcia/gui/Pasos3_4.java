package com.agarcia.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Pasos3_4 extends JFrame {
    public static int height = 705;
    public static int width = 1000;
    private JButton siguiente;
    private JButton anterior;
    private JPanel panelPasos4_6;
    private JButton home;
    private JLabel paso3, paso4, subtitulo;
    BufferedImage image1, image2, image3, image4;
    private Container container;

    public Pasos3_4(){
        super("Pasos 3-4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        container = getContentPane();
        initialComponent();
        //add(panelPasos4_6);
        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void initialComponent() {
        anterior = new JButton(new ImageIcon(getClass().getResource("/resources/images/atras.png")));
        siguiente = new JButton(new ImageIcon(getClass().getResource("/resources/images/adelante.png")));
        home = new JButton(new ImageIcon(getClass().getResource("/resources/images/home.png")));

        anterior.setBounds(370, 605, 100, 60);
        anterior.setBorder(BorderFactory.createEmptyBorder());
        anterior.setContentAreaFilled(false);

        home.setBounds(450, 605, 100, 60);
        home.setBorder(BorderFactory.createEmptyBorder());
        home.setContentAreaFilled(false);

        siguiente.setBounds(530, 605, 100, 60);
        siguiente.setBorder(BorderFactory.createEmptyBorder());
        siguiente.setContentAreaFilled(false);


        paso3 = new JLabel("Paso 3: Aproximación del modelo");
        paso3.setFont(new Font("Serif", Font.BOLD, 21));
        paso3.setForeground(Color.BLACK);
        paso3.setBounds(50, 15, 900, 30);

        subtitulo = new JLabel("Obtenemos los residuales:");
        subtitulo.setFont(new Font("Serif", Font.ITALIC, 18));
        subtitulo.setForeground(Color.BLACK);
        subtitulo.setBounds(120, 185, 900, 30);

        paso4 = new JLabel("Paso 4: Método de los residuos ponderados");
        paso4.setFont(new Font("Serif", Font.BOLD, 21));
        paso4.setForeground(Color.BLACK);
        paso4.setBounds(50, 365, 900, 30);

        container.setBackground(Color.WHITE);
        container.add(siguiente);
        container.add(anterior);
        container.add(home);
        container.add(paso3);
        container.add(paso4);
        container.add(subtitulo);

        try {
            image1 = ImageIO.read(getClass().getResource("/resources/images/Paso3a.png"));
            image2 = ImageIO.read(getClass().getResource("/resources/images/Paso3b.png"));
            image3 = ImageIO.read(getClass().getResource("/resources/images/Paso4a.png"));
            image4 = ImageIO.read(getClass().getResource("/resources/images/Paso4b.png"));
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        anterior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Pasos1_2 p1 = new Pasos1_2();
                p1.setVisible(true);
                dispose();
            }
        });

        siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Pasos5_6 com = new Pasos5_6();
                com.setVisible(true);
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

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image1, 290, 110, this);
        g.drawImage(image2, 290, 270, this);
        g.drawImage(image3, 250, 470,  this);
        g.drawImage(image4, 550, 470,  this);
    }
}
