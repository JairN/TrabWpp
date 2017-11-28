package appwhatsapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class JFrameWhatsapp extends javax.swing.JFrame implements Serializable {

    private LocalDateTime now = LocalDateTime.now();
    private DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM");
    private String data = now.format(formatterData);
    private DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm");
    private String hora = now.format(formatterHora);
    protected Conversa c;
    protected Whatsapp w = new Whatsapp();

    public void setC(Conversa c) {
        this.c = c;
    }

    public void setW(Whatsapp w) {
        this.w = w;
    }

    public JFrameWhatsapp() {
        initComponents();
        jListContatos.setModel(new DefaultListModel<>());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupQuemEnvia = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaConversa = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaMensagem = new javax.swing.JTextArea();
        jButtonEnviar = new javax.swing.JButton();
        jRadioButtonVoce = new javax.swing.JRadioButton();
        jRadioButtonContato = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListContatos = new javax.swing.JList<>();
        jTextFieldPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonNovaMensagem = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaResultadoBusca = new javax.swing.JTextArea();
        jComboBoxOnlineOffline = new javax.swing.JComboBox<>();
        jButtonAlterarNome = new javax.swing.JButton();
        jLabelStatus = new javax.swing.JLabel();
        jLabelNomeContato = new javax.swing.JLabel();
        jLabelNomeUsuario = new javax.swing.JLabel();
        jLabelVistoPorUltimo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WhatsAppLocal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTextAreaConversa.setEditable(false);
        jTextAreaConversa.setColumns(20);
        jTextAreaConversa.setRows(5);
        jScrollPane1.setViewportView(jTextAreaConversa);

        jTextAreaMensagem.setColumns(20);
        jTextAreaMensagem.setRows(5);
        jScrollPane2.setViewportView(jTextAreaMensagem);

        jButtonEnviar.setText("Enviar");
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });

        buttonGroupQuemEnvia.add(jRadioButtonVoce);
        jRadioButtonVoce.setSelected(true);
        jRadioButtonVoce.setText("Você");
        jRadioButtonVoce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonVoceActionPerformed(evt);
            }
        });

        buttonGroupQuemEnvia.add(jRadioButtonContato);
        jRadioButtonContato.setText("Contato");
        jRadioButtonContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonContatoActionPerformed(evt);
            }
        });

        jListContatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListContatosMouseClicked(evt);
            }
        });
        jListContatos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListContatosValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jListContatos);

        jTextFieldPesquisar.setText("Pesquisar");
        jTextFieldPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldPesquisarMouseClicked(evt);
            }
        });
        jTextFieldPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesquisarActionPerformed(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonNovaMensagem.setText("Nova Mensagem");
        jButtonNovaMensagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovaMensagemActionPerformed(evt);
            }
        });

        jTextAreaResultadoBusca.setEditable(false);
        jTextAreaResultadoBusca.setColumns(20);
        jTextAreaResultadoBusca.setRows(5);
        jTextAreaResultadoBusca.setText("Resultado da Busca");
        jScrollPane6.setViewportView(jTextAreaResultadoBusca);

        jComboBoxOnlineOffline.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Online", "Offline" }));
        jComboBoxOnlineOffline.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxOnlineOfflineItemStateChanged(evt);
            }
        });

        jButtonAlterarNome.setText("Alterar");
        jButtonAlterarNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarNomeActionPerformed(evt);
            }
        });

        jLabelStatus.setText("Status:");

        jLabelNomeContato.setText("NOMECONTATO");

        jLabelNomeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNomeUsuario.setText("NOME");
        jLabelNomeUsuario.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabelVistoPorUltimo.setText("Visto por último:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButtonPesquisar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                            .addComponent(jButtonNovaMensagem))
                        .addComponent(jTextFieldPesquisar)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabelNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonAlterarNome, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxOnlineOffline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jRadioButtonVoce)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButtonContato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                                .addComponent(jButtonEnviar))
                            .addComponent(jScrollPane2))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelVistoPorUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNomeUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonAlterarNome)
                        .addComponent(jLabelNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelVistoPorUltimo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelStatus)
                        .addComponent(jComboBoxOnlineOffline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonEnviar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButtonVoce)
                                .addComponent(jRadioButtonContato)))
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNovaMensagem)
                            .addComponent(jButtonPesquisar))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        // TODO add your handling code here:
        if (!jTextAreaMensagem.getText().equals("")) {
            String emissor;
            if (jRadioButtonVoce.isSelected()) {
                emissor = w.getNomeUsuario();
            } else {
                emissor = w.getListaConversa().get(jListContatos.getSelectedIndex()).getContato();
            }
            Mensagem m = new Mensagem(emissor, jTextAreaMensagem.getText(), data, hora);
            w.getListaConversa().get(jListContatos.getSelectedIndex()).addMensagem(m);
            jTextAreaMensagem.setText("");
            jTextAreaConversa.append(m.toString());
        }
    }//GEN-LAST:event_jButtonEnviarActionPerformed

    private void jRadioButtonVoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonVoceActionPerformed
        // TODO add your handling code here:
        jLabelVistoPorUltimo.setText(data + "-" + hora);
    }//GEN-LAST:event_jRadioButtonVoceActionPerformed

    private void jRadioButtonContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonContatoActionPerformed
        // TODO add your handling code here:
        jLabelVistoPorUltimo.setText("Online");
    }//GEN-LAST:event_jRadioButtonContatoActionPerformed

    private void jListContatosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListContatosValueChanged
        // TODO add your handling code here:


    }//GEN-LAST:event_jListContatosValueChanged

    private void jButtonNovaMensagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovaMensagemActionPerformed
        // TODO add your handling code here:
        String telContato = JOptionPane.showInputDialog("Insira o número");
        w.iniciarConversa(telContato);
        DefaultListModel<String> modelo = (DefaultListModel<String>) jListContatos.getModel();
        int i;
        for (i = 0; i < modelo.size(); i++) {
            if (telContato.equals(modelo.get(i))) {
                jListContatos.setSelectedIndex(i);
                return;
            }
        }
        if (i == modelo.getSize()) {
            modelo.add(i, telContato);
            jListContatos.setSelectedIndex(i);
        }
        jLabelNomeContato.setText(w.getListaConversa().get(jListContatos.getMaxSelectionIndex()).getContato());
    }//GEN-LAST:event_jButtonNovaMensagemActionPerformed

    private void jListContatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListContatosMouseClicked
        // TODO add your handling code here:
        jRadioButtonVoce.setSelected(true);
        jLabelNomeContato.setText(w.getListaConversa().get(jListContatos.getMaxSelectionIndex()).getContato());
        jTextAreaConversa.setText(w.getListaConversa().get(jListContatos.getMaxSelectionIndex()).TodaConversa().toString());
    }//GEN-LAST:event_jListContatosMouseClicked

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        // TODO add your handling code here:
        jTextAreaResultadoBusca.setText("");
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < w.getListaConversa().size(); i++) {
                sb.append(w.getListaConversa().get(i).Buscar(jTextFieldPesquisar.getText()).toString());
            }
            jTextAreaResultadoBusca.setText(sb.toString());
            if (sb.toString().equalsIgnoreCase("")) {
                throw new nenhumaMensagemException(jTextFieldPesquisar.getText());
            }
        } catch (nenhumaMensagemException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "ERRO", HEIGHT);
        }
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jTextFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesquisarActionPerformed

    private void jTextFieldPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldPesquisarMouseClicked
        // TODO add your handling code here:
        jTextFieldPesquisar.setText("");
    }//GEN-LAST:event_jTextFieldPesquisarMouseClicked

    private void jButtonAlterarNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarNomeActionPerformed
        // TODO add your handling code here:
        String s = JOptionPane.showInputDialog("Digite o nome para alteração");
        jLabelNomeUsuario.setText(s);
        w.setNomeUsuario(s);
    }//GEN-LAST:event_jButtonAlterarNomeActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        String fileName = "Whats.txt";
        JOptionPane.showMessageDialog(null, "Salvando...");
        try (FileOutputStream fout = new FileOutputStream(fileName);
                ObjectOutputStream oout = new ObjectOutputStream(fout)) {
            oout.writeObject(w);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:

        File f = new File("Whats.txt");
        if (f.exists()) {
            try (FileInputStream fin = new FileInputStream(f);
                    ObjectInputStream oin = new ObjectInputStream(fin)) {
                w = (Whatsapp) oin.readObject();
                jLabelNomeUsuario.setText(w.getNomeUsuario());
                DefaultListModel<String> modelo = (DefaultListModel<String>) jListContatos.getModel();
                for (int i = 0; i < w.getListaConversa().size(); i++) {
                    modelo.add(i, w.getListaConversa().get(i).getContato());
                    jListContatos.setSelectedIndex(i);
                }
                //jListContatos = (JList) oin.readObject();
            } catch (Exception e) {
            }

        } else {
            String nome = JOptionPane.showInputDialog("Insira seu nome:");
            jLabelNomeUsuario.setText(nome);
            w.setNomeUsuario(nome);
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        String fileName = "Whats.txt";
        File f = new File(fileName);
        try (FileOutputStream fout = new FileOutputStream(fileName);
                ObjectOutputStream oout = new ObjectOutputStream(fout)) {
            oout.writeObject(w);
            oout.writeObject(jLabelNomeUsuario);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_formWindowClosing

    private void jComboBoxOnlineOfflineItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxOnlineOfflineItemStateChanged
        // TODO add your handling code here:
        if (jComboBoxOnlineOffline.getSelectedItem().equals("Online")) {
            w.setStatusUsuario("Online");
        } else {
            w.setStatusUsuario("Offline");
        }
    }//GEN-LAST:event_jComboBoxOnlineOfflineItemStateChanged

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
            java.util.logging.Logger.getLogger(JFrameWhatsapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameWhatsapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameWhatsapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameWhatsapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameWhatsapp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupQuemEnvia;
    private javax.swing.JButton jButtonAlterarNome;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JButton jButtonNovaMensagem;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JComboBox<String> jComboBoxOnlineOffline;
    private javax.swing.JLabel jLabelNomeContato;
    private javax.swing.JLabel jLabelNomeUsuario;
    private javax.swing.JLabel jLabelStatus;
    private javax.swing.JLabel jLabelVistoPorUltimo;
    private javax.swing.JList<String> jListContatos;
    private javax.swing.JRadioButton jRadioButtonContato;
    private javax.swing.JRadioButton jRadioButtonVoce;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextArea jTextAreaConversa;
    private javax.swing.JTextArea jTextAreaMensagem;
    private javax.swing.JTextArea jTextAreaResultadoBusca;
    private javax.swing.JTextField jTextFieldPesquisar;
    // End of variables declaration//GEN-END:variables
}
