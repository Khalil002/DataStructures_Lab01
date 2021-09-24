package gui_abb;

/**
 *
 * @author Khalil
 */
public class GUI_ABB extends javax.swing.JFrame {

    BinarySearchTree tree;
    TreePanel panel;

    public GUI_ABB() {
        initComponents();
        tree = new BinarySearchTree();
        panel = new TreePanel(panelPlaceholder);
        this.add(panel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField = new javax.swing.JTextField();
        insertBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        preorderBtn = new javax.swing.JButton();
        inorderBtn = new javax.swing.JButton();
        postorderBtn = new javax.swing.JButton();
        perlevelBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        panelPlaceholder = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        insertBtn.setText("Insertar");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Eliminar nodo");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        searchBtn.setText("Buscar nodo");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        preorderBtn.setText("Preorden");
        preorderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preorderBtnActionPerformed(evt);
            }
        });

        inorderBtn.setText("Inorden");
        inorderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inorderBtnActionPerformed(evt);
            }
        });

        postorderBtn.setText("Postorden");
        postorderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postorderBtnActionPerformed(evt);
            }
        });

        perlevelBtn.setText("Por niveles");
        perlevelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perlevelBtnActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        panelPlaceholder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panelPlaceholderLayout = new javax.swing.GroupLayout(panelPlaceholder);
        panelPlaceholder.setLayout(panelPlaceholderLayout);
        panelPlaceholderLayout.setHorizontalGroup(
            panelPlaceholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPlaceholderLayout.setVerticalGroup(
            panelPlaceholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPlaceholder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField)
                            .addComponent(insertBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteBtn)
                            .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(preorderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inorderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(postorderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(perlevelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPlaceholder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn)
                            .addComponent(preorderBtn)
                            .addComponent(postorderBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertBtn)
                            .addComponent(searchBtn)
                            .addComponent(inorderBtn)
                            .addComponent(perlevelBtn)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        tree.insert(getFieldData());
        panel.updateTree(tree);
    }//GEN-LAST:event_insertBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        tree.delete(getFieldData());
        panel.updateTree(tree);
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        Node n = tree.search(getFieldData());
        if (n != null) {
            textArea.append("Nodo encontrado: " + n.getData() + "\n");
        } else {
            textArea.append("Nodo no existe en el arbol" + "\n");
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void preorderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preorderBtnActionPerformed
        textArea.append("Recorrido preOrden: \n" + tree.preOrder() + "\n");
    }//GEN-LAST:event_preorderBtnActionPerformed

    private void inorderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inorderBtnActionPerformed
        textArea.append("Recorrido inOrden: \n" + tree.inOrder() + "\n");
    }//GEN-LAST:event_inorderBtnActionPerformed

    private void postorderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postorderBtnActionPerformed
        textArea.append("Recorrido postOrden: \n" + tree.postOrder() + "\n");
    }//GEN-LAST:event_postorderBtnActionPerformed

    private void perlevelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perlevelBtnActionPerformed
        textArea.append("Recorrido por nivel: \n" + tree.perLevel() + "\n");
    }//GEN-LAST:event_perlevelBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        GUI_ABB ui = new GUI_ABB();//get a display panel

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ui.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton inorderBtn;
    private javax.swing.JButton insertBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPlaceholder;
    private javax.swing.JButton perlevelBtn;
    private javax.swing.JButton postorderBtn;
    private javax.swing.JButton preorderBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables

    private int getFieldData() {
        return Integer.parseInt(textField.getText());
    }
}
