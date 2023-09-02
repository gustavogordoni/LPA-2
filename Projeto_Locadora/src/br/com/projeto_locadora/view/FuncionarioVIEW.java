package br.com.projeto_locadora.view;


/**
 * Importando as classes necessárias para trabalhar nesta classe
 */
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import br.com.projeto_locadora.dto.FuncionarioDTO;
import br.com.projeto_locadora.ctr.FuncionarioCTR;
import javax.swing.JTextField;

/**
 * Essa classe contém os métodos para inserir, alterar, consultar e excluir
 * Pessoa e seu filho (funcionario)
 * Disciplina de LPA - Integrado IFSP
 *
 * @author Andre Luis Gobbi Primo/Marcelo Luis Murari
 * @version 2.0
 */
public class FuncionarioVIEW extends javax.swing.JInternalFrame {     
    FuncionarioDTO funcionarioDTO = new FuncionarioDTO(); //Cria um objeto funcionarioDTO
    FuncionarioCTR funcionarioCTR = new FuncionarioCTR(); //Cria um objeto funcionarioCTR
    
    ResultSet rs; //Variavel usada para preenchimeto da tabela e dos campos
    int gravar_alterar; //Variavel usada para saber se esta alterando o incluindo
    DefaultTableModel modelo_jtl_consultar_pes; //Variavel para guardar o modelo da tabela

    
    /**
     * Método construtor da Classe
     */
    public FuncionarioVIEW() {
        initComponents();
        
        
        //Chama todos os métodos liberaCampos
        liberaCampos(false);
        //Chama o método liberaBotoes
        liberaBotoes(true, false, false, false, true);
        //Atribui um modelo para manipular a tabela 
        modelo_jtl_consultar_pes = (DefaultTableModel) jtl_consultar_pes.getModel();
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nom_pes = new javax.swing.JTextField();
        end_pes = new javax.swing.JTextField();
        num_pes = new javax.swing.JTextField();
        bai_pes = new javax.swing.JTextField();
        cid_pes = new javax.swing.JTextField();
        est_pes = new javax.swing.JComboBox<>();
        cep_pes = new javax.swing.JFormattedTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        log_fun = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        sen_fun = new javax.swing.JPasswordField();
        rg_ie_pes = new javax.swing.JTextField();
        cpf_cnpj_pes = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pesquisa_nome_pes = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtl_consultar_pes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setTitle("Cadastro de Funcionário");
        setMaximumSize(new java.awt.Dimension(1000000000, 2147483647));
        setPreferredSize(new java.awt.Dimension(762, 452));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Funcionário");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nome:");
        jLabel2.setMaximumSize(new java.awt.Dimension(49, 14));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Endereço:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Bairro:");
        jLabel6.setMaximumSize(new java.awt.Dimension(49, 14));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Cidade:");
        jLabel7.setMaximumSize(new java.awt.Dimension(49, 14));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Estado:");
        jLabel8.setMaximumSize(new java.awt.Dimension(49, 14));

        jLabel9.setText("N.º:");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("CEP:");
        jLabel10.setMaximumSize(new java.awt.Dimension(49, 14));

