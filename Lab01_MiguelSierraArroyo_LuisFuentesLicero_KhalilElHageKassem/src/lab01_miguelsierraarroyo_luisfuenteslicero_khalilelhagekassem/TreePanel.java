/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_miguelsierraarroyo_luisfuenteslicero_khalilelhagekassem;

/**
 *
 * @author Khalil
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

//Clase para el panel donde se dibuja el arbol
public class TreePanel extends JPanel {

    private Arbol tree;
    private final int xs;
    private final int ys;

    public TreePanel(JPanel placeholder) {
        placeholder.setOpaque(false);
        this.setBounds(placeholder.getBounds());
        this.setBorder(placeholder.getBorder());
        tree = new Arbol();
        xs = this.getWidth() / 2;
        ys = this.getHeight() / 2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (tree.getR() != null) {
            drawUsuarios(g, tree.getR().usuario);
        }
    }
    
    //Dibuja el arbol
    public void drawUsuarios(Graphics g, Usuario n) {
        int dx, dy, dx2, dy2;
        int scaleX, scaleY;
        int nodeSize = 5;
        scaleX = ((this.getWidth() - xs ) / (tree.getTotalNodes()));
        scaleY = ((this.getHeight() - ys ) / (tree.height() + 1));
        
        if (n != null) {
            drawUsuarios(g, n.getIzquierda());
            dx = n.getX() * scaleX - tree.getR().getX() * scaleX + xs;
            dy = n.getY() * scaleY - tree.getR().getY() * scaleY + ys;
            String s = "" + n.getData();

            if (n.getIzquierda() != null) {
                dx2 = n.getIzquierda().getX() * scaleX - tree.getR().getX() * scaleX + xs;
                dy2 = n.getIzquierda().getY() * scaleY - tree.getR().getY() * scaleY + ys;
                g.drawLine(dx, dy, dx2, dy2);
            }
            if (n.getDerecha() != null) {
                dx2 = n.getDerecha().getX() * scaleX - tree.getR().getX() * scaleX + xs;
                dy2 = n.getDerecha().getY() * scaleY - tree.getR().getY() * scaleY + ys;
                g.drawLine(dx, dy, dx2, dy2);
            }
            drawNode(g, s, dx, dy, this.getFont(), nodeSize);
            g.setColor(Color.black);
            
            drawUsuarios(g, n.getDerecha());
        }
    }

    //Dibuja cada nodo del arbol
    public void drawNode(Graphics g, String s, int x, int y, Font f, int d){
        int xN = x - d/2;
        int yN = y - d/2;
        g.setColor(Color.black);
        g.fillOval(xN, yN, d, d);
        
        FontMetrics metrics = g.getFontMetrics(f);
        xN = x -  (metrics.stringWidth(s)) / 2;
        yN = y - (metrics.getHeight() / 2) + metrics.getAscent();      
        g.setFont(f);
        g.setColor(Color.white);
        g.drawString(s, xN, yN);
    }
    
    //Actualiza el arbol binario cuando se inserta o se elimina un nodo
    public void updateTree(Arbol tree) {
        this.tree = tree;
        //tree.nodePositions();
        //tree.setMaxheight(tree.height());
        repaint();
    }
    
}