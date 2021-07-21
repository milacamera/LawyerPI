/*
Para os campos nome, limitar caracteres de a-z/A-Z e espaço, de no máximo 30 
caracteres; para o campo endereco, limitar caracteres de a-z/A-Z e espaço, de 
no máximo 40 caracteres; para o campo cidade, limitar caracteres de a-z/A-Z e 
espaço, de no máximo 15 caracteres; para o campo observação, limitar caracteres 
de a-z/A-Z e espaço, de no máximo 130 caracteres.
 */
package modelo;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Camila_Camera
 */
public class LimitadorLetras extends PlainDocument {
    private int quantidadeMax;
    
    //método CONSTRUTOR da classe - serve para inicializar variáveis da classe
    public LimitadorLetras(int max) {
        // verifica se a regra que o dev definiu no GUIPessoa é negativo ou nulo
        if(max<=0) { //se for nulo ou negativo, mostra mensagem de erro
            //throw é uma cláusula de excessão 
            throw new IllegalArgumentException("Erro ao definir quantidade máxima de caracteres");
        } else { //se for maior, então a variável global receberá o parâmetro definido pelo dev
            this.quantidadeMax = max;
        }//fecha else
    } //fecha método construtor
    
    // cria método insertString para verificar a quantidade de caracteres que 
    //foi digitada dentro do campo jTextField
    @Override
    public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
        /*
        i (ou offs) - posição do texto
        string (ou str) - texto que o usuário digita
        as (ou a) - atributo da fonte, ou seja, se vai aceitar letra, números, caracteres especiais
        */
        if (string == null) {
            //se o usuário não escreveu nada ainda, então poderá prosseguir com seus dígitos
            return;
        }
        //a variável soma o tamanho total do jTextField (definido pelo dev) com o tamanho total de caracteres digitados pelo usuário
        //getLength() -> verifica quanto de espaço ainda tenho para ser digitado no TextField
        //string.length() -> verifica quantos caracteres JÁ FORAM digitados
        int quantidadeTotal = (getLength()+string.length());
        //se a soma da quantidadeTotal for menor ou igual à quantidadeMax definida
        if(quantidadeTotal <= quantidadeMax) {
            super.insertString(i, string.replaceAll("[^a-z^A-Z' ']^´~", ""), as); //To change body of generated methods, choose Tools | Templates.
            //[^a-z^A-Z] significa que é aceito letras de a até z minúsculas e A até Z maipusculas
            //' ' significa que é aceito espaço entre as letras
            // " " significa que não foi definido um nome para essa função.
            return;
        }//fecha if
        
        /* cria variável String que recebe os dados que o usuário está digitando.
           Continua mostrando (deixando visível) os caracteres que são permitidos e até onde caibam na quantidade máxima.
           Caso o usuário digite caracteres não permitidos, não seráo visíveis no jTextField.
        */
        String nova = string.substring(0,getLength() - quantidadeMax);
        super.insertString(i, nova, as);
    }
}
