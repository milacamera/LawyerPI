/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.CadastroUsuarioDAO;
import dao.DAOFactory;
import dao.PreCadastroDAO;
import java.sql.SQLException;
import modelo.PreCadastroVO;

/**
 *
 * @author Camila_Camera
 */
public class PreCadastroServicos {
    public void preCadastrarUsuario(PreCadastroVO cVO) throws SQLException{
        PreCadastroDAO pcaduserDAO = DAOFactory.getPreCadastroDAO();
        pcaduserDAO.preCadastrarUsuario(cVO);
    }
}
