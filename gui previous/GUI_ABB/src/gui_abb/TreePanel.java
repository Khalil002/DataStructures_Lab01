package gui_abb;

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

    private BinarySearchTree tree;
    private final int xs;
    private final int ys;

    public TreePanel(JPanel placeholder) {
        placeholder.setOpaque(false);
        this.setBounds(placeholder.getBounds());
        this.setBorder(placeholder.getBorder());
        tree = new BinarySearchTree();
        xs = this.getWidth() / 2;
        ys = this.getHeight() / 2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (tree.getRoot() != null) {
            drawTree(g, tree.getRoot());
        }
    }
    
    //Dibuja el arbol
    public void drawTree(Graphics g, Node n) {
        int dx, dy, dx2, dy2;
        int scaleX, scaleY;
        int nodeSize = tree.getNodeSize();
        scaleX = ((this.getWidth() - xs ) / (tree.getTotalnodes()));
        scaleY = ((this.getHeight() - ys ) / (tree.getMaxheight() + 1));
        
        if (n != null) {
            drawTree(g, n.getLeft());
            dx = n.getX() * scaleX - tree.getRoot().getX() * scaleX + xs;
            dy = n.getY() * scaleY - tree.getRoot().getY() * scaleY + ys;
            String s = "" + n.getData();

            if (n.getLeft() != null) {
                dx2 = n.getLeft().getX() * scaleX - tree.getRoot().getX() * scaleX + xs;
                dy2 = n.getLeft().getY() * scaleY - tree.getRoot().getY() * scaleY + ys;
                g.drawLine(dx, dy, dx2, dy2);
            }
            if (n.getRight() != null) {
                dx2 = n.getRight().getX() * scaleX - tree.getRoot().getX() * scaleX + xs;
                dy2 = n.getRight().getY() * scaleY - tree.getRoot().getY() * scaleY + ys;
                g.drawLine(dx, dy, dx2, dy2);
            }
            drawNode(g, s, dx, dy, this.getFont(), nodeSize);
            g.setColor(Color.black);
            
            drawTree(g, n.getRight());
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
    public void updateTree(BinarySearchTree tree) {
        this.tree = tree;
        tree.nodePositions();
        tree.setMaxheight(tree.height());
        repaint();
    }
    
}
