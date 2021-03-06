/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import servicos.LoginUsuarioServicos;

/**
 *
 * @author Camila_Camera
 */
public class GUILoginUsuarioFrame extends javax.swing.JFrame {
    GUIPerfilUsuarioFrame guiperfil;
    
    //Método para efetuar o login do usuário ou mostrar erros, caso ocorram
    public void efetuarLogin() {
        try{
            if(jtfEmail.getText().isEmpty() || jPassword.getText().isEmpty()) {
              JOptionPane.showMessageDialog(null,"Você precisar preencer os campos para efetuar o login!","Erro!",JOptionPane.INFORMATION_MESSAGE);  
            } else {
                LoginUsuarioServicos luserServicos = servicos.ServicosFactory.getLoginUsuarioServicos();
                
                String login, senha;
                login=jtfEmail.getText();
                senha=jPassword.getText();
                
                luserServicos.checkLogin(login, senha);
                
                JOptionPane.showMessageDialog(null,"Login efetuado com sucesso!","Você efetuou o login!",JOptionPane.INFORMATION_MESSAGE);
                
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Erro ao efetuar login"+e.getMessage(),"Erro!",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    //Método para cancelar as ações do usuário
    public void cancelar() {
        jtfEmail.setText(null);
        jPassword.setText(null);
    }
    
    //Método que envia os dados de email para a classe GUIPerfilUsuarioFrame
    public void enviarDados() {
        if (guiperfil == null) {
           guiperfil = new GUIPerfilUsuarioFrame();
           guiperfil.setVisible(true);
           guiperfil.receberDadosLogin(jtfEmail.getText());
        } else {
            guiperfil.setVisible(true);
            guiperfil.setState(GUIPerfilUsuarioFrame.NORMAL);
            guiperfil.receberDadosLogin(jtfEmail.getText());
        }
    }
    
    /**
     * Creates new form GUILoginUsuarioFrame
     */
    public GUILoginUsuarioFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtfEmail = new javax.swing.JTextField();
        jlSenha = new javax.swing.JLabel();
        jbEntrar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jlEmail = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jlIconEntrar = new javax.swing.JLabel();
        jlIconCancelar = new javax.swing.JLabel();
        jlLogo = new javax.swing.JLabel();
        jPassword = new javax.swing.JPasswordField();
        jbVoltar = new javax.swing.JButton();
        jlVoltar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtfEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jlSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlSenha.setText("Senha:");

        jbEntrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbEntrar.setText("Entrar");
        jbEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEntrarActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jlEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlEmail.setText("E-mail:");

        jlTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlTitulo.setText("Login do Usuário");

        jlIconEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.png"))); // NOI18N

        jlIconCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo64px.png"))); // NOI18N

        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jlVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/voltar.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jlTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlLogo)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlIconEntrar)
                            .addComponent(jbEntrar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jlIconCancelar)
                                .addGap(99, 99, 99)
                                .addComponent(jlVoltar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jbCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbVoltar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlSenha)
                            .addComponent(jlEmail))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(jPassword))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlLogo)
                    .addComponent(jlTitulo))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlEmail)
                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlSenha)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlIconCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlIconEntrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEntrar)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEntrarActionPerformed
        //Chama o método de efetuar login
        efetuarLogin();
        
        ////Quando o user clica em login, é redirecionado pra tela de perfil
        GUIPerfilUsuarioFrame guiperfil = new GUIPerfilUsuarioFrame();
        guiperfil.setVisible(true);
        this.setVisible(false);
        
        //Chama o método de enviar dados
        enviarDados();
    }//GEN-LAST:event_jbEntrarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        //Chama o método de cancelar
        cancelar();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        //Quando o user clica em voltar, é redirecionado pra tela de menu
        GUIMenuFrame guimenu = new GUIMenuFrame();
        guimenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(GUILoginUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUILoginUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUILoginUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUILoginUsuarioFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUILoginUsuarioFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbEntrar;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlIconCancelar;
    private javax.swing.JLabel jlIconEntrar;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JLabel jlVoltar;
    private javax.swing.JTextField jtfEmail;
    // End of variables declaration//GEN-END:variables
}
