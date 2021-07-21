/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author casa
 */
public class PerfilConsultorVO {
    private String nome, numeroOab, telefone;
    private int idConsultor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroOab() {
        return numeroOab;
    }

    public void setNumeroOab(String numeroOab) {
        this.numeroOab = numeroOab;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdConsultor() {
        return idConsultor;
    }

    public void setIdConsultor(int idConsultor) {
        this.idConsultor = idConsultor;
    }

    @Override
    public String toString() {
        return "PerfilConsultorVO{" + "nome=" + nome + ", numeroOab=" + numeroOab + ", telefone=" + telefone + ", idConsultor=" + idConsultor + '}';
    }
    
    
}