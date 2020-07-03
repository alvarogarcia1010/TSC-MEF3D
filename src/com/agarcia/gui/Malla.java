package com.agarcia.gui;

import com.agarcia.gui.dialogs.CondicionesContorno;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Malla extends JFrame {

    public static int height = 705;
    public static int width = 1000;
    private JButton siguiente;
    private JButton anterior;
    private JButton home, condiciones;
    private JLabel titulo1, subtitulo1, titulo2, titulo3;
    private  JTable table;
    private Container container;


    public Malla(){
        super("Malla");
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
        condiciones = new JButton("Condiciones de contorno");

        anterior.setBounds(370, 605, 100, 60);
        anterior.setBorder(BorderFactory.createEmptyBorder());
        anterior.setContentAreaFilled(false);

        home.setBounds(450, 605, 100, 60);
        home.setBorder(BorderFactory.createEmptyBorder());
        home.setContentAreaFilled(false);

        siguiente.setBounds(530, 605, 100, 60);
        siguiente.setBorder(BorderFactory.createEmptyBorder());
        siguiente.setContentAreaFilled(false);

        condiciones.setBounds(720, 625, 250, 25);

        titulo1 = new JLabel("Definición de una malla");
        titulo1.setFont(new Font("Serif", Font.BOLD, 21));
        titulo1.setForeground(Color.BLACK);
        titulo1.setBounds(50, 5, 900, 30);

        subtitulo1 = new JLabel("Al realizar el mallado dentro de GiD nos resultan 12 elementos interconectados por 9 nodos");
        subtitulo1.setFont(new Font("Serif", Font.PLAIN, 18));
        subtitulo1.setForeground(Color.BLACK);
        subtitulo1.setBounds(50, 30, 900, 30);

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/resources/images/Malla/malla1-320x200.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(100, 75, 360, 225);

        ImageIcon imageIcon2 = new ImageIcon(getClass().getResource("/resources/images/Malla/malla2-320x200.gif"));
        JLabel label2 = new JLabel(imageIcon2);
        label2.setBounds(500, 75, 360, 225);

        titulo2 = new JLabel("Elemento local");
        titulo2.setFont(new Font("Serif", Font.BOLD, 21));
        titulo2.setForeground(Color.BLACK);
        titulo2.setBounds(150, 325, 900, 30);

        titulo3 = new JLabel("Tabla de conectividades");
        titulo3.setFont(new Font("Serif", Font.BOLD, 21));
        titulo3.setForeground(Color.BLACK);
        titulo3.setBounds(450, 325, 900, 30);

        ImageIcon imageIcon3 = new ImageIcon(getClass().getResource("/resources/images/Malla/Tetra200x200.png"));
        JLabel label3 = new JLabel(imageIcon3);
        label3.setBounds(150, 360, 200, 200);

        // JTable

        String[] columnNames = {"Elemento", "Nodo 1", "Nodo 2", "Nodo 3", "Nodo 4"};
        String[][] data = {
                {"1", "2", "1", "3", "7"},
                {"2", "1", "4", "3", "7"},
                {"3", "8", "9", "2", "5"},
                {"4", "8", "9", "5", "6"},
                {"5", "9", "5", "6", "4"},
                {"6", "5", "6", "4", "3"},
                {"7", "5", "6", "3", "8"},
                {"8", "3", "5", "8", "2"},
                {"9", "9", "5", "4", "7"},
                {"10", "9", "5", "7", "2"},
                {"11", "5", "4", "7", "3"},
                {"12", "5", "7", "2", "3"},
        };

        table = new JTable(data, columnNames);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( SwingConstants.RIGHT );
        table.setDefaultRenderer(String.class, centerRenderer);
        JScrollPane sp = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        sp.setBounds(450, 360, 330, 215);

        container.setBackground(Color.WHITE);
        container.add(anterior);
        container.add(siguiente);
        container.add(home);
        container.add(condiciones);
        container.add(label);
        container.add(label2);
        container.add(titulo1);
        container.add(subtitulo1);
        container.add(titulo2);
        container.add(titulo3);
        container.add(label3);
        container.add(sp);

        condiciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CondicionesContorno condiciones = new CondicionesContorno();
                condiciones.setVisible(true);
            }
        });

        anterior.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Dominio dom = new Dominio();
                dom.setVisible(true);
                dispose();
            }
        });

        siguiente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Pasos1_2 m = new Pasos1_2();
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
