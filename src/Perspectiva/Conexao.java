package Perspectiva;

import Modelo.Clientes;
import Modelo.PegarTudo;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Castelhano
 */
public class Conexao {
    Connection con = null;
    String url = "jdbc:mysql://localhost:3306/Redecanal";
    String usuario = "root";
    String senha = "";
    
    public void Conectar(){
        try {
            con = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexao realizado com sucesso!");
        } catch (SQLException ex) {
            System.out.println("Conexao realizado com sucesso!" +ex);
        }
    }
    public void Desconectar(){
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println("SQLException nao encontrado" +ex);
        }
    }
    public boolean comando(String sql)throws SQLException{
        boolean resultado = false;
        PreparedStatement stmt = con.prepareStatement(sql);
        if(stmt.execute()){
            resultado = true;
        }
        stmt.close();
        return resultado;
    }
    public Usuario validarUsuario(String usuario, String password, String permissao){
        Usuario us = null;
        String sql = "select * from tb_usuario where usuario='"+usuario+"' and password='"+password+"' and permissao='"+permissao+"';";
       
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            
            if(rs.next()){
                us = new Usuario();
                us.setId(rs.getInt("id"));
                us.setUsuario(rs.getString("usuario"));
                us.setPassword(rs.getString("password"));
                us.setPermissao(rs.getString("permissao"));
            }
        }catch(SQLException ex){
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return us;
    }
    public boolean Registra(Usuario usr){
        boolean res = false;
        String sql = "insert into tb_usuario (usuario, password, nome,permissao, nivel)values(?,?,?,?,?)";
        
        
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            stmt.setString(1, usr.getUsuario());
            stmt.setString(2, usr.getPassword());
            stmt.setString(3, usr.getNome());
            stmt.setString(4, usr.getPermissao());
            stmt.setString(5, usr.getNivel());
            
            stmt.execute();
            res=true;
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    public List<Usuario>listarUsuario(String sql)throws SQLException{
         Usuario u;
         
         List<Usuario> lista = new ArrayList<>();
         
         try(PreparedStatement stmt = con.prepareStatement(sql)){
             try(ResultSet rs = stmt.executeQuery()){
                 while(rs.next()){
                     u = new Usuario();
                     u.setNome(rs.getString("nome"));
                     u.setUsuario(rs.getString("usuario"));
                     u.setPermissao(rs.getString("permissao"));
                     u.setPassword(rs.getString("password"));
                     u.setNivel(rs.getString("nivel"));
                     lista.add(u);
                }
                rs.close();
            }
            return lista;
        }
     }
    public int buscar_id(String sql)throws SQLException{
        int id = 0;
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            try(ResultSet rs = stmt.executeQuery()){
                while(rs.next()){
                    id = rs.getInt("id_clientes");
                }
                rs.close();
            }
            return id;
        }
    }
    public Clientes buscar(String sql)throws SQLException{
        Clientes c = new Clientes();
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            try(ResultSet rs = stmt.executeQuery()){
                while(rs.next()){
                   c.setId_clientes(rs.getInt("id_clientes"));
                   c.setNome(rs.getString("nome"));
                   c.setEndereco(rs.getString("endereco"));
                   c.setEmail(rs.getString("email"));
                   c.setCidade(rs.getString("cidade"));
                   c.setBairro(rs.getString("bairro"));
                   c.setCpf(rs.getString("cpf"));
                   c.setRg(rs.getString("rg"));
                   c.setCelular(rs.getString("celular"));
                   c.setTelefone(rs.getString("telefone"));
                }
                rs.close();
            }
        }
        return c;
    }
    public List<Clientes>preencherTabela(String sql)throws SQLException{
        Clientes c;
        
        List<Clientes> lista = new ArrayList<>();
        
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            try(ResultSet rs = stmt.executeQuery()){
                while(rs.next()){
                    c = new Clientes();
                    c.setNome(rs.getString("nome"));
                    lista.add(c);
                }
                rs.close();
            }
        }
        return lista;
    }
    public List<Clientes>preencher(String sql)throws SQLException{
        Clientes c;
        
        List<Clientes> lista = new ArrayList<>();
        
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            try(ResultSet rs = stmt.executeQuery()){
                while(rs.next()){
                    c = new Clientes();
                    c.setNome(rs.getString("nome"));
                    c.setEndereco(rs.getString("endereco"));
                    c.setEmail(rs.getString("email"));
                    c.setCidade(rs.getString("cidade"));
                    c.setCelular(rs.getString("celular"));
                    lista.add(c);
                }
                rs.close();
            }
        }
        return lista;
    }
    public PegarTudo listaPaciente(String sql)throws SQLException{
        PegarTudo pt = new PegarTudo();
        try(PreparedStatement stmt = con.prepareStatement(sql)){
            try(ResultSet rs = stmt.executeQuery()){
                while(rs.next()){
                   pt.setId_clientes(rs.getInt("id_clientes"));
                   pt.setNome(rs.getString("nome"));
                   pt.setEndereco(rs.getString("endereco"));
                   pt.setEmail(rs.getString("email"));
                   pt.setCidade(rs.getString("cidade"));
                   pt.setBairro(rs.getString("bairro"));
                }
                rs.close();
            }
        }
        return pt;
    }
}
