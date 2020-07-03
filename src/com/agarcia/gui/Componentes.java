package com.agarcia.gui;

import com.agarcia.gui.dialogs.InfoDialog;
import com.agarcia.gui.dialogs.Paso1_2Dialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Componentes extends JFrame {

    public static int height = 700;
    public static int width = 1000;
    private JButton home, anterior, siguiente, info, general;
    private JPanel compo;
    private JButton btn_p, btn_m, btn_n, btn_t, btn_u, btn_r;
    private JLabel title, result_p, result_m, result_n, result_t, result_r, result_u;
    private Container container;

    public Componentes(){
        super("Componentes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        container = getContentPane();
        initialComponent();
        //add(compo);
        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void initialComponent() {
        compo = new JPanel();

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

        info = new JButton(new ImageIcon(getClass().getResource("/resources/images/info.png")));
        info.setBounds(900, 605, 100, 60);
        info.setBorder(BorderFactory.createEmptyBorder());
        info.setContentAreaFilled(false);

        btn_m = new JButton(new ImageIcon(getClass().getResource("/resources/images/Componentes/btn-m.png")));
        btn_m.setBounds(180, 55, 280, 65);

        result_m = new JLabel(new ImageIcon(getClass().getResource("/resources/images/Componentes/result-m.png")));
        result_m.setBounds(470, 55, 290, 80);

        btn_n = new JButton(new ImageIcon(getClass().getResource("/resources/images/Componentes/btn-n.png")));
        btn_n.setBounds(195, 165, 268, 65);

        result_n = new JLabel(new ImageIcon(getClass().getResource("/resources/images/Componentes/result-n.png")));
        result_n.setBounds(470, 165, 286, 65);

        btn_p = new JButton(new ImageIcon(getClass().getResource("/resources/images/Componentes/btn-p.png")));
        btn_p.setBounds(30, 290, 230, 65);

        result_p = new JLabel(new ImageIcon(getClass().getResource("/resources/images/Componentes/result-p.png")));
        result_p.setBounds(265, 290, 250, 65);

        btn_r = new JButton(new ImageIcon(getClass().getResource("/resources/images/Componentes/btn-r.png")));
        btn_r.setBounds(580, 290, 196, 75);

        result_r = new JLabel(new ImageIcon(getClass().getResource("/resources/images/Componentes/result-r.png")));
        result_r.setBounds(780, 260, 181, 119);

        btn_t = new JButton(new ImageIcon(getClass().getResource("/resources/images/Componentes/btn-t.png")));
        btn_t.setBounds(45, 460, 199, 73);

        result_t = new JLabel(new ImageIcon(getClass().getResource("/resources/images/Componentes/result-t.png")));
        result_t.setBounds(250, 460, 230, 70);

        btn_u = new JButton(new ImageIcon(getClass().getResource("/resources/images/Componentes/btn-u.png")));
        btn_u.setBounds(570, 460, 206, 80);

        result_u = new JLabel(new ImageIcon(getClass().getResource("/resources/images/Componentes/result-u.png")));
        result_u.setBounds(780, 430, 195, 130);


        title = new JLabel("Definición de componentes");
        title.setFont(new Font("Serif", Font.BOLD, 21));
        title.setForeground(Color.BLACK);
        title.setBounds(40, 5, 800, 30);

        general = new JButton("Info general");
        general.setBounds(800, 15, 150, 30);

        container.setBackground(Color.WHITE);
        container.add(siguiente);
        container.add(anterior);
        container.add(home);
        container.add(title);
        container.add(btn_m);
        container.add(result_m);
        container.add(btn_n);
        container.add(result_n);
        container.add(btn_p);
        container.add(result_p);
        container.add(btn_r);
        container.add(result_r);
        container.add(btn_t);
        container.add(result_t);
        container.add(btn_u);
        container.add(result_u);
        container.add(info);
        container.add(general);

        btn_p.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoDialog dialog = new InfoDialog("/resources/images/Componentes/proceso-p.gif",612,700);
                dialog.setVisible(true);
            }
        });

        btn_t.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoDialog dialog = new InfoDialog("/resources/images/Componentes/proceso-t.gif",612,700);
                dialog.setVisible(true);
            }
        });

        btn_m.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoDialog dialog = new InfoDialog("/resources/images/Componentes/proceso-m.gif",612,700);
                dialog.setVisible(true);
            }
        });

        btn_n.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoDialog dialog = new InfoDialog("/resources/images/Componentes/proceso-n.gif",612,700);
                dialog.setVisible(true);
            }
        });

        btn_u.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoDialog dialog = new InfoDialog("/resources/images/Componentes/proceso-u.gif",612,600);
                dialog.setVisible(true);
            }
        });

        btn_r.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoDialog dialog = new InfoDialog("/resources/images/Componentes/proceso-r.gif",612,600);
                dialog.setVisible(true);
            }
        });


        general.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoDialog dialog = new InfoDialog("/resources/images/Componentes/general.gif",612,700);
                dialog.setVisible(true);
            }
        });


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
                Pasos5_6 p5 = new Pasos5_6();
                p5.setVisible(true);
                dispose();
            }
        });

        siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Ensamblaje ens = new Ensamblaje();
                ens.setVisible(true);
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
