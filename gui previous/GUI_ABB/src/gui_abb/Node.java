
package gui_abb;

/**
 *
 * @author Khalil
 */

//Clase del nodo para un arbol binario
public class Node {

    private int data, x, y;
    private Node left, right;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public Node getLeft() {
        return left;
    }
    public Node getRight() {
        return right;
    }

    public void setData(int data) {
        this.data = data;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public void setRight(Node right) {
        this.right = right;
    }
}
