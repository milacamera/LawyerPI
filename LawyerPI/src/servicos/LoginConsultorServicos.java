/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.LoginConsultorDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.LoginConsultorVO;

/**
 *
 * @author casa
 */
public class LoginConsultorServicos {
    public ArrayList<LoginConsultorVO> checkLogin(String email, String senha) throws SQLException {
        LoginConsultorDAO logiConsultorDAO = DAOFactory.getCadastroConsultorDAO();

    return logiConsultorDAO.checkLogin(email, senha);
    }
    
}
