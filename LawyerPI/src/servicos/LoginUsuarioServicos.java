/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.LoginUsuarioDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.LoginUsuarioVO;

/**
 *
 * @author Camila_Camera
 */
public class LoginUsuarioServicos {
    public ArrayList<LoginUsuarioVO> checkLogin(String login, String senha) throws SQLException {
        LoginUsuarioDAO luserDAO = DAOFactory.getLoginUsuarioDAO();

    return luserDAO.checkLogin(login, senha);
    }
}
