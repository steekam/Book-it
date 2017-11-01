
package project_booking;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        overlay_pnl.setBackground(new Color(0,0,0,200));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        overlay_pnl = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        image = new javax.swing.JLabel();
        details_pnl = new javax.swing.JPanel();
        oneway = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        btnCheck = new javax.swing.JToggleButton();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        roundtrip = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        btnCheck1 = new javax.swing.JToggleButton();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        jXDatePicker3 = new org.jdesktop.swingx.JXDatePicker();
        tab = new javax.swing.JPanel();
        pnl_one = new javax.swing.JPanel();
        lbl_oneway = new javax.swing.JLabel();
        pnl_round = new javax.swing.JPanel();
        lbl_round = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        overlay_pnl.setBackground(new java.awt.Color(102, 0, 102));

        exit.setBackground(new java.awt.Color(49, 74, 74));
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-cancel_1.png"))); // NOI18N
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        logo.setBackground(new java.awt.Color(49, 74, 74));
        logo.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        logo.setForeground(new java.awt.Color(153, 153, 153));
        logo.setText("Train It");

        javax.swing.GroupLayout overlay_pnlLayout = new javax.swing.GroupLayout(overlay_pnl);
        overlay_pnl.setLayout(overlay_pnlLayout);
        overlay_pnlLayout.setHorizontalGroup(
            overlay_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overlay_pnlLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(logo)
                .addContainerGap(625, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, overlay_pnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
        );
        overlay_pnlLayout.setVerticalGroup(
            overlay_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(overlay_pnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit)
                .addGap(43, 43, 43)
                .addComponent(logo)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jPanel1.add(overlay_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 240));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sgr.jpg"))); // NOI18N
        image.setText("jLabel1");
        jPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 240));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        details_pnl.setLayout(new java.awt.CardLayout());

        oneway.setBackground(new java.awt.Color(102, 0, 102));
        oneway.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Khmer OS Content", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Departing:");
        oneway.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Khmer OS Content", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("From:");
        oneway.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nairobi", "Mombasa", "Mtito-Andei", "Mariakani", "Maisenyi", "Voi", "Kibwezi", "Emali", "Athi River" }));
        jComboBox1.setSelectedIndex(1);
        jComboBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        oneway.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 210, -1));

        jComboBox2.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox2.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nairobi", "Mombasa", "Mtito-Andei", "Mariakani", "Maisenyi", "Voi", "Kibwezi", "Emali", "Athi River" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        oneway.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, -1));
        oneway.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 200, 20));
        oneway.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 200, 10));
        oneway.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 200, 10));

        jLabel4.setFont(new java.awt.Font("Khmer OS Content", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("To:");
        oneway.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        btnCheck.setBackground(new java.awt.Color(2, 62, 66));
        btnCheck.setForeground(new java.awt.Color(153, 153, 153));
        btnCheck.setText("Check Availability");
        btnCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCheckMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCheckMouseEntered(evt);
            }
        });
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });
        oneway.add(btnCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, -1, -1));

        jXDatePicker1.setBackground(new java.awt.Color(255, 255, 255));
        jXDatePicker1.setMaximumSize(new java.awt.Dimension(133, 13));
        oneway.add(jXDatePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, -1));

        details_pnl.add(oneway, "card2");

        roundtrip.setBackground(new java.awt.Color(102, 0, 102));
        roundtrip.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Khmer OS Content", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("From:");
        roundtrip.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 60, -1));

        jLabel6.setFont(new java.awt.Font("Khmer OS Content", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Returning:");
        roundtrip.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 90, -1));

        jLabel7.setFont(new java.awt.Font("Khmer OS Content", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("To:");
        roundtrip.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 40, -1));

        jLabel8.setFont(new java.awt.Font("Khmer OS Content", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Departing:");
        roundtrip.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        jComboBox3.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox3.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nairobi", "Mombasa", "Mtito-Andei", "Mariakani", "Maisenyi", "Voi", "Kibwezi", "Emali", "Athi River" }));
        jComboBox3.setSelectedIndex(1);
        roundtrip.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, -1));

        jComboBox4.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox4.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nairobi", "Mombasa", "Mtito-Andei", "Mariakani", "Maisenyi", "Voi", "Kibwezi", "Emali", "Athi River" }));
        roundtrip.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 200, -1));
        roundtrip.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 180, 20));
        roundtrip.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, 20));
        roundtrip.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 210, 20));
        roundtrip.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 200, 20));

        btnCheck1.setBackground(new java.awt.Color(2, 62, 66));
        btnCheck1.setForeground(new java.awt.Color(153, 153, 153));
        btnCheck1.setText("Check Availability");
        btnCheck1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCheck1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCheck1MouseEntered(evt);
            }
        });
        roundtrip.add(btnCheck1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, -1));

        jXDatePicker2.setBackground(new java.awt.Color(255, 255, 255));
        roundtrip.add(jXDatePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 210, -1));

        jXDatePicker3.setBackground(new java.awt.Color(255, 255, 255));
        roundtrip.add(jXDatePicker3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 190, -1));

        details_pnl.add(roundtrip, "card3");

        getContentPane().add(details_pnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 790, 320));

        tab.setBackground(new java.awt.Color(102, 0, 102));
        tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_one.setBackground(new java.awt.Color(204, 0, 204));
        pnl_one.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_oneMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                none(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_oneMouseEntered(evt);
            }
        });

        lbl_oneway.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        lbl_oneway.setForeground(new java.awt.Color(204, 204, 204));
        lbl_oneway.setText("OneWay");

        javax.swing.GroupLayout pnl_oneLayout = new javax.swing.GroupLayout(pnl_one);
        pnl_one.setLayout(pnl_oneLayout);
        pnl_oneLayout.setHorizontalGroup(
            pnl_oneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_oneLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lbl_oneway)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_oneLayout.setVerticalGroup(
            pnl_oneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_oneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_oneway)
                .addContainerGap())
        );

        tab.add(pnl_one, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 110, 50));

        pnl_round.setBackground(new java.awt.Color(102, 0, 102));
        pnl_round.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl_roundMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_roundMouseEntered(evt);
            }
        });

        lbl_round.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 18)); // NOI18N
        lbl_round.setForeground(new java.awt.Color(204, 204, 204));
        lbl_round.setText("RoundTrip");

        javax.swing.GroupLayout pnl_roundLayout = new javax.swing.GroupLayout(pnl_round);
        pnl_round.setLayout(pnl_roundLayout);
        pnl_roundLayout.setHorizontalGroup(
            pnl_roundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_roundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_round)
                .addContainerGap())
        );
        pnl_roundLayout.setVerticalGroup(
            pnl_roundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_roundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_round)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tab.add(pnl_round, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, 60));

        getContentPane().add(tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 790, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnl_oneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_oneMouseEntered
        // TODO add your handling code here:
        setpnlColor(pnl_one);
        resetpnlColor(pnl_round);
    }//GEN-LAST:event_pnl_oneMouseEntered

    private void none(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_none
        // TODO add your handling code here:
        
    }//GEN-LAST:event_none

    private void pnl_roundMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_roundMouseEntered
        // TODO add your handling code here:
        setpnlColor(pnl_round);
        resetpnlColor(pnl_one);
    }//GEN-LAST:event_pnl_roundMouseEntered

    private void pnl_oneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_oneMouseClicked
        // TODO add your handling code here:
        setpnlColor(pnl_one);
        resetpnlColor(pnl_round);
        oneway.setVisible(true);
        roundtrip.setVisible(false);
    }//GEN-LAST:event_pnl_oneMouseClicked

    private void pnl_roundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_roundMouseClicked
        // TODO add your handling code here:
        setpnlColor(pnl_round);
        resetpnlColor(pnl_one);
        roundtrip.setVisible(true);
        oneway.setVisible(false);
    }//GEN-LAST:event_pnl_roundMouseClicked

    private void btnCheckMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckMouseEntered
        // TODO add your handling code here:
        btnCheck.setBackground(new java.awt.Color(49,74,74));
    }//GEN-LAST:event_btnCheckMouseEntered

    private void btnCheckMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckMouseExited
        // TODO add your handling code here:
        btnCheck.setBackground(new java.awt.Color(2,62,66));
    }//GEN-LAST:event_btnCheckMouseExited

    private void btnCheck1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheck1MouseEntered
        // TODO add your handling code here:
         btnCheck1.setBackground(new java.awt.Color(49,74,74));        
    }//GEN-LAST:event_btnCheck1MouseEntered

    private void btnCheck1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheck1MouseExited
        // TODO add your handling code here:
        btnCheck1.setBackground(new java.awt.Color(2,62,66));
    }//GEN-LAST:event_btnCheck1MouseExited

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_exitMouseClicked

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Tickets available!;)", "Success", JOptionPane.PLAIN_MESSAGE);
        new Booking_details().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnCheckActionPerformed

    // -------to switch active/inactive labels
    public void setpnlColor(JPanel panel){
        panel.setBackground(new java.awt.Color(204,0,204));
    }
    public void resetpnlColor(JPanel panel){
        panel.setBackground(new java.awt.Color(102,0,102));
    }
    //-----------------------------END---------------------------------
    

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCheck;
    private javax.swing.JToggleButton btnCheck1;
    private javax.swing.JPanel details_pnl;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel image;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker3;
    private javax.swing.JLabel lbl_oneway;
    private javax.swing.JLabel lbl_round;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel oneway;
    private javax.swing.JPanel overlay_pnl;
    private javax.swing.JPanel pnl_one;
    private javax.swing.JPanel pnl_round;
    private javax.swing.JPanel roundtrip;
    private javax.swing.JPanel tab;
    // End of variables declaration//GEN-END:variables
}
