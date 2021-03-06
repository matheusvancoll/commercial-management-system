package View;
public class ViewVendas extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewVendas
     */
    public ViewVendas() {
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

        PainelConsultaVendas = new javax.swing.JPanel();
        txtPesquisarVendas = new javax.swing.JTextField();
        btnPesquisarVenda = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        ListVendas = new javax.swing.JScrollPane();
        TabelaProdutos = new javax.swing.JTable();
        btnNovaVenda = new javax.swing.JButton();
        btnAlterarVenda = new javax.swing.JButton();
        btnExcluirVenda = new javax.swing.JButton();
        btnDetalhesVenda = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PainelDetalhesVenda = new javax.swing.JPanel();
        btnOcutarInfo = new javax.swing.JButton();
        ListCarrinho = new javax.swing.JScrollPane();
        TabelaCarrinho = new javax.swing.JTable();

        PainelConsultaVendas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPesquisarVendas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarVendasKeyPressed(evt);
            }
        });

        btnPesquisarVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPesquisarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search.gif"))); // NOI18N
        btnPesquisarVenda.setText("Pesquisar");
        btnPesquisarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarVendaActionPerformed(evt);
            }
        });

        lblInfo.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        lblInfo.setText("<html>*Nome ou Código do produto</html>");

        TabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cliente", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaProdutos.getTableHeader().setReorderingAllowed(false);
        TabelaProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaProdutosMouseClicked(evt);
            }
        });
        ListVendas.setViewportView(TabelaProdutos);

        btnNovaVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNovaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/package_add.gif"))); // NOI18N
        btnNovaVenda.setText("Novo");
        btnNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaVendaActionPerformed(evt);
            }
        });

        btnAlterarVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAlterarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/package_edit.gif"))); // NOI18N
        btnAlterarVenda.setText("Alterar");
        btnAlterarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarVendaActionPerformed(evt);
            }
        });

        btnExcluirVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExcluirVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/package_remove.gif"))); // NOI18N
        btnExcluirVenda.setText("Excluir");
        btnExcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirVendaActionPerformed(evt);
            }
        });

        btnDetalhesVenda.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDetalhesVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/theme.gif"))); // NOI18N
        btnDetalhesVenda.setText("Detalhes");
        btnDetalhesVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesVendaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Gerenciamento de Vendas");

        javax.swing.GroupLayout PainelConsultaVendasLayout = new javax.swing.GroupLayout(PainelConsultaVendas);
        PainelConsultaVendas.setLayout(PainelConsultaVendasLayout);
        PainelConsultaVendasLayout.setHorizontalGroup(
            PainelConsultaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelConsultaVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelConsultaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PainelConsultaVendasLayout.createSequentialGroup()
                        .addComponent(btnNovaVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(btnDetalhesVenda))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPesquisarVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelConsultaVendasLayout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(btnPesquisarVenda))
                    .addComponent(ListVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PainelConsultaVendasLayout.setVerticalGroup(
            PainelConsultaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelConsultaVendasLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelConsultaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarVenda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ListVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelConsultaVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirVenda)
                    .addComponent(btnDetalhesVenda)
                    .addComponent(btnNovaVenda)
                    .addComponent(btnAlterarVenda))
                .addContainerGap())
        );

        PainelDetalhesVenda.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnOcutarInfo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnOcutarInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/symbol_no.gif"))); // NOI18N
        btnOcutarInfo.setText("Ocultar");
        btnOcutarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcutarInfoActionPerformed(evt);
            }
        });

        TabelaCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Nome", "Valor unidade", "Quantidade", "Valor total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ListCarrinho.setViewportView(TabelaCarrinho);

        javax.swing.GroupLayout PainelDetalhesVendaLayout = new javax.swing.GroupLayout(PainelDetalhesVenda);
        PainelDetalhesVenda.setLayout(PainelDetalhesVendaLayout);
        PainelDetalhesVendaLayout.setHorizontalGroup(
            PainelDetalhesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDetalhesVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelDetalhesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ListCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                    .addGroup(PainelDetalhesVendaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnOcutarInfo)))
                .addContainerGap())
        );
        PainelDetalhesVendaLayout.setVerticalGroup(
            PainelDetalhesVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDetalhesVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ListCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOcutarInfo)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelConsultaVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PainelDetalhesVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelConsultaVendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelDetalhesVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarVendasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarVendasKeyPressed
        //if(evt.getKeyCode() == KeyEvent.VK_ENTER){ 
        //}
    }//GEN-LAST:event_txtPesquisarVendasKeyPressed

    private void btnPesquisarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarVendaActionPerformed
        //huehue
    }//GEN-LAST:event_btnPesquisarVendaActionPerformed

    private void TabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProdutosMouseClicked
        //huehue
    }//GEN-LAST:event_TabelaProdutosMouseClicked

    private void btnNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaVendaActionPerformed
        //huehue
    }//GEN-LAST:event_btnNovaVendaActionPerformed

    private void btnAlterarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarVendaActionPerformed
        //huehue
    }//GEN-LAST:event_btnAlterarVendaActionPerformed

    private void btnExcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirVendaActionPerformed
        //if((JOptionPane.showConfirmDialog(null,
          //  "Realmente dejesa excluir o registro?", "Confirmação", JOptionPane.YES_NO_OPTION,
           // JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)){
    //ExcluirProduto();
    //}
    }//GEN-LAST:event_btnExcluirVendaActionPerformed

    private void btnDetalhesVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesVendaActionPerformed
        PainelDetalhesVenda.setVisible(true);
    }//GEN-LAST:event_btnDetalhesVendaActionPerformed

    private void btnOcutarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcutarInfoActionPerformed
        PainelDetalhesVenda.setVisible(false);
    }//GEN-LAST:event_btnOcutarInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ListCarrinho;
    private javax.swing.JScrollPane ListVendas;
    private javax.swing.JPanel PainelConsultaVendas;
    private javax.swing.JPanel PainelDetalhesVenda;
    private javax.swing.JTable TabelaCarrinho;
    private javax.swing.JTable TabelaProdutos;
    private javax.swing.JButton btnAlterarVenda;
    private javax.swing.JButton btnDetalhesVenda;
    private javax.swing.JButton btnExcluirVenda;
    private javax.swing.JButton btnNovaVenda;
    private javax.swing.JButton btnOcutarInfo;
    private javax.swing.JButton btnPesquisarVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JTextField txtPesquisarVendas;
    // End of variables declaration//GEN-END:variables
}
