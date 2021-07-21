/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.CadastroUsuarioDAO;
import dao.DAOFactory;
import dao.LoginUsuarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.CadastroUsuarioVO;
import modelo.LoginUsuarioVO;

/**
 *
 * @author Camila_Camera
 */
public class CadastroUsuarioServicos {
    
    public void cadastrarUsuario(CadastroUsuarioVO cVO) throws SQLException{
        CadastroUsuarioDAO caduserDAO = DAOFactory.getCadastroUsuarioDAO();
        caduserDAO.cadastrarUsuario(cVO);
    }
    
    
    public ArrayList<CadastroUsuarioVO> buscar() throws SQLException {
        CadastroUsuarioDAO caduserDAO = DAOFactory.getCadastroUsuarioDAO();
        return caduserDAO.buscar();
    }
    
     public void deletarUsuario(int idUsuarioCliente) throws SQLException{
        CadastroUsuarioDAO caduserDAO = DAOFactory.getCadastroUsuarioDAO();
        caduserDAO.deletarUsuario(idUsuarioCliente);
    }
     
     public void alterarCadastro(CadastroUsuarioVO cVO) throws SQLException{
        CadastroUsuarioDAO caduserDAO = DAOFactory.getCadastroUsuarioDAO();
        caduserDAO.cadastrarUsuario(cVO);
    }

}
