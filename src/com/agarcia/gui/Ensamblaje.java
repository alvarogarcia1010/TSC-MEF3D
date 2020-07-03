package com.agarcia.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ensamblaje extends JFrame {

    public static int height = 700;
    public static int width = 1000;
    private JButton siguiente;
    private JButton anterior;
    private JLabel title;
    private JButton home;
    private Container container;

    public Ensamblaje(){
        super("Ensamblaje");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        initialComponent();

        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void initialComponent() {
        container = getContentPane();

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

        title = new JLabel("Ensamblaje");
        title.setFont(new Font("Serif", Font.BOLD, 21));
        title.setForeground(Color.BLACK);
        title.setBounds(40, 5, 500, 30);

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/resources/images/Ensamblaje/ensamblaje.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(100, 75, 800, 500);

        container.setBackground(Color.WHITE);
        container.add(siguiente);
        container.add(anterior);
        container.add(home);
        container.add(title);
        container.add(label);

        anterior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Componentes compo = new Componentes();
                compo.setVisible(true);
                dispose();
            }
        });

        siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                PasosFinales pf = new PasosFinales();
                pf.setVisible(true);
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
