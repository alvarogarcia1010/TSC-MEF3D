package com.agarcia.gui;

import com.agarcia.gui.dialogs.Paso1_2Dialog;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Pasos1_2 extends JFrame {

    public static int height = 705;
    public static int width = 1000;
    private JButton siguiente;
    private JButton anterior;
    private JPanel panelPasos1_3;
    private JButton home, info;
    private BufferedImage image1, image2, image3;
    private JLabel paso1, paso2;

    public Pasos1_2(){
        super("Pasos 1-2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        initialComponent();
        //add(panelPasos1_3);
        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public void initialComponent() {
        panelPasos1_3 = new JPanel();
        panelPasos1_3.setBackground(Color.WHITE);
        anterior = new JButton(new ImageIcon(getClass().getResource("/resources/images/atras.png")));
        siguiente = new JButton(new ImageIcon(getClass().getResource("/resources/images/adelante.png")));
        home = new JButton(new ImageIcon(getClass().getResource("/resources/images/home.png")));
        info = new JButton(new ImageIcon(getClass().getResource("/resources/images/info.png")));

        paso1 = new JLabel("Paso 1: Localización e isoparametrización");
        paso1.setFont(new Font("Serif", Font.BOLD, 21));
        paso1.setForeground(Color.BLACK);
        paso1.setBounds(50, 5, 900, 30);

        paso2 = new JLabel("Paso 2: Interpolación");
        paso2.setFont(new Font("Serif", Font.BOLD, 21));
        paso2.setForeground(Color.BLACK);
        paso2.setBounds(50, 355, 900, 30);

        anterior.setBounds(370, 605, 100, 60);
        anterior.setBorder(BorderFactory.createEmptyBorder());
        anterior.setContentAreaFilled(false);

        home.setBounds(450, 605, 100, 60);
        home.setBorder(BorderFactory.createEmptyBorder());
        home.setContentAreaFilled(false);

        siguiente.setBounds(530, 605, 100, 60);
        siguiente.setBorder(BorderFactory.createEmptyBorder());
        siguiente.setContentAreaFilled(false);

        info.setBounds(900, 605, 100, 60);
        info.setBorder(BorderFactory.createEmptyBorder());
        info.setContentAreaFilled(false);

/*
        panelPasos1_3.add(anterior);
        panelPasos1_3.add(siguiente);
        panelPasos1_3.add(home);
*/

        Container container = getContentPane();
        container.setBackground(Color.WHITE);
        container.add(siguiente);
        container.add(anterior);
        container.add(home);
        container.add(paso1);
        container.add(paso2);
        container.add(info);

        try {
            image1 = ImageIO.read(getClass().getResource("/resources/images/Paso1.png"));
            image2 = ImageIO.read(getClass().getResource("/resources/images/Paso2a.png"));
            image3 = ImageIO.read(getClass().getResource("/resources/images/Paso2b.png"));
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paso1_2Dialog dialog = new Paso1_2Dialog("/resources/images/Componentes/componentes-mas-info550x603.png");
                dialog.setVisible(true);
            }
        });

        anterior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Malla malla = new Malla();
                malla.setVisible(true);
                dispose();
            }
        });

        siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Pasos3_4 p4 = new Pasos3_4();
                p4.setVisible(true);
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
        g.drawImage(image1, 50, 80, 900, 300, this);
        g.drawImage(image2, 75, 420, this);
        g.drawImage(image3, 75, 525, this);

    }
}
