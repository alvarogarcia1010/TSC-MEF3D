package com.agarcia.gui.dialogs;

import javax.swing.*;
import java.awt.*;

public class CondicionesContorno extends JFrame {

    public static int height = 600;
    public static int width = 900;
    private JLabel titulo, titulo2, desc;
    private Container container;

    public CondicionesContorno(){
        super("Condiciones de Contorno");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        container = getContentPane();
        initialComponent();
        //add(ensa);
        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void initialComponent() {
        desc = new JLabel("Definiremos las siguientes condiciones de contorno para concretizar nuestro problema:");
        desc.setFont(new Font("Serif", Font.PLAIN, 18));
        desc.setForeground(Color.BLACK);
        desc.setBounds(40, 3, 900, 30);

        titulo = new JLabel("Condiciones de Dirichlet en A:");
        titulo.setFont(new Font("Serif", Font.BOLD, 20));
        titulo.setForeground(Color.BLACK);
        titulo.setBounds(70, 40, 900, 30);

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/resources/images/Condiciones/Condiciones1-320x200.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(170, 80, 320, 200);

        ImageIcon imageIcon2 = new ImageIcon(getClass().getResource("/resources/images/Condiciones/nodos1.png"));
        JLabel label2 = new JLabel(imageIcon2);
        label2.setBounds(570, 80, 105, 160);

        JLabel dirichlet = new JLabel("A = 50");
        dirichlet.setFont(new Font("Serif", Font.BOLD, 20));
        dirichlet.setForeground(Color.BLACK);
        dirichlet.setBounds(700, 150, 100, 30);

        titulo2 = new JLabel("Condiciones de Neumman en B:");
        titulo2.setFont(new Font("Serif", Font.BOLD, 20));
        titulo2.setForeground(Color.BLACK);
        titulo2.setBounds(70, 295, 900, 30);

        ImageIcon imageIcon3 = new ImageIcon(getClass().getResource("/resources/images/Condiciones/Condiciones2-320x200.gif"));
        JLabel label3 = new JLabel(imageIcon3);
        label3.setBounds(170, 335, 320, 200);

        ImageIcon imageIcon4 = new ImageIcon(getClass().getResource("/resources/images/Condiciones/nodos2.png"));
        JLabel label4 = new JLabel(imageIcon4);
        label4.setBounds(570, 350, 105, 160);

        ImageIcon imageIcon5 = new ImageIcon(getClass().getResource("/resources/images/Condiciones/neumman.png"));
        JLabel label5 = new JLabel(imageIcon5);
        label5.setBounds(700, 400, 150, 65);

        container.setBackground(Color.WHITE);
        container.add(titulo);
        container.add(label);
        container.add(label2);
        container.add(titulo2);
        container.add(label3);
        container.add(label4);
        container.add(desc);
        container.add(label5);
        container.add(dirichlet);

    }

}
