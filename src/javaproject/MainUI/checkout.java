/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaproject.MainUI;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.Color;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author L3gend
 */
public class checkout extends javax.swing.JFrame {

    /**
     * Creates new form checkout
     */
    public checkout() {
        initComponents();       
        data();
        image();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new customframework.PanelRound();
        minimizebtn = new javax.swing.JLabel();
        maximizebtn = new javax.swing.JLabel();
        closebtn = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tempdatatable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        deletebtn = new customframework.Button();
        button2 = new customframework.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        minimizebtn.setBackground(new java.awt.Color(255, 255, 255));
        minimizebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizebtn.setOpaque(true);
        minimizebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizebtnMouseExited(evt);
            }
        });

        maximizebtn.setBackground(new java.awt.Color(255, 255, 255));
        maximizebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maximizebtn.setOpaque(true);
        maximizebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maximizebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maximizebtnMouseExited(evt);
            }
        });

        closebtn.setBackground(new java.awt.Color(255, 255, 255));
        closebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closebtn.setFocusable(false);
        closebtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        closebtn.setOpaque(true);
        closebtn.setPreferredSize(new java.awt.Dimension(400, 300));
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closebtnMouseExited(evt);
            }
        });

        tempdatatable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title5", "Title6", "Title7"
            }
        ));
        jScrollPane1.setViewportView(tempdatatable);

        deletebtn.setText("Delete Item");
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
        });

        button2.setText("button2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(minimizebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maximizebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(closebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane4))))
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maximizebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(minimizebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizebtnMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(this.ICONIFIED);
    }//GEN-LAST:event_minimizebtnMouseClicked

    private void minimizebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizebtnMouseEntered
        // TODO add your handling code here:
        minimizebtn.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_minimizebtnMouseEntered

    private void minimizebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizebtnMouseExited
        // TODO add your handling code here:
        minimizebtn.setBackground(Color.WHITE);
    }//GEN-LAST:event_minimizebtnMouseExited

    private boolean maximizestate;
    private void maximizebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizebtnMouseClicked
        // TODO add your handling code here:
        if (maximizestate) {
            this.setExtendedState(this.NORMAL);

            ImageIcon maximizeicon = new ImageIcon(this.getClass().getResource("../icon/maximize.png"));
            Image logomaximize = maximizeicon.getImage();
            Image scalemaximize = logomaximize.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
            ImageIcon scaledmaximize = new ImageIcon(scalemaximize);
            maximizebtn.setIcon(scaledmaximize);
        } else {
            this.setExtendedState(this.MAXIMIZED_BOTH);

            ImageIcon maximizeicon = new ImageIcon(this.getClass().getResource("../icon/restore.png"));
            Image logomaximize = maximizeicon.getImage();
            Image scalemaximize = logomaximize.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
            ImageIcon scaledmaximize = new ImageIcon(scalemaximize);
            maximizebtn.setIcon(scaledmaximize);
        }
        maximizestate = !maximizestate;
    }//GEN-LAST:event_maximizebtnMouseClicked

    private void maximizebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizebtnMouseEntered
        // TODO add your handling code here:
        maximizebtn.setBackground(new Color(242, 242, 242));
    }//GEN-LAST:event_maximizebtnMouseEntered

    private void maximizebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizebtnMouseExited
        // TODO add your handling code here:
        maximizebtn.setBackground(Color.WHITE);
    }//GEN-LAST:event_maximizebtnMouseExited

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closebtnMouseClicked

    private void closebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseEntered
        // TODO add your handling code here:
        closebtn.setBackground(new Color(220, 0, 0, 255));

        ImageIcon closeicon = new ImageIcon(this.getClass().getResource("../icon/whiteclose.png"));
        Image logoclose = closeicon.getImage();
        Image scaleclose = logoclose.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon scaledclose = new ImageIcon(scaleclose);
        closebtn.setIcon(scaledclose);
    }//GEN-LAST:event_closebtnMouseEntered

    private void closebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseExited
        // TODO add your handling code here:
        closebtn.setBackground(Color.WHITE);

        ImageIcon closeicon = new ImageIcon(this.getClass().getResource("../icon/close.png"));
        Image logoclose = closeicon.getImage();
        Image scaleclose = logoclose.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon scaledclose = new ImageIcon(scaleclose);
        closebtn.setIcon(scaledclose);
    }//GEN-LAST:event_closebtnMouseExited

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
        // TODO add your handling code here:
        
        System.out.println(tempdatatable.getValueAt(tempdatatable.getSelectedRow(), 0));
        
        
    }//GEN-LAST:event_deletebtnMouseClicked

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
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkout().setVisible(true);
            }
        });
    }
    public void data(){
        String url = "jdbc:mysql://localhost:3306/possystem?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "root";
        DefaultTableModel model = (DefaultTableModel) tempdatatable.getModel();
        model.setRowCount(0);
         
            try {
                Connection connection = DriverManager.getConnection(url, user, password);
                String query = "Select * from tempdata";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    ResultSet resultSet = preparedStatement.executeQuery();
                     
                    while(resultSet.next()){
                      Object[] row = new Object[tempdatatable.getColumnCount()
                              
                              ];
                   row[0] = resultSet.getInt(1);
                   row[1] = resultSet.getString(2);
                   row[2] = resultSet.getString(3);
                   row[3] = resultSet.getString(4);
                   row[4] = resultSet.getString(5);
                   row[5] = resultSet.getString(6);
                   row[6] = resultSet.getString(7);
                    model.addRow(row);
                    }
                   
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(checkout.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void image(){
        ImageIcon closeicon = new ImageIcon(this.getClass().getResource("../icon/close.png"));
        Image logoclose = closeicon.getImage();
        Image scaleclose = logoclose.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon scaledclose = new ImageIcon(scaleclose);
        closebtn.setIcon(scaledclose);

        ImageIcon maximizeicon = new ImageIcon(this.getClass().getResource("../icon/maximize.png"));
        Image logomaximize = maximizeicon.getImage();
        Image scalemaximize = logomaximize.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon scaledmaximize = new ImageIcon(scalemaximize);
        maximizebtn.setIcon(scaledmaximize);

        ImageIcon minimizeicon = new ImageIcon(this.getClass().getResource("../icon/minimize.png"));
        Image logominimize = minimizeicon.getImage();
        Image scaleminimize = logominimize.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon scaledminimize = new ImageIcon(scaleminimize);
        minimizebtn.setIcon(scaledminimize);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private customframework.Button button2;
    private javax.swing.JLabel closebtn;
    private customframework.Button deletebtn;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel maximizebtn;
    private javax.swing.JLabel minimizebtn;
    private customframework.PanelRound panelRound1;
    private javax.swing.JTable tempdatatable;
    // End of variables declaration//GEN-END:variables
}
