/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import modelo.CadastroUsuarioVO;
import modelo.LimitadorLetras;
import modelo.PreCadastroVO;
import modelo.LimitadorNumeros;

/**
 *
 * @author Camila_Camera
 */
public class GUITelaCadastroUsuarioFrame extends javax.swing.JFrame {
    GUIPerfilUsuarioFrame guiperfil;
    
    //Método para enviar dados de email para a classe/tela de perfil
    public void enviarDados() {
        if (guiperfil == null) {
           guiperfil = new GUIPerfilUsuarioFrame();
           guiperfil.setVisible(true);
           //guiperfil.receberDadosCadastro(jtfNome.getText());
        } else {
            guiperfil.setVisible(true);
            guiperfil.setState(GUIPerfilUsuarioFrame.NORMAL);
            //guiperfil.receberDadosCadastro(jtfNome.getText());
        }
    }
    
    //Método para cadastrar usuário no sistema
    public void cadastrarUsuario () {
        try{
            modelo.CadastroUsuarioVO cad = new CadastroUsuarioVO();
            cad.setNome(jtfNome.getText());
            cad.setTelefone1(jftfTelefone1.getText());
            cad.setTelefone2(jftfTelefone2.getText());
            cad.setGenero(jtfGenero.getText());
            cad.setEndereco(jtfEndereco.getText());
            cad.setCidade(jtfCidade.getText());
            cad.setEstado(jftfEstado.getText());
            cad.setBairro(jtfBairro.getText());
            cad.setDataNascimento(jftfDataNascimento.getText());
            cad.setRg(jftfRG.getText());
            cad.setCnpj(jftfCNPJ.getText());
            cad.setCpf(jftfCPF.getText());
            cad.setComplementoEndereco(jtfComplemento.getText());
            cad.setNumero(Integer.parseInt(jtfNumero.getText()));
            cad.setIdentificacaoEndereco(String.valueOf(jcomboResidenciaTrabalho.getSelectedItem()));
            cad.setPessoaFisicaJuridica(String.valueOf(jcomboPessoa.getSelectedItem()));
           
        
            //Chama a classe CadastroUsuarioServicos em servicos, que fará a inserção dos dados da classe dentro do banco
            servicos.CadastroUsuarioServicos pcad = servicos.ServicosFactory.getCadastroUsuarioServicos();
            pcad.cadastrarUsuario(cad);
            JOptionPane.showMessageDialog(null, "Você foi pré cadastrado(a) com sucesos!", "Confirmação", JOptionPane.INFORMATION_MESSAGE);
            
            //Quando o user clica em Salvar e continuar, é redirecionado pra a próxima tela de cadastro
            GUITelaCadastroUsuariollFrame guimenu = new GUITelaCadastroUsuariollFrame();
            guimenu.setVisible(true);
            this.setVisible(false);

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Ops, algo deu errado!" +e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Método para cancelar as ações do usuário, setando-as para nulo
    public void cancelarCadastro() {
            jtfNome.setText(null);
            jftfTelefone1.setText(null);
            jftfTelefone2.setText(null);
            jtfGenero.setText(null);
            jtfEndereco.setText(null);
            jtfCidade.setText(null);
            jftfEstado.setText(null);
            jtfBairro.setText(null);
            jftfDataNascimento.setText(null);
            jftfRG.setText(null);
            jftfCNPJ.setText(null);
            jftfCPF.setText(null);
            jtfComplemento.setText(null);
            jtfNumero.setText(null);
    }

    /**
     * Creates new form GUITelaCadastroUsuarioFrame
     */
    public GUITelaCadastroUsuarioFrame() {
        initComponents();
        //indica que o jTextField está recebendo os comandos especificados dentro das classes LimitadorLetras ou LimitadorNumeros
        jtfGenero.setDocument(new LimitadorLetras(30));
        jtfNome.setDocument(new LimitadorLetras(100));
        jftfCNPJ.setDocument(new LimitadorLetras(25));
        jftfCPF.setDocument(new LimitadorLetras(25));
        jftfRG.setDocument(new LimitadorLetras(10));
        jftfDataNascimento.setDocument(new LimitadorLetras(25));
        jftfTelefone1.setDocument(new LimitadorLetras(25));
        jftfTelefone2.setDocument(new LimitadorLetras(25));
        jtfCidade.setDocument(new LimitadorLetras(50));
        jftfEstado.setDocument(new LimitadorLetras(2));
        jtfEndereco.setDocument(new LimitadorLetras(255));
        jtfBairro.setDocument(new LimitadorLetras(50));
        jtfNumero.setDocument(new LimitadorNumeros(11));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlCidade = new javax.swing.JLabel();
        jlDatadeNascimento = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jlNumero = new javax.swing.JLabel();
        jlPessoa = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlIdentificacaodoEndereco = new javax.swing.JLabel();
        jlEstado = new javax.swing.JLabel();
        jlRG = new javax.swing.JLabel();
        jlBairro = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlDadosdeLogin = new javax.swing.JLabel();
        jlDadosdeCorrespondencia = new javax.swing.JLabel();
        jcomboPessoa = new javax.swing.JComboBox<>();
        jlCNPJ = new javax.swing.JLabel();
        jtfCidade = new javax.swing.JTextField();
        jtfEndereco = new javax.swing.JTextField();
        jtfBairro = new javax.swing.JTextField();
        jtfNumero = new javax.swing.JTextField();
        jtfComplemento = new javax.swing.JTextField();
        jlComplemento = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jbSalvar = new javax.swing.JButton();
        button1 = new java.awt.Button();
        jbCancelar = new javax.swing.JButton();
        jlLogo = new javax.swing.JLabel();
        jtfGenero = new javax.swing.JTextField();
        jcomboResidenciaTrabalho = new javax.swing.JComboBox<>();
        jlSalvar = new javax.swing.JLabel();
        jlCancelar = new javax.swing.JLabel();
        jftfDataNascimento = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter dataNascimento= new javax.swing.text.MaskFormatter("##/##/####");
            jftfDataNascimento = new javax.swing.JFormattedTextField(dataNascimento);
        }
        catch (Exception e){
        }
        jftfTelefone1 = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter telefone1= new javax.swing.text.MaskFormatter("(##)#####-####");
            jftfTelefone1 = new javax.swing.JFormattedTextField(telefone1);
        }
        catch (Exception e){
        }
        jftfTelefone2 = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter telefone2= new javax.swing.text.MaskFormatter("(##)#####-####");
            jftfTelefone2 = new javax.swing.JFormattedTextField(telefone2);
        }
        catch (Exception e){
        }
        jftfCNPJ = new javax.swing.JFormattedTextField();
        jftfCPF = new javax.swing.JFormattedTextField();
        jftfRG = new javax.swing.JFormattedTextField();
        jftfEstado = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlCidade.setText("Cidade");

