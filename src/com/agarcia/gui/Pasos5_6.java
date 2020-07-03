package com.agarcia.gui;

import com.agarcia.gui.dialogs.Paso1_2Dialog;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Pasos5_6 extends JFrame {

    public static int height = 700;
    public static int width = 1000;
    private JButton siguiente;
    private JButton anterior;
    private JButton home, info, btn_p, btn_p2;
    private JLabel paso5, paso6;
    BufferedImage image1, image2, image3, image4;
    private Container container;

    public Pasos5_6() {
        super("Pasos 5-6");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        container = getContentPane();
        initialComponent();
        //add(panel);
        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void initialComponent() {
        // panel = new JPanel();
        anterior = new JButton(new ImageIcon(getClass().getResource("/resources/images/atras.png")));
        siguiente = new JButton(new ImageIcon(getClass().getResource("/resources/images/adelante.png")));
        home = new JButton(new ImageIcon(getClass().getResource("/resources/images/home.png")));
        info = new JButton(new ImageIcon(getClass().getResource("/resources/images/info.png")));

        anterior.setBounds(370, 605, 100, 60);
        anterior.setBorder(BorderFactory.createEmptyBorder());
        anterior.setContentAreaFilled(false);

        home.setBounds(450, 605, 100, 60);
        home.setBorder(BorderFactory.createEmptyBorder());
        home.setContentAreaFilled(false);

        siguiente.setBounds(530, 605, 100, 60);
        siguiente.setBorder(BorderFactory.createEmptyBorder());
        siguiente.setContentAreaFilled(false);

        paso5 = new JLabel("Paso 5: Método de Galerkin ");
        paso5.setFont(new Font("Serif", Font.BOLD, 21));
        paso5.setForeground(Color.BLACK);
        paso5.setBounds(50, 15, 300, 30);


        paso6 = new JLabel("Paso 6: Integración por partes");
        paso6.setFont(new Font("Serif", Font.BOLD, 21));
        paso6.setForeground(Color.BLACK);
        paso6.setBounds(50, 340, 900, 30);

        info.setBounds(900, 605, 100, 60);
        info.setBorder(BorderFactory.createEmptyBorder());
        info.setContentAreaFilled(false);

        btn_p = new JButton(new ImageIcon(getClass().getResource("/resources/images/Paso6/paso6-btn1.png")));
        btn_p.setBounds(85, 400, 383, 96);

        btn_p2 = new JButton(new ImageIcon(getClass().getResource("/resources/images/Paso6/paso6-btn2.png")));
        btn_p2.setBounds(490, 400, 400, 96);

        container.setBackground(Color.WHITE);
        container.add(siguiente);
        container.add(anterior);
        container.add(home);
        container.add(paso5);
        container.add(paso6);
        container.add(info);
        container.add(btn_p);
        container.add(btn_p2);

        try {
            image1 = ImageIO.read(getClass().getResource("/resources/images/Paso5/paso5-718x225.png"));
            image2 = ImageIO.read(getClass().getResource("/resources/images/Paso5/Paso5subtitulo.png"));
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }

        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paso1_2Dialog dialog = new Paso1_2Dialog("/resources/images/Paso6/FormaDebil779x256.png", 20, 30, 820, 300);
                dialog.setVisible(true);
            }
        });

        btn_p.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paso1_2Dialog dialog = new Paso1_2Dialog("/resources/images/Paso6/btn1-proceso.png");
                dialog.setVisible(true);
            }
        });

        btn_p2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Paso1_2Dialog dialog = new Paso1_2Dialog("/resources/images/Paso6/btn2-proceso.png");
                dialog.setVisible(true);
            }
        });

        anterior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Pasos3_4 pasos= new Pasos3_4();
                pasos.setVisible(true);
                dispose();
            }
        });

        siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Componentes m = new Componentes();
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

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image1, 150, 110, this);
        g.drawImage(image2, 340, 45, this);
    }

    /*public static void main(String[] args)
    {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Pasos5_6 b = new Pasos5_6();
                b.setVisible(true);
            }

        });
    }*/

}
