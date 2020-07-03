package com.agarcia.gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//https://github.com/alvarogarcia1010/Shooter-de-plataforma
public class MEF3D extends JFrame {

    public static int height = 700;
    public static int width = 1000;

    private JButton dominio;
    private JButton malla;
    private JButton pasos1_2;
    private JButton pasos3_4;
    private JButton pasos5_6;
    private JButton componentes;
    private JButton ensamblaje;
    private JButton paso8;
    private JButton pasos_finales;
    private JLabel titulo;
    private JLabel autor;
    private JPanel arriba;
    private JPanel abajo;

    public MEF3D() {
        super("MEF3D");
        panelSuperior();
        panelInferior();
        setLayout(new GridLayout(2,1,8,8));
        add(arriba);
        add(abajo);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width,height);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void panelSuperior() { ;
        arriba = new JPanel();
        arriba.setLayout(new GridLayout(4,1,8,8));
        arriba.setBackground(Color.WHITE);


        //Titulo
        titulo = new JLabel("Aplicación del Método de los elementos finitos en 3D");
        titulo.setFont(new Font("Chilanka", Font.PLAIN, 26));
        titulo.setForeground(Color.BLACK);
        titulo.setHorizontalAlignment(JLabel.CENTER);

        JLabel espace = new JLabel();

        //Modelo
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/resources/images/Modelo.png"));
        JLabel modelo = new JLabel(imageIcon);
        modelo.setHorizontalAlignment(JLabel.CENTER);
        //modelo.setBounds(10, 100, 480, 320);

        //Autor
        autor = new JLabel("Por Alvaro Francisco García Cornejo");
        autor.setFont(new Font("Chilanka", Font.ITALIC, 16));
        autor.setForeground(Color.BLACK);
        autor.setHorizontalAlignment(JLabel.CENTER);

        arriba.add(espace);
        arriba.add(titulo);
        arriba.add(modelo);
        arriba.add(autor);
    }

    public void panelInferior(){
        EmptyBorder border = new EmptyBorder(0,30,30,30);

        abajo = new JPanel();
        abajo.setLayout(new GridLayout(2,4,8,8));
        abajo.setBackground(Color.WHITE);

        dominio = new JButton(new ImageIcon(getClass().getResource("/resources/images/dominio.jpg")));
        //dominio.setBackground(Color.BLUE);
        //dominio.setForeground(Color.WHITE);

        malla = new JButton(new ImageIcon(getClass().getResource("/resources/images/malla.jpg")));
        //malla.setBackground(Color.BLUE);
        //malla.setForeground(Color.WHITE);

        pasos1_2 = new JButton(new ImageIcon(getClass().getResource("/resources/images/paso1.jpg")));
        //pasos1_2.setBackground(Color.BLUE);
        //pasos1_2.setForeground(Color.WHITE);

        pasos3_4 = new JButton(new ImageIcon(getClass().getResource("/resources/images/paso3.jpg")));
        //pasos3_4.setBackground(Color.BLUE);
        //pasos3_4.setForeground(Color.WHITE);

        pasos5_6 = new JButton(new ImageIcon(getClass().getResource("/resources/images/paso5.jpg")));
        //pasos5_6.setBackground(Color.BLUE);
        //pasos5_6.setForeground(Color.WHITE);

        componentes = new JButton(new ImageIcon(getClass().getResource("/resources/images/componentes.jpg")));
        //componentes.setBackground(Color.BLUE);
        //componentes.setForeground(Color.WHITE);

        ensamblaje = new JButton(new ImageIcon(getClass().getResource("/resources/images/ensamblaje.jpg")));
        //ensamblaje.setBackground(Color.BLUE);
        //ensamblaje.setForeground(Color.WHITE);

        pasos_finales = new JButton(new ImageIcon(getClass().getResource("/resources/images/finales.jpg")));
        //pasos_finales.setBackground(Color.BLUE);
        //pasos_finales.setForeground(Color.WHITE);

        abajo.add(dominio);
        abajo.add(malla);
        abajo.add(pasos1_2);
        abajo.add(pasos3_4);
        abajo.add(pasos5_6);
        abajo.add(componentes);
        abajo.add(ensamblaje);
        abajo.add(pasos_finales);
        abajo.setBorder(border);

        dominio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Dominio dominio = new Dominio();
                dominio.setVisible(true);
                dispose();
            }
        });

        malla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Malla malla = new Malla();
                malla.setVisible(true);
                dispose();
            }
        });

        pasos1_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try{
                    Pasos1_2 pasos1_2 = new Pasos1_2();
                    pasos1_2.setVisible(true);
                    dispose();
                } catch (Exception e) {
                    titulo.setText(e.getMessage());
                }
            }
        });

        pasos3_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Pasos3_4 pasos3_4 = new Pasos3_4();
                pasos3_4.setVisible(true);
                dispose();
            }
        });

        pasos5_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Pasos5_6 modelo = new Pasos5_6();
                modelo.setVisible(true);
                dispose();
            }
        });

        componentes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Componentes componentes= new Componentes();
                componentes.setVisible(true);
                dispose();
            }
        });

        ensamblaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Ensamblaje ens = new Ensamblaje();
                ens.setVisible(true);
                dispose();
            }
        });

        pasos_finales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                PasosFinales pasosF = new PasosFinales();
                pasosF.setVisible(true);
                dispose();
            }
        });


    }

    public static void main(String[] args)
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MEF3D b = new MEF3D();
                b.setVisible(true);
            }

        });
    }

}
