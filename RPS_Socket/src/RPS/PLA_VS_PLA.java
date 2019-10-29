/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
/**
 *
 * @author Nayeem
 */
public class PLA_VS_PLA extends javax.swing.JFrame {

    /**
     * Creates new form PLA_VS_PLA
     */
    static int n =0;
    Socket S;
    BufferedReader R;
    PrintWriter W;
    public PLA_VS_PLA() {
        initComponents();
        
       // new PLA_VS_PLA_2().setVisible(true);
        try {
            S =new Socket("172.16.40.147",8800);
            System.out.println("Connected");
            R = new BufferedReader(new InputStreamReader(S.getInputStream()));
            W = new PrintWriter(S.getOutputStream(),true);
            //   n=R.read();
            res game = new res(S);
            game.start();
        } catch (IOException ex) {
            Logger.getLogger(PLA_VS_PLA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    static int res=0,ans=0;
    static int myans=0,point=0;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setText("Player 1");

        jTextField1.setText("0");

        jLabel1.setText("Player 2");

        jTextField2.setText("0");

        jLabel2.setText("Player 1");

        jLabel3.setText("Player 2");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Reset");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RPS/rock_button.png"))); // NOI18N
        jButton2.setText("ROCK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RPS/Paper_Button.png"))); // NOI18N
        jButton3.setText("PAPER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RPS/S_button.png"))); // NOI18N
        jButton4.setText("SCISSOR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel7, jLabel8});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jLabel1, jLabel9, jTextField1, jTextField2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel7, jLabel8});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel9});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton2, jButton3, jButton4});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(res==0)
        {
            jLabel7.setIcon(new ImageIcon("S_lbl.jpg"));
            myans=2;
           // PLA_VS_PLA_2.request(2);
            W.println("0");
            W.println(myans);
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton3.setEnabled(false);
        }
        else
        {
            jLabel7.setIcon(new ImageIcon("S_lbl.jpg"));


            W.println("1");
            W.println(myans);//PLA_VS_PLA_2.response(2);
            switch(ans)
            {
               case 0:
                    jLabel8.setIcon(new ImageIcon("rock_lbl.png"));
                    jTextArea1.setText("Rock on Scissors\nResult:P2 WINS");
                    res =0;
                    point=Integer.parseInt(jTextField2.getText());
                    jTextField2.setText(""+(point+1));
                    break;
               case 1:
                    jLabel8.setIcon(new ImageIcon("Paper_lbl.jpg"));
                    jTextArea1.setText("Scissors on Paper\nResult:You WINS");
                    res =0;
                    point=Integer.parseInt(jTextField1.getText());
                    jTextField1.setText(""+(point+1));
                    break;
                  
               case 2:
                   jLabel8.setIcon(new ImageIcon("S_lbl.jpg"));
                   jTextArea1.setText("Scissor On Scissor\nResult:DRAW");
                   res=0;
                   break;
                
               default :
                   break;
           }   
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(res==0)
        {
            jLabel7.setIcon(new ImageIcon("Paper_lbl.jpg"));
            myans=1;
            //PLA_VS_PLA_2.request(1);
            W.println("0");
            W.println(myans);
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
            jButton4.setEnabled(false);
        }
        else
        {
            jLabel7.setIcon(new ImageIcon("Paper_lbl.jpg"));
            myans=1;
            //PLA_VS_PLA_2.response(1);


            W.println("1");
            W.println(myans);
            switch(ans)
              {
                 case 0:
                 jLabel8.setIcon(new ImageIcon("rock_lbl.png"));
                 jTextArea1.setText("Paper on Rock\nResult:You WIN");
                 res =0;
                 point=Integer.parseInt(jTextField1.getText());
                 jTextField1.setText(""+(point+1));
                 break;
                 case 1:
                 jLabel8.setIcon(new ImageIcon("Paper_lbl.jpg"));
                 jTextArea1.setText("Paper on Paper\nResult:DRAW");
                 res =0;
                 break;
                 
                 case 2:
                jLabel8.setIcon(new ImageIcon("S_lbl.jpg"));
                jTextArea1.setText("Scissor On Paper\nResult:P2 WIN");
               
                point=Integer.parseInt(jTextField2.getText());
                 res =0;
                 
                 jTextField2.setText(""+(point+1));
                 break;
                
                 default :
                break;
              }

         
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(res==0)
        {
            jLabel7.setIcon(new ImageIcon("rock_lbl.png"));
            myans=0;
            W.println("0");
            W.println(myans);
            jButton1.setEnabled(false);
            jButton3.setEnabled(false);
            jButton4.setEnabled(false);
        }
        else
        {
           jLabel7.setIcon(new ImageIcon("rock_lbl.png"));
           myans = 0;
          // PLA_VS_PLA_2.response(0);

            W.println("1");
            W.println(myans);
           
           
           switch(ans)
           {
               case 0:
                    jLabel8.setIcon(new ImageIcon("rock_lbl.png"));
                    jTextArea1.setText("Rock on Rock\nResult:Draw");
                    res =0;
                    break;
               case 1:
                    jLabel8.setIcon(new ImageIcon("Paper_lbl.jpg"));
                    jTextArea1.setText("Paper on Rock\nResult:P2 WIN");
                    point=Integer.parseInt(jTextField2.getText());
                 
                    jTextField2.setText(""+(point+1));
                    res=0;
                    break;
               case 2:
                   jLabel8.setIcon(new ImageIcon("S_lbl.jpg"));
                   jTextArea1.setText("Rock on Scissor\nResult:You WIN");
                   point=Integer.parseInt(jTextField1.getText());
                 
                   jTextField1.setText(""+(point+1));
                   res=0;
                   break;
                 
               
           } 
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void request(int a)
    {
        res = 1;
        ans = a;
        jTextArea1.setText("waiting for your response");
        
       
    }
    public static void response(int a)
     {
         if(myans==0)
         {
             switch(a)
           {
               case 0:
                    jLabel8.setIcon(new ImageIcon("rock_lbl.png"));
                    jTextArea1.setText("Rock on Rock\nResult:Draw");
                    res =0;
                    break;
               case 1:
                    jLabel8.setIcon(new ImageIcon("Paper_lbl.jpg"));
                    jTextArea1.setText("Paper on Rock\nResult:P2 WIN");
                    point=Integer.parseInt(jTextField2.getText());
                 
                    jTextField2.setText(""+(point+1));
                    res=0;
                    break;
               case 2:
                   jLabel8.setIcon(new ImageIcon("S_lbl.jpg"));
                   jTextArea1.setText("Rock on Scissor\nResult:You WIN");
                   point=Integer.parseInt(jTextField1.getText());
                 
                   jTextField1.setText(""+(point+1));
                   res=0;
                   break;

                 
               
           }
            jButton1.setEnabled(true);
            jButton3.setEnabled(true);
            jButton4.setEnabled(true);
         }
         else if(myans==1)
         {
             switch(a)
              {
                 case 0:
                 jLabel8.setIcon(new ImageIcon("rock_lbl.png"));
                 jTextArea1.setText("Paper on Rock\nResult:You WIN");
                 res =0;
                 point=Integer.parseInt(jTextField1.getText());
                 jTextField1.setText(""+(point+1));
                 break;
                 case 1:
                 jLabel8.setIcon(new ImageIcon("Paper_lbl.jpg"));
                 jTextArea1.setText("Paper on Paper\nResult:DRAW");
                 res =0;
                 break;
                 
                 case 2:
                jLabel8.setIcon(new ImageIcon("S_lbl.jpg"));
                jTextArea1.setText("Scissor On Paper\nResult:P2 WIN");
               
                point=Integer.parseInt(jTextField2.getText());
                 res =0;
                 
                 jTextField2.setText(""+(point+1));
                 break;
                
                 default :
                break;
              }
             jButton1.setEnabled(true);
            jButton2.setEnabled(true);
            jButton4.setEnabled(true);
         }
         else
         {
             switch(a)
            {
               case 0:
                    jLabel8.setIcon(new ImageIcon("rock_lbl.png"));
                    jTextArea1.setText("Rock on Scissors\nResult:P2 WINS");
                    res =0;
                    point=Integer.parseInt(jTextField2.getText());
                    jTextField2.setText(""+(point+1));
                    break;
               case 1:
                    jLabel8.setIcon(new ImageIcon("Paper_lbl.jpg"));
                    jTextArea1.setText("Scissors on Paper\nResult:You WINS");
                    res =0;
                    point=Integer.parseInt(jTextField1.getText());
                    jTextField1.setText(""+(point+1));
                    break;
                  
               case 2:
                   jLabel8.setIcon(new ImageIcon("S_lbl.jpg"));
                   jTextArea1.setText("Scissor On Scissor\nResult:DRAW");
                   res=0;
                   break;
                
               default :
                   break;
           }
             jButton1.setEnabled(true);
            jButton2.setEnabled(true);
            jButton3.setEnabled(true);

         }
         
     }
    
    
    
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
            java.util.logging.Logger.getLogger(PLA_VS_PLA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PLA_VS_PLA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PLA_VS_PLA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PLA_VS_PLA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new PLA_VS_PLA().setVisible(true);

                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton jButton1;
    private static javax.swing.JButton jButton2;
    private static javax.swing.JButton jButton3;
    private static javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private static javax.swing.JLabel jLabel7;
    private static javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTextArea jTextArea1;
    private static javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
class res extends Thread{

    int req;
    Socket s;

    public res(Socket s) {
        this.s = s;
    }
    
    @Override
    public void run() {
     
         
        try {
           
            BufferedReader rr = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter ww = new PrintWriter(s.getOutputStream(),true);
            while(true)
            {
                //PLA_VS_PLA.res=R.read();
               req=Integer.parseInt(rr.readLine());System.out.println("read");
               if(req==1)
               {
                    int result = Integer.parseInt(rr.readLine());
                    PLA_VS_PLA.request(result);
               }
               else
               {
                   int result = Integer.parseInt(rr.readLine());
                   PLA_VS_PLA.response(result);
               }
            }
        } catch (IOException ex) {
            Logger.getLogger(res.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
    
}