

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.year;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.awt.print.*;
import java.text.*;
import javax.swing.JTable;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PLAYBOLD!!
 */
public class min extends javax.swing.JFrame {
Connection conn;
    ResultSet rs;
    PreparedStatement pst;
    /**
     * Creates new form mini
     */
    public min() {
        super("Mini Statement");
        initComponents();
        conn=jconnect.ConnecrDb();
        date();
        time();
         setResizable(false);
        /*minitrans();*/
     
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
              time2.setText("" +ttime);
          }
      }).start();
              
          }
  public void custlogo(){
       /*conn=jconnect.ConnecrDb();*/
       String sql="insert into custlog(Outdate,Outtime,Acc_No) values (?,?,?)";
        try{
                   pst=conn.prepareStatement(sql);
                   pst.setString(1,date.getText());
                   pst.setString(2,time2.getText());
                   pst.setString(3,x.getText());
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
              
                
            }
        }
  }
/* public void statementprint(){
        int rows=xtable.getRowCount();
                for(int row = 0; row<rows; row++)
               {
    
    Date dateno = (Date)xtable.getValueAt(row,0);
    Time time=(Time)xtable.getValueAt(row,1);
    String credit = (String)xtable.getValueAt(row,2);
    String debit = (String)xtable.getValueAt(row,3);
    String part=(String)xtable.getValueAt(row,4);
            String currdate=String.format(date.getText());
            String currtime=String.format(time2.getText());
            String dateno1=String.valueOf(dateno);
            String daten=String.valueOf(time);//time
            String cd=String.valueOf(credit);
            String db=String.valueOf(debit);
            String crd=String.valueOf(part);
            String balance=new Integer(bal2.getText()).toString();
  
  
 
  
           
        String billbody=("\n\t\tVERMA'S COMMERCIAL BANK\n" +
  "\n==============================================================\t"+
            "\t\t          VASAI WEST MAIN BRANCH\n"+
               
            "DATE: "+currdate+"\t\t   TIME: "+currtime+
            "\n=======================================================\t"+
            "\nDATE\t\t\tTIME\t\t\tCREDIT\t\t\tDEBIT\t\t\tPARTICULARS"+
            "\n=======================================================\t"+
            "\n=======================================================\t"+
            "\n YOUR AVAILABLE BALANCE IS\t\t\tRs. "+balance+"/-"+
            "\n\t        THANK YOU \n");
        summarytext.setText(billbody);
        summarybody.append("\n"+dateno1+"\t\t\t"+daten+"\t\t\t"+cd+"\t\t\t"+db+"\t\t\t"+crd);
        summarytext.insert(summarybody.getText(),223);

    }
  }*/
           /* public void viewreport(){
              Date date11;
              Date date1;
              
              date11=year.getDate();
              date1=eddate.getDate();
              if (date11 == null||date1==null) { 
                  JOptionPane.showMessageDialog(null, "You must select both Start and End date first.", "Error", JOptionPane.ERROR_MESSAGE); 
                  stdate.grabFocus(); 
                  eddate.grabFocus();
}
              else{
              DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
              
        sttf.setText(df.format(stdate.getDate()));
        edtf.setText(df.format(eddate.getDate()));
        String a=sttf.getText();
        String b=edtf.getText();
            
        
        try
        {
            
        String query1 = "SELECT tblvalue.date as DATE,sum(amt)as AMOUNT FROM tblvalue WHERE date BETWEEN '"+a+"' AND '"+b+"' group by date;";
        ResultSet rs1=stmt.executeQuery(query1);
        if (!rs1.isBeforeFirst() ) {    
        JOptionPane.showMessageDialog(null, "No Records!");
        tamt.setText("");
        summarytext.setText("");
        summarybody.setText("");
        sttf.setText("");
        edtf.setText("");
        date.setText("");
        time.setText("");
        stdate.setCalendar(null);
        eddate.setCalendar(null);         
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        while(model.getRowCount() >0){
            for(int i=0; i<model.getRowCount();i++){
                model.removeRow(i);
            }
        }
        
        }
        else{
        xtable.setModel(DbUtils.resultSetToTableModel(rs1));
        
        }}
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        }}*/
  /*public void minitrans(){
   String ac=x.getText();
       try{
           String sql1="select  Date,Time,Credit,Debit,creditor as 'Particulars' from Transactions where Acc_no='"+ac+"' ORDER BY ROWID DESC LIMIT 5";
           pst=conn.prepareStatement(sql1);
           rs=pst.executeQuery();
           xtable.setModel(DbUtils.resultSetToTableModel(rs));
   }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);              //customer list
       }finally{
           try{
               rs.close();
               pst.close();
               
           }catch(Exception e){
               JOptionPane.showMessageDialog(null, e);
           }
       }
  }*/
  
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        time2 = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        home = new javax.swing.JButton();
        name2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        xtable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        bal2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        x = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        time2.setEditable(false);
        time2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        date.setEditable(false);
        date.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mini.png"))); // NOI18N

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apps-session-logout-icon(2).png"))); // NOI18N
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home-icon(1).png"))); // NOI18N
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        name2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        name2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("                      ACCOUNT HOLDER NAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(name2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(date))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(time2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        xtable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        jScrollPane1.setViewportView(xtable);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2), "MINI STATEMENT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        bal2.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("AVAILABLE BALANCE");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ACCOUNT NUMBER");

        x.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(x)
                    .addComponent(bal2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bal2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("LATEST 5 TRANSACTIONS");

        print.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        print.setText("PRINT STATEMENT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(print))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 206, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(759, 693));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
       setVisible(false);                                        
               customerauth ob=new customerauth();
         ob.setVisible(true);   
         custlogo(); 
    }//GEN-LAST:event_logoutActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
         setVisible(false);                                        
               customer_portal ob=new customer_portal();
         ob.setVisible(true); 
         customer_portal.lbl1.setText(x.getText());
         customer_portal.name1.setText(name2.getText());
    }//GEN-LAST:event_homeActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        //print table code
        String a=x.getText();
       MessageFormat header=new MessageFormat("MINI STATEMENT FOR ACCOUNT NUMBER '"+a+"'") ;
       MessageFormat footer=new MessageFormat("THANK YOU!!!");
        try
        {
          /*summarytext.print();*/
          xtable.print(JTable.PrintMode.NORMAL,header,footer);

        }catch(java.awt.print.PrinterException e){
            System.err.format("No Printer Found",  e);

        }
    }//GEN-LAST:event_printActionPerformed

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
            java.util.logging.Logger.getLogger(min.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(min.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(min.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(min.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new min().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField bal2;
    private javax.swing.JTextField date;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logout;
    public static javax.swing.JLabel name2;
    private javax.swing.JButton print;
    private javax.swing.JTextField time2;
    public static javax.swing.JTextField x;
    public static javax.swing.JTable xtable;
    // End of variables declaration//GEN-END:variables
}
