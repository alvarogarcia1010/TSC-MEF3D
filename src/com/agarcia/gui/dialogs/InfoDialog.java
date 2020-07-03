package com.agarcia.gui.dialogs;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class InfoDialog extends JFrame
{
    public int height;
    public int width;

    private Container container;
    private JLabel imagen;
    private String urlImage;

    public InfoDialog(String image, Integer width, Integer height)
    {
        super("Más Información");
        this.urlImage = image;
        this.width = width;
        this.height = height;
        setLayout(null);

        initialComponent();

        setSize(this.width, this.height);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void initialComponent()
    {
        container = getContentPane();
        container.setBackground(Color.WHITE);

        ImageIcon imageIcon = new ImageIcon(getClass().getResource(this.urlImage));
        imagen = new JLabel(imageIcon);
        imagen.setBounds(0, -15, this.width, this.height);

        container.add(imagen);
    }
}
