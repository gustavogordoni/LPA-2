package br.com.projeto_locadora.view;


/**
 * Importando as classes necessárias para trabalhar nesta classe
 */
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import br.com.projeto_locadora.dto.CarroDTO;
import br.com.projeto_locadora.ctr.CarroCTR;
/**
 * Essa classe contém os métodos para inserir, alterar, consultar e excluir
 * carro
 * Disciplina de LPA - Integrado IFSP
 *
 * @author Andre Luis Gobbi Primo/Marcelo Luis Murari
 * @version 2.0
 */
public class CarroVIEW extends javax.swing.JInternalFrame {     
    CarroDTO carroDTO = new CarroDTO(); //Cria um objeto carroDTO
    CarroCTR carroCTR = new CarroCTR(); //Cria um objeto carrorCTR
    
    ResultSet rs; //Variavel usada para preenchimeto da tabela e dos campos
    int gravar_alterar; //Variavel usada para saber se esta alterando o incluindo
    DefaultTableModel modelo_jtl_consultar_car; //Variavel para guardar o modelo da tabela
 
    
    /**
     * Método construtor da Classe
     */
    public CarroVIEW() {
        initComponents();
        this.setSize(768, 465);
        //Chama todos os métodos liberaCampos
        liberaCampos(false);
        //Chama o método liberaBotoes
        liberaBotoes(true, false, false, false, true);
        //Atribui um modelo para manipular a tabela 
        modelo_jtl_consultar_car = (DefaultTableModel) jtl_consultar_car.getModel();

    }

    
    /**
     * Método para centralizar o internalFrame.
     */
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }//Fecha método setPosicao()
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pla_car = new javax.swing.JTextField();
        mar_car = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        des_car = new javax.swing.JTextArea();
        ano_car = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pesquisa_mar_car = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtl_consultar_car = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setTitle("Cadastro de Carros");
        setMaximumSize(new java.awt.Dimension(1000000000, 2147483647));
        setPreferredSize(new java.awt.Dimension(790, 430));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Carro");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Placa:");
        jLabel2.setMaximumSize(new java.awt.Dimension(49, 14));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Marca:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Descrição:");
        jLabel6.setMaximumSize(new java.awt.Dimension(49, 14));

        jLabel9.setText("Ano:");

        pla_car.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pla_carKeyPressed(evt);
            }
        });

        mar_car.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mar_carKeyPressed(evt);
            }
        });

        des_car.setColumns(20);
        des_car.setRows(5);
        des_car.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                des_carKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(des_car);

        try {
            ano_car.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(mar_car))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pla_car, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ano_car, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pla_car, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(ano_car, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mar_car, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Marca:");
        jLabel11.setMaximumSize(new java.awt.Dimension(49, 14));

        btnPesquisar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto_locadora/view/imagens/pesquisar.png"))); // NOI18N
        btnPesquisar.setAlignmentY(0.0F);
        btnPesquisar.setBorder(null);
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPesquisar.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        btnPesquisar.setMaximumSize(new java.awt.Dimension(113, 35));
        btnPesquisar.setMinimumSize(new java.awt.Dimension(113, 35));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        jtl_consultar_car.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtl_consultar_car.getTableHeader().setReorderingAllowed(false);
        jtl_consultar_car.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtl_consultar_carMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtl_consultar_car);
        if (jtl_consultar_car.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_car.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_car.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtl_consultar_car.getColumnModel().getColumn(1).setResizable(false);
            jtl_consultar_car.getColumnModel().getColumn(1).setPreferredWidth(140);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisa_mar_car, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pesquisa_mar_car, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnCancelar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto_locadora/view/imagens/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setAlignmentY(0.0F);
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnNovo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto_locadora/view/imagens/novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setAlignmentY(0.0F);
        btnNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNovo.setMaximumSize(new java.awt.Dimension(113, 35));
        btnNovo.setMinimumSize(new java.awt.Dimension(113, 35));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto_locadora/view/imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setAlignmentY(0.0F);
        btnSalvar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSalvar.setMaximumSize(new java.awt.Dimension(113, 35));
        btnSalvar.setMinimumSize(new java.awt.Dimension(113, 35));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto_locadora/view/imagens/excluir.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setAlignmentY(0.0F);
        btnExcluir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExcluir.setMaximumSize(new java.awt.Dimension(113, 35));
        btnExcluir.setMinimumSize(new java.awt.Dimension(113, 35));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto_locadora/view/imagens/sair.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setAlignmentY(0.0F);
        btnSair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSair.setMaximumSize(new java.awt.Dimension(113, 35));
        btnSair.setMinimumSize(new java.awt.Dimension(113, 35));
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 274, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Método para executar os comandos quando o botão btnCancelar for clicado.
     * @param evt evento de clique no botão.
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCampos();
        liberaCampos(false);
        modelo_jtl_consultar_car.setNumRows(0);
        liberaBotoes(true, false, false, false, true);
        gravar_alterar=0;
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    /**
     * Método para executar os comandos quando o botão btnNovo for clicado.
     * @param evt evento de clique no botão.
     */
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        liberaCampos(true);
        liberaBotoes(false, true, true, false, true);
        gravar_alterar = 1;
    }//GEN-LAST:event_btnNovoActionPerformed

    
    /**
     * Método para executar os comandos quando o botão btnSalvar for clicado.
     * @param evt evento de clique no botão.
     */
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(verificaPreenchimentoGeral()){
            if(gravar_alterar==1){
                gravar();
                gravar_alterar=0;
            }
            else{
                if(gravar_alterar==2){
                    alterar();
                    preencheTabela(pesquisa_mar_car.getText().toUpperCase());
                    gravar_alterar=0;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro no Sistema!!!");
                }
            }
            limpaCampos();
            liberaCampos(false);
            liberaBotoes(true, false, false, false, true);
        }    
    }//GEN-LAST:event_btnSalvarActionPerformed

    
    /**
     * Método para executar os comandos quando o botão btnExcluir for clicado.
     * @param evt evento de clique no botão.
     */
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        excluir();
        limpaCampos();
        liberaCampos(false);
        liberaBotoes(true, false, false, false, true);
        preencheTabela(pesquisa_mar_car.getText().toUpperCase());
    }//GEN-LAST:event_btnExcluirActionPerformed

    
    /**
     * Método para executar os comandos quando o botão btnSair for clicado.
     * @param evt evento de clique no botão.
     */
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    
    /**
     * Método para executar os comandos quando o jtl_consultar_es for clicado.
     * @param evt evento de clique no jtl_consultar_pes.
     */
    private void jtl_consultar_carMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtl_consultar_carMouseClicked
        //Pega a Pessoa selecionada e chama preencheCampos
        preencheCampos(Integer.parseInt(String.valueOf(jtl_consultar_car.getValueAt(jtl_consultar_car.getSelectedRow(), 0))));
        liberaBotoes(false, true, true, true, true);
    }//GEN-LAST:event_jtl_consultar_carMouseClicked

    
    /**
     * Método para executar os comandos quando o botão btnPesquisar for clicado.
     * @param evt evento de clique no botão.
     */
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        preencheTabela(pesquisa_mar_car.getText().toUpperCase());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    
    /**
     * Método para verificar o tamanho máximo do campo, a cada tecla digitada,
     * chama o método verificaTamanho passando o campo pla_car e o tamanho máximo 
     * de caractéres para ser validado.
     * @param evt evento de tecla pressionada.
     */
    private void pla_carKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pla_carKeyPressed
        verificaTamanho(pla_car, 8);
    }//GEN-LAST:event_pla_carKeyPressed
	
	
    /**
     * Método para verificar o tamanho máximo do campo, a cada tecla digitada,
     * chama o método verificaTamanho passando o campo mar_car e o tamanho máximo 
     * de caractéres para ser validado.
     * @param evt evento de tecla pressionada.
     */
    private void mar_carKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mar_carKeyPressed
        verificaTamanho(mar_car, 30);
    }//GEN-LAST:event_mar_carKeyPressed

    
    /**
     * Método para verificar o tamanho máximo do campo, a cada tecla digitada,
     * chama o método verificaTamanho passando o campo des_car e o tamanho máximo 
     * de caractéres para ser validado.
     * @param evt evento de tecla pressionada.
     */
    private void des_carKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_des_carKeyPressed
        verificaTamanho(des_car, 200);
    }//GEN-LAST:event_des_carKeyPressed
	
   
    
    /**
     * Método utilizado para gravar os dados do carro.
     */
    private void gravar(){
        try{
            carroDTO.setPla_car(pla_car.getText());
            
            carroDTO.setAno_car(Integer.parseInt(ano_car.getText()));
            carroDTO.setMar_car(mar_car.getText());
            carroDTO.setDes_car(des_car.getText());
            
            JOptionPane.showMessageDialog(null,
                    carroCTR.inserirCarro(carroDTO)
            );
        }
        catch(Exception e){
            System.out.println("Erro ao Gravar" + e.getMessage());
        }
    }//Fecha método gravar()
    
    
    /**
     * Método utilizado para excluir os dados do carro.
     */
    private void excluir(){
       if(JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir o Carro?","Aviso", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,
                    carroCTR.excluirCarro(carroDTO)
            );
       }
    }//Fecha método excluir()
    
    
    /**
     * Método utilizado para alterar os dados do carro.
     */
    private void alterar(){
        try{
            carroDTO.setPla_car(pla_car.getText());
            carroDTO.setAno_car(Integer.parseInt(ano_car.getText()));
            carroDTO.setMar_car(mar_car.getText());
            carroDTO.setDes_car(des_car.getText());
     
            JOptionPane.showMessageDialog(null,
                    carroCTR.alterarCarro(carroDTO)
            );
        }
        catch(Exception e){}
    }//Fecha método alterar()
    
    
    /**
     * Método utilizado para preencher/contruir a Jtable.
     * @param mar_car, String com a marca do carro
     */
    private void preencheTabela(String mar_car){
        try{
            //Limpa todas as linhas
            modelo_jtl_consultar_car.setNumRows(0);

            //Enquanto tiver linhas - faça
            carroDTO.setMar_car(mar_car);
            rs = carroCTR.consultarCarro(carroDTO, 1); //1 = é a pesquisa por marca na classe DAO
            while(rs.next()){
                modelo_jtl_consultar_car.addRow(new Object[]{
                  rs.getString("id_car"),
                  rs.getString("mar_car"),
                });
            }        
        }
        catch(Exception erTab){
            System.out.println("Erro SQL: "+erTab);
        }  
    }//Fecha método preencheTabela(String mar_car)
    
    
    /**
     * Método utilizado para preencher os campos da tela com 
     * valores do carro.
     * @param id_car, int com o id do carro.
     */
    private void preencheCampos(int id_car){
        try{
            carroDTO.setId_car(id_car);
            rs = carroCTR.consultarCarro(carroDTO, 2); //2 = é a pesquisa no id na classe DAO
            if(rs.next()){
                limpaCampos();
                
                pla_car.setText(rs.getString("pla_car"));
                ano_car.setText(rs.getString("ano_car"));
                mar_car.setText(rs.getString("mar_car"));
                des_car.setText(rs.getString("des_car"));
                
                gravar_alterar = 2;
                liberaCampos(true);
            }
        }
        catch(Exception erTab){
            System.out.println("Erro SQL: "+erTab);
        }  
    }//Fecha método preencheCampos(int id_car)
     
    
    /**
     * Método utilizado para liberar/bloquear os campos da tela.
     * @param a, boolean com true(libera) false(bloqueia).
     */
    private void liberaCampos(boolean a){
        pla_car.setEnabled(a);
        ano_car.setEnabled(a);
        mar_car.setEnabled(a);
        des_car.setEnabled(a);
    }//Fecha método liberaCampos(boolean a)
       
    
    /**
     * Método utilizado para limpar os campos da tela.
     */
    private void limpaCampos(){
        pla_car.setText("");
        ano_car.setText("");
        mar_car.setText("");
        des_car.setText("");
    }//Fecha método limpaCampos()
    
    
    /**
     * Método utilizado para liberar os botões da tela.
     * @param a, boolean com true(libera) false(bloqueia) para o btnNovo.
     * @param b, boolean com true(libera) false(bloqueia) para o btnSalvar.
     * @param c, boolean com true(libera) false(bloqueia) para o btnCancelar.
     * @param d, boolean com true(libera) false(bloqueia) para o btnExcluir.
     * @param e, boolean com true(libera) false(bloqueia) para o btnSair.
     */
    private void liberaBotoes(boolean a, boolean b, boolean c, boolean d, boolean e){
        btnNovo.setEnabled(a);
        btnSalvar.setEnabled(b);
        btnCancelar.setEnabled(c);
        btnExcluir.setEnabled(d);
        btnSair.setEnabled(e);
    }//Fecha método liberaBotoes(boolean a, boolean b, boolean c, boolean d, boolean e)
    
    
    /**
     * Método utilizado para limitar o maximo de caracteres nos campos.
     * @param jtextfield, JTextField que recebe o campo.
     * @param maximo, int com o tamanho maximo do campo.
     */
    private void verificaTamanho(JTextField jtextfield, int maximo) {                            
        String tamanho = jtextfield.getText();
        if(tamanho.length() >= maximo){
              jtextfield.setText(jtextfield.getText().substring(0, maximo-1));
        }
    }//Fecha método verificaTamanho(JTextField jtextfield, int maximo)  
    
    
    /**
     * Método utilizado para limitar o maximo de caracteres nos campos.
     * @param jtextfield, JTextField que recebe o campo.
     * @param maximo, int com o tamanho maximo do campo.
     */
    private void verificaTamanho(JTextArea jtextarea, int maximo) {                            
        String tamanho = jtextarea.getText();
        if(tamanho.length() >= maximo){
              jtextarea.setText(jtextarea.getText().substring(0, maximo-1));
        }
    }//Fecha método verificaTamanho(JTextArea jtextarea, int maximo)  
    
    
    /**
     * Método utilizado para verificar se os campos estão preenchidos.
     * @return boolean false(campo não preenchido) true(campo preenchido).
     */
    private boolean verificaPreenchimentoGeral() {                            
        if(pla_car.getText().equalsIgnoreCase("")){
              JOptionPane.showMessageDialog(null, "O campo Placa deve ser preenchido");
              pla_car.requestFocus();
              return false;
        }
        else{
            if(ano_car.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "O campo Ano deve ser preenchido");
                ano_car.requestFocus();
                return false;
            }
            else{
                if(mar_car.getText().equalsIgnoreCase("")){
                    JOptionPane.showMessageDialog(null, "O campo Marca deve ser preenchido");
                    mar_car.requestFocus();
                    return false;
                }
                else{
                    if(des_car.getText().equalsIgnoreCase("")){
                        JOptionPane.showMessageDialog(null, "O campo Descrição deve ser preenchido");
                        des_car.requestFocus();
                        return false;
                    }
                    else{
                        return true;
                    }//Fecha else des_car
                }//Fecha else mar_car
            }//Fecha else ano_car
        }//Fecha else pla_car
    }//Fecha método verificaPreenchimentoGeral()
    
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ano_car;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JTextArea des_car;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtl_consultar_car;
    private javax.swing.JTextField mar_car;
    private javax.swing.JTextField pesquisa_mar_car;
    private javax.swing.JTextField pla_car;
    // End of variables declaration//GEN-END:variables
}//Fecha classe CarroVIEW
