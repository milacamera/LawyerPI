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
public class CadastroUsuariollVO {
    private String especificacaoDeNegocio, tipoDeRenda, renda;

    public String getEspecificacaoDeNegocio() {
        return especificacaoDeNegocio;
    }

    public void setEspecificacaoDeNegocio(String especificacaoDeNegocio) {
        this.especificacaoDeNegocio = especificacaoDeNegocio;
    }

    public String getTipoDeRenda() {
        return tipoDeRenda;
    }

    public void setTipoDeRenda(String tipoDeRenda) {
        this.tipoDeRenda = tipoDeRenda;
    }

    public String getRenda() {
        return renda;
    }

    public void setRenda(String renda) {
        this.renda = renda;
    }

    @Override
    public String toString() {
        return "CadastroUsuariollVO{" + "especificacaoDeNegocio=" + especificacaoDeNegocio + ", tipoDeRenda=" + tipoDeRenda + ", renda=" + renda + '}';
    }
    
    
}
