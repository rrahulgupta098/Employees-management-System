package core_java_pro_employee;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
public class empup extends javax.swing.JFrame {


    public empup() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jopmsg = new javax.swing.JOptionPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        brb = new javax.swing.JRadioButton();
        crb = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        arb = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        drb = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ecodecmb = new javax.swing.JComboBox();
        ecodetf = new javax.swing.JTextField();
        enametf = new javax.swing.JTextField();
        designtf = new javax.swing.JTextField();
        depttf = new javax.swing.JTextField();
        addrtf = new javax.swing.JTextField();
        bptf = new javax.swing.JTextField();
        phtf = new javax.swing.JTextField();
        exitbtn = new javax.swing.JButton();
        srchbtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        grtf = new javax.swing.JTextField();
        clrbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EMPLOYEE PAYROLL MANAGEMENT");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jLabel7.setFont(new java.awt.Font("Garamond", 1, 24));
        jLabel7.setText("EMPLOYEE UPDATION FORM");

        buttonGroup1.add(brb);
        brb.setText("B");
        brb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brbActionPerformed(evt);
            }
        });

        buttonGroup1.add(crb);
        crb.setText("C");
        crb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crbActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel4.setText("DESIGNATION");

        buttonGroup1.add(arb);
        arb.setText("A");
        arb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arbActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel3.setText("EMPLOYEE CODE");

        buttonGroup1.add(drb);
        drb.setText("D");
        drb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drbActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel1.setText("NAME");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel8.setText("GRADE ");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel10.setText("DEPARTMENT");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel6.setText("BASIC PAY");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel9.setText("ADDRESS");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel5.setText("PHONE NO.");

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

        enametf.setToolTipText("");
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

        phtf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phtfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phtfFocusLost(evt);
            }
        });

        exitbtn.setFont(new java.awt.Font("Tahoma", 1, 14));
        exitbtn.setText("EXIT");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        srchbtn.setFont(new java.awt.Font("Tahoma", 1, 14));
        srchbtn.setText("SEARCH");
        srchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srchbtnActionPerformed(evt);
            }
        });

        updatebtn.setFont(new java.awt.Font("Tahoma", 1, 14));
        updatebtn.setText("MODIFY");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        updatebtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                updatebtnFocusGained(evt);
            }
        });

        clrbtn.setFont(new java.awt.Font("Tahoma", 1, 14));
        clrbtn.setText("CLEAR");
        clrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrbtnActionPerformed(evt);
            }
        });
        clrbtn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                clrbtnFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(srchbtn)
                        .addGap(33, 33, 33)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(ecodecmb, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ecodetf, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(designtf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(updatebtn)
                        .addGap(40, 40, 40)
                        .addComponent(exitbtn))
                    .addComponent(enametf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phtf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(grtf, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                        .addGap(19, 19, 19)
                        .addComponent(arb)
                        .addGap(9, 9, 9)
                        .addComponent(brb)
                        .addGap(18, 18, 18)
                        .addComponent(crb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drb)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bptf, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(addrtf))
                        .addComponent(depttf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                    .addComponent(clrbtn, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel7)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ecodecmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ecodetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(enametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(designtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(grtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(arb)
                            .addComponent(drb)
                            .addComponent(brb)
                            .addComponent(crb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(depttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(bptf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(addrtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(srchbtn)
                    .addComponent(updatebtn)
                    .addComponent(exitbtn))
                .addGap(18, 18, 18)
                .addComponent(clrbtn)
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Connection cn=null;
ResultSet rs=null;
Statement stmt=null;
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

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
            salup su = new salup();
            su.setVisible(true);
            this.setVisible(false);
            String ec=ecodetf.getText();
            jopmsg.showMessageDialog(null,"Enter Employee Code" + ec);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void srchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srchbtnActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/core_employee", "root", "root");
            PreparedStatement ps=cn.prepareStatement(  
            "Select * from info where ecode=?");  
           
            ps.setString(1,ecodetf.getText());
            rs=ps.executeQuery();
            clrbtn.setEnabled(true);
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
            System.err.println(e);;
        }
}//GEN-LAST:event_srchbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        int res=jopmsg.showConfirmDialog(null,"Are u sure to update the record ?", "MODIFICATION OF RECORD",1);
        if(res==jopmsg.YES_OPTION){
            try {
               
                PreparedStatement ps=cn.prepareStatement(  
   "update info set ename=?,edesign=?,egrade=?,edept=? ,epay=?,eaddr=?,eph=? where ecode=?");  
            ps.setString(1,enametf.getText());  
            ps.setString(2,designtf.getText());  
            ps.setString(3,grtf.getText());  
            ps.setString(4,depttf.getText()); 
             ps.setString(5,bptf.getText()); 
              ps.setString(6,addrtf.getText()); 
               ps.setString(7,phtf.getText());
               ps.setString(8,ecodetf.getText());
            
              ps.executeUpdate();
                jopmsg.showMessageDialog(null,"RECORD UPDATED SUCCESSFULLY","MODIFICATION OF EMPLOYEE ",1);
                salup su=new salup();
                su.setVisible(true);
            } catch(Exception e){
                System.err.println(e);;
            }

        }
}//GEN-LAST:event_updatebtnActionPerformed

    private void updatebtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_updatebtnFocusGained
        // TODO add your handling code here:
}//GEN-LAST:event_updatebtnFocusGained

    private void brbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brbActionPerformed
        if (brb.isSelected())
            grtf.setText("Grade B");
           bptf.setText(""+15000);
}//GEN-LAST:event_brbActionPerformed

    private void arbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arbActionPerformed
        if (arb.isSelected())
            grtf.setText("Grade A");
        bptf.setText(""+18000);
}//GEN-LAST:event_arbActionPerformed

    private void crbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crbActionPerformed
        if (crb.isSelected())
            grtf.setText("Grade C");
        bptf.setText(""+12000);
}//GEN-LAST:event_crbActionPerformed

    private void drbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drbActionPerformed
        if (drb.isSelected())
            grtf.setText("Grade D");
        bptf.setText(""+10000);
}//GEN-LAST:event_drbActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        ecodecmb.removeAllItems();
        clrbtn.setEnabled(false);
        updatebtn.setEnabled(false);
        arb.setVisible(false);
        brb.setVisible(false);
        crb.setVisible(false);
        drb.setVisible(false);
        ecodetf.setVisible(false);
        try{
            Class.forName("com.mysql.jdbc.Driver");
cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/core_employee", "root", "root");

            System.out.println("Testing");
   PreparedStatement ps = cn.prepareStatement("Select ecode from info");
            rs=ps.executeQuery();
            while(rs.next()) {
                ecodecmb.addItem(rs.getString("ecode"));
            }
        } catch (Exception e){
            System.err.println(e);}
    }//GEN-LAST:event_formWindowGainedFocus

    private void clrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrbtnActionPerformed
        srchbtn.setEnabled(false);
        enametf.setText("");
        designtf.setText("");
        depttf.setText("");
        addrtf.setText("");
        bptf.setText("");
        phtf.setText("");
        grtf.setText("");
        arb.setVisible(true);
        brb.setVisible(true);
        crb.setVisible(true);
        drb.setVisible(true);
        grtf.setEnabled(false);
}//GEN-LAST:event_clrbtnActionPerformed

    private void clrbtnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_clrbtnFocusGained
        
    }//GEN-LAST:event_clrbtnFocusGained

    private void phtfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phtfFocusLost
      
    }//GEN-LAST:event_phtfFocusLost

    private void phtfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phtfFocusGained
        clrbtn.setEnabled(false);
        updatebtn.setEnabled(true);

    }//GEN-LAST:event_phtfFocusGained

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new empup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addrtf;
    private javax.swing.JRadioButton arb;
    private javax.swing.JTextField bptf;
    private javax.swing.JRadioButton brb;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clrbtn;
    private javax.swing.JRadioButton crb;
    private javax.swing.JTextField depttf;
    private javax.swing.JTextField designtf;
    private javax.swing.JRadioButton drb;
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
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables

}
