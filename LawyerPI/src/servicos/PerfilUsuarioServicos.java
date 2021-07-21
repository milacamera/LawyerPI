/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.PerfilUsuarioDAO;
import java.sql.SQLException;
import modelo.PerfilUsuarioVO;

/**
 *
 * @author Camila_Camera
 */
public class PerfilUsuarioServicos {
    public void PerfilUsuario(PerfilUsuarioVO pVO) throws SQLException{
        PerfilUsuarioDAO perfilDAO = DAOFactory.getPerfilUsuarioDAO();
        perfilDAO.PerfilUsuario(pVO);
    }
}
