/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
/**
 *
 * @author Camila_Camera
 */
public class DAOFactory {
    private static LoginUsuarioDAO luserDAO = new LoginUsuarioDAO();
    private static CadastroUsuarioDAO caduserDAO = new CadastroUsuarioDAO();
    private static PerfilUsuarioDAO puserDAO = new PerfilUsuarioDAO();
    private static PreCadastroDAO pcaduserDAO = new PreCadastroDAO();
    private static CadastroUsuariollDAO caduserllDAO = new CadastroUsuariollDAO();
    private static CadastroUsuariolllDAO caduserlllDAO = new CadastroUsuariolllDAO();
    

    public static LoginUsuarioDAO getLoginUsuarioDAO(){
        return luserDAO;
    }
    
    public static CadastroUsuarioDAO getCadastroUsuarioDAO(){
        return caduserDAO;
    }
    
    public static PerfilUsuarioDAO getPerfilUsuarioDAO(){
        return puserDAO;
    }
    
     public static PreCadastroDAO getPreCadastroDAO(){
        return pcaduserDAO;
    }
     
     public static CadastroUsuariollDAO getCadastroUsuariollDAO(){
        return caduserllDAO;
    }
     
     public static CadastroUsuariolllDAO getCadastroUsuariolllDAO(){
        return caduserlllDAO;
    }
     
}
