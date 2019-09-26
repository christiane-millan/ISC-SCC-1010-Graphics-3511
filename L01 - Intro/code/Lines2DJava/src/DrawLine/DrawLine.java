/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DrawLine;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * 
 * @author Christian Millan <ceduardo dot millan at gmail dot com>
 */
public class DrawLine extends JPanel {

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        
        g.setColor(Color.red);
        g.drawLine(0, 0, 0, 150);
        
        int sizeHeight = height / 16;
        int sizeWidth = width / 16;
        
        for (int i = 0; i < 17; i++) {
            g.drawLine(0, 0, width - (sizeWidth*i), sizeHeight*i);
        }
    }
}