        jlDatadeNascimento.setText("Data de Nascimento");

        jlEndereco.setText("Endereço");

        jLabel6.setText("Genêro");

        jlNumero.setText("Número");

        jlPessoa.setText(" Pessoa");

        jLabel16.setText("Celular/Telefone");

        jlNome.setText("Nome Completo");

        jlIdentificacaodoEndereco.setText("Identificação do Endereço (Residência/Trabalho)");

        jlEstado.setText("Estado");

        jlRG.setText("RG");

        jlBairro.setText("Bairro");

        jlTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlTitulo.setText("                                                 FAÇA SEU CADASTRO");

        jLabel10.setText("CPF");

        jlDadosdeLogin.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jlDadosdeLogin.setText("Dados de Login");

        jlDadosdeCorrespondencia.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jlDadosdeCorrespondencia.setText("Dados de Correspondência");

        jcomboPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pessoa Física", "Pessoa Jurídica", " " }));

        jlCNPJ.setText("CNPJ");

        jtfNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumeroActionPerformed(evt);
            }
        });

        jtfComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfComplementoActionPerformed(evt);
            }
        });

        jlComplemento.setText("Complemento");

        jLabel17.setText("Celular/Telefone 2");

        jbSalvar.setText("Salvar e continuar ");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        button1.setLabel("button1");

        jbCancelar.setText("Voltar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo64px.png"))); // NOI18N

        jcomboResidenciaTrabalho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Residência", "Trabalho" }));

        jlSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N

        jlCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/voltar.png"))); // NOI18N

        try {
            jftfDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jftfTelefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jftfTelefone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jftfCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            jftfCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftfCPFActionPerformed(evt);
            }
        });

        jftfEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftfEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlDadosdeLogin)
                            .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlRG)
                                            .addComponent(jlCNPJ)
                                            .addComponent(jLabel10))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jlDatadeNascimento))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jftfCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                                    .addComponent(jftfCPF)
                                                    .addComponent(jftfRG)))))
                                    .addComponent(jlPessoa)
                                    .addComponent(jcomboPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jftfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDadosdeCorrespondencia)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlIdentificacaodoEndereco)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlCidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcomboResidenciaTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlEstado)
                                        .addGap(18, 18, 18)
                                        .addComponent(jftfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(159, 159, 159))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlEndereco)
                            .addComponent(jlNumero)
                            .addComponent(jlBairro))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtfEndereco)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbSalvar)
                                            .addGap(259, 259, 259)
                                            .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(59, 59, 59)
                                            .addComponent(jlComplemento)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jtfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))))))
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jlLogo)
                        .addGap(108, 108, 108))))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(30, 30, 30)
                        .addComponent(jftfTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jftfTelefone2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlSalvar)
                .addGap(342, 342, 342)
                .addComponent(jlCancelar)
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(370, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jtfGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addComponent(jlPessoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcomboPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCNPJ)
                            .addComponent(jftfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jlLogo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlDadosdeLogin)
                            .addComponent(jlDadosdeCorrespondencia))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlIdentificacaodoEndereco)
                                .addComponent(jcomboResidenciaTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlEstado)
                                    .addComponent(jftfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlCidade)
                                .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEndereco)
                            .addComponent(jtfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNumero)
                            .addComponent(jtfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlComplemento)
                            .addComponent(jtfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jlBairro)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(81, 81, 81)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jftfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlRG)
                            .addComponent(jftfRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlDatadeNascimento)
                            .addComponent(jftfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jftfTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jftfTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlSalvar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlCancelar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbCancelar))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNumeroActionPerformed

    private void jtfComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfComplementoActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        //Chama o método de cadastrar
        cadastrarUsuario();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        //Chama o método de cancelar
        cancelarCadastro();
        
        //Quando o user clica em cancelar, é redirecionado pra tela de menu
        GUIMenuFrame guimenu = new GUIMenuFrame();
        guimenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jftfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftfCPFActionPerformed

    private void jftfEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftfEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftfEstadoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUITelaCadastroUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUITelaCadastroUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUITelaCadastroUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUITelaCadastroUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUITelaCadastroUsuarioFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcomboPessoa;
    private javax.swing.JComboBox<String> jcomboResidenciaTrabalho;
    private javax.swing.JFormattedTextField jftfCNPJ;
    private javax.swing.JFormattedTextField jftfCPF;
    private javax.swing.JFormattedTextField jftfDataNascimento;
    private javax.swing.JFormattedTextField jftfEstado;
    private javax.swing.JFormattedTextField jftfRG;
    private javax.swing.JFormattedTextField jftfTelefone1;
    private javax.swing.JFormattedTextField jftfTelefone2;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCNPJ;
    private javax.swing.JLabel jlCancelar;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlComplemento;
    private javax.swing.JLabel jlDadosdeCorrespondencia;
    private javax.swing.JLabel jlDadosdeLogin;
    private javax.swing.JLabel jlDatadeNascimento;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlIdentificacaodoEndereco;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlPessoa;
    private javax.swing.JLabel jlRG;
    private javax.swing.JLabel jlSalvar;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfComplemento;
    private javax.swing.JTextField jtfEndereco;
    private javax.swing.JTextField jtfGenero;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNumero;
    // End of variables declaration//GEN-END:variables
}