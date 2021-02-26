package core_java_pro_employee;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
public class empdel extends javax.swing.JFrame {


    public empdel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jopmsg = new javax.swing.JOptionPane();
        srchbtn = new javax.swing.JButton();
        delbtn = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        ecodecmb = new javax.swing.JComboBox();
        ecodetf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        designtf = new javax.swing.JTextField();
        enametf = new javax.swing.JTextField();
        grtf = new javax.swing.JTextField();
        phtf = new javax.swing.JTextField();
        addrtf = new javax.swing.JTextField();
        bptf = new javax.swing.JTextField();
        depttf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        srchbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        srchbtn.setText("SEARCH");
        srchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchbtnActionPerformed(evt);
            }
        });

        delbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        delbtn.setText("DELETE");
        delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtnActionPerformed(evt);
            }
        });

        exitbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitbtn.setText("EXIT");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("EMPLOYEE CODE");

        ecodecmb.setEditable(true);
        ecodecmb.setToolTipText("Select any product and click on show products");
        ecodecmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ecodecmbItemStateChanged(evt);
            }
        });
        ecodecmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecodecmbActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Garamond", 1, 24)); // NOI18N
        jLabel7.setText("EMPLOYEE DELETION FORM");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("GRADE ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("NAME");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("DESIGNATION");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("PHONE NO.");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("ADDRESS");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("BASIC PAY");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("DEPARTMENT");

        enametf.setToolTipText("Begin with type's first alphabet followed by digit");
        enametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enametfActionPerformed(evt);
            }
        });
        enametf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                enametfFocusLost(evt);
            }
        });

        bptf.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(enametf, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(designtf, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(depttf, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(addrtf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(bptf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                            .addComponent(grtf, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(delbtn)
                                    .addComponent(phtf, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(exitbtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ecodecmb, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ecodetf, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(srchbtn)))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ecodecmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ecodetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(enametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(designtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(depttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bptf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addrtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel10)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(srchbtn)
                    .addComponent(delbtn)
                    .addComponent(exitbtn))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Connection cn=null;
ResultSet rs=null;
Statement stmt=null;
PreparedStatement pst = null;
    private void srchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchbtnActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/core_employee", "root", "root");
            JOptionPane.showMessageDialog(new JFrame(),"database connected");

pst=cn.prepareStatement("select * from  info where ecode=?");
pst.setString(1,ecodetf.getText());
rs=pst.executeQuery();
delbtn.setEnabled(true);
if (rs.next()) {
                enametf.setText(rs.getString("ename"));
                designtf.setText(""+rs.getString("edesign"));
                grtf.setText(""+rs.getString("egrade"));
                depttf.setText(rs.getString("edept"));
                bptf.setText(""+rs.getString("epay"));
                addrtf.setText(rs.getString("eaddr"));
                phtf.setText(""+rs.getString("eph"));
            } else{
                jopmsg.showMessageDialog(null,"NO SUCH RECORD FOUND","SEARCHING RECORD",0);
            }
            
        } catch( Exception e){
            System.err.println(e);
        }
}//GEN-LAST:event_srchbtnActionPerformed

    private void delbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtnActionPerformed
        srchbtn.setEnabled(false);
        int res=jopmsg.showConfirmDialog(null,"Are u sure to delete this record?");
        if(res==jopmsg.YES_OPTION){
            try{
                PreparedStatement ps = cn.prepareStatement("delete from info where ecode=?");
                System.out.println("--------------------------"+ecodetf.getText());
                pst.setString(1,ecodetf.getText());
                ps.executeUpdate();
                cn.close();
                jopmsg.showMessageDialog(null,"RECORDS DELETED SUCCESSFULLY","DELETION OF EMPLOYEE n SALARY ",1);
            } catch (Exception e){
                System.out.println("--------------------------"+e);
            }
        }
}//GEN-LAST:event_delbtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        empmenu em=new empmenu();
        em.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_exitbtnActionPerformed

    private void ecodecmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ecodecmbItemStateChanged
        /**/
}//GEN-LAST:event_ecodecmbItemStateChanged

    private void ecodecmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecodecmbActionPerformed
        ecodetf.setText(""+ecodecmb.getSelectedItem());
}//GEN-LAST:event_ecodecmbActionPerformed

    private void enametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enametfActionPerformed

}//GEN-LAST:event_enametfActionPerformed

    private void enametfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_enametfFocusLost

}//GEN-LAST:event_enametfFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        ecodecmb.removeAllItems();
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/core_employee", "root", "root");
            stmt=cn.createStatement();
            System.out.println("Testing");
            String qry ="Select ecode from info;";
            rs=stmt.executeQuery(qry);
            while(rs.next()) {
                ecodecmb.addItem(rs.getString("ecode"));
            }
        } catch (Exception e){
            System.err.println(e);}
    }//GEN-LAST:event_formWindowGainedFocus

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empdel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addrtf;
    private javax.swing.JTextField bptf;
    private javax.swing.JButton delbtn;
    private javax.swing.JTextField depttf;
    private javax.swing.JTextField designtf;
    private javax.swing.JComboBox ecodecmb;
    private javax.swing.JTextField ecodetf;
    private javax.swing.JTextField enametf;
    private javax.swing.JButton exitbtn;
    private javax.swing.JTextField grtf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jopmsg;
    private javax.swing.JTextField phtf;
    private javax.swing.JButton srchbtn;
    // End of variables declaration//GEN-END:variables

}
