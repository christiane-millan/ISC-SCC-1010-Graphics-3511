/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DrawLine;

import javax.swing.JFrame;

/**
 * 
 * @author Christian Millan <ceduardo dot millan at gmail dot com>
 */
public class DrawLineTest {
    // Este es el 
    public static void main(String[] args) {
        DrawLine drawLine = new DrawLine();
        JFrame frmApplication = new JFrame();
        frmApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frmApplication.add(drawLine);
        frmApplication.setSize(320, 320);
        frmApplication.setVisible(true);
                
    }
}
