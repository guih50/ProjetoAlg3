

package projetos.telas;

import java.util.List;
import projeto.entidades.Cliente;
import projeto.persistencia.ClienteDAO;
import projeto.utils.DAOFactory;
import javax.swing.table.DefaultTableModel;

public class ClienteJPanel extends javax.swing.JPanel {
    
    private ClienteDAO dao = DAOFactory.createClienteDAO();
    private int flag;
    
    public ClienteJPanel() {
        initComponents();
        carregarTabela();
    }
    private void carregarTabela(){
        List<Cliente> lista = dao.listar();
        DefaultTableModel dfm = (DefaultTableModel) tabela.getModel();
        int linhas = dfm.getRowCount();
        for (int i = 0; i < linhas; i++) {
            dfm.removeRow(0);
        }
        for (Cliente cliente : lista) {
            Object[] linha = new Object[2];
            linha[0] = cliente.getCPF();
            linha[1] = cliente.getConta();

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
        jTextFieldCPF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldCidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldBairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldRua = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldNumero = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldConta = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(505, 405));
        setPreferredSize(new java.awt.Dimension(505, 504));

        jPanel1.setMinimumSize(new java.awt.Dimension(505, 405));
        jPanel1.setPreferredSize(new java.awt.Dimension(505, 504));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Cadastro do Cliente");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 55, 340, 10));

        jLabel9.setText("CPF/CNPJ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 20));
        jPanel1.add(jTextFieldCPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 240, -1));

        jLabel10.setText("Cidade");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, 20));
        jPanel1.add(jTextFieldCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 100, -1));

        jLabel11.setText("Bairro");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 50, 20));
        jPanel1.add(jTextFieldBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 100, -1));

        jLabel12.setText("Rua/Avenida");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 20));
        jPanel1.add(jTextFieldRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 130, -1));

        jLabel13.setText("Número");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 70, 20));
        jPanel1.add(jTextFieldNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 30, -1));

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
                "CPF/CNPJ", "Conta"
            }
        ));
        jScrollPane2.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setResizable(false);
            tabela.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 310, 91));

        jButton7.setText("Editar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, -1, -1));

        jButton8.setText("Apagar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        jLabel14.setText("Nome");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 40, 20));
        jPanel1.add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 270, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        jLabel1.setText("Agência");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 70, 20));

        jLabel2.setText("Conta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, 20));
        jPanel1.add(jTextFieldConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 100, -1));

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextFieldConta.setText("");
        jTextFieldBairro.setText("");
        jTextFieldCPF.setText("");
        jTextFieldRua.setText("");
        jTextFieldNumero.setText("");
        jTextFieldCidade.setText("");
        jTextFieldNome.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         if(flag == 1){
            int[] linhas = tabela.getSelectedRows();
        for (int linha : linhas) {
            int agenciaAg = (int) tabela.getValueAt(linha, 0);
            dao.remover(agenciaAg);
        }
        carregarTabela();
        }
        
        Cliente n = new Cliente();
        int CPF = Integer.parseInt(jTextFieldCPF.getText());
        n.setCPF(CPF);
        n.setNome(jTextFieldNome.getText());
        n.setCidade(jTextFieldCidade.getText());
        n.setBairro(jTextFieldBairro.getText());
        n.setRua(jTextFieldRua.getText());
        int Numero = Integer.parseInt(jTextFieldNumero.getText());
        n.setNumero(Numero);
        int Conta = Integer.parseInt(jTextFieldConta.getText());
        n.setConta(Conta);
        
        if(dao.getByCPF(CPF) == null){
            dao.inserir(n);
        }else{
            dao.editar(n);
        }
        jButton6ActionPerformed(evt);
        carregarTabela();
        flag = 0;                                                           
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int[] linhas = tabela.getSelectedRows();
        for (int linha : linhas) {
            int ClienteCl = (int) tabela.getValueAt(linha, 0);
            dao.remover(ClienteCl);
        }
        carregarTabela();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        flag = 1;
        int linha = tabela.getSelectedRow();
        if(linha >= 0){
            int CPF = (int) tabela.getValueAt(linha, 0);
            Cliente c = dao.getByCPF(CPF);
            jTextFieldCPF.setText(c.getCPF()+"");
            jTextFieldNome.setText(c.getNome());
            jTextFieldCidade.setText(c.getCidade());
            jTextFieldBairro.setText(c.getBairro());
            jTextFieldRua.setText(c.getRua());
            jTextFieldConta.setText(c.getConta()+"");
            jTextFieldNumero.setText(c.getNumero()+"");
        }
    }//GEN-LAST:event_jButton7ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldConta;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
