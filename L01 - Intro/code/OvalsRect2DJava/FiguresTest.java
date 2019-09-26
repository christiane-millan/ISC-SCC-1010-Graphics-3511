/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LinesPractice;

import javax.swing.JFrame;

/**
 * 
 * @author Christian Millan <ceduardo dot millan at gmail dot com>
 */
public class FiguresTest {
    public static void main(String[] args) {
        Figures figures = new Figures();
        JFrame frmApplication = new JFrame();
        
        frmApplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmApplication.add(figures);
        frmApplication.setSize(1200, 1200);
        frmApplication.setVisible(true);
    }
}
