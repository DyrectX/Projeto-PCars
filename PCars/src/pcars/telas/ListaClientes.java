/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pcars.telas;

import pcars.classes.Clientes;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import pcars.classes.DadosDAO;

/**
 *
 * @author Diego Luz
 */
public class ListaClientes extends javax.swing.JFrame {
    
    public static ListaClientes clientesList = new ListaClientes();
    
    private final String[] tableColumns = {"Cliente", "CNH", "Telefone", "CPF"};
    
    DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);
    
    private final List<Clientes> cadastroList = new ArrayList<>();
    /**
     * Creates new form NewJFrame
     */
    public ListaClientes() {
        initComponents();
        this.preencherTabela("");
    }
    
    public void preencherTabela(String listaC) {
        DadosDAO dao = new DadosDAO();
        boolean status = dao.conectar();
        if (status == false) {
            JOptionPane.showMessageDialog(null, "Erro de conexão");
        }

        List<Clientes> listaClientes = dao.getClientes(listaC);

        DefaultTableModel tabelaClientes = (DefaultTableModel) tblCadastros.getModel();

        tblCadastros.setRowSorter(new TableRowSorter(tabelaClientes));

        tabelaClientes.setNumRows(0);

        for (Clientes f : listaClientes) {
            Object[] obj = new Object[]{
                f.getId(),
                f.getNome(),
                f.getCnh(),
                f.getTelefone(),
                f.getCpf()

            };
            tabelaClientes.addRow(obj);
        }

        dao.desconectar();
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
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCadastros = new javax.swing.JTable();
        btnExcluirCliente = new javax.swing.JButton();
        btnCadCliente = new javax.swing.JButton();
        btnFinalizarCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFocusable(false);
        jPanel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jTextField1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTextField1.setText("Lista de Clientes");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        tblCadastros.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblCadastros.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tblCadastros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", null, null},
                {"", null, null, null},
                {"", null, null, null},
                {"", null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cliente", "CNH", "Telefone", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCadastros);

        btnExcluirCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnExcluirCliente.setText("Excluir Cliente");
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });

        btnCadCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnCadCliente.setText("Cadastrar Cliente");
        btnCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadClienteActionPerformed(evt);
            }
        });

        btnFinalizarCadastro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnFinalizarCadastro.setText("Finalizar Cadastro");
        btnFinalizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCadCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluirCliente)
                        .addGap(61, 61, 61)
                        .addComponent(btnFinalizarCadastro))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadCliente)
                    .addComponent(btnExcluirCliente)
                    .addComponent(btnFinalizarCadastro))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        // TODO add your handling code here:
       DadosDAO dao = new DadosDAO();
        boolean status = dao.conectar();
        if (status == false) {
            JOptionPane.showMessageDialog(null, "Erro de conexão");
        }

        try {
            if (tblCadastros.getSelectedRow() >= 0) {
                int id = (int) tblCadastros.getValueAt(tblCadastros.getSelectedRow(), 0);

                int resposta = JOptionPane.showConfirmDialog(this, "Deseja excluir o registro" + id + "?");
                if (resposta == 0) {

                    dao.excluirClientes(id);
                    JOptionPane.showMessageDialog(this, "Registro excluído com sucesso!");

                    
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha: " + e.getMessage());
        }
        dao.desconectar();
        

    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadClienteActionPerformed
        // TODO add your handling code here:
        CadastroClientes cadClientes = new CadastroClientes();
        cadClientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadClienteActionPerformed

    private void btnFinalizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCadastroActionPerformed
        // TODO add your handling code here:
        TelaInicial telaInicial = new TelaInicial();
        telaInicial.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFinalizarCadastroActionPerformed

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
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadCliente;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnFinalizarCadastro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblCadastros;
    // End of variables declaration//GEN-END:variables
   
    
        
    


}