/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.CadastroUsuariolllDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import modelo.CadastroUsuariolllVO;

/**
 *
 * @author Camila_Camera
 */
public class CadastroUsuariolllServicos {
        
    public void cadastrarUsuario (CadastroUsuariolllVO cVO) throws SQLException{
        CadastroUsuariolllDAO caduserlllDAO = DAOFactory.getCadastroUsuariolllDAO();
        caduserlllDAO.cadastrarUsuario(cVO);
    }
}
