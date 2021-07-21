/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.PerfilConsultorVO;
import persistencia.Conexao;

/**
 *
 * @author casa
 */
public class PerfilConsultorDAO {
     public void PerfilConsultor (PerfilConsultorVO pVO) throws SQLException{
      
        Connection con = Conexao.getConexao();
        try( 
                Statement stat = con.createStatement()) {
            String sql;
            sql = "insert into perfil_consultor(id_consultor, numero_oab, nome, telefone)"
                    +"values (null, '"+pVO.getNumeroOab()+"','"+pVO.getNome()+"','"+pVO.getTelefone()+"')";
        }
     }
     // public ArrayList<PerfilConsultorVO> buscarDadosDeLogin (int idConsultor, String numeroOab, String nome, String telefone) throws SQLException {
        
       // Connection con = Conexao.getConexao();
       // Statement stat = con.createStatement();
      // try{
       //    String sql; //String that receives SQL commands
      //      sql = "select id_consultor, numero_oab, nome, telefone from perfil_consultor
       }

