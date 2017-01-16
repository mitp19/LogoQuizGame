

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*; 

/**
 *
 * @author mitp1_000
 */
public class Menu {
    // creates buttons for start menu 
    public Rectangle playButton = new Rectangle (logoQuiz.WIDTH / 2 + 120 + 150, 100, 50); 
    public Rectangle helpButton = new Rectangle (logoQuiz.WIDTH / 2 + 120 + 150, 100, 50);
    public Rectangle quitButton = new Rectangle (logoQuiz.WIDTH / 2 + 120 + 150, 100, 50);
    
    public void render(Graphics g) {
     Graphics2D g2d = (Graphics2D) g; 
     // creates new font
     Font fnt0 = new Font ("arial", Font.BOLD, 50);
     g.setFont(fnt0);
     g.setColor(Color.black);
     
     Font fnt1 = new Font ("arial", Font.BOLD, 30);
     g.setFont(fnt1);
     g.drawString("Play",playButton.x, playButton.y); 
     g2d.draw(playButton);
     g2d.draw(helpButton);
     g2d.draw(quitButton);
    }
}
