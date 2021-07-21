/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.LoginConsultorVO;
import modelo.PerfilConsultorVO;
import persistencia.Conexao;

/**
 *
 * @author casa
 */
public class LoginConsultorDAO {
   public ArrayList<LoginConsultorVO> checkLogin(String email, String senha) throws SQLException {
        
        Connection con = Conexao.getConexao();
       
        Statement stat = con.createStatement();
       try{
            String sql; 
            sql = "select * from consultor_advogado where email = '"+email + "'and senha = '"+senha +"' ";
            
            ResultSet rset = stat.executeQuery(sql);
            ArrayList<LoginConsultorVO> loginVo = new ArrayList<>();
            
            
            
            while(rset.next()) { 
                LoginConsultorVO lc = new LoginConsultorVO();
                lc.setEmail(rset.getString("email"));
                lc.setSenha(rset.getString("senha"));
                
                loginVo.add(lc);
            }
            return loginVo;
        } catch (SQLException e) {
            throw new SQLException ("Erro ao pesquisar dados no banco"+e.getMessage());
        }finally {
            stat.close();
            con.close();
        }   
    }   

    
        }