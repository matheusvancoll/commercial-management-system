package View;
import Model.ModelProdutos;
import Controller.ControllerProdutos;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
/**
 * @author Matheus
 */
public class ViewProdutos extends javax.swing.JInternalFrame {
    ArrayList<ModelProdutos> ListaDeProdutos = new ArrayList<>();
    ControllerProdutos ControleDeProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    String SaveOrChange;
    String VendaCliente;

    public String getVendaCliente() {
        return VendaCliente;
    }

    public void setVendaCliente(String VendaCliente) {
        this.VendaCliente = VendaCliente;
    }
    
    
    public ViewProdutos() {
        initComponents();
        MostrarListaDeProdutos();
        PainelDetalhesProduto.setVisible(false);
        HabilitarCampos(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelConsultaProduto = new javax.swing.JPanel();
        txtPesquisarProduto = new javax.swing.JTextField();
        btnPesquisarProduto = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        ListProdutos = new javax.swing.JScrollPane();
        TabelaProdutos = new javax.swing.JTable();
        btnNovoProduto = new javax.swing.JButton();
        btnAlterarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        btnDetalhesProduto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        PainelDetalhesProduto = new javax.swing.JPanel();
        lblValorOriginal = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblIdProduto = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblEstoque = new javax.swing.JLabel();
        lblDetalhes = new javax.swing.JLabel();
        lblBaseLucro = new javax.swing.JLabel();
        lblLucroReal = new javax.swing.JLabel();
        lblValorFinal = new javax.swing.JLabel();
        txtIdProduto = new javax.swing.JTextField();
        txtNomeProduto = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtEstoque = new javax.swing.JSpinner();
        txtValorOriginal = new javax.swing.JTextField();
        txtDetalhes = new javax.swing.JTextField();
        txtBaseLucro = new javax.swing.JSpinner();
        txtLucroReal = new javax.swing.JTextField();
        txtValorFinal = new javax.swing.JTextField();
        btnSalvarProduto = new javax.swing.JButton();
        btnOcutarInfo = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();

        setClosable(true);
        setForeground(java.awt.Color.lightGray);
        setTitle("Gerenciamento de Produtos");
        setToolTipText("");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        PainelConsultaProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtPesquisarProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarProdutoKeyPressed(evt);
            }
        });

        btnPesquisarProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPesquisarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/search.gif"))); // NOI18N
        btnPesquisarProduto.setText("Pesquisar");
        btnPesquisarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarProdutoActionPerformed(evt);
            }
        });

        lblInfo.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        lblInfo.setText("<html>*Nome ou Código do produto</html>");

        TabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Marca", "Valor", "Estoque", "Detalhes"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
        ListProdutos.setViewportView(TabelaProdutos);
        if (TabelaProdutos.getColumnModel().getColumnCount() > 0) {
            TabelaProdutos.getColumnModel().getColumn(0).setPreferredWidth(2);
            TabelaProdutos.getColumnModel().getColumn(1).setPreferredWidth(100);
            TabelaProdutos.getColumnModel().getColumn(2).setPreferredWidth(40);
            TabelaProdutos.getColumnModel().getColumn(3).setPreferredWidth(3);
            TabelaProdutos.getColumnModel().getColumn(4).setPreferredWidth(2);
        }

        btnNovoProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNovoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/package_add.gif"))); // NOI18N
        btnNovoProduto.setText("Novo");
        btnNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProdutoActionPerformed(evt);
            }
        });

        btnAlterarProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAlterarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/package_edit.gif"))); // NOI18N
        btnAlterarProduto.setText("Alterar");
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });

        btnExcluirProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/package_remove.gif"))); // NOI18N
        btnExcluirProduto.setText("Excluir");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        btnDetalhesProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDetalhesProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/theme.gif"))); // NOI18N
        btnDetalhesProduto.setText("Detalhes");
        btnDetalhesProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalhesProdutoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Gerenciamento de Produtos");

        javax.swing.GroupLayout PainelConsultaProdutoLayout = new javax.swing.GroupLayout(PainelConsultaProduto);
        PainelConsultaProduto.setLayout(PainelConsultaProdutoLayout);
        PainelConsultaProdutoLayout.setHorizontalGroup(
            PainelConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelConsultaProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelConsultaProdutoLayout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(btnPesquisarProduto)
                        .addGap(99, 99, 99))
                    .addGroup(PainelConsultaProdutoLayout.createSequentialGroup()
                        .addGroup(PainelConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ListProdutos)
                            .addGroup(PainelConsultaProdutoLayout.createSequentialGroup()
                                .addComponent(btnNovoProduto)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterarProduto)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluirProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDetalhesProduto))
                            .addGroup(PainelConsultaProdutoLayout.createSequentialGroup()
                                .addGroup(PainelConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        PainelConsultaProdutoLayout.setVerticalGroup(
            PainelConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelConsultaProdutoLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ListProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PainelConsultaProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirProduto)
                    .addComponent(btnDetalhesProduto)
                    .addComponent(btnNovoProduto)
                    .addComponent(btnAlterarProduto))
                .addContainerGap())
        );

        PainelDetalhesProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblValorOriginal.setFont(new java.awt.Font("Verdana", 1, 8)); // NOI18N
        lblValorOriginal.setText("Valor Original");

        lblNome.setFont(new java.awt.Font("Verdana", 1, 8)); // NOI18N
        lblNome.setText("Nome do produto");

        lblIdProduto.setFont(new java.awt.Font("Verdana", 1, 8)); // NOI18N
        lblIdProduto.setText("ID do produto");

        lblMarca.setFont(new java.awt.Font("Verdana", 1, 8)); // NOI18N
        lblMarca.setText("Marca");

        lblEstoque.setFont(new java.awt.Font("Verdana", 1, 8)); // NOI18N
        lblEstoque.setText("Unidades");

        lblDetalhes.setFont(new java.awt.Font("Verdana", 1, 8)); // NOI18N
        lblDetalhes.setText("Detalhes");

        lblBaseLucro.setFont(new java.awt.Font("Verdana", 1, 8)); // NOI18N
        lblBaseLucro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBaseLucro.setText("Base Lucro %");

        lblLucroReal.setFont(new java.awt.Font("Verdana", 1, 8)); // NOI18N
        lblLucroReal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLucroReal.setText("Lucro Real R$");

        lblValorFinal.setFont(new java.awt.Font("Verdana", 1, 8)); // NOI18N
        lblValorFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValorFinal.setText("Valor Final");

        txtIdProduto.setEditable(false);

        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });

        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        txtEstoque.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        txtValorOriginal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDetalhesActionPerformed(evt);
            }
        });

        txtBaseLucro.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        txtBaseLucro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtBaseLucro.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                txtBaseLucroStateChanged(evt);
            }
        });

        txtLucroReal.setEditable(false);
        txtLucroReal.setForeground(java.awt.Color.red);
        txtLucroReal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txtValorFinal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtValorFinal.setText("0");

        btnSalvarProduto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSalvarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/symbol_check.gif"))); // NOI18N
        btnSalvarProduto.setText("Gravar");
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });

        btnOcutarInfo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnOcutarInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/symbol_no.gif"))); // NOI18N
        btnOcutarInfo.setText("Ocultar");
        btnOcutarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcutarInfoActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/stamp.gif"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelDetalhesProdutoLayout = new javax.swing.GroupLayout(PainelDetalhesProduto);
        PainelDetalhesProduto.setLayout(PainelDetalhesProdutoLayout);
        PainelDetalhesProdutoLayout.setHorizontalGroup(
            PainelDetalhesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDetalhesProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelDetalhesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelDetalhesProdutoLayout.createSequentialGroup()
                        .addGroup(PainelDetalhesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelDetalhesProdutoLayout.createSequentialGroup()
                                .addComponent(lblMarca)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtMarca))
                        .addGap(18, 18, 18)
                        .addGroup(PainelDetalhesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstoque)
                            .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelDetalhesProdutoLayout.createSequentialGroup()
                        .addGroup(PainelDetalhesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdProduto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelDetalhesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelDetalhesProdutoLayout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(168, 220, Short.MAX_VALUE))
                            .addComponent(txtNomeProduto)))
                    .addGroup(PainelDetalhesProdutoLayout.createSequentialGroup()
                        .addGroup(PainelDetalhesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValorOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PainelDetalhesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBaseLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBaseLucro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PainelDetalhesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLucroReal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLucroReal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PainelDetalhesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblValorFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelDetalhesProdutoLayout.createSequentialGroup()
                        .addComponent(btnSalvarProduto)
                        .addGap(58, 58, 58)
                        .addComponent(btnLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOcutarInfo))
                    .addComponent(txtDetalhes)
                    .addGroup(PainelDetalhesProdutoLayout.createSequentialGroup()
                        .addComponent(lblDetalhes)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PainelDetalhesProdutoLayout.setVerticalGroup(
            PainelDetalhesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelDetalhesProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PainelDetalhesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelDetalhesProdutoLayout.createSequentialGroup()
                        .addGroup(PainelDetalhesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelDetalhesProdutoLayout.createSequentialGroup()
                                .addComponent(lblIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblNome)
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblMarca)
                        .addGap(1, 1, 1)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelDetalhesProdutoLayout.createSequentialGroup()
                        .addComponent(lblEstoque)
                        .addGap(1, 1, 1)
                        .addComponent(txtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PainelDetalhesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelDetalhesProdutoLayout.createSequentialGroup()
                        .addComponent(lblValorOriginal)
                        .addGap(1, 1, 1)
                        .addComponent(txtValorOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelDetalhesProdutoLayout.createSequentialGroup()
                        .addComponent(lblValorFinal)
                        .addGap(2, 2, 2)
                        .addComponent(txtValorFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PainelDetalhesProdutoLayout.createSequentialGroup()
                        .addComponent(lblLucroReal)
                        .addGap(2, 2, 2)
                        .addComponent(txtLucroReal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelDetalhesProdutoLayout.createSequentialGroup()
                        .addComponent(lblBaseLucro)
                        .addGap(1, 1, 1)
                        .addComponent(txtBaseLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblDetalhes)
                .addGap(1, 1, 1)
                .addComponent(txtDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addGroup(PainelDetalhesProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarProduto)
                    .addComponent(btnOcutarInfo)
                    .addComponent(btnLimpar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelConsultaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(PainelDetalhesProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PainelConsultaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelDetalhesProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void btnOcutarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcutarInfoActionPerformed
        PainelDetalhesProduto.setVisible(false);
        HabilitarCampos(false);
        LimparCampos();
    }//GEN-LAST:event_btnOcutarInfoActionPerformed

    private void btnPesquisarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarProdutoActionPerformed
        PesquisarProduto();
    }//GEN-LAST:event_btnPesquisarProdutoActionPerformed

    private void btnNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProdutoActionPerformed
        SaveOrChange = "save";
        PainelDetalhesProduto.setVisible(true);
        LimparCampos();
        HabilitarCampos(true);
    }//GEN-LAST:event_btnNovoProdutoActionPerformed

    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
        if(SaveOrChange.equals("save")){
            SalvarProtudo();
            MostrarListaDeProdutos();
        }else if (SaveOrChange.equals("change")){
            AlterarProduto();
            MostrarListaDeProdutos();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao Realizar operação!");
        }
    }//GEN-LAST:event_btnSalvarProdutoActionPerformed

    private void btnDetalhesProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalhesProdutoActionPerformed
        PainelDetalhesProduto.setVisible(true);
        HabilitarCampos(false);
        MostrarInfoProdutos();
    }//GEN-LAST:event_btnDetalhesProdutoActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        if((JOptionPane.showConfirmDialog(null, 
                "Realmente dejesa excluir o registro?", "Confirmação", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)){
        ExcluirProduto();
        }
        LimparCampos();
        HabilitarCampos(false);
        MostrarListaDeProdutos();
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    private void txtBaseLucroStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_txtBaseLucroStateChanged
        CalcularLucro();
    }//GEN-LAST:event_txtBaseLucroStateChanged

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed
        SaveOrChange = "change";
        PainelDetalhesProduto.setVisible(true);
        LimparCampos();
        MostrarInfoProdutos();
        HabilitarCampos(true);
    }//GEN-LAST:event_btnAlterarProdutoActionPerformed

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void TabelaProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaProdutosMouseClicked
        MostrarInfoProdutos();
    }//GEN-LAST:event_TabelaProdutosMouseClicked

    private void txtPesquisarProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarProdutoKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            PesquisarProduto();
        }
    }//GEN-LAST:event_txtPesquisarProdutoKeyPressed

    private void txtDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDetalhesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDetalhesActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ListProdutos;
    private javax.swing.JPanel PainelConsultaProduto;
    private javax.swing.JPanel PainelDetalhesProduto;
    private javax.swing.JTable TabelaProdutos;
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnDetalhesProduto;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNovoProduto;
    private javax.swing.JButton btnOcutarInfo;
    private javax.swing.JButton btnPesquisarProduto;
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBaseLucro;
    private javax.swing.JLabel lblDetalhes;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JLabel lblIdProduto;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLucroReal;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblValorFinal;
    private javax.swing.JLabel lblValorOriginal;
    private javax.swing.JSpinner txtBaseLucro;
    private javax.swing.JTextField txtDetalhes;
    private javax.swing.JSpinner txtEstoque;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtLucroReal;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPesquisarProduto;
    private javax.swing.JTextField txtValorFinal;
    private javax.swing.JTextField txtValorOriginal;
    // End of variables declaration//GEN-END:variables

    
    
    
    //Métodos usados
    private void SalvarProtudo(){
        modelProdutos.setNomeProduto(this.txtNomeProduto.getText());
        modelProdutos.setMarcaProduto(this.txtMarca.getText());
        modelProdutos.setValorProduto(Double.parseDouble(this.txtValorFinal.getText()));
        modelProdutos.setEstoqueProduto(Integer.parseInt(this.txtEstoque.getValue().toString()));
        modelProdutos.setDetalhesProduto(this.txtDetalhes.getText());
        if(ControleDeProdutos.SalvarProdutoController(modelProdutos)>0){
            JOptionPane.showMessageDialog(this, "Produto Cadastrado com Sucesso!");
            LimparCampos();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao Cadastrar protudo! :(");
        }

    }
    
    private void ExcluirProduto(){
        int idProduto = (int) TabelaProdutos.getValueAt(TabelaProdutos.getSelectedRow(), 0);
        if(ControleDeProdutos.ExcluirProdutoController(idProduto)){
            JOptionPane.showMessageDialog(this, "Produto removido com sucesso!");
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao remover produto! :(");
        }
    }
    
    private void AlterarProduto(){
        modelProdutos.setNomeProduto(this.txtNomeProduto.getText());
        modelProdutos.setMarcaProduto(this.txtMarca.getText());
        modelProdutos.setValorProduto(Double.parseDouble(this.txtValorFinal.getText()));
        modelProdutos.setEstoqueProduto(Integer.parseInt(this.txtEstoque.getValue().toString()));
        modelProdutos.setDetalhesProduto(this.txtDetalhes.getText());
        if(ControleDeProdutos.AlterarProdutoController(modelProdutos)){
            JOptionPane.showMessageDialog(this, "Dados do produto alterados com Sucesso!");
            LimparCampos();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao alterar dados do protudo! :(");
        }
    }
    
    //Exibe as informações do produto
    private void MostrarInfoProdutos(){
        try {
            int pIdProduto = (int) TabelaProdutos.getValueAt(TabelaProdutos.getSelectedRow(), 0);
            modelProdutos = ControleDeProdutos.PesquisaProdutoController(pIdProduto);
            this.txtIdProduto.setText(String.valueOf(modelProdutos.getIdProduto()));
            this.txtNomeProduto.setText(modelProdutos.getNomeProduto());
            this.txtMarca.setText(modelProdutos.getMarcaProduto());
            this.txtEstoque.setValue(modelProdutos.getEstoqueProduto());
            this.txtValorFinal.setText(String.valueOf(modelProdutos.getValorProduto()));
            this.txtDetalhes.setText(modelProdutos.getDetalhesProduto());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Nenhum produto foi selecionado!");
            
        }
    }
    
    //Filtra os produtos de acordo com o campo de texto
    protected void PesquisarProduto(){
        DefaultTableModel Tabela = (DefaultTableModel) TabelaProdutos.getModel();
        final TableRowSorter<DefaultTableModel> Pesquisa = new TableRowSorter<>(Tabela);
        this.TabelaProdutos.setRowSorter(Pesquisa);
        String filtro = txtPesquisarProduto.getText();
        Pesquisa.setRowFilter(RowFilter.regexFilter(filtro, 0,1));
    }
    
    private void LimparCampos(){
        txtIdProduto.setText("");
        txtNomeProduto.setText("");
        txtMarca.setText("");
        txtEstoque.setValue(1);
        txtValorOriginal.setText("0");
        txtDetalhes.setText("");
        txtBaseLucro.setValue(0);
    }
    
    private void HabilitarCampos(boolean VF){
        txtNomeProduto.setEditable(VF);
        txtMarca.setEditable(VF);
        txtEstoque.setEnabled(VF);
        txtValorOriginal.setEditable(VF);
        txtBaseLucro.setEnabled(VF);
        txtValorFinal.setEditable(VF);
        txtDetalhes.setEditable(VF);
    }
    
    private void CalcularLucro(){
        //Cálculo do VALOR FINAL do produto
        double valorOriginal = Double.parseDouble(txtValorOriginal.getText());
        double baseLucro = Double.parseDouble(String.valueOf(txtBaseLucro.getValue()));
        double valorFinal = valorOriginal + ((valorOriginal/100)*baseLucro);
        txtValorFinal.setText(String.valueOf(valorFinal));
        
        //Calculo de LUCRO
        double lucroFinal = (valorFinal - valorOriginal);
        txtLucroReal.setText("R$ " + lucroFinal);
    }
    
    //Mostra todos os produtos salvos no DB
    protected void MostrarListaDeProdutos(){
        ListaDeProdutos = ControleDeProdutos.ListaProdutosController();
        DefaultTableModel Tabela = (DefaultTableModel) TabelaProdutos.getModel();
        Tabela.setNumRows(0);
        
        for (int i = 0; i < ListaDeProdutos.size(); i++) {
            Tabela.insertRow(i, new Object[]{
                ListaDeProdutos.get(i).getIdProduto(),
                ListaDeProdutos.get(i).getNomeProduto(),
                ListaDeProdutos.get(i).getMarcaProduto(),
                ListaDeProdutos.get(i).getValorProduto(),
                ListaDeProdutos.get(i).getEstoqueProduto(),
                ListaDeProdutos.get(i).getDetalhesProduto()
            });
        }
    }  
        
    //Centraliza a tela
    public void Centralizar() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
}