/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Usuario
 */
public class VPlayer extends Player{
    
    public VPlayer(double x, double y, Game game) {
        super(x, y, game);
    }

    @Override
    public void shoot() 
    {
            Bullet b = new VBullet(x+(WIDTH/2)-5, y-18,game);       
            game.getBullets().addBullet(b);
    }

  
    @Override
    public void render(Graphics g) 
    {
                g.setColor(Color.black);
		g.drawOval((int) x, (int) y, 12,2);
	}
    
}
