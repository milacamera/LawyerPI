/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.CadastroUsuariollDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import modelo.CadastroUsuariollVO;


/**
 *
 * @author Camila_Camera
 */
public class CadastroUsuariollServicos {
    
    public void cadastrarUsuario (CadastroUsuariollVO cVO) throws SQLException{
        CadastroUsuariollDAO caduserllDAO = DAOFactory.getCadastroUsuariollDAO();
        caduserllDAO.cadastrarUsuario(cVO);
    }   
}
