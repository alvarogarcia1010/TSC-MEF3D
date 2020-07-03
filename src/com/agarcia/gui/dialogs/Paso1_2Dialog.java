package com.agarcia.gui.dialogs;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Paso1_2Dialog extends JFrame {

    public static int height = 630;
    public static int width = 560;
    private int x = 5, y = 28;
    private Container container;
    private String urlImage;

    private BufferedImage image1;

    public Paso1_2Dialog(String image){
        super("Más Información");
        urlImage = image;
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        container = getContentPane();
        container.setBackground(Color.WHITE);

        initialComponent();
        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public Paso1_2Dialog(String image, int x, int y, int width, int height){
        super("Más Información");
        urlImage = image;
        this.x = x;
        this.y = y;
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        container = getContentPane();
        container.setBackground(Color.WHITE);

        initialComponent();
        setSize(width, height);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void initialComponent() {
        /*frame = new JFrame();
        JScrollPane pane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        frame.setContentPane(pane);*/

        try {
            image1 = ImageIO.read(getClass().getResource(urlImage));
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(image1, x, y,  this);
    }

}
