/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidorblogapsrmi;

import util.EscolherArquivo;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Luiz
 */
public class Main extends javax.swing.JFrame {

    //Cria as variaveis globais para bind
    Registry registro;
    FuncoesBlog canal;
    String ipServidor;

    /**
     * Creates new form Main
     */
    public Main() {
        //metodo abaixo serve para capturar dinamicamente o ip do servidor 
        //apos isso ele é atribuido a variavel ip servidor
        loginComIp();
        try {
            
            this.registro = LocateRegistry.getRegistry(ipServidor, 1099);

            this.canal = (FuncoesBlog) registro.lookup("blog");

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, "Exception: Registro de bind Servidor OFFLINE :\n" + e.getMessage(), "", JOptionPane.OK_CANCEL_OPTION);
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jDialog1 = new javax.swing.JDialog();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuLogin = new javax.swing.JMenu();
        jMenuLogar = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenuItem();
        jMenuControl = new javax.swing.JMenu();
        jMenuGerenciarRegras = new javax.swing.JMenuItem();
        jMenuFerram = new javax.swing.JMenu();
        jMenuItemAplicarConfiguracoes = new javax.swing.JMenuItem();
        jMenuValoresPadroes = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemBkpConfiruracoes = new javax.swing.JMenuItem();
        jMenuItemRestaurarConfiguracoes = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        jMenuLogin.setMnemonic('l');
        jMenuLogin.setText("Login");

        jMenuLogar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuLogar.setText("Logar");
        jMenuLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLogarActionPerformed(evt);
            }
        });
        jMenuLogin.add(jMenuLogar);

        jMenuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuSair.setText("Sair");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenuLogin.add(jMenuSair);

        jMenuBar1.add(jMenuLogin);

        jMenuControl.setMnemonic('c');
        jMenuControl.setText("Controle de Acesso");
        jMenuControl.setEnabled(false);
        jMenuControl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuControlMouseClicked(evt);
            }
        });
        jMenuControl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jMenuControlKeyPressed(evt);
            }
        });

        jMenuGerenciarRegras.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuGerenciarRegras.setText("Gerenciar Regras");
        jMenuGerenciarRegras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGerenciarRegrasActionPerformed(evt);
            }
        });
        jMenuControl.add(jMenuGerenciarRegras);

        jMenuBar1.add(jMenuControl);

        jMenuFerram.setMnemonic('f');
        jMenuFerram.setText("Ferramentas");
        jMenuFerram.setEnabled(false);

        jMenuItemAplicarConfiguracoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAplicarConfiguracoes.setText("Aplicar Configurações");
        jMenuItemAplicarConfiguracoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemAplicarConfiguracoesMouseClicked(evt);
            }
        });
        jMenuItemAplicarConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAplicarConfiguracoesActionPerformed(evt);
            }
        });
        jMenuFerram.add(jMenuItemAplicarConfiguracoes);

        jMenuValoresPadroes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuValoresPadroes.setText("Valores padões");
        jMenuValoresPadroes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuValoresPadroesActionPerformed(evt);
            }
        });
        jMenuFerram.add(jMenuValoresPadroes);
        jMenuFerram.add(jSeparator1);

        jMenuItemBkpConfiruracoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemBkpConfiruracoes.setText("Backup Configurações Atuais");
        jMenuItemBkpConfiruracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBkpConfiruracoesActionPerformed(evt);
            }
        });
        jMenuFerram.add(jMenuItemBkpConfiruracoes);

        jMenuItemRestaurarConfiguracoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemRestaurarConfiguracoes.setText("Restaurar Configurações");
        jMenuItemRestaurarConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRestaurarConfiguracoesActionPerformed(evt);
            }
        });
        jMenuFerram.add(jMenuItemRestaurarConfiguracoes);

        jMenuBar1.add(jMenuFerram);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLogarActionPerformed
        JTextField loginField = new JTextField(10);
        JTextField senhaField = new JPasswordField(10);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Login:"));
        myPanel.add(loginField);
        myPanel.add(Box.createVerticalStrut(20)); // a spacer
        myPanel.add(new JLabel("Senha:"));
        myPanel.add(senhaField);
        myPanel.add(new JLabel("\nLogin:admin\n senha:123"));

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Por favor digite o Login e Senha", JOptionPane.OK_CANCEL_OPTION);

        //Login chega senha e habilita as funcionalidades do sistema
         if (result == JOptionPane.OK_OPTION && loginField.getText().equals("admin") && senhaField.getText().equals("123")) {
        this.jMenuControl.setEnabled(true);
        this.jMenuFerram.setEnabled(true);
        this.jMenuLogar.setEnabled(false);
        }
    }//GEN-LAST:event_jMenuLogarActionPerformed

    private void jMenuItemAplicarConfiguracoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemAplicarConfiguracoesMouseClicked
        try {
            canal.iniciaSeguranca();
            this.dispose();
        } catch (RemoteException ex) {
            Logger.getLogger(ListarTodas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemAplicarConfiguracoesMouseClicked

    private void jMenuControlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuControlMouseClicked
      
    }//GEN-LAST:event_jMenuControlMouseClicked

    private void jMenuControlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jMenuControlKeyPressed

    }//GEN-LAST:event_jMenuControlKeyPressed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        String[] options = new String[]{"Sim", "NÃO"};
        int response = JOptionPane.showOptionDialog(null, "DESEJA REALMENTE SAIR DO SISTEMA? ", "Confirmação de Saida",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
        switch (response) {
            case 0:
                System.exit(0);
                break;

            default:
                break;
        }
    }//GEN-LAST:event_jMenuSairActionPerformed

    private void jMenuValoresPadroesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuValoresPadroesActionPerformed
        //Restaura valores Padroes mas antes pega o ip da maquina solicitante 
        //para caso o usuário não tenha acesso ao acesso ao servidor
        //o terminal que foi feita a alteração terá acesso
        // se o usuário desejar excluir esta regra também terá 
        //que ser feita na opção excluir regra

        String[] options = new String[]{"Sim", "NÃO"};
        int response = JOptionPane.showOptionDialog(null, "DESEJA REALMENTE RESTAURAR OS VALORES PADROES? ", "Confirmação de Saida",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options, options[0]);
        switch (response) {

            case 0:

                try {
                    java.net.InetAddress i = java.net.InetAddress.getLocalHost();
                    String ip = i.getHostAddress();
                    List<String> regras = new ArrayList();
                    regras.add("permission java.net.SocketPermission \"" + ip + ":1099\", \"accept, resolve\";");
                    regras.add("permission java.net.SocketPermission \"" + ip + ":1024-65535\", \"accept, resolve\";");
                    canal.gravarArquivo(regras);
                    JOptionPane.showMessageDialog(rootPane, "Valores padrões restaurados.\n"
                            + "Foi adicionado uma regra automática com o endereço da sua máquina \n"
                            + "para que não haja o bloqueio deste terminal, caso deseje manipule as regras\n"
                            + "em CONTROLE DE ACESSO.");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao restaurar valores.\n"
                            + ex.getMessage());
                }

                break;

            default:
                break;
        }
    }//GEN-LAST:event_jMenuValoresPadroesActionPerformed

    private void jMenuItemRestaurarConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRestaurarConfiguracoesActionPerformed
        new EscolherArquivo(this.canal).restaurarArquivo();
    }//GEN-LAST:event_jMenuItemRestaurarConfiguracoesActionPerformed

    private void jMenuItemAplicarConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAplicarConfiguracoesActionPerformed
        try {
            canal.iniciaSeguranca();
            JOptionPane.showMessageDialog(rootPane, "Configurações aplicadas com Sucesso!");
        } catch (RemoteException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItemAplicarConfiguracoesActionPerformed

    private void jMenuItemBkpConfiruracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBkpConfiruracoesActionPerformed
        try {
            new EscolherArquivo(canal).bkpArquivo();
        } catch (RemoteException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jMenuItemBkpConfiruracoesActionPerformed

    private void jMenuGerenciarRegrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGerenciarRegrasActionPerformed
         try {
            ListarTodas listarRegras = new ListarTodas(this.canal);
            listarRegras.setVisible(true);

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jMenuGerenciarRegrasActionPerformed

    private void loginComIp() {
        JTextField loginField = new JTextField(10);
        JTextField senhaField = new JPasswordField(10);
        JTextField ipField = new JTextField(15);
        
        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("IP do Servidor:"));
        myPanel.add(ipField);
        myPanel.add(Box.createVerticalStrut(20)); // a spacer
        
        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Por favor digite o Login e Senha", JOptionPane.OK_CANCEL_OPTION);

        //Login chega senha e habilita as funcionalidades do sistema
        // if (result == JOptionPane.OK_OPTION && senhaField.getText().equals("123")) {
        this.ipServidor = ipField.getText();
        
        
        //}

    }

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuControl;
    private javax.swing.JMenu jMenuFerram;
    private javax.swing.JMenuItem jMenuGerenciarRegras;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemAplicarConfiguracoes;
    private javax.swing.JMenuItem jMenuItemBkpConfiruracoes;
    private javax.swing.JMenuItem jMenuItemRestaurarConfiguracoes;
    private javax.swing.JMenuItem jMenuLogar;
    private javax.swing.JMenu jMenuLogin;
    private javax.swing.JMenuItem jMenuSair;
    private javax.swing.JMenuItem jMenuValoresPadroes;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
