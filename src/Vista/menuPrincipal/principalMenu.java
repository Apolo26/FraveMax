/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.menuPrincipal;

import java.awt.Color;
import Vista.login.login;
import javax.swing.JOptionPane;

/**
 *
 * @author APOLO
 */
public class principalMenu extends javax.swing.JFrame {

    int xMouse, yMouse;

    public principalMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jP_principal = new javax.swing.JPanel();
        jP_header = new javax.swing.JPanel();
        HomeBtn = new javax.swing.JPanel();
        HomeBtnTxt = new javax.swing.JLabel();
        BtnExit = new javax.swing.JPanel();
        BtnExitTxt = new javax.swing.JLabel();
        jL_logo = new javax.swing.JLabel();
        BtnCliente = new javax.swing.JButton();
        BtnProovedores = new javax.swing.JButton();
        BtnInventario = new javax.swing.JButton();
        BtnCompra = new javax.swing.JButton();
        BtnVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jP_principal.setBackground(new java.awt.Color(51, 51, 51));
        jP_principal.setMinimumSize(new java.awt.Dimension(800, 500));
        jP_principal.setPreferredSize(new java.awt.Dimension(800, 500));
        jP_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jP_header.setBackground(new java.awt.Color(51, 51, 51));
        jP_header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jP_headerMouseDragged(evt);
            }
        });
        jP_header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jP_headerMousePressed(evt);
            }
        });

        HomeBtn.setBackground(new java.awt.Color(51, 51, 51));

        HomeBtnTxt.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        HomeBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        HomeBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HomeBtnTxt.setText("<");
        HomeBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HomeBtnLayout = new javax.swing.GroupLayout(HomeBtn);
        HomeBtn.setLayout(HomeBtnLayout);
        HomeBtnLayout.setHorizontalGroup(
            HomeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
            .addGroup(HomeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(HomeBtnLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(HomeBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        HomeBtnLayout.setVerticalGroup(
            HomeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(HomeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(HomeBtnLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(HomeBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        BtnExit.setBackground(new java.awt.Color(51, 51, 51));
        BtnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        BtnExitTxt.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        BtnExitTxt.setForeground(new java.awt.Color(255, 255, 255));
        BtnExitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnExitTxt.setText("X");
        BtnExitTxt.setMaximumSize(new java.awt.Dimension(70, 70));
        BtnExitTxt.setMinimumSize(new java.awt.Dimension(70, 70));
        BtnExitTxt.setPreferredSize(new java.awt.Dimension(70, 70));
        BtnExitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnExitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnExitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnExitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnExitLayout = new javax.swing.GroupLayout(BtnExit);
        BtnExit.setLayout(BtnExitLayout);
        BtnExitLayout.setHorizontalGroup(
            BtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnExitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnExitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BtnExitLayout.setVerticalGroup(
            BtnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnExitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnExitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jP_headerLayout = new javax.swing.GroupLayout(jP_header);
        jP_header.setLayout(jP_headerLayout);
        jP_headerLayout.setHorizontalGroup(
            jP_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jP_headerLayout.createSequentialGroup()
                .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 626, Short.MAX_VALUE)
                .addComponent(BtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jP_headerLayout.setVerticalGroup(
            jP_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jP_headerLayout.createSequentialGroup()
                .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jP_principal.add(jP_header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));

        jL_logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/Sin título-3.png"))); // NOI18N
        jP_principal.add(jL_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 800, 100));

        BtnCliente.setBackground(new java.awt.Color(255, 255, 255));
        BtnCliente.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        BtnCliente.setForeground(new java.awt.Color(0, 0, 0));
        BtnCliente.setText("CLIENTES");
        BtnCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnClienteMouseExited(evt);
            }
        });
        BtnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnClienteActionPerformed(evt);
            }
        });
        jP_principal.add(BtnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 140, 60));

        BtnProovedores.setBackground(new java.awt.Color(255, 255, 255));
        BtnProovedores.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        BtnProovedores.setForeground(new java.awt.Color(0, 0, 0));
        BtnProovedores.setText("PROOVEDORES");
        BtnProovedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnProovedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnProovedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnProovedoresMouseExited(evt);
            }
        });
        BtnProovedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnProovedoresActionPerformed(evt);
            }
        });
        jP_principal.add(BtnProovedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 190, 60));

        BtnInventario.setBackground(new java.awt.Color(255, 255, 255));
        BtnInventario.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        BtnInventario.setForeground(new java.awt.Color(0, 0, 0));
        BtnInventario.setText("INVENTARIO");
        BtnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnInventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnInventarioMouseExited(evt);
            }
        });
        BtnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInventarioActionPerformed(evt);
            }
        });
        jP_principal.add(BtnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 170, 60));

        BtnCompra.setBackground(new java.awt.Color(255, 255, 255));
        BtnCompra.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        BtnCompra.setForeground(new java.awt.Color(0, 0, 0));
        BtnCompra.setText("COMPRA");
        BtnCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnCompraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnCompraMouseExited(evt);
            }
        });
        BtnCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCompraActionPerformed(evt);
            }
        });
        jP_principal.add(BtnCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 170, 60));

        BtnVenta.setBackground(new java.awt.Color(255, 255, 255));
        BtnVenta.setFont(new java.awt.Font("HP Simplified", 1, 18)); // NOI18N
        BtnVenta.setForeground(new java.awt.Color(0, 0, 0));
        BtnVenta.setText("VENTA");
        BtnVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnVentaMouseExited(evt);
            }
        });
        BtnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVentaActionPerformed(evt);
            }
        });
        jP_principal.add(BtnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 170, 60));

        jPanel1.add(jP_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Botones Menu Principal
    private void BtnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClienteActionPerformed
        dispose();
        vistaCliente agg = new vistaCliente();
        agg.setVisible(true);

    }//GEN-LAST:event_BtnClienteActionPerformed

    private void BtnProovedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnProovedoresActionPerformed
        dispose();
        vistaProveedor pro = new vistaProveedor();
        pro.setVisible(true);
    }//GEN-LAST:event_BtnProovedoresActionPerformed

    private void BtnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInventarioActionPerformed
        dispose();
        vistaInventario inven = new vistaInventario();
        inven.setVisible(true);
    }//GEN-LAST:event_BtnInventarioActionPerformed

    private void BtnCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCompraActionPerformed
        dispose();
        vistaCompra comp = new vistaCompra();
        comp.setVisible(true);
    }//GEN-LAST:event_BtnCompraActionPerformed

    private void BtnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVentaActionPerformed
        // TODO add your handling code here:
        dispose();
        vistaVenta venta = new vistaVenta();
        venta.setVisible(true);
    }//GEN-LAST:event_BtnVentaActionPerformed

    // Cabecera y eventos para draggear y cerrar el programa
    private void jP_headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jP_headerMousePressed

    private void jP_headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jP_headerMouseDragged
        //Esto hace que se pueda draggear el programa
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jP_headerMouseDragged

    private void BtnExitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitTxtMouseEntered
        BtnExit.setBackground(Color.RED);
    }//GEN-LAST:event_BtnExitTxtMouseEntered

    private void BtnExitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitTxtMouseClicked
        int option = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que queres cerrar el programa?", "Confirmar cierre", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_BtnExitTxtMouseClicked

    // Colores Hover
    private void BtnExitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnExitTxtMouseExited
        BtnExit.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_BtnExitTxtMouseExited

    private void HomeBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnTxtMouseEntered
        HomeBtn.setBackground(Color.MAGENTA);
    }//GEN-LAST:event_HomeBtnTxtMouseEntered

    private void HomeBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnTxtMouseExited
        HomeBtn.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_HomeBtnTxtMouseExited

    private void BtnClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClienteMouseEntered
        BtnCliente.setBackground(Color.MAGENTA);
        BtnCliente.setForeground(Color.WHITE);
    }//GEN-LAST:event_BtnClienteMouseEntered

    private void BtnClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnClienteMouseExited
        BtnCliente.setBackground(Color.WHITE);
        BtnCliente.setForeground(Color.BLACK);
    }//GEN-LAST:event_BtnClienteMouseExited

    // Boton volver al Login
    private void HomeBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnTxtMouseClicked
        dispose();
        login login = new login();
        login.setVisible(true);
    }//GEN-LAST:event_HomeBtnTxtMouseClicked

    //Colores Hover
    private void BtnProovedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProovedoresMouseEntered
        BtnProovedores.setBackground(Color.MAGENTA);
        BtnProovedores.setForeground(Color.WHITE);
    }//GEN-LAST:event_BtnProovedoresMouseEntered

    private void BtnProovedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnProovedoresMouseExited
        BtnProovedores.setBackground(Color.WHITE);
        BtnProovedores.setForeground(Color.BLACK);
    }//GEN-LAST:event_BtnProovedoresMouseExited

    private void BtnInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInventarioMouseEntered
        BtnInventario.setBackground(Color.MAGENTA);
        BtnInventario.setForeground(Color.WHITE);
    }//GEN-LAST:event_BtnInventarioMouseEntered

    private void BtnInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInventarioMouseExited
        BtnInventario.setBackground(Color.WHITE);
        BtnInventario.setForeground(Color.BLACK);
    }//GEN-LAST:event_BtnInventarioMouseExited

    private void BtnCompraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCompraMouseEntered
        BtnCompra.setBackground(Color.MAGENTA);
        BtnCompra.setForeground(Color.WHITE);
    }//GEN-LAST:event_BtnCompraMouseEntered

    private void BtnCompraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCompraMouseExited
        BtnCompra.setBackground(Color.WHITE);
        BtnCompra.setForeground(Color.BLACK);
    }//GEN-LAST:event_BtnCompraMouseExited

    private void BtnVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVentaMouseEntered
        BtnVenta.setBackground(Color.MAGENTA);
        BtnVenta.setForeground(Color.WHITE);
    }//GEN-LAST:event_BtnVentaMouseEntered

    private void BtnVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnVentaMouseExited
        BtnVenta.setBackground(Color.WHITE);
        BtnVenta.setForeground(Color.BLACK);
    }//GEN-LAST:event_BtnVentaMouseExited

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
            java.util.logging.Logger.getLogger(principalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principalMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCliente;
    private javax.swing.JButton BtnCompra;
    private javax.swing.JPanel BtnExit;
    private javax.swing.JLabel BtnExitTxt;
    private javax.swing.JButton BtnInventario;
    private javax.swing.JButton BtnProovedores;
    private javax.swing.JButton BtnVenta;
    private javax.swing.JPanel HomeBtn;
    private javax.swing.JLabel HomeBtnTxt;
    private javax.swing.JLabel jL_logo;
    private javax.swing.JPanel jP_header;
    private javax.swing.JPanel jP_principal;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
