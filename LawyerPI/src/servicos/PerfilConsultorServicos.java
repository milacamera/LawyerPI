/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import dao.DAOFactory;
import dao.LoginConsultorDAO;
import dao.PerfilConsultorDAO;
import java.sql.SQLException;
import modelo.PerfilConsultorVO;

/**
 *
 * @author casa
 */
public class PerfilConsultorServicos {
    public void PerfilConsultor(PerfilConsultorVO pVO) throws SQLException{
        PerfilConsultorDAO PerfilDAO = DAOFactory.getPerfilConsultorDAO();
        PerfilDAO.PerfilConsultor(pVO);
    }
}
