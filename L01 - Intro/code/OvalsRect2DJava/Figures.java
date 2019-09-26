/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LinesPractice;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * 
 * @author Christian Millan <ceduardo dot millan at gmail dot com>
 */
public class Figures extends JPanel {
    public void paintComponent (Graphics g){
        g.drawRect(10, 10, 50, 50);
        g.drawOval(200, 200, 50, 50);
        
        g.setColor(Color.YELLOW);
        g.fillOval(300, 300, 50, 50);
        g.setColor(Color.BLACK);
        g.fillRect(400, 400, 250, 250);
        
        g.setColor(Color.YELLOW);
        int centerX = getWidth()/2;
        int centerY = getHeight()-300;
        g.fillArc(centerX, centerY, 250, 250, 45, 270);
//        g.drawString(TOOL_TIP_TEXT_KEY, WIDTH, WIDTH);
        
       
    }
}
