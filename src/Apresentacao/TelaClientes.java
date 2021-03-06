package Apresentacao;

import Modelo.Clientes;
import Modelo.Usuario;
import Perspectiva.Conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Castelhano
 */
public class TelaClientes extends javax.swing.JInternalFrame {
    
    Conexao con = new Conexao();
    Clientes c = new Clientes();
    Usuario u = new Usuario();

    /**
     * Creates new form TelaClientes
     */
    public TelaClientes(String idCuidador) {
        initComponents();
        Desbilitar();
    }
    
    public void Habilitar(){
        jBnovo.setEnabled(false);
        jBsalvar.setEnabled(true);
        jBbuscar.setEnabled(true);
        jBatulizar.setEnabled(true);
    }
    public void Desbilitar(){
        jTnome.setEnabled(true);
        jTendereco.setEnabled(true);
        jTemail.setEnabled(true);
        jTcidade.setEnabled(true);
        jTbairro.setEnabled(true);
        jFcpf.setEnabled(true);
        jFrg.setEnabled(true);
        jFcelular.setEnabled(true);
        jFtelefone.setEnabled(true);
        jBnovo.setEnabled(true);
        jBsalvar.setEnabled(false);
        jBbuscar.setEnabled(false);
        jBatulizar.setEnabled(false);
        
    }
    public void Limpar(){
        jTnome.setText(null);
        jTendereco.setText(null);
        jTemail.setText(null);
        jTcidade.setText(null);
        jTbairro.setText(null);
        jFcpf.setText(null);
        jFrg.setText(null);
        jFcelular.setText(null);
        jFtelefone.setText(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTcodigo = new javax.swing.JTextField();
        jTnome = new javax.swing.JTextField();
        jTcidade = new javax.swing.JTextField();
        jTendereco = new javax.swing.JTextField();
        jTemail = new javax.swing.JTextField();
        jTbairro = new javax.swing.JTextField();
        jFtelefone = new javax.swing.JFormattedTextField();
        jFcelular = new javax.swing.JFormattedTextField();
        jFrg = new javax.swing.JFormattedTextField();
        jFcpf = new javax.swing.JFormattedTextField();
        jBsalvar = new javax.swing.JButton();
        jBnovo = new javax.swing.JButton();
        jBatulizar = new javax.swing.JButton();
        jBbuscar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTpesquisa = new javax.swing.JButton();
        jBrelatorio = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Cadastro de clientes");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(169, 11, 241, 29);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(169, 63, 545, 10);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("ID :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(46, 91, 22, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nome :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(34, 145, 42, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Endere??o :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(35, 197, 64, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Email :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(29, 255, 39, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Cidade :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(29, 316, 49, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Bairro :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(455, 91, 44, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("CPF :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(469, 145, 30, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("RG :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(465, 197, 25, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Celular :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(450, 255, 49, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Telefone :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(439, 316, 60, 15);

        jTcodigo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTcodigo);
        jTcodigo.setBounds(127, 92, 53, 15);

        jTnome.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTnome);
        jTnome.setBounds(127, 146, 276, 15);

        jTcidade.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTcidade);
        jTcidade.setBounds(127, 317, 276, 15);

        jTendereco.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTendereco);
        jTendereco.setBounds(127, 198, 276, 15);

        jTemail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTemail);
        jTemail.setBounds(127, 256, 276, 15);

        jTbairro.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(jTbairro);
        jTbairro.setBounds(527, 91, 236, 15);

        jFtelefone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        try {
            jFtelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFtelefone);
        jFtelefone.setBounds(527, 317, 236, 15);

        jFcelular.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        try {
            jFcelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFcelular);
        jFcelular.setBounds(527, 256, 236, 15);

        jFrg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        try {
            jFrg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-###-###/#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFrg);
        jFrg.setBounds(527, 198, 236, 15);

        jFcpf.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        try {
            jFcpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(jFcpf);
        jFcpf.setBounds(527, 146, 236, 15);

        jBsalvar.setBackground(new java.awt.Color(102, 153, 255));
        jBsalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBsalvar.setForeground(new java.awt.Color(255, 255, 255));
        jBsalvar.setText("Salvar");
        jBsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalvarActionPerformed(evt);
            }
        });
        jPanel1.add(jBsalvar);
        jBsalvar.setBounds(342, 395, 98, 57);

        jBnovo.setBackground(new java.awt.Color(102, 153, 255));
        jBnovo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBnovo.setForeground(new java.awt.Color(255, 255, 255));
        jBnovo.setText("Novo");
        jBnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnovoActionPerformed(evt);
            }
        });
        jPanel1.add(jBnovo);
        jBnovo.setBounds(226, 398, 98, 51);

        jBatulizar.setBackground(new java.awt.Color(102, 153, 255));
        jBatulizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBatulizar.setForeground(new java.awt.Color(255, 255, 255));
        jBatulizar.setText("Atualizar");
        jBatulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBatulizarActionPerformed(evt);
            }
        });
        jPanel1.add(jBatulizar);
        jBatulizar.setBounds(574, 395, 98, 56);

        jBbuscar.setBackground(new java.awt.Color(102, 153, 255));
        jBbuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBbuscar.setForeground(new java.awt.Color(255, 255, 255));
        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jBbuscar);
        jBbuscar.setBounds(458, 394, 98, 58);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/infermeira.png"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(818, 155, 310, 409);

        jTpesquisa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTpesquisa.setForeground(new java.awt.Color(153, 255, 255));
        jPanel1.add(jTpesquisa);
        jTpesquisa.setBounds(10, 523, 80, 30);

        jBrelatorio.setBackground(new java.awt.Color(102, 153, 255));
        jBrelatorio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jBrelatorio.setForeground(new java.awt.Color(255, 255, 255));
        jBrelatorio.setText("Relatorios");
        jBrelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrelatorioActionPerformed(evt);
            }
        });
        jPanel1.add(jBrelatorio);
        jBrelatorio.setBounds(110, 400, 100, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1128, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1144, 594);
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalvarActionPerformed
       con.Conectar();
       String salvar = "insert into tb_clientes values("+jTcodigo.getText()+",'"+jTnome.getText()+"','"+jTendereco.getText()+"','"
               +jTemail.getText()+"','"+jTcidade.getText()+"','"+jTbairro.getText()+"','"+jFcpf.getText()+"','"
               +jFrg.getText()+"','"+jFcelular.getText()+"','"+jFtelefone.getText()+"');";
        try {
            con.comando(salvar);
            jTpesquisa.setText(String.valueOf(c.getId_clientes()));
            Desbilitar();
            Limpar();
            JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
            con.Desconectar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jBsalvarActionPerformed

    private void jBnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnovoActionPerformed
        con.Conectar();
        String busca_id = "select max(id_clientes) as id_clientes from tb_clientes";
        
        try {
            int id = con.buscar_id(busca_id);
            jTcodigo.setText(String.valueOf(id + 1));
            jTnome.requestFocus();
            con.Desconectar();
            Habilitar();
            Limpar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel buscar ID" +ex);
        }
    }//GEN-LAST:event_jBnovoActionPerformed

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        con.Conectar();
        String busca = "select * from tb_clientes where id_clientes='"+jTcodigo.getText()+"';";
        
        try {
            c = con.buscar(busca);
            jTcodigo.setText(String.valueOf(c.getId_clientes()));
            jTnome.setText(c.getNome());
            jTendereco.setText(c.getEndereco());
            jTemail.setText(c.getEmail());
            jTcidade.setText(c.getCidade());
            jTbairro.setText(c.getBairro());
            jFcpf.setText(c.getCpf());
            jFrg.setText(c.getRg());
            jFcelular.setText(c.getCelular());
            jFtelefone.setText(c.getTelefone());
        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBatulizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBatulizarActionPerformed
       con.Conectar();
       String atualizar = "update tb_clientes set nome='"+jTnome.getText()+"',endereco='"+jTendereco.getText()+
               "',email='"+jTemail.getText()+"',cidade='"+jTcidade.getText()+"',bairro='"+jTbairro.getText()+"',cpf='"+jFcpf.getText()+
               "',rg='"+jFrg.getText()+"',celular='"+jFcelular.getText()+"',telefone='"+jFtelefone.getText()+"'"
               + "where id_clientes='"+jTcodigo.getText()+"';";
        try {
            con.comando(atualizar);
            JOptionPane.showMessageDialog(null, "Usuario Atualizado com sucesso!");
            con.Desconectar();
            Desbilitar();
            Limpar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel Atualizar" +ex);
        }
    }//GEN-LAST:event_jBatulizarActionPerformed

    private void jBrelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrelatorioActionPerformed
        Connection a;
        String url = "jdbc:mysql://localhost:3306/redecanal";
        String usuario = "root";
        String senha = "";
        
        try {
            a = DriverManager.getConnection(url, usuario, senha);
            
            HashMap filtro = new HashMap();
            
            filtro.put("id_clientes", Integer.parseInt(jTcodigo.getText()));
            
            String src = "C:/Users/Castelhano/Documents/NetBeansProjects/Redecanal/src/JasperReporter/RelatorioClientes.jasper";
            
            JasperPrint print = JasperFillManager.fillReport(src, filtro, a);
            
            JasperViewer ver = new JasperViewer(print, false);
            ver.setVisible(true);
            
        } catch (NumberFormatException | SQLException | JRException e) {
        }
    }//GEN-LAST:event_jBrelatorioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBatulizar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBnovo;
    private javax.swing.JButton jBrelatorio;
    private javax.swing.JButton jBsalvar;
    private javax.swing.JFormattedTextField jFcelular;
    private javax.swing.JFormattedTextField jFcpf;
    private javax.swing.JFormattedTextField jFrg;
    private javax.swing.JFormattedTextField jFtelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTbairro;
    private javax.swing.JTextField jTcidade;
    private javax.swing.JTextField jTcodigo;
    private javax.swing.JTextField jTemail;
    private javax.swing.JTextField jTendereco;
    private javax.swing.JTextField jTnome;
    private javax.swing.JButton jTpesquisa;
    // End of variables declaration//GEN-END:variables
}