        nom_pes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nom_pesKeyPressed(evt);
            }
        });

        end_pes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                end_pesKeyPressed(evt);
            }
        });

        bai_pes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bai_pesKeyPressed(evt);
            }
        });

        cid_pes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cid_pesKeyPressed(evt);
            }
        });

        est_pes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        try {
            cep_pes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("CPF/CNPJ:");
        jLabel18.setMaximumSize(new java.awt.Dimension(49, 14));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("RG/IE:");
        jLabel19.setMaximumSize(new java.awt.Dimension(49, 14));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Login:");

        log_fun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                log_funKeyPressed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Senha:");

        sen_fun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sen_funKeyPressed(evt);
            }
        });

        rg_ie_pes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rg_ie_pesKeyPressed(evt);
            }
        });

        cpf_cnpj_pes.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cpf_cnpj_pesFocusLost(evt);
            }
        });
        cpf_cnpj_pes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cpf_cnpj_pesKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(log_fun, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sen_fun)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nom_pes))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(end_pes, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(num_pes, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bai_pes))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rg_ie_pes))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(est_pes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cep_pes, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cid_pes, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cpf_cnpj_pes)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom_pes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(end_pes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num_pes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bai_pes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cid_pes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(est_pes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cep_pes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpf_cnpj_pes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rg_ie_pes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(log_fun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(sen_fun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Nome:");
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

        jtl_consultar_pes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtl_consultar_pes.getTableHeader().setReorderingAllowed(false);
        jtl_consultar_pes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtl_consultar_pesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtl_consultar_pes);
        if (jtl_consultar_pes.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_pes.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_pes.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtl_consultar_pes.getColumnModel().getColumn(1).setResizable(false);
            jtl_consultar_pes.getColumnModel().getColumn(1).setPreferredWidth(140);
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
                        .addComponent(pesquisa_nome_pes, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
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
                        .addComponent(pesquisa_nome_pes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addGap(35, 35, 35))
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        modelo_jtl_consultar_pes.setNumRows(0);
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
                    preencheTabela(pesquisa_nome_pes.getText().toUpperCase());
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
        preencheTabela(pesquisa_nome_pes.getText().toUpperCase());
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
    private void jtl_consultar_pesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtl_consultar_pesMouseClicked
        //Pega a Pessoa selecionada e chama preencheCampos
        preencheCampos(Integer.parseInt(String.valueOf(jtl_consultar_pes.getValueAt(jtl_consultar_pes.getSelectedRow(), 0))));
        liberaBotoes(false, true, true, true, true);
    }//GEN-LAST:event_jtl_consultar_pesMouseClicked

    
    /**
     * Método para executar os comandos quando o botão btnPesquisar for clicado.
     * @param evt evento de clique no botão.
     */
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        preencheTabela(pesquisa_nome_pes.getText().toUpperCase());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    
    /**
     * Método para verificar o tamanho máximo do campo, a cada tecla digitada,
     * chama o método verificaTamanho passando o campo nom_pes e o tamanho máximo 
     * de caractéres para ser validado.
     * @param evt evento de tecla pressionada.
     */
    private void nom_pesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_pesKeyPressed
        verificaTamanho(nom_pes, 50);
    }//GEN-LAST:event_nom_pesKeyPressed
	
	
    /**
     * Método para verificar o tamanho máximo do campo, a cada tecla digitada,
     * chama o método verificaTamanho passando o campo end_pes e o tamanho máximo 
     * de caractéres para ser validado.
     * @param evt evento de tecla pressionada.
     */
    private void end_pesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_end_pesKeyPressed
        verificaTamanho(end_pes, 50);
    }//GEN-LAST:event_end_pesKeyPressed
	
	
    /**
     * Método para verificar o tamanho máximo do campo, a cada tecla digitada,
     * chama o método verificaTamanho passando o campo bai_pes e o tamanho máximo 
     * de caractéres para ser validado.
     * @param evt evento de tecla pressionada.
     */
    private void bai_pesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bai_pesKeyPressed
        verificaTamanho(bai_pes, 30);
    }//GEN-LAST:event_bai_pesKeyPressed
	
	
    /**
     * Método para verificar o tamanho máximo do campo, a cada tecla digitada,
     * chama o método verificaTamanho passando o campo cid_pes e o tamanho máximo 
     * de caractéres para ser validado.
     * @param evt evento de tecla pressionada.
     */
    private void cid_pesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cid_pesKeyPressed
        verificaTamanho(cid_pes, 30);
    }//GEN-LAST:event_cid_pesKeyPressed

    
    /**
     * Método para verificar o tamanho máximo do campo, a cada tecla digitada,
     * chama o método verificaTamanho passando o campo cpf_cnpj_pes e o tamanho máximo 
     * de caractéres para ser validado.
     * @param evt evento de tecla pressionada.
     */
    private void cpf_cnpj_pesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpf_cnpj_pesKeyPressed
        verificaTamanho(cpf_cnpj_pes, 14);
    }//GEN-LAST:event_cpf_cnpj_pesKeyPressed


    /**
     * Método para verificar o tamanho máximo do campo, a cada tecla digitada,
     * chama o método verificaTamanho passando o campo rg_ie_pes e o tamanho máximo 
     * de caractéres para ser validado.
     * @param evt evento de tecla pressionada.
     */
    private void rg_ie_pesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rg_ie_pesKeyPressed
        verificaTamanho(rg_ie_pes, 20);
    }//GEN-LAST:event_rg_ie_pesKeyPressed

    
    /**
     * Método para verificar o tamanho máximo do campo, a cada tecla digitada,
     * chama o método verificaTamanho passando o campo log_fun e o tamanho máximo 
     * de caractéres para ser validado.
     * @param evt evento de tecla pressionada.
     */
    private void log_funKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_log_funKeyPressed
        verificaTamanho(log_fun, 20);
    }//GEN-LAST:event_log_funKeyPressed

    
    /**
     * Método para verificar o tamanho máximo do campo, a cada tecla digitada,
     * chama o método verificaTamanho passando o campo sen_fun e o tamanho máximo 
     * de caractéres para ser validado.
     * @param evt evento de tecla pressionada.
     */
    private void sen_funKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sen_funKeyPressed
        verificaTamanho(sen_fun, 20);
    }//GEN-LAST:event_sen_funKeyPressed

    
    /**
     * Método para colcoar a mascara do campo, ao capo perder o foco,
     * chama o método verificaMascaraCPFCNPJ.
     * @param evt evento saida do foco.
     */
    private void cpf_cnpj_pesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cpf_cnpj_pesFocusLost
        verificaMascaraCPFCNPJ();
    }//GEN-LAST:event_cpf_cnpj_pesFocusLost

    
    /**
     * Método utilizado para gravar os dados do funcionario.
     */
    private void gravar(){
        funcionarioDTO.setNom_pes(nom_pes.getText());
        funcionarioDTO.setEnd_pes(end_pes.getText());
        funcionarioDTO.setNum_pes(Integer.parseInt(num_pes.getText()));
        funcionarioDTO.setBai_pes(bai_pes.getText());
        funcionarioDTO.setCid_pes(cid_pes.getText());
        funcionarioDTO.setEst_pes(est_pes.getSelectedItem().toString());
        funcionarioDTO.setCep_pes(cep_pes.getText());
        funcionarioDTO.setCpf_cnpj_pes(cpf_cnpj_pes.getText());
        funcionarioDTO.setRg_ie_pes(rg_ie_pes.getText());
        funcionarioDTO.setLog_fun(log_fun.getText());
        funcionarioDTO.setSen_fun(String.valueOf(sen_fun.getPassword()));
        funcionarioDTO.setTip_pes(1); // 1 porque é Pessoa do tipo Funcionario

        JOptionPane.showMessageDialog(null,
                funcionarioCTR.inserirFuncionario(funcionarioDTO)
        );
    }//Fecha método gravar()
    
    
    /**
     * Método utilizado para excluir os dados do funcionario.
     */
    private void excluir(){
       if(JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir o Funcionário?","Aviso", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,
                    funcionarioCTR.excluirFuncionario(funcionarioDTO)
            );
       }
    }//Fecha método excluir()
    
    
    /**
     * Método utilizado para alterar os dados do funcionario.
     */
    private void alterar(){
        funcionarioDTO.setNom_pes(nom_pes.getText());
        funcionarioDTO.setEnd_pes(end_pes.getText());
        funcionarioDTO.setNum_pes(Integer.parseInt(num_pes.getText()));
        funcionarioDTO.setBai_pes(bai_pes.getText());
        funcionarioDTO.setCid_pes(cid_pes.getText());
        funcionarioDTO.setEst_pes(est_pes.getSelectedItem().toString());
        funcionarioDTO.setCep_pes(cep_pes.getText());
        funcionarioDTO.setCpf_cnpj_pes(cpf_cnpj_pes.getText());
        funcionarioDTO.setRg_ie_pes(rg_ie_pes.getText());
        funcionarioDTO.setLog_fun(log_fun.getText());
        funcionarioDTO.setSen_fun(String.valueOf(sen_fun.getPassword()));
        funcionarioDTO.setTip_pes(1); // 1 por que é Pessoa do tipo Funcionario
     
        JOptionPane.showMessageDialog(null,
                funcionarioCTR.alterarFuncionario(funcionarioDTO)
        );
    }//Fecha método alterar()
    
    
    /**
     * Método utilizado para preencher/contruir a Jtable.
     * @param nom_pes, String com a descrição do nome da pessoa
     */
    private void preencheTabela(String nom_pes){
        try{
            //Limpa todas as linhas
            modelo_jtl_consultar_pes.setNumRows(0);

            //Enquanto tiver linhas - faça
            funcionarioDTO.setNom_pes(nom_pes);
            rs = funcionarioCTR.consultarFuncionario(funcionarioDTO, 1); //1 = é a pesquisa por nome na classe DAO
            while(rs.next()){
                modelo_jtl_consultar_pes.addRow(new Object[]{
                  rs.getString("id_pes"),
                  rs.getString("nom_pes"),
                });
            }        
        }
        catch(Exception erTab){
            System.out.println("Erro SQL: "+erTab);
        }  
    }//Fecha método preencheTabela(String nom_pes)
    
    
    /**
     * Método utilizado para preencher os campos da tela com 
     * valores do funcionario.
     * @param id_pes, int com o id da pessoa.
     */
    private void preencheCampos(int id_pes){
        try{
            funcionarioDTO.setId_pes(id_pes);
            rs = funcionarioCTR.consultarFuncionario(funcionarioDTO, 2); //2 = é a pesquisa no id na classe DAO
            if(rs.next()){
                limpaCampos();
                
                nom_pes.setText(rs.getString("nom_pes"));
                end_pes.setText(rs.getString("end_pes"));
                num_pes.setText(rs.getString("num_pes"));
                bai_pes.setText(rs.getString("bai_pes"));
                cid_pes.setText(rs.getString("cid_pes"));
                est_pes.setSelectedItem(rs.getString("est_pes"));
                cep_pes.setText(rs.getString("cep_pes"));
                cpf_cnpj_pes.setText(rs.getString("cpf_cnpj_pes"));
                rg_ie_pes.setText(rs.getString("rg_ie_pes"));
                log_fun.setText(rs.getString("log_fun"));
                sen_fun.setText(rs.getString("sen_fun"));
                 
                gravar_alterar = 2;
                liberaCampos(true);
            }
        }
        catch(Exception erTab){
            System.out.println("Erro SQL: "+erTab);
        }  
    }//Fecha método preencheCampos(int id_pes)
     
    
    /**
     * Método utilizado para liberar/bloquear os campos da tela.
     * @param a, boolean com true(libera) false(bloqueia).
     */
    private void liberaCampos(boolean a){
        nom_pes.setEnabled(a);
        end_pes.setEnabled(a);
        num_pes.setEnabled(a);
        bai_pes.setEnabled(a);
        cid_pes.setEnabled(a);
        est_pes.setEnabled(a);
        cep_pes.setEnabled(a);
        cpf_cnpj_pes.setEnabled(a);
        rg_ie_pes.setEnabled(a);
        log_fun.setEnabled(a);
        sen_fun.setEnabled(a);
    }//Fecha método liberaCampos(boolean a)
       
    
    /**
     * Método utilizado para limpar os campos da tela.
     */
    private void limpaCampos(){
        nom_pes.setText("");
        end_pes.setText("");
        num_pes.setText("");
        bai_pes.setText("");
        cid_pes.setText("");
        est_pes.setSelectedItem(0);
        cep_pes.setText("");
        cpf_cnpj_pes.setText("");
        rg_ie_pes.setText("");
        log_fun.setText("");
        sen_fun.setText("");
        
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
     * Método utilizado para formatar a mascara do CPF/CNPJ.
     */
    private void verificaMascaraCPFCNPJ() { 
        try{
            String conteudo="";
            int i=0;
            while(i<cpf_cnpj_pes.getText().length()){
                if((cpf_cnpj_pes.getText().charAt(i) == '.') || (cpf_cnpj_pes.getText().charAt(i) == '-') || (cpf_cnpj_pes.getText().charAt(i) == '/')){
                    conteudo += "";
                 
                }
                else{
                    conteudo += cpf_cnpj_pes.getText().charAt(i);
                }
                i++;
            }
            cpf_cnpj_pes.setText(conteudo);
            if(cpf_cnpj_pes.getText().length() == 11){
                cpf_cnpj_pes.setText(cpf_cnpj_pes.getText(0, 3)+"."+cpf_cnpj_pes.getText(3, 3)+"."+cpf_cnpj_pes.getText(6, 3)+"-"+cpf_cnpj_pes.getText(9, 2));
            }
            else{
                if(cpf_cnpj_pes.getText().length() == 14){
                    cpf_cnpj_pes.setText(cpf_cnpj_pes.getText(0, 2)+"."+cpf_cnpj_pes.getText(2, 3)+"."+cpf_cnpj_pes.getText(5, 3)+"/"+cpf_cnpj_pes.getText(8, 4)+"-"+cpf_cnpj_pes.getText(12, 2));
            
                }
            }
        }
        catch(Exception e){}
    }//Fecha método verificaTamanho(JTextField jtextfield, int maximo)  

    
    /**
     * Método utilizado para verificar se os campos estão preenchidos.
     * @return boolean false(campo não preenchido) true(campo preenchido).
     */
    private boolean verificaPreenchimentoGeral() {                            
        if(nom_pes.getText().equalsIgnoreCase("")){
              JOptionPane.showMessageDialog(null, "O campo Nome deve ser preenchido");
              nom_pes.requestFocus();
              return false;
        }
        else{
            if(end_pes.getText().equalsIgnoreCase("")){
                JOptionPane.showMessageDialog(null, "O campo Endereço deve ser preenchido");
                end_pes.requestFocus();
                return false;
            }
            else{
                if(num_pes.getText().equalsIgnoreCase("")){
                    JOptionPane.showMessageDialog(null, "O campo Número deve ser preenchido");
                    num_pes.requestFocus();
                    return false;
                }
                else{
                    if(bai_pes.getText().equalsIgnoreCase("")){
                        JOptionPane.showMessageDialog(null, "O campo Bairro deve ser preenchido");
                        bai_pes.requestFocus();
                        return false;
                    }
                    else{
                        if(cid_pes.getText().equalsIgnoreCase("")){
                            JOptionPane.showMessageDialog(null, "O campo Cidade deve ser preenchido");
                            cid_pes.requestFocus();
                            return false;
                        }
                        else{
                            if((cep_pes.getText().equalsIgnoreCase("")) || (cep_pes.getText().equalsIgnoreCase("  .   -   "))){
                                JOptionPane.showMessageDialog(null, "O campo CEP deve ser preenchido");
                                cep_pes.requestFocus();
                                return false;
                            }
                            else{
                                if(cpf_cnpj_pes.getText().equalsIgnoreCase("")){
                                    JOptionPane.showMessageDialog(null, "O campo CPF/CNPJ deve ser preenchido");
                                    cpf_cnpj_pes.requestFocus();
                                    return false;
                                }
                                else{
                                    if(rg_ie_pes.getText().equalsIgnoreCase("")){
                                        JOptionPane.showMessageDialog(null, "O campo RG/IE deve ser preenchido");
                                        rg_ie_pes.requestFocus();
                                        return false;
                                    }
                                    else{
                                        if(log_fun.getText().equalsIgnoreCase("")){
                                            JOptionPane.showMessageDialog(null, "O campo Login deve ser preenchido");
                                            log_fun.requestFocus();
                                            return false;
                                        }
                                        else{
                                            if(sen_fun.getText().equalsIgnoreCase("")){
                                                JOptionPane.showMessageDialog(null, "O campo Senha deve ser preenchido");
                                                sen_fun.requestFocus();
                                                return false;
                                            }
                                            else{
                                                return true;
                                            }//Fecha else sen_fun
                                        }//Fecha else log_fun
                                    }//Fecha else rg_ie_pes
                                }//Fecha else cpf_cnpj_pes
                            }//Fecha else cep_pes
                        }//Fecha else cid_pes
                    }//Fecha else bai_pes 
                }//Fecha else num_pes
            }//Fecha else end_pes
        }//Fecha else nom_pes
    }//Fecha método verificaPreenchimentoGeral()
    
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bai_pes;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField cep_pes;
    private javax.swing.JTextField cid_pes;
    private javax.swing.JTextField cpf_cnpj_pes;
    private javax.swing.JTextField end_pes;
    private javax.swing.JComboBox<String> est_pes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtl_consultar_pes;
    private javax.swing.JTextField log_fun;
    private javax.swing.JTextField nom_pes;
    private javax.swing.JTextField num_pes;
    private javax.swing.JTextField pesquisa_nome_pes;
    private javax.swing.JTextField rg_ie_pes;
    private javax.swing.JPasswordField sen_fun;
    // End of variables declaration//GEN-END:variables
}//Fecha classe FuncionarioVIEW
