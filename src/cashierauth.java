
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PLAYBOLD!!
 */
public class cashierauth extends javax.swing.JFrame {
Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    /**
     * Creates new form cashierauth
     */
    public cashierauth() {
        super("Cashier Authentication");
        initComponents();
        conn=j2connect.ConnecrDb();
        setResizable(false);
        date();
        time();
       
    }
     public void date(){
      String tdate=new SimpleDateFormat("dd/MM/YY",Locale.ENGLISH).format(new Date());
      date.setText("" +tdate);
  }
  public void time(){
      new Timer(0,new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent ae){
              java.text.SimpleDateFormat ad=new java.text.SimpleDateFormat("HH:mm:ss");
              String ttime=ad.format(new Date());
              time.setText("" +ttime);
          }
      }).start();
              
          }
  public void cashierlog(){
      String sql="insert into emplog(Indate,Intime,Username) values (?,?,?)";
        try{
                   pst=conn.prepareStatement(sql);
                   pst.setString(1,date.getText());
                   pst.setString(2,time.getText());
                   pst.setString(3,cash1.getText());
                 pst.execute();
 }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                rs.close();
                pst.close();
     
            }
            catch(Exception e){
                e.printStackTrace();
                
            }
        }
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
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        cash1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        date = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2), "CASHIER LOGIN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 0))); // NOI18N
        jPanel1.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("FORGOT PASSWORD?");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("PASSWORD");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("USERNAME");

        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyPressed(evt);
            }
        });

        cash1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cash1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPasswordField1)
                        .addComponent(cash1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cash1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPasswordField1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 190, 453, 291);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(345, 489, 93, 32);

        date.setEditable(false);
        getContentPane().add(date);
        date.setBounds(347, 85, 119, 31);

        time.setEditable(false);
        getContentPane().add(time);
        time.setBounds(347, 134, 119, 32);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adminauth.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 10, 142, 165);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 590, 570);

        setSize(new java.awt.Dimension(588, 598));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(cash1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter Your UserName");
        }
        else if(jPasswordField1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter Your Password");
        }
        else{
         String sql="select * from cashier where Username=? and Password=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, cash1.getText());
            pst.setString(2, jPasswordField1.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                setVisible(false);                                        /////LOGIN CODE
                cashier_portal ob=new cashier_portal();
                ob.setVisible(true);
                cashier_portal.l1.setText(cash1.getText());
                rs.close();
                pst.close();
                }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect Credential");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            }finally{
            try{
                rs.close();
                pst.close();
                 }catch (Exception e){
                     
                 }
                 
        }
        cashierlog();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         setVisible(false);                                        
                login_portal ob=new login_portal();
              
                ob.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
         setVisible(false);                                        
               forgot_cashier ob=new forgot_cashier();
              
                ob.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void cash1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cash1KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cash1KeyPressed

    private void jPasswordField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
             if(cash1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter Your UserName");
        }
        else if(jPasswordField1.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Enter Your Password");
        }
        else{
         String sql="select * from cashier where Username=? and Password=?";
        try{
            pst=conn.prepareStatement(sql);
            pst.setString(1, cash1.getText());
            pst.setString(2, jPasswordField1.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                setVisible(false);                                        /////LOGIN CODE
                cashier_portal ob=new cashier_portal();
                ob.setVisible(true);
                cashier_portal.l1.setText(cash1.getText());
                rs.close();
                pst.close();
                }
            else{
                JOptionPane.showMessageDialog(null, "Incorrect Credential");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            }finally{
            try{
                rs.close();
                pst.close();
                 }catch (Exception e){
                     
                 }
                 
        }
        cashierlog();
        }
        }
       
    }//GEN-LAST:event_jPasswordField1KeyPressed

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
            java.util.logging.Logger.getLogger(cashierauth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cashierauth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cashierauth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cashierauth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cashierauth().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField cash1;
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
}
