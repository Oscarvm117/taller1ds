/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Usuario
 */
public class CRender extends BackgroundRenderer{

    @Override
    public void render(Graphics g, Canvas c) {
        g.setColor(Color.yellow);
        g.fillOval(1, 1, 100, 100);
        g.setColor(Color.black);
    }
    
}
