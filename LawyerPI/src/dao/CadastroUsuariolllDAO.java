/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.CadastroUsuariolllVO;
import persistencia.Conexao;

/**
 *
 * @author Camila_Camera
 */
public class CadastroUsuariolllDAO {
    public void cadastrarUsuario(CadastroUsuariolllVO cVO) throws SQLException{
      
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        try{
            String sql;
            sql = "insert into cadastro3 (data_endividamento, situacao_do_usuario, situacao_de_habitacao, tamanho_da_divida)"
                    + "values ('" + cVO.getDataEndividamento()+"','" + cVO.getSituacaoDoUsuario()+"','" + cVO.getSituacaoDaHabitacao()+"','"+ cVO.getTamanhoDaDivida()+"')";
            
            stat.execute(sql);
            
        }catch(SQLException e){
            throw new SQLException("Erro ao cadastrar usuário!"+e.getMessage());
        }finally{
            con.close();
        }
                    
        }
}

