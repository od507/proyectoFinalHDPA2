/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistasParqueadero;

/**
 *
 * @author ANTONIO
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     * Contendrá:
     * Cierre
     * Cobro
     * Configurar Estacionamiento
     * Consultar Disponibilidad
     * Ingresar Vehiculo
     * Registrar Vehiculo
     * Total Recaudado
     * 
     */
    Cierre cierre;
    Cobro cobro;
    ConfigurarEstacionamiento configurarEstacionamiento;
    ConsultarDisponibilidad consultarDisponibilidad;
    IngresarVehiculo ingresarVehiculo;
    RegistrarVehiculo registrarVehiculo;
    TotalRecaudado totalRecaudado;
    
    
    public Principal() {
        initComponents();
        cierre = new Cierre();
        cobro = new Cobro();
        configurarEstacionamiento = new ConfigurarEstacionamiento();
        consultarDisponibilidad = new ConsultarDisponibilidad();
        ingresarVehiculo = new IngresarVehiculo();
        registrarVehiculo = new RegistrarVehiculo();
        totalRecaudado = new TotalRecaudado();
        
        jPanel2.setBounds(0,0,400,600);
        cierre.setBounds(400,0,600,600);
        cobro.setBounds(400,0,600,600);
        configurarEstacionamiento.setBounds(400,0,600,600);
        consultarDisponibilidad.setBounds(400,0,600,600);
        ingresarVehiculo.setBounds(400,0,600,600);
        registrarVehiculo.setBounds(400,0,600,600);
        totalRecaudado.setBounds(400,0,600,600);
        
        add(cierre);
        add(cobro);
        add(configurarEstacionamiento);
        add(consultarDisponibilidad);
        add(ingresarVehiculo);
        add(registrarVehiculo);
        add(totalRecaudado);
        
        
        cierre.setVisible(false);
        cobro.setVisible(false);
        configurarEstacionamiento.setVisible(false);
        consultarDisponibilidad.setVisible(false);
        ingresarVehiculo.setVisible(false);
        registrarVehiculo.setVisible(false);
        totalRecaudado.setVisible(false);
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botonConfigurarEstacionamiento = new javax.swing.JButton();
        botonConsultarDisponibilidad = new javax.swing.JButton();
        botonRegistrarVehiculo = new javax.swing.JButton();
        botonIngresarVehiculo = new javax.swing.JButton();
        botonCobro = new javax.swing.JButton();
        botonTotalRecaudado = new javax.swing.JButton();
        botonCierreCaja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(400, 600));
        jPanel2.setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administración del Estacionamiento");

        botonConfigurarEstacionamiento.setBackground(new java.awt.Color(102, 204, 255));
        botonConfigurarEstacionamiento.setText("Configurar Estacionamiento");
        botonConfigurarEstacionamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfigurarEstacionamientoActionPerformed(evt);
            }
        });

        botonConsultarDisponibilidad.setBackground(new java.awt.Color(102, 204, 255));
        botonConsultarDisponibilidad.setText("Consultar Disponibilidad");
        botonConsultarDisponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarDisponibilidadActionPerformed(evt);
            }
        });

        botonRegistrarVehiculo.setBackground(new java.awt.Color(102, 204, 255));
        botonRegistrarVehiculo.setText("Registrar Vehiculo");
        botonRegistrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarVehiculoActionPerformed(evt);
            }
        });

        botonIngresarVehiculo.setBackground(new java.awt.Color(102, 204, 255));
        botonIngresarVehiculo.setText("Ingresar Vehículo");
        botonIngresarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarVehiculoActionPerformed(evt);
            }
        });

        botonCobro.setBackground(new java.awt.Color(102, 204, 255));
        botonCobro.setText("Cobro");
        botonCobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCobroActionPerformed(evt);
            }
        });

        botonTotalRecaudado.setBackground(new java.awt.Color(102, 204, 255));
        botonTotalRecaudado.setText("Total Recaudado");
        botonTotalRecaudado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTotalRecaudadoActionPerformed(evt);
            }
        });

        botonCierreCaja.setBackground(new java.awt.Color(102, 204, 255));
        botonCierreCaja.setText("Cierre Caja");
        botonCierreCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCierreCajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonConfigurarEstacionamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonConsultarDisponibilidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonTotalRecaudado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonRegistrarVehiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCobro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonIngresarVehiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonCierreCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonRegistrarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonConfigurarEstacionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonIngresarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonConsultarDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonTotalRecaudado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCobro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(botonCierreCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 600, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonConfigurarEstacionamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfigurarEstacionamientoActionPerformed
        // TODO add your handling code here:
        configurarEstacionamiento.setVisible(true);
        cierre.setVisible(false);
        cobro.setVisible(false);
        consultarDisponibilidad.setVisible(false);
        ingresarVehiculo.setVisible(false);
        registrarVehiculo.setVisible(false);
        totalRecaudado.setVisible(false);
        revalidate();
        repaint();
    }//GEN-LAST:event_botonConfigurarEstacionamientoActionPerformed

    private void botonCierreCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCierreCajaActionPerformed
        // TODO add your handling code here:
        cierre.setVisible(true);
        cobro.setVisible(false);
        configurarEstacionamiento.setVisible(false);
        consultarDisponibilidad.setVisible(false);
        ingresarVehiculo.setVisible(false);
        registrarVehiculo.setVisible(false);
        totalRecaudado.setVisible(false);
        revalidate();
        repaint();
        
        
    }//GEN-LAST:event_botonCierreCajaActionPerformed

    private void botonRegistrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarVehiculoActionPerformed
        // TODO add your handling code here:
        cierre.setVisible(false);
        cobro.setVisible(false);
        configurarEstacionamiento.setVisible(false);
        consultarDisponibilidad.setVisible(false);
        ingresarVehiculo.setVisible(false);
        registrarVehiculo.setVisible(true);
        totalRecaudado.setVisible(false);
        revalidate();
        repaint();
    }//GEN-LAST:event_botonRegistrarVehiculoActionPerformed

    private void botonConsultarDisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarDisponibilidadActionPerformed
        // TODO add your handling code here:
        cierre.setVisible(false);
        cobro.setVisible(false);
        configurarEstacionamiento.setVisible(false);
        consultarDisponibilidad.setVisible(true);
        ingresarVehiculo.setVisible(false);
        registrarVehiculo.setVisible(false);
        totalRecaudado.setVisible(false);
        revalidate();
        repaint();
    }//GEN-LAST:event_botonConsultarDisponibilidadActionPerformed

    private void botonTotalRecaudadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTotalRecaudadoActionPerformed
        // TODO add your handling code here:
        cierre.setVisible(false);
        cobro.setVisible(false);
        configurarEstacionamiento.setVisible(false);
        consultarDisponibilidad.setVisible(false);
        ingresarVehiculo.setVisible(false);
        registrarVehiculo.setVisible(false);
        totalRecaudado.setVisible(true);
        revalidate();
        repaint();
    }//GEN-LAST:event_botonTotalRecaudadoActionPerformed

    private void botonCobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCobroActionPerformed
        // TODO add your handling code here:
        cierre.setVisible(false);
        cobro.setVisible(true);
        configurarEstacionamiento.setVisible(false);
        consultarDisponibilidad.setVisible(false);
        ingresarVehiculo.setVisible(false);
        registrarVehiculo.setVisible(false);
        totalRecaudado.setVisible(false);
        revalidate();
        repaint();
    }//GEN-LAST:event_botonCobroActionPerformed

    private void botonIngresarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarVehiculoActionPerformed
        // TODO add your handling code here:
        cierre.setVisible(false);
        cobro.setVisible(false);
        configurarEstacionamiento.setVisible(false);
        consultarDisponibilidad.setVisible(false);
        ingresarVehiculo.setVisible(true);
        registrarVehiculo.setVisible(false);
        totalRecaudado.setVisible(false);
        revalidate();
        repaint();
    }//GEN-LAST:event_botonIngresarVehiculoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCierreCaja;
    private javax.swing.JButton botonCobro;
    private javax.swing.JButton botonConfigurarEstacionamiento;
    private javax.swing.JButton botonConsultarDisponibilidad;
    private javax.swing.JButton botonIngresarVehiculo;
    private javax.swing.JButton botonRegistrarVehiculo;
    private javax.swing.JButton botonTotalRecaudado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
