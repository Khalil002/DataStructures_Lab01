/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_miguelsierraarroyo_luisfuenteslicero_khalilelhagekassem;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author khali
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();

        this.setLocationRelativeTo(null);
        mostrarArbol.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registro = new javax.swing.JFrame();
        jPanel2 = new javax.swing.JPanel();
        show1 = new javax.swing.JButton();
        login1 = new javax.swing.JButton();
        signup1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jnumero = new javax.swing.JTextField();
        jemail = new javax.swing.JTextField();
        jnombre = new javax.swing.JTextField();
        japellido = new javax.swing.JTextField();
        registrarse = new javax.swing.JButton();
        jcontraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        cuenta = new javax.swing.JFrame();
        jPanel3 = new javax.swing.JPanel();
        jbalance = new javax.swing.JLabel();
        jid = new javax.swing.JLabel();
        jnom = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        realizarTransaccion = new javax.swing.JButton();
        monto = new javax.swing.JTextField();
        destino = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        descripcion = new javax.swing.JTextField();
        mostrarArbol = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        showArbol = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        cerrar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jusuario = new javax.swing.JTextField();
        show = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        signup = new javax.swing.JButton();
        login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jcontra = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        registro.setResizable(false);
        registro.setSize(new java.awt.Dimension(1080, 660));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        show1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mostrar contraseña.png"))); // NOI18N
        show1.setContentAreaFilled(false);
        show1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show1ActionPerformed(evt);
            }
        });
        jPanel2.add(show1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 430, 40, 40));

        login1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        login1.setText("Iniciar sesion");
        login1.setBorder(null);
        login1.setContentAreaFilled(false);
        login1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login1MouseExited(evt);
            }
        });
        login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login1ActionPerformed(evt);
            }
        });
        jPanel2.add(login1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 59, 210, 50));

        signup1.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        signup1.setText("Registrate");
        signup1.setBorder(null);
        signup1.setContentAreaFilled(false);
        signup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signup1ActionPerformed(evt);
            }
        });
        jPanel2.add(signup1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel4.setText("o");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, -1, -1));

        jnumero.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jnumero.setBorder(null);
        jPanel2.add(jnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 350, 30));

        jemail.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jemail.setBorder(null);
        jPanel2.add(jemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 350, 30));

        jnombre.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jnombre.setBorder(null);
        jPanel2.add(jnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 350, 30));

        japellido.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        japellido.setBorder(null);
        jPanel2.add(japellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 350, 30));

        registrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton de registrarse.png"))); // NOI18N
        registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarseActionPerformed(evt);
            }
        });
        jPanel2.add(registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 500, 350, 40));

        jcontraseña.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jcontraseña.setBorder(null);
        jPanel2.add(jcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 310, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pagina 2.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 620));

        javax.swing.GroupLayout registroLayout = new javax.swing.GroupLayout(registro.getContentPane());
        registro.getContentPane().setLayout(registroLayout);
        registroLayout.setHorizontalGroup(
            registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
        );
        registroLayout.setVerticalGroup(
            registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        cuenta.setResizable(false);
        cuenta.setSize(new java.awt.Dimension(1080, 660));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbalance.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jPanel3.add(jbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 150, 20));

        jid.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jPanel3.add(jid, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 150, 20));

        jnom.setBackground(new java.awt.Color(0, 0, 102));
        jnom.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jPanel3.add(jnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 300, 40));

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton salir.png"))); // NOI18N
        salir.setBorder(null);
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel3.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 110, 80));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton cerrar sesion.png"))); // NOI18N
        logout.setBorder(null);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel3.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 110, 80));

        realizarTransaccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton realizar transaccion.png"))); // NOI18N
        realizarTransaccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarTransaccionActionPerformed(evt);
            }
        });
        jPanel3.add(realizarTransaccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 350, 40));

        monto.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        monto.setBorder(null);
        jPanel3.add(monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 350, 30));

        destino.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        destino.setBorder(null);
        jPanel3.add(destino, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 350, 30));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 310, 140));

        descripcion.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        descripcion.setBorder(null);
        jPanel3.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 350, 30));

        mostrarArbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton mostrar arbol.png"))); // NOI18N
        mostrarArbol.setBorder(null);
        mostrarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarArbolActionPerformed(evt);
            }
        });
        jPanel3.add(mostrarArbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 110, 80));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuenta.png"))); // NOI18N
        jPanel3.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 620));

        javax.swing.GroupLayout cuentaLayout = new javax.swing.GroupLayout(cuenta.getContentPane());
        cuenta.getContentPane().setLayout(cuentaLayout);
        cuentaLayout.setHorizontalGroup(
            cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
        );
        cuentaLayout.setVerticalGroup(
            cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        showArbol.setResizable(false);
        showArbol.setSize(new java.awt.Dimension(1080, 660));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton de cerrar.png"))); // NOI18N
        cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarActionPerformed(evt);
            }
        });
        jPanel4.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 350, 40));

        jPanel5.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 920, 460));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pagina para mostrar arbol.png"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 620));

        javax.swing.GroupLayout showArbolLayout = new javax.swing.GroupLayout(showArbol.getContentPane());
        showArbol.getContentPane().setLayout(showArbolLayout);
        showArbolLayout.setHorizontalGroup(
            showArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
        );
        showArbolLayout.setVerticalGroup(
            showArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jusuario.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jusuario.setBorder(null);
        jPanel1.add(jusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 210, 340, 40));

        show.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mostrar contraseña.png"))); // NOI18N
        show.setContentAreaFilled(false);
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        jPanel1.add(show, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 340, 40, 40));

        ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botonDeIngresar.png"))); // NOI18N
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        jPanel1.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 350, 40));

        signup.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        signup.setText("Registrate");
        signup.setBorder(null);
        signup.setContentAreaFilled(false);
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupMouseExited(evt);
            }
        });
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jPanel1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 59, 150, 50));

        login.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        login.setText("Iniciar sesion");
        login.setBorder(null);
        login.setContentAreaFilled(false);
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        jLabel3.setText("o");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, -1, -1));

        jcontra.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jcontra.setBorder(null);
        jPanel1.add(jcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 300, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pagina 1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int auxiliar = 0;
    Arbol a = new Arbol();
    Usuario UsuarioGen = a.buscarUsuario(0);
    Usuario u;


    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        int id = Integer.parseInt(jusuario.getText());
        String contra = String.valueOf(jcontra.getPassword());

        u = a.buscarUsuario(id);
        if (u == null) {
            JOptionPane.showMessageDialog(null, "ID incorrecto");
        } else {
            if (!(u.getContraseña().equals(contra))) {
                JOptionPane.showMessageDialog(null, "Contra incorrecta!");
            } else {
                mostrarCuenta(u);
            }
        }


    }//GEN-LAST:event_ingresarActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        registro.setVisible(true);
        registro.setLocationRelativeTo(null);
        this.setVisible(false);
        jusuario.setText("");
        jcontra.setText("");
    }//GEN-LAST:event_signupActionPerformed

    private void signup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signup1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signup1ActionPerformed

    private void login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login1ActionPerformed
        this.setVisible(true);
        registro.setVisible(false);
        jnombre.setText("");
        japellido.setText("");
        jnumero.setText("");
        jemail.setText("");
        jcontraseña.setText("");
    }//GEN-LAST:event_login1ActionPerformed

    boolean emailRepetido = false;

    private void registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarseActionPerformed

        try {

            String nombre = jnombre.getText();
            String apellido = japellido.getText();
            int numeroIdentificacion = Integer.parseInt(jnumero.getText());
            String email = jemail.getText();
            String contraseña = String.valueOf(jcontraseña.getPassword());
            int nextId = 0;

            u = new Usuario(nombre, apellido, numeroIdentificacion, email, contraseña, 0);
            a.registrarUsuario(u);

            mostrarCuenta(u);
            a.guardarArchivo();

            jnombre.setText("");
            japellido.setText("");
            jnumero.setText("");
            jemail.setText("");
            jcontraseña.setText("");

            if (UsuarioGen.getBalance() > 0) {
                a.realizarTransaccion(UsuarioGen, u, 50);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error revise los campos");
        }


    }//GEN-LAST:event_registrarseActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        cuenta.setVisible(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        jusuario.setText("");
        jcontra.setText("");
        mostrarArbol.setVisible(false);

    }//GEN-LAST:event_logoutActionPerformed


    private void signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseEntered
        signup.setContentAreaFilled(true);
    }//GEN-LAST:event_signupMouseEntered

    private void signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseExited
        signup.setContentAreaFilled(false);
    }//GEN-LAST:event_signupMouseExited

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void login1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseEntered
        login1.setContentAreaFilled(true);
    }//GEN-LAST:event_login1MouseEntered

    private void login1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login1MouseExited
        login1.setContentAreaFilled(false);
    }//GEN-LAST:event_login1MouseExited

    int aux = 0;

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed

        if (aux == 0) {
            jcontra.setEchoChar((char) 0);
            aux++;
        } else {
            jcontra.setEchoChar('*');
            aux = 0;
        }

    }//GEN-LAST:event_showActionPerformed

    private void show1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show1ActionPerformed

        if (aux == 0) {
            jcontraseña.setEchoChar((char) 0);
            aux++;
        } else {
            jcontraseña.setEchoChar('*');
            aux = 0;
        }
    }//GEN-LAST:event_show1ActionPerformed

    private void realizarTransaccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarTransaccionActionPerformed

        try {
            int id2 = Integer.parseInt(destino.getText());
            float dineroT = Integer.parseInt(monto.getText());
            Usuario u2 = a.buscarUsuario(id2);
            destino.setText("");
            monto.setText("");
            if (u2 != null) {
                a.realizarTransaccion(u, u2, dineroT);
            } else {
                JOptionPane.showMessageDialog(null, "Ese usuario no existe");
                destino.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error revise los campos");
        }

    }//GEN-LAST:event_realizarTransaccionActionPerformed

    private void mostrarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarArbolActionPerformed
        showArbol.setVisible(true);
        showArbol.setLocationRelativeTo(null);
    }//GEN-LAST:event_mostrarArbolActionPerformed

    private void cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarActionPerformed
        showArbol.setVisible(false);
    }//GEN-LAST:event_cerrarActionPerformed

    public void mostrarCuenta(Usuario u) {
        jid.setText(String.valueOf(u.getId()));
        jbalance.setText(String.valueOf(u.getBalance()) + " $");
        jnom.setText(u.getNombre() + " " + u.getApellido());

        cuenta.setVisible(true);
        registro.setVisible(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cerrar;
    private javax.swing.JFrame cuenta;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField destino;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField japellido;
    private javax.swing.JLabel jbalance;
    private javax.swing.JPasswordField jcontra;
    private javax.swing.JPasswordField jcontraseña;
    private javax.swing.JTextField jemail;
    private javax.swing.JLabel jid;
    private javax.swing.JLabel jnom;
    private javax.swing.JTextField jnombre;
    private javax.swing.JTextField jnumero;
    private javax.swing.JTextField jusuario;
    private javax.swing.JButton login;
    private javax.swing.JButton login1;
    private javax.swing.JButton logout;
    private javax.swing.JTextField monto;
    private javax.swing.JButton mostrarArbol;
    private javax.swing.JButton realizarTransaccion;
    private javax.swing.JButton registrarse;
    private javax.swing.JFrame registro;
    private javax.swing.JButton salir;
    private javax.swing.JButton show;
    private javax.swing.JButton show1;
    private javax.swing.JFrame showArbol;
    private javax.swing.JButton signup;
    private javax.swing.JButton signup1;
    // End of variables declaration//GEN-END:variables
}
