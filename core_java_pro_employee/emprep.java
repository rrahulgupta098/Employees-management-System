package core_java_pro_employee; 
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * emprep.java
 *
 * Created on 2 Dec, 2013, 11:21:04 PM
 */

/**
 *
 * @author Harish
 */
public class emprep extends javax.swing.JFrame {

    /** Creates new form emprep */
    public emprep() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jopmsg = new javax.swing.JOptionPane();
        emptybtn = new javax.swing.JButton();
        viewbtn = new javax.swing.JButton();
        exitbtn1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        emptbl = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMPLOYEE PAYROLL MANAGEMENT");

        emptybtn.setText("Empty Table");
        emptybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptybtnActionPerformed(evt);
            }
        });

        viewbtn.setText("View");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });

        exitbtn1.setText("EXIT");
        exitbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtn1ActionPerformed(evt);
            }
        });

        emptbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODE NO.", "EMPLOYEE NAME", "DESIGNATION", "DEPARTMENT", "PHONE NO."
            }
        ));
        jScrollPane1.setViewportView(emptbl);

        jLabel7.setFont(new java.awt.Font("Garamond", 1, 24));
        jLabel7.setText("REPORT ON EMPLOYEES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(emptybtn)
                        .addGap(28, 28, 28)
                        .addComponent(viewbtn)
                        .addGap(37, 37, 37)
                        .addComponent(exitbtn1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emptybtn)
                    .addComponent(viewbtn)
                    .addComponent(exitbtn1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Connection con=null;
ResultSet rs=null;
Statement stmt=null;
    private void emptybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptybtnActionPerformed
        DefaultTableModel model=(DefaultTableModel)emptbl.getModel();
        int rows=model.getRowCount();
        if (rows>0) {
            for (int i=0;i<rows;i++){
                model.removeRow(0);
            }
        }
}//GEN-LAST:event_emptybtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        emptybtn.doClick();
        DefaultTableModel model=(DefaultTableModel) emptbl.getModel();
        try{
            Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/core_employee", "root", "root");
stmt=con.createStatement();
            String query="Select * from info;";
            rs=stmt.executeQuery(query);
            while (rs.next()){
                model.addRow(new Object[]{rs.getString("ecode"),rs.getString("ename"),rs.getString("edesign"),rs.getString("edept"),
                rs.getString("eph")});
            }
        } catch(Exception e){
            System.err.println(e);
        }
}//GEN-LAST:event_viewbtnActionPerformed

    private void exitbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtn1ActionPerformed
        empmenu em=new empmenu();
        em.setVisible(true);
        this.setVisible(false);
}//GEN-LAST:event_exitbtn1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emprep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable emptbl;
    private javax.swing.JButton emptybtn;
    private javax.swing.JButton exitbtn1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JOptionPane jopmsg;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables

}
