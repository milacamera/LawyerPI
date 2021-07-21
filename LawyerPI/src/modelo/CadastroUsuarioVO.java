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
public class CadastroUsuarioVO {
    //cadastro do usuario_cliente
    private String nome, telefone1, telefone2, cpf, cnpj, rg, dataNascimento, genero, cidade, estado, endereco, complementoEndereco, bairro, identificacaoEndereco, pessoaFisicaJuridica;
    private int idUsuario, numero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(String telefone1) {
        this.telefone1 = telefone1;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplementoEndereco() {
        return complementoEndereco;
    }

    public void setComplementoEndereco(String complementoEndereco) {
        this.complementoEndereco = complementoEndereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getIdentificacaoEndereco() {
        return identificacaoEndereco;
    }

    public void setIdentificacaoEndereco(String identificacaoEndereco) {
        this.identificacaoEndereco = identificacaoEndereco;
    }

    public String getPessoaFisicaJuridica() {
        return pessoaFisicaJuridica;
    }

    public void setPessoaFisicaJuridica(String pessoaFisicaJuridica) {
        this.pessoaFisicaJuridica = pessoaFisicaJuridica;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "CadastroUsuarioVO{" + "nome=" + nome + ", telefone1=" + telefone1 + ", telefone2=" + telefone2 + ", cpf=" + cpf + ", cnpj=" + cnpj + ", rg=" + rg + ", dataNascimento=" + dataNascimento + ", genero=" + genero + ", cidade=" + cidade + ", estado=" + estado + ", endereco=" + endereco + ", complementoEndereco=" + complementoEndereco + ", bairro=" + bairro + ", identificacaoEndereco=" + identificacaoEndereco + ", pessoaFisicaJuridica=" + pessoaFisicaJuridica + ", idUsuario=" + idUsuario + ", numero=" + numero + '}';
    }
    
}
    
    
    
    
    
    
    

