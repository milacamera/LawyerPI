/*
This class implements the DAO pattern for the Model.LoginUsuarioVO that will 
login the user registered in the system. 
DAO class is responsible for the connection between Java and SQL languages,
bringing everything that was described in the database to the Java patterns
 */
package dao;

import java.awt.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.LoginUsuarioVO;
import persistencia.Conexao;



/**
 *
 * @author Camila_Camera
 */
public class LoginUsuarioDAO {
    
    public ArrayList<LoginUsuarioVO> checkLogin(String login, String senha) throws SQLException {
        //Searches for connection with database
        Connection con = Conexao.getConexao();
        //Creates an object "stat", responsable for sending Java commands to be executed in Database
        Statement stat = con.createStatement();
       try{
            String sql; //String that receives SQL commands
            sql = "select * from login_usuario_cliente where email = '"+login + "'and senha = '"+senha +"' ";
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
    }   
    
}
