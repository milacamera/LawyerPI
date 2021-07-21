/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Camila_Camera
 */
public class LoginUsuarioVO {
    private String email, senha;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    

    @Override
    public String toString() {
        return "LoginUsuarioVO{" + "email=" + email + ", senha=" + senha + '}';
    }

}
