/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balitechy.spacewar.main;

import java.awt.Canvas;
import java.awt.Graphics;

/**
 *
 * @author Usuario
 */
public class VRender extends BackgroundRenderer{

    @Override
    public void render(Graphics g, Canvas c) {
    g.drawOval(1, 1, 100, 100);
    }
    
}
