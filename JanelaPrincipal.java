package pckavlautomoveis;


import javax.swing.JOptionPane;

public class JanelaPrincipal extends javax.swing.JFrame {
    private AVL avl = new AVL();
    
    public JanelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        txtPreco = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnAtravessa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        btnInserir = new javax.swing.JButton();
        txtKM = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALV de automóveis");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(131, 111, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 51));
        jPanel1.setFont(new java.awt.Font("Prestige Elite Std", 0, 11)); // NOI18N
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("KM: ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(270, 340, 120, 30);

        jLabel2.setFont(new java.awt.Font("Candara", 1, 48)); // NOI18N
        jLabel2.setText("AVL de automóveis");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(270, 10, 480, 60);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Marca:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 160, 120, 30);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Ano de Fab.:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 210, 120, 30);

        txtPlaca.setBackground(new java.awt.Color(204, 204, 204));
        txtPlaca.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtPlaca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPlaca);
        txtPlaca.setBounds(410, 110, 280, 30);

        txtMarca.setBackground(new java.awt.Color(204, 204, 204));
        txtMarca.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtMarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtMarca);
        txtMarca.setBounds(410, 160, 280, 30);

        txtAno.setBackground(new java.awt.Color(204, 204, 204));
        txtAno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtAno);
        txtAno.setBounds(410, 210, 280, 24);

        txtPreco.setBackground(new java.awt.Color(204, 204, 204));
        txtPreco.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtPreco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtPreco);
        txtPreco.setBounds(410, 260, 280, 30);

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        btnSair.setText("Sair");
        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair);
        btnSair.setBounds(760, 390, 90, 30);

        btnPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisar);
        btnPesquisar.setBounds(600, 390, 140, 30);

        btnRemover.setBackground(new java.awt.Color(255, 255, 255));
        btnRemover.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemover);
        btnRemover.setBounds(450, 390, 130, 30);

        btnAtravessa.setBackground(new java.awt.Color(255, 255, 255));
        btnAtravessa.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        btnAtravessa.setText("Atravessamentos");
        btnAtravessa.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAtravessa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtravessaActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtravessa);
        btnAtravessa.setBounds(230, 390, 200, 30);

        txtArea.setBackground(new java.awt.Color(204, 204, 204));
        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        txtArea.setForeground(new java.awt.Color(0, 0, 51));
        txtArea.setRows(5);
        txtArea.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(txtArea);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 450, 910, 370);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Placa: ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(270, 110, 120, 30);

        btnInserir.setBackground(new java.awt.Color(204, 204, 204));
        btnInserir.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });
        jPanel1.add(btnInserir);
        btnInserir.setBounds(90, 390, 120, 30);

        txtKM.setBackground(new java.awt.Color(204, 204, 204));
        txtKM.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtKM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKMActionPerformed(evt);
            }
        });
        jPanel1.add(txtKM);
        txtKM.setBounds(410, 340, 280, 30);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Preço:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(270, 260, 120, 30);

        txtModelo.setBackground(new java.awt.Color(204, 204, 204));
        txtModelo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtModelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });
        jPanel1.add(txtModelo);
        txtModelo.setBounds(410, 300, 280, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Modelo:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(270, 300, 120, 30);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 370, 10, 10);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 0, 1020, 870);

        setSize(new java.awt.Dimension(1033, 916));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModeloActionPerformed

    private void txtKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKMActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        String placa = txtPlaca.getText();
        String marca = txtMarca.getText();
        int ano = Integer.parseInt(txtAno.getText());
        float preco = Float.parseFloat(txtPreco.getText());
        String modelo = txtModelo.getText();
        int Km = Integer.parseInt(txtKM.getText());

        avl.insereAVL(new Automovel(placa, marca, ano, preco, modelo, Km));
        txtArea.setText("Automóvel inserido com sucesso!\n");
        txtPlaca.setText("");
        txtMarca.setText("");
        txtAno.setText("");
        txtPreco.setText("");
        txtModelo.setText("");
        txtKM.setText("");
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnAtravessaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtravessaActionPerformed
        txtArea.setText("");
        txtArea.setText("Em-ordem:\n"
            + avl.emOrdemString()
            + "\nPré-ordem:\n"
            + avl.preOrdemString()
            + "\nPós-ordem:\n"
            + avl.posOrdemString()
            + "\nEm nivel:\n"
            + avl.emNivelString() + "\n");
        txtPlaca.setText("");
        txtMarca.setText("");
        txtAno.setText("");
        txtPreco.setText("");
    }//GEN-LAST:event_btnAtravessaActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        Automovel au = new Automovel();
        au.setPlaca(txtPlaca.getText());
        if (!avl.removeAVL(au)) {
            txtArea.setText("O automóvel não foi eliminado.\nVerifique a placa digitada.");
        } else {
            txtArea.setText("O automóvel foi eliminado do cadastro.");
        }
        //txtPlaca.setText("");
        txtMarca.setText("");
        txtAno.setText("");
        txtPreco.setText("");
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        Automovel au = new Automovel(txtPlaca.getText(), "", 0, 0.0f, "",0);
        NoAVL nodo = avl.searchAVL(au);
        if (nodo == null) {
            txtArea.setText("O automóvel não foi encontrado.\nVerifique a placa digitada.");
        } else {
            txtArea.setText("Encontrado:\n" + nodo.getDado().toString());
        }
        //txtPlaca.setText("");
        txtMarca.setText("");
        txtAno.setText("");
        txtPreco.setText("");
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed
    
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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtravessa;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtKM;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}
