package com.agarcia.gui;

import com.agarcia.gui.dialogs.InfoDialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PasosFinales extends JFrame
{
    public static int height = 700;
    public static int width = 1000;
    private JButton anterior;
    private JPanel fina;
    private JButton home, sistema_final;
    private JLabel title;
    private Container container;

    public PasosFinales()
    {
        super("Pasos Finales");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        container = getContentPane();
        initialComponent();

        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void initialComponent() {
        fina = new JPanel();
        anterior = new JButton(new ImageIcon(getClass().getResource("/resources/images/atras.png")));
        home = new JButton(new ImageIcon(getClass().getResource("/resources/images/home.png")));

        anterior.setBounds(400, 570, 100, 60);
        anterior.setBorder(BorderFactory.createEmptyBorder());
        anterior.setContentAreaFilled(false);

        home.setBounds(500, 570, 100, 60);
        home.setBorder(BorderFactory.createEmptyBorder());
        home.setContentAreaFilled(false);

        title = new JLabel("Aplicando condiciones y sistema final");
        title.setFont(new Font("Serif", Font.BOLD, 21));
        title.setForeground(Color.BLACK);
        title.setBounds(40, 5, 500, 30);

        sistema_final = new JButton("Sistema final");
        sistema_final.setBounds(720, 600, 250, 25);

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/resources/images/Ensamblaje/Condiciones de contorno.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(100, 75, 800, 500);

        container.setBackground(Color.WHITE);
        container.add(anterior);
        container.add(home);
        container.add(title);
        container.add(label);
        container.add(sistema_final);

        sistema_final.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InfoDialog infoDialog = new InfoDialog("/resources/images/Ensamblaje/SistemaFinal.png", 960, 455);
                infoDialog.setVisible(true);
            }
        });

        anterior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Ensamblaje ensa = new Ensamblaje();
                ensa.setVisible(true);
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
