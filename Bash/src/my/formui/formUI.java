/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.formui;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import my.editform.editform;
import my.addform.AddForm;
import my.loginform.login2;

/**
 *
 * @author Hunter
 */
public class formUI extends javax.swing.JFrame {
    /**
     * Creates new form formUI
     */
    public formUI() {
        initComponents();
        jTableWork tableConstructor = new jTableWork();
        tableConstructor.jTableSub();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jTablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BASHM Inventory Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jButton1.setText("Add New Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit Item");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Delete Item");

        jTextField1.setToolTipText("");

        jButton4.setText("Search by ID");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setText("Inventory Report");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"hi", null, null, null, null, null},
                {"hi", null, null, null, null, null}
            },
            new String [] {
                "#", "ID", "Quantity", "Price", "Purchase_Date", "Description"
            }
        ));
        inventoryTable.setEnabled(false);
        jScrollPane1.setViewportView(inventoryTable);

        javax.swing.GroupLayout jTablePanelLayout = new javax.swing.GroupLayout(jTablePanel);
        jTablePanel.setLayout(jTablePanelLayout);
        jTablePanelLayout.setHorizontalGroup(
            jTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 608, Short.MAX_VALUE)
            .addGroup(jTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTablePanelLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jTablePanelLayout.setVerticalGroup(
            jTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
            .addGroup(jTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jTablePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jButton7.setText("Close Form");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Search by Desc.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(657, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton6, jButton7});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)
                            .addComponent(jButton8))
                        .addGap(49, 49, 49)
                        .addComponent(jTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3, jButton6, jButton7});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             // For add item button:
        setVisible(false);
        new AddForm().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            // For edit item button:
        setVisible(false);
        new editform().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new login2().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
         Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Parts", "parts", "password");
         Statement stmt = (Statement) con.createStatement();
         
         
         String ID = jTextField1.getText();
         
        
         
         String SQL = "SELECT * FROM INVENTORY WHERE ID='" + ID + "'" ;
         
         
         ResultSet rs = stmt.executeQuery(SQL);
         
         
         while(rs.next())  {
             System.out.println("ID"+ rs.getString("ID") + "Quantity:" + rs.getString("QUANTITY") + rs.getString("Purchase_Date"));
             
         }
        
      }catch(Exception e) {
          System.out.println("Error: " + e.getMessage());
         
      }
    }//GEN-LAST:event_jButton4ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(formUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable inventoryTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jTablePanel;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    public class jTableWork implements ActionListener {
       int count = 0;
       public void jTableSub() {
           jTablePanel.setVisible(false);
           jButton6.addActionListener(this);
       }

        public void actionPerformed(ActionEvent e) {
           jTablePanel.setVisible(true);
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Parts", "parts", "password");
                Statement myStatement = conn.createStatement();
                ResultSet mySet = myStatement.executeQuery("select * from INVENTORY");
                DefaultTableModel myModel = new DefaultTableModel(new String[]{"#", "ID", "Quantity", "Price", "Purchase Date","Description"}, count);
            while (mySet.next()) {
                String ID, Quantity, Price, Purchase_Date, Description;
                int rowNumber = count;
                ID = mySet.getString(1);
                Quantity = mySet.getString(2);
                Price = mySet.getString(3);
                Purchase_Date = mySet.getString(4);
                Description = mySet.getString(5);
                myModel.addRow(new Object[] {rowNumber, ID, Quantity, Price, Purchase_Date, Description});
               inventoryTable.setModel(myModel);
               count +=1;
            }

        } catch (Exception d){
            JOptionPane.showMessageDialog(null, d);
         }
      }
   }
}