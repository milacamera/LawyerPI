/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.CadastroUsuariollVO;
import persistencia.Conexao;

/**
 *
 * @author Camila_Camera
 */
public class CadastroUsuariollDAO {
    public void cadastrarUsuario(CadastroUsuariollVO cVO) throws SQLException{
      
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        try{
            String sql;
            sql = "insert into cadastro2 (especificacao_de_negocio, tipo_de_renda, renda)"
                    + "values ('" + cVO.getEspecificacaoDeNegocio()+"','" + cVO.getTipoDeRenda()+"','" + cVO.getRenda()+"')";
            
            stat.execute(sql);
            
        }catch(SQLException e){
            throw new SQLException("Erro ao cadastrar usuário!"+e.getMessage());
        }finally{
            con.close();
        }
                    
        }
}