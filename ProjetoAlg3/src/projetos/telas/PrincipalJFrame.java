package projetos.telas;

import javax.swing.JPanel;
/**
 *
 * @author Vitor Lucas
 */
public class PrincipalJFrame extends javax.swing.JFrame {


    public PrincipalJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        conteudoJPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuAg = new javax.swing.JMenuItem();
        jMenuCliente = new javax.swing.JMenuItem();
        jMenuFunc = new javax.swing.JMenuItem();
        JMenuTr = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(605, 504));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        conteudoJPanel.setMinimumSize(new java.awt.Dimension(505, 505));
        conteudoJPanel.setPreferredSize(new java.awt.Dimension(605, 605));
        getContentPane().add(conteudoJPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("File");

        jMenuAg.setText("Agência");
        jMenuAg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAgActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAg);

        jMenuCliente.setText("Cliente");
        jMenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCliente);

        jMenuFunc.setText("Funcionário");
        jMenuFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFuncActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuFunc);

        JMenuTr.setText("Transação");
        JMenuTr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuTrActionPerformed(evt);
            }
        });
        jMenu1.add(JMenuTr);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFuncActionPerformed
        conteudoJPanel.removeAll();
        conteudoJPanel.add(new FuncaoJPanel());
        conteudoJPanel.setVisible(false);
        conteudoJPanel.setVisible(true);
    }//GEN-LAST:event_jMenuFuncActionPerformed
    
    private void jMenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuClienteActionPerformed
        conteudoJPanel.removeAll();
        conteudoJPanel.add(new ClienteJPanel());
        conteudoJPanel.setVisible(false);
        conteudoJPanel.setVisible(true);
    }//GEN-LAST:event_jMenuClienteActionPerformed

    private void jMenuAgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAgActionPerformed
        conteudoJPanel.removeAll();
        conteudoJPanel.add(new AgenciaJPanel());
        conteudoJPanel.setVisible(false);
        conteudoJPanel.setVisible(true);
    }//GEN-LAST:event_jMenuAgActionPerformed

    private void JMenuTrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuTrActionPerformed
        conteudoJPanel.removeAll();
        conteudoJPanel.add(new TransacaoJPanel());
        conteudoJPanel.setVisible(false);
        conteudoJPanel.setVisible(true);
    }//GEN-LAST:event_JMenuTrActionPerformed

    /*private void setConteudo(JPanel tela){
        conteudoJPanel.removeAll();
        conteudoJPanel.add(tela);
        conteudoJPanel.setVisible(false);
        conteudoJPanel.setVisible(true);
        
    }*/
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJFrame().setVisible(true);
            }
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMenuTr;
    private javax.swing.JPanel conteudoJPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuAg;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCliente;
    private javax.swing.JMenuItem jMenuFunc;
    // End of variables declaration//GEN-END:variables
}

