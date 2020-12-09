
package projetos.telas;

import java.util.List;
import projeto.entidades.Agencia;
import projeto.persistencia.AgenciaDAO;
import projeto.utils.DAOFactory;
import javax.swing.table.DefaultTableModel;

public class AgenciaJPanel extends javax.swing.JPanel {

    private AgenciaDAO dao = DAOFactory.createAgenciaDAO();
    private int flag;
    
    public AgenciaJPanel() {
        initComponents();
        carregarTabela();
    }
    private void carregarTabela(){
        List<Agencia> lista = dao.listar();
        DefaultTableModel dfm = (DefaultTableModel) tabela.getModel();
        int linhas = dfm.getRowCount();
        for (int i = 0; i < linhas; i++) {
            dfm.removeRow(0);
        }
        
        for (Agencia agencia : lista) {
            Object[] linha = new Object[1];
            linha[0] = agencia.getnumeroAg();

            dfm.addRow(linha);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(505, 405));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(505, 405));

        jPanel1.setMinimumSize(new java.awt.Dimension(505, 405));
        jPanel1.setPreferredSize(new java.awt.Dimension(505, 504));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Cadastro do Agência");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 55, 340, 10));

        jLabel2.setText("Número da Agência");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 20));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 190, -1));

        jLabel3.setText("Cidade");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, 20));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 100, -1));

        jLabel4.setText("Bairro");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 50, 20));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 100, -1));

        jLabel5.setText("Rua/Avenida");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, 20));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 130, -1));

        jLabel6.setText("Número");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 70, 20));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 30, -1));

        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jButton2.setText("Limpar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número da Agência"
            }
        ));
        jScrollPane1.setViewportView(tabela);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 250, 310, 91));

        jButton3.setText("Editar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        jButton4.setText("Apagar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(flag == 1){
            int[] linhas = tabela.getSelectedRows();
        for (int linha : linhas) {
            int agenciaAg = (int) tabela.getValueAt(linha, 0);
            dao.remover(agenciaAg);
        }
        carregarTabela();
        }
        
        Agencia n = new Agencia();
        int numeroAg = Integer.parseInt(jTextField1.getText());
        n.setnumeroAg(numeroAg);
        n.setCidade(jTextField2.getText());
        n.setBairro(jTextField3.getText());
        n.setRua(jTextField4.getText());
        int Numero = Integer.parseInt(jTextField5.getText());
        n.setNumero(Numero);
        if(dao.getBynumeroAg(numeroAg) == null){
            dao.inserir(n);
        }else{
            dao.editar(n);
        }
        jButton2ActionPerformed(evt);
        carregarTabela();
        flag = 0;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int[] linhas = tabela.getSelectedRows();
        for (int linha : linhas) {
            int agenciaAg = (int) tabela.getValueAt(linha, 0);
            dao.remover(agenciaAg);
        }
        carregarTabela();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        flag = 1;
        int linha = tabela.getSelectedRow();
        if(linha >= 0){
            int numeroAg = (int) tabela.getValueAt(linha, 0);
            Agencia c = dao.getBynumeroAg(numeroAg);
            jTextField1.setText(c.getnumeroAg()+"");
            jTextField2.setText(c.getCidade());
            jTextField3.setText(c.getBairro());
            jTextField4.setText(c.getRua());
            jTextField5.setText(c.getNumero()+"");
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
