/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetos.telas;

import java.util.List;
import projeto.entidades.Funcao;
import projeto.persistencia.FuncaoDAO;
import projeto.utils.DAOFactory;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vitor Lucas
 */
public class FuncaoJPanel extends javax.swing.JPanel {

    private FuncaoDAO dao = DAOFactory.createFuncaoDAO();
    private int flag;
    
    public FuncaoJPanel() {
        initComponents();
        carregarTabela();
    }

    private void carregarTabela(){
        List<Funcao> lista = dao.listar();
        DefaultTableModel dfm = (DefaultTableModel) tabela.getModel();
        int linhas = dfm.getRowCount();
        for (int i = 0; i < linhas; i++) {
            dfm.removeRow(0);
        }
        
        for (Funcao funcionario : lista) {
            Object[] linha = new Object[2];
            linha[0] = funcionario.getCodigo();
            linha[1] = funcionario.getCargo();

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
        jCodigo = new javax.swing.JTextField();
        sla = new javax.swing.JLabel();
        jCidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jBairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jRua = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jNumero = new javax.swing.JTextField();
        jSalvar = new javax.swing.JButton();
        jLimpar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jEditar = new javax.swing.JButton();
        jApagar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCargo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSalario = new javax.swing.JTextField();

        jPanel1.setMinimumSize(new java.awt.Dimension(505, 405));
        jPanel1.setPreferredSize(new java.awt.Dimension(505, 504));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setText("Cadastro do Funcionário");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 55, 340, 10));

        jLabel9.setText("Código");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, 20));
        jPanel1.add(jCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 60, -1));

        sla.setText("Cidade");
        jPanel1.add(sla, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, 20));
        jPanel1.add(jCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 100, -1));

        jLabel11.setText("Bairro");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 50, 20));
        jPanel1.add(jBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 100, -1));

        jLabel12.setText("Rua/Avenida");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 20));
        jPanel1.add(jRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 130, -1));

        jLabel13.setText("Número");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 70, 20));
        jPanel1.add(jNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 30, -1));

        jSalvar.setText("Salvar");
        jSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jLimpar.setText("Limpar");
        jLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimparActionPerformed(evt);
            }
        });
        jPanel1.add(jLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Cargo"
            }
        ));
        jScrollPane2.setViewportView(tabela);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 250, 310, 91));

        jEditar.setText("Editar");
        jEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        jApagar.setText("Apagar");
        jApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jApagarActionPerformed(evt);
            }
        });
        jPanel1.add(jApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        jLabel14.setText("Nome");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 40, 20));
        jPanel1.add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 150, -1));

        jLabel1.setText("Cargo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, 20));

        jCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCargoActionPerformed(evt);
            }
        });
        jPanel1.add(jCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 130, -1));

        jLabel2.setText("Salário");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 40, 20));
        jPanel1.add(jSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 60, -1));

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void jLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimparActionPerformed
        jRua.setText("");
        jNumero.setText("");
        jNome.setText("");
        jCodigo.setText("");
        jCidade.setText("");
        jBairro.setText("");
        jCargo.setText("");
        jSalario.setText("");
    }//GEN-LAST:event_jLimparActionPerformed

    private void jCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCargoActionPerformed

    private void jSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalvarActionPerformed
        if(flag == 1){
            int[] linhas = tabela.getSelectedRows();
        for (int linha : linhas) {
            int Codigo = (int) tabela.getValueAt(linha, 0);
            dao.remover(Codigo);
        }
        carregarTabela();
        }
        
        Funcao n = new Funcao();
        int Codigo = Integer.parseInt(jCodigo.getText());
        n.setCodigo(Codigo);
        n.setCidade(jCidade.getText());
        n.setBairro(jBairro.getText());
        n.setRua(jRua.getText());
        int Numero = Integer.parseInt(jNumero.getText());
        n.setNumero(Numero);
        int Salario = Integer.parseInt(jSalario.getText());
        n.setSalario(Salario);
        n.setNome(jNome.getText());
        n.setCargo(jCargo.getText());
        if(dao.getByCodigo(Codigo) == null){
            dao.inserir(n);
        }else{
            dao.editar(n);
        }
        jLimparActionPerformed(evt);
        carregarTabela();
        flag = 0;
    }//GEN-LAST:event_jSalvarActionPerformed

    private void jApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jApagarActionPerformed
        int[] linhas = tabela.getSelectedRows();
        for (int linha : linhas) {
            int Codigo = (int) tabela.getValueAt(linha, 0);
            dao.remover(Codigo);
        }
        carregarTabela();
    }//GEN-LAST:event_jApagarActionPerformed

    private void jEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEditarActionPerformed
        flag = 1;
        int linha = tabela.getSelectedRow();
        if(linha >= 0){
            int Codigo = (int) tabela.getValueAt(linha, 0);
            Funcao c = dao.getByCodigo(Codigo);
            jCodigo.setText(c.getCodigo()+"");
            jCidade.setText(c.getCidade());
            jBairro.setText(c.getBairro());
            jRua.setText(c.getRua());
            jNumero.setText(c.getNumero()+"");
            jCargo.setText(c.getCargo());
            jSalario.setText(c.getSalario()+"");
            jNome.setText(c.getNome());
            
        }
    }//GEN-LAST:event_jEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jApagar;
    private javax.swing.JTextField jBairro;
    private javax.swing.JTextField jCargo;
    private javax.swing.JTextField jCidade;
    private javax.swing.JTextField jCodigo;
    private javax.swing.JButton jEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLimpar;
    private javax.swing.JTextField jNome;
    private javax.swing.JTextField jNumero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jRua;
    private javax.swing.JTextField jSalario;
    private javax.swing.JButton jSalvar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel sla;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
