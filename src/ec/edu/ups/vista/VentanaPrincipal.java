/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.*;
import ec.edu.ups.dao.ClienteDAO;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.DefaultListModel;

/**
 *
 * @author Usuario
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    //Ventanas internas
    private VentanaCliente ventanaCliente;
    private VentanaListarTicket listarTicket;
   
   //Controlador
   private ControladorTicket cTicket;
   
   //localizacion
   private Locale localizacion;
   
   private ResourceBundle mensajes;
   
    public VentanaPrincipal() {
        
        initComponents();
        ventanaCliente = new VentanaCliente();
        listarTicket = new VentanaListarTicket(); 
    }
    
    public void cambiarIdioma(){
        
        fileMenu.setText(mensajes.getString("fileMenu"));
        IdiomaMenu.setText(mensajes.getString("IdiomaMenu"));
        IngresarClienteMenuItem.setText(mensajes.getString("IngresarClienteMenuItem"));
        TicketsMenuItem.setText(mensajes.getString("TicketsMenuItem"));
        saveAsMenuItem.setText(mensajes.getString("saveAsMenuItem"));
        cutMenuItem.setText(mensajes.getString("cutMenuItem"));
        copyMenuItem.setText(mensajes.getString("copyMenuItem"));
        ventanaCliente.getLbCedula().setText(mensajes.getString("lbCedula"));
        ventanaCliente.getLbDireccion().setText(mensajes.getString("lbDireccion"));
        ventanaCliente.getLbNombre().setText(mensajes.getString("lbNombre"));
        ventanaCliente.getLbTelefono().setText(mensajes.getString("lbTelefono"));
        ventanaCliente.getBtnCerrar().setText(mensajes.getString("btnCerrar"));
        ventanaCliente.getBtnIngresarVehiculo().setText(mensajes.getString("btnIngresarVehiculo"));
        ventanaCliente.getPnlCliente().setBorder(javax.swing.BorderFactory.createTitledBorder(null, mensajes.getString("pnlCliente"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14), new java.awt.Color(51, 0, 51)));
        ventanaCliente.getV().getLbMarca().setText(mensajes.getString("lbMarca"));
        ventanaCliente.getV().getLbModelo().setText(mensajes.getString("lbModelo"));
        ventanaCliente.getV().getLbPLaca().setText(mensajes.getString("lbPlaca"));
        ventanaCliente.getV().getPnlVehiculo().setBorder(javax.swing.BorderFactory.createTitledBorder(null, mensajes.getString("pnlVehiculo"), javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        IngresarClienteMenuItem = new javax.swing.JMenuItem();
        TicketsMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        IdiomaMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Inicio");

        IngresarClienteMenuItem.setMnemonic('o');
        IngresarClienteMenuItem.setText("Ingresar Cliente");
        IngresarClienteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarClienteMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(IngresarClienteMenuItem);

        TicketsMenuItem.setMnemonic('s');
        TicketsMenuItem.setText("Tickets");
        TicketsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(TicketsMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Salir");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        menuBar.add(fileMenu);

        IdiomaMenu.setMnemonic('e');
        IdiomaMenu.setText("Idiomas");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Español");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        IdiomaMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Inglés");
        copyMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyMenuItemActionPerformed(evt);
            }
        });
        IdiomaMenu.add(copyMenuItem);

        menuBar.add(IdiomaMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarClienteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarClienteMenuItemActionPerformed
        if(ventanaCliente.isVisible() == false){
        desktopPane.add(ventanaCliente);
        ventanaCliente.setVisible(true);
        }
    }//GEN-LAST:event_IngresarClienteMenuItemActionPerformed

    private void TicketsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketsMenuItemActionPerformed
        if(listarTicket.isVisible() == false){
         desktopPane.add(listarTicket);
         listarTicket.setVisible(true);
        }
    }//GEN-LAST:event_TicketsMenuItemActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
       System.exit(0);
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        localizacion = new Locale("es", "EC");

        mensajes = ResourceBundle.getBundle("ec.edu.ups.idioma.mensajes", localizacion);

        cambiarIdioma();
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void copyMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyMenuItemActionPerformed
        localizacion = new Locale("en", "UK");
        mensajes = ResourceBundle.getBundle("ec.edu.ups.idioma.mensajes", localizacion);
        cambiarIdioma();
    }//GEN-LAST:event_copyMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu IdiomaMenu;
    private javax.swing.JMenuItem IngresarClienteMenuItem;
    private javax.swing.JMenuItem TicketsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem saveAsMenuItem;
    // End of variables declaration//GEN-END:variables

}
