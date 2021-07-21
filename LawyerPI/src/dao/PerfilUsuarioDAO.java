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
import modelo.LoginUsuarioVO;
import modelo.PerfilUsuarioVO;
import persistencia.Conexao;
/**
 *
 * @author Camila_Camera
 */
public class PerfilUsuarioDAO {
     public void PerfilUsuario(PerfilUsuarioVO pVO) throws SQLException{
      
        Connection con = Conexao.getConexao();
        try( 
                Statement stat = con.createStatement()) {
            String sql;
            sql = "insert into perfil-usuario_cliente(nickname, nomePerfil, email)"
                    +"values('"+pVO.getNickname()+","+pVO.getNomePerfil()+","
                    +pVO.getEmail()+")";
        }
   }
     
     /*
     public ArrayList<LoginUsuarioVO> buscarDadosDeLogin(String nome, String nickname) throws SQLException {
        //Searches for connection with database
        Connection con = Conexao.getConexao();
        //Creates an object "stat", responsable for sending Java commands to be executed in Database
        Statement stat = con.createStatement();
       try{
            String sql; //String that receives SQL commands
            sql = "select nome, nickname from cadastro_usuario_cliente where email = '"+login + "'and senha = '"+senha +"' ";
            //Brings all results of the query from database
            ResultSet rset = stat.executeQuery(sql);
            ArrayList<LoginUsuarioVO> loginVo = new ArrayList<>();
            
            
            //Searches always the next existing data in database and returns it for the existing attribute in LoginUsuarioVO
            while(rset.next()) { 
                LoginUsuarioVO lu = new LoginUsuarioVO();
                lu.setEmail(rset.getString("email"));
                lu.setSenha(rset.getString("senha"));
                
                loginVo.add(lu);
            }
            return loginVo;
        } catch (SQLException e) {
            throw new SQLException ("Erro ao pesquisar dados no banco"+e.getMessage());
        }finally {
            stat.close();
            con.close();
        }   
    } */  
     
}
