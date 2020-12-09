
package projetos.telas;

import java.util.List;
import projeto.entidades.Transacao;
import projeto.persistencia.TransacaoDAO;
import projeto.utils.DAOFactory;
import javax.swing.table.DefaultTableModel;


public class TransacaoJPanel extends javax.swing.JPanel {

    private TransacaoDAO dao = DAOFactory.createTransacaoDAO();
    private int flag;
    
    public TransacaoJPanel() {
        initComponents();
        carregarTabela();
    }
    private void carregarTabela(){
        List<Transacao> lista = dao.listar();
        DefaultTableModel dfm = (DefaultTableModel) tabela.getModel();
        int linhas = dfm.getRowCount();
        for (int i = 0; i < linhas; i++) {
            dfm.removeRow(0);
        }
        for (Transacao transacao : lista) {
            Object[] linha = new Object[3];
            linha[0] = transacao.getCPF();
            linha[1] = transacao.getValor();    
            linha[2] = transacao.getValor();

            dfm.addRow(linha);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();

        jPanel1.setMinimumSize(new java.awt.Dimension(505, 405));
        jPanel1.setPreferredSize(new java.awt.Dimension(505, 504));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Transação");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 55, 340, 10));

        jLabel9.setText("CPF/CNPJ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, 20));
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 240, -1));

        jButton5.setText("Salvar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        jButton6.setText("Limpar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dê", "Para", "Valor"
            }
        ));
        jScrollPane2.setViewportView(tabela);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 310, 91));

        jButton7.setText("Consultar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        jLabel14.setText("Conta");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 40, 20));
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 100, -1));

        jLabel2.setText("Remente");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 60, 100, -1));

        jLabel1.setText("Destinatário");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 150, 80, -1));

        jLabel3.setText("Valor");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, -1, 20));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 80, -1));

        jLabel10.setText("CPF/CNPJ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 20));
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 240, -1));

        jLabel15.setText("Conta");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 40, 20));
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 100, -1));

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField1.setText("");
        jTextField13.setText("");
        jTextField12.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Transacao n = new Transacao();
        int CPF = Integer.parseInt(jTextField8.getText());
        n.setCPF(CPF);
        int Conta = Integer.parseInt(jTextField13.getText());
        n.setConta(Conta);
        int Valor = Integer.parseInt(jTextField1.getText());
        n.setValor(Valor);
        int CPF2 = Integer.parseInt(jTextField7.getText());
        n.setCPF2(CPF2);
        int Conta2 = Integer.parseInt(jTextField12.getText());
        n.setConta2(Conta2);
        
        if(dao.getByCPF(CPF) == null){
            dao.inserir(n);
        }else{
            dao.editar(n);
        }
        jButton6ActionPerformed(evt);
        carregarTabela();
        flag = 0;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         flag = 1;
        int linha = tabela.getSelectedRow();
        if(linha >= 0){
            int CPF = (int) tabela.getValueAt(linha, 0);
            Transacao c = dao.getByCPF(CPF);
            jTextField8.setText(c.getCPF()+""); 
            jTextField7.setText(c.getCPF2()+""); 
            jTextField13.setText(c.getConta()+"");
            jTextField12.setText(c.getConta2()+"");
            jTextField1.setText(c.getValor()+"");
            
        }
    }//GEN-LAST:event_jButton7ActionPerformed
/**/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
