/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

import Modelo.Clientes;
import Perspectiva.Conexao;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Castelhano
 */
public class TelaTabela extends javax.swing.JInternalFrame {

    int id_tabela;

    Conexao con = new Conexao();
    Clientes c = new Clientes();
    List<Clientes> lista;

    /**
     * Creates new form TelaTabela
     *
     * @param usuario
     */
    public TelaTabela(String usuario) {
        initComponents();
        jLusuarios.setText(usuario);
    }

    public void enviar(int idTabela) {
        id_tabela = idTabela;
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPcad = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTnome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLusuarios = new javax.swing.JLabel();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Rede Canal");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(21, 20, 102, 22);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(238, 60, 582, 2);

        jPcad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paciente"
            }
        ));
        jPcad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPcadMouseReleased(evt);
            }
        });
        jPcad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPcadKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jPcad);
        if (jPcad.getColumnModel().getColumnCount() > 0) {
            jPcad.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(300, 160, 420, 132);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nome :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(310, 130, 50, 20);

        jTnome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTnome);
        jTnome.setBounds(370, 130, 236, 20);

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(610, 123, 50, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/thinking_woman_PNG11616.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 130, 500, 400);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("Nome :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(690, 500, 50, 17);

        jLusuarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLusuarios.setForeground(new java.awt.Color(102, 153, 255));
        jLusuarios.setText("jLabel5");
        jPanel1.add(jLusuarios);
        jLusuarios.setBounds(740, 500, 100, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );

        setBounds(0, 0, 861, 560);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        con.Conectar();
        String sql = "SELECT vinculo.id, cliente.id_clientes, vinculo.usuario, cuidador.nome\n"
                + "FROM tb_usuario  AS vinculo , tb_clientes AS cliente, tb_clientes AS cuidador\n"
                + "WHERE\n"
                + "vinculo.id = cliente.id_clientes AND\n"
                + 
                 "id ="+id_tabela+";";
        System.out.println(sql);

        DefaultTableModel modelo = (DefaultTableModel) jPcad.getModel();

        try {
            lista = con.preencherTabela(sql);
            for (int i = 0; i < lista.size(); i++) {
                c = lista.get(i);

                Object[] dados = {c.getNome()};

                modelo.addRow(dados);
            }
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void jPcadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPcadKeyReleased
        if ((evt.getKeyCode() == KeyEvent.VK_DOWN) || (evt.getKeyCode() == KeyEvent.VK_UP)) {
            int filaSelecionada = this.jPcad.getSelectedRow();

            try {
                this.jTnome.setText(jPcad.getValueAt(filaSelecionada, 0).toString());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao ler a Tabela ", "Erro", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_jPcadKeyReleased

    private void jPcadMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPcadMouseReleased
        int filaSelecionada = this.jPcad.getSelectedRow();

        try {
            this.jTnome.setText(jPcad.getValueAt(filaSelecionada, 0).toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler a tabela ", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jPcadMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        con.Conectar();
        String buscar = "select * from tb_clientes where nome='" + jTnome.getText() + "';";

        try {
            int index = jPcad.getSelectedRow();
            if (index >= 0) {
                Clientes cli = con.buscar(buscar);
                TelaVer ver = new TelaVer();
                ver.setVisible(true);
                ver.setPaciente(cli);
                ver.mostrar();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel buscar cliente");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLusuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jPcad;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTnome;
    // End of variables declaration//GEN-END:variables
}