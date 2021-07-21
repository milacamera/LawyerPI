/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.PreCadastroVO;
import persistencia.Conexao;

/**
 *
 * @author Camila_Camera
 */
public class PreCadastroDAO {
    public void preCadastrarUsuario(PreCadastroVO cVO) throws SQLException{
      
        Connection con = Conexao.getConexao();
        try( 
                Statement stat = con.createStatement()) {
            String sql;
            sql = "insert into login_usuario_cliente (email, senha)" + "values ('"+cVO.getEmailUsuario()+"','"+cVO.getSenhaUsuario()+"')";
            stat.execute(sql);
        }catch(SQLException e){
            throw new SQLException("Erro ao cadastrar usuário ou senha. Tente novamente!"+e.getMessage());
        }finally{
            con.close();
        }
                    
        }
}
