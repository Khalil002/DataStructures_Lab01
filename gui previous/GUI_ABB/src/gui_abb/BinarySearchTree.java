
package gui_abb;

/**
 *
 * @author Khalil
 */

//Clase de Arbol de Busqueda Binaria
public class BinarySearchTree {

    private Node root;
    private int totalnodes = 0; 
    private int maxheight = 0;
    private int maxNum = 0;
    private int nodeSize = 25;

    public BinarySearchTree() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }
    public int getTotalnodes() {
        return totalnodes;
    }
    public int getMaxheight() {
        return maxheight;
    }
    public int getMaxNum() {
        return maxNum;
    }
    public int getNodeSize() {
        return nodeSize;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    public void setTotalnodes(int totalnodes) {
        this.totalnodes = totalnodes;
    }
    public void setMaxheight(int maxheight) {
        this.maxheight = maxheight;
    }
    public void setMaxNum(int maxNum) {
        this.maxNum = maxNum;
    }
    public void setNodeSize(int nodeSize) {
        this.nodeSize = nodeSize;
    }
  
    //Si la raiz del arbol es nula se crea y si no es nula se inserta dentro del arbol
    public void insert(int i) {
        if (root == null) {
            root = new Node(i);
        } else {
            insert(i, root);
        }
        
        if((i+"").length()>(maxNum+"").length()){
            nodeSize+=5;
            maxNum = i;
        }
    }
    private void insert(int i, Node n) {
        if (i < n.getData()) {
            if (n.getLeft() == null) {
                n.setLeft(new Node(i));
            } else {
                insert(i, n.getLeft());
            }
        } else {
            if (i > n.getData()) {
                if (n.getRight() == null) {
                    n.setRight(new Node(i));
                } else {
                    insert(i, n.getRight());
                }
            }
        }
    }

    //Busca el nodo con la informacion "i" dada
    public Node search(int i) {
        return search(i, root);
    }
    private Node search(int i, Node n) {
        if (n != null) {
            if (i == n.getData()) {
                return n;
            } else if (i > n.getData()) {
                return search(i, n.getRight());
            } else {
                return search(i, n.getLeft());
            }
        }
        return null;
    }

    //Elimina el nodo especifico, para ello hay que considerar 3 casos: 1. El nodo es una hoja 2. El nodo tiene 1 hijo (der o izq) 3. El nodo tiene 2 hijos
    public void delete(int i) {
        delete(i, root);
        if(i==maxNum && (i+"").length()>(maxValue(root)+"").length() ){
            if(nodeSize>25){
                nodeSize-=5;
            }
            maxNum = maxValue(root);
        }
    }
    private Node delete(int i, Node n) {
        if(n == null) return n;
 
        if(i < n.getData()) {
            n.setLeft(delete(i, n.getLeft()));
        } else if(i > n.getData()) {
            n.setRight(delete(i, n.getRight()));
        } else {
            if(n.getLeft() == null && n.getRight() == null) {
                return null;
            } else if(n.getLeft() == null) {
                return n.getRight();
            } else if(n.getRight() == null) {
                return n.getLeft();
            } else {
                int min = minValue(n.getRight());
                n.setData(min);
                n.setRight(delete(min, n.getRight()));
            }
        }
        return n;
    }

    //Regresa un String con el recorrido del arbol en preOrden
    public String preOrder() {
        return preOrder(root);
    }
    private String preOrder(Node n) {
        if (n != null) {
            return n.getData() + " " + preOrder(n.getLeft()) + preOrder(n.getRight());
        }
        return "";
    }

    //Regresa un String con el recorrido del arbol en inOrden
    public String inOrder() {
        return inOrder(root);
    }
    private String inOrder(Node n) {
        if (n != null) {
            return inOrder(n.getLeft()) + n.getData() + " " + inOrder(n.getRight());
        }
        return "";
    }

    //Regresa un String con el recorrido del arbol en postOrden
    public String postOrder() {
        return postOrder(root);
    }
    private String postOrder(Node n) {
        if (n != null) {
            return postOrder(n.getLeft()) + postOrder(n.getRight()) + n.getData() + " ";
        }
        return "";
    }

    //Regresa un string con el recorrido del arbol por niveles
    public String perLevel() {
        String s = "";
        for(int i=0; i<=height(); i++){
            s+= perLevel(root, i);
        }
        return s;
    }
    private String perLevel(Node n, int i) {
        if (n != null) {
            if (i == 0) {
                return n.getData() + " ";
            } else {
                if (i > 0) {
                    return perLevel(n.getLeft(), i - 1) + perLevel(n.getRight(), i - 1);
                }
            }
        }
        return "";
    }

    //Calcula la altura del arbol
    public int height() {
        return height(root);
    }
    private int height(Node n) {
        if (n == null) {
            return -1;
        } else {
            return 1 + Math.max(height(n.getLeft()), height(n.getRight()));
        }
    }
    
    //Regresa el min valor del arbol
    private Integer minValue(Node node) { 
        if(node.getLeft() != null) {
            return minValue(node.getLeft());
        }
        return node.getData();
    }
    
    //Regresa el max valor del arbol
    private Integer maxValue(Node node) { 
        if(node.getRight() != null) {
            return maxValue(node.getLeft());
        }
        return node.getData();
    }

    //Se utiliza el recorrido inOrden para dar las coordenadas XY a cada nodo del arbol
    public void nodePositions() {
        totalnodes = 0;
        int depth = 1;
        nodePositions(root, depth);
    }
    private void nodePositions(Node t, int depth) {
        if (t != null) {
            nodePositions(t.getLeft(), depth + 1); //add 1 to depth (y coordinate) 
            t.setX((totalnodes++)); //x coord is node number in inorder traversal
            t.setY(+depth); // mark y coord as depth
            nodePositions(t.getRight(), depth + 1);
        }
    }
}
