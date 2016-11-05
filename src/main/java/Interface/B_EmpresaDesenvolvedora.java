/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import geradorxml.CorretorOrtografico;
import geradorxml.XML;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * @author Hiago
 */
public class B_EmpresaDesenvolvedora extends javax.swing.JFrame {

    /**
     * Creates new form
     */
    static boolean flag = false;
    static String razaoSocialt, cnpjt;

    public B_EmpresaDesenvolvedora() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setBackground(Color.black);
        this.setVisible(true);
    }

    public static String getRazaoSocial() {
        return razaoSocialt;
    }

    public static String getCnpj() {
        return cnpjt;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        razaoSocial = new javax.swing.JTextField();
        cnpj = new javax.swing.JTextField();
        ie = new javax.swing.JTextField();
        rua = new javax.swing.JTextField();
        numero = new javax.swing.JTextField();
        complemento = new javax.swing.JTextField();
        bairro = new javax.swing.JTextField();
        municipio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        uf = new javax.swing.JTextField();
        cep = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        cpf = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        responsAcompTestes = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dados da Empresa Desenvolvedora Requerente");

        jLabel1.setText("Razão Social");

        jLabel2.setText("CNPJ");

        jLabel3.setText("IE - Inscrição Estadual");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setText("Informações da Empresa Desenvolvedora Requerente");
        jLabel4.setEnabled(false);

        razaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                razaoSocialActionPerformed(evt);
            }
        });

        cnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnpjActionPerformed(evt);
            }
        });

        rua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruaActionPerformed(evt);
            }
        });

        numero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroActionPerformed(evt);
            }
        });

        bairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bairroActionPerformed(evt);
            }
        });

        jLabel5.setText("Rua");

        jLabel6.setText("Número");

        jLabel7.setText("Complemento");

        jLabel8.setText("Bairro");

        jLabel9.setText("Município");

        jLabel10.setText("UF");

        jLabel11.setText("CEP");

        jLabel12.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel12.setText("Informações de endereço");
        jLabel12.setEnabled(false);

        jLabel14.setText("Nome");

        jLabel15.setText("CPF");

        jLabel16.setText("Telefone");

        jLabel17.setText("E-mail");

        ok.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel18.setText("Informações de contato");
        jLabel18.setEnabled(false);

        responsAcompTestes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                responsAcompTestesActionPerformed(evt);
            }
        });

        jLabel19.setText("Responsável pelo acompanhamento dos testes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(170, 170, 170)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(115, 115, 115)
                                                .addComponent(jLabel1)
                                                .addGap(153, 153, 153)
                                                .addComponent(jLabel2)
                                                .addGap(183, 183, 183)
                                                .addComponent(jLabel3))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(75, 75, 75)
                                                .addComponent(razaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53)
                                                .addComponent(cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(84, 84, 84)
                                                .addComponent(ie, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(284, 284, 284)
                                                .addComponent(jLabel12))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addComponent(jLabel5)
                                                .addGap(88, 88, 88)
                                                .addComponent(jLabel6)
                                                .addGap(66, 66, 66)
                                                .addComponent(jLabel7)
                                                .addGap(66, 66, 66)
                                                .addComponent(jLabel8)
                                                .addGap(60, 60, 60)
                                                .addComponent(jLabel9)
                                                .addGap(69, 69, 69)
                                                .addComponent(jLabel10)
                                                .addGap(61, 61, 61)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(41, 41, 41)
                                                .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(complemento, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(6, 6, 6)
                                                .addComponent(municipio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(290, 290, 290)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(jLabel14)
                                                .addGap(140, 140, 140)
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(146, 146, 146)
                                                .addComponent(jLabel16)
                                                .addGap(152, 152, 152)
                                                .addComponent(jLabel17))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(49, 49, 49)
                                                .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(73, 73, 73)
                                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(251, 251, 251)
                                                .addComponent(jLabel19))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(212, 212, 212)
                                                .addComponent(responsAcompTestes, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(301, 301, 301)
                                                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(razaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(ie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(39, 39, 39)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel16)
                                        .addComponent(jLabel17))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addComponent(jLabel19)
                                .addGap(12, 12, 12)
                                .addComponent(responsAcompTestes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void razaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_razaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_razaoSocialActionPerformed

    private void cnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnpjActionPerformed

    private void ruaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ruaActionPerformed

    private void numeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroActionPerformed

    private void bairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bairroActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed

        if ("".equals(razaoSocial.getText()) || "".equals(cnpj.getText()) || "".equals(ie.getText())
                || "".equals(rua.getText()) || "".equals(numero.getText()) || "".equals(complemento.getText())
                || "".equals(bairro.getText()) || "".equals(municipio.getText()) || "".equals(uf.getText())
                || "".equals(cep.getText()) || "".equals(nome.getText()) || "".equals(cpf.getText())
                || "".equals(telefone.getText()) || "".equals(email.getText()) || "".equals(responsAcompTestes.getText())) {
            JOptionPane.showMessageDialog(null, "EXISTE(M) CAMPO(S) EM BRANCO(S)!", "Aviso de erro!!!", JOptionPane.PLAIN_MESSAGE);
        } else {

            razaoSocialt = CorretorOrtografico.corretor(razaoSocial.getText());


            cnpjt = CorretorOrtografico.corretor(cnpj.getText());

            String correto;

            correto = CorretorOrtografico.corretor(razaoSocial.getText());
            XML.setRazao(correto);

            correto = CorretorOrtografico.corretor(cnpj.getText());
            XML.setCnpj(correto);

            correto = CorretorOrtografico.corretor(ie.getText());
            XML.setIe(correto);

            correto = CorretorOrtografico.corretor(rua.getText());
            XML.setRua(correto);

            correto = CorretorOrtografico.corretor(numero.getText());
            XML.setNumero(correto);

            correto = CorretorOrtografico.corretor(complemento.getText());
            XML.setComplemento(correto);

            correto = CorretorOrtografico.corretor(bairro.getText());
            XML.setBairro(correto);

            correto = CorretorOrtografico.corretor(municipio.getText());
            XML.setMunicipio(correto);

            correto = CorretorOrtografico.corretor(uf.getText());
            XML.setUf(correto);

            correto = CorretorOrtografico.corretor(cep.getText());
            XML.setCep(correto);

            correto = CorretorOrtografico.corretor(nome.getText());
            XML.setNome(correto);

            correto = CorretorOrtografico.corretor(cpf.getText());
            XML.setCpf(correto);

            correto = CorretorOrtografico.corretor(telefone.getText());
            XML.setTelefone(correto);

            correto = CorretorOrtografico.corretor(email.getText());
            XML.setEmail(correto);

            correto = CorretorOrtografico.corretor(responsAcompTestes.getText());
            XML.setResponsAcompTestes(correto);

            B_EmpresaDesenvolvedora.setFlag(true);
            dispose();
        }

    }//GEN-LAST:event_okActionPerformed

    private void responsAcompTestesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_responsAcompTestesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_responsAcompTestesActionPerformed

    public static void setFlag(boolean flag) {
        B_EmpresaDesenvolvedora.flag = flag;
    }

    public static boolean getFlag() {
        return B_EmpresaDesenvolvedora.flag == true;
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
            java.util.logging.Logger.getLogger(B_EmpresaDesenvolvedora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(B_EmpresaDesenvolvedora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(B_EmpresaDesenvolvedora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(B_EmpresaDesenvolvedora.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new B_EmpresaDesenvolvedora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairro;
    private javax.swing.JTextField cep;
    private javax.swing.JTextField cnpj;
    private javax.swing.JTextField complemento;
    private javax.swing.JTextField cpf;
    private javax.swing.JTextField email;
    private javax.swing.JTextField ie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField municipio;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField numero;
    private javax.swing.JButton ok;
    private javax.swing.JTextField razaoSocial;
    private javax.swing.JTextField responsAcompTestes;
    private javax.swing.JTextField rua;
    private javax.swing.JTextField telefone;
    private javax.swing.JTextField uf;
    // End of variables declaration//GEN-END:variables
}