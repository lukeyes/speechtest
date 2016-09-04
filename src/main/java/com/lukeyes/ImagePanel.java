package com.lukeyes;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class ImagePanel extends JPanel {

    BufferedImage image;

    public ImagePanel() {

        try {
            image = ImageIO.read(new File("Annabelle_1.png"));
        } catch (IOException ex) {
            System.out.println("Loading image failed");
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, null); // see javadoc for more info on the parameters
    }
}
