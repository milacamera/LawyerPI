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
public class CadastroUsuariolllVO {
    private String dataEndividamento, situacaoDoUsuario, situacaoDaHabitacao, tamanhoDaDivida; 

    public String getDataEndividamento() {
        return dataEndividamento;
    }

    public void setDataEndividamento(String dataEndividamento) {
        this.dataEndividamento = dataEndividamento;
    }

    public String getSituacaoDoUsuario() {
        return situacaoDoUsuario;
    }

    public void setSituacaoDoUsuario(String situacaoDoUsuario) {
        this.situacaoDoUsuario = situacaoDoUsuario;
    }

    public String getSituacaoDaHabitacao() {
        return situacaoDaHabitacao;
    }

    public void setSituacaoDaHabitacao(String situacaoDaHabitacao) {
        this.situacaoDaHabitacao = situacaoDaHabitacao;
    }

    public String getTamanhoDaDivida() {
        return tamanhoDaDivida;
    }

    public void setTamanhoDaDivida(String tamanhoDaDivida) {
        this.tamanhoDaDivida = tamanhoDaDivida;
    }

    @Override
    public String toString() {
        return "CadastroUsuariolllVO{" + "dataEndividamento=" + dataEndividamento + ", situacaoDoUsuario=" + situacaoDoUsuario + ", situacaoDaHabitacao=" + situacaoDaHabitacao + ", tamanhoDaDivida=" + tamanhoDaDivida + '}';
    }
    
    
}
