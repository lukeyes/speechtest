package com.lukeyes.panel;

import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class AppPrincipalFrame extends JFrame {

    ImagePanel imagePanel;

    public AppPrincipalFrame() {
        this.setSize(800, 600);
        imagePanel = new ImagePanel();
        this.add(imagePanel);
    }

}
