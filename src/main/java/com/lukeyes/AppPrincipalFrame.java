package com.lukeyes;

import org.springframework.stereotype.Component;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

@Component
public class AppPrincipalFrame extends JFrame {

    ImagePanel imagePanel;

    public AppPrincipalFrame() {
        this.setSize(800, 600);
        imagePanel = new ImagePanel();
        this.add(imagePanel);
    }

}
