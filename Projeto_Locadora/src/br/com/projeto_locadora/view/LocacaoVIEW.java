package br.com.projeto_locadora.view;

/**
 * Importando as classes necessárias para trabalhar nesta classe
 */
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import br.com.projeto_locadora.dto.LocacaoDTO;
import br.com.projeto_locadora.ctr.LocacaoCTR;
import br.com.projeto_locadora.dto.CarroDTO;
import br.com.projeto_locadora.ctr.CarroCTR;
import br.com.projeto_locadora.dto.LocadorDTO;
import br.com.projeto_locadora.ctr.LocadorCTR;
import br.com.projeto_locadora.dto.FuncionarioDTO;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


/**
 * Essa classe contém os métodos para inserir, alterar, consultar, excluir e
 * montar da tela de Locacao
 * Disciplina de LPA - Integrado IFSP
 *
 * @author Andre Luis Gobbi Primo/Marcelo Luis Murari
 * @version 2.0
 */
public class LocacaoVIEW extends javax.swing.JInternalFrame {
    LocacaoCTR locacaoCTR = new LocacaoCTR(); //Cria um objeto locacaoCTR
    LocacaoDTO locacaoDTO = new LocacaoDTO(); //Cria um objeto locacaoDTO
    CarroCTR carroCTR = new CarroCTR(); //Cria um objeto carroCTR
    CarroDTO carroDTO = new CarroDTO(); //Cria um objeto carroDTO
    LocadorCTR locadorCTR = new LocadorCTR(); //Cria um objeto locadorCTR
    LocadorDTO locadorDTO = new LocadorDTO(); //Cria um objeto locadorDTO
    FuncionarioDTO funcionarioDTO = new FuncionarioDTO(); //Cria um objeto funcionarioDTO
    ResultSet rs; // Variavel usada para preenchimeto da tabela e dos campos
    int gravar_alterar; //Variavel usada para saber se esta alterando o incluindo
    DefaultTableModel modelo_jtl_consultar_loc; //Variavel para guardar o modelo da tabela
    DefaultTableModel modelo_jtl_consultar_locacao; //Variavel para guardar o modelo da tabela
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //Será utilizado para frmatar e converter o texto do campo dat_ini_locacao e dat_fim_locacao para Date

    ArrayList<CarroDTO> carro = new ArrayList<CarroDTO>(); //É usando para preencher o combo_carro
    
    
    /**
     * Método construtor da Classe
     * @param funcionarioDTO onde será extraido log_pes do tipo String 
     * (login do usuário que veio da classe LoginVIEW).
     */
    public LocacaoVIEW(FuncionarioDTO funcionarioDTO) {
        initComponents();
        this.setSize(758, 560);
        //Chama o metodo liberaCamposNovo
        liberaCamposNovo(false);
        //Chama o metodo liberaCamposFim
        liberaCamposFim(false);
        //Chama o método lieraBotoes
        liberaBotoes(true, false, false, false, true);
        //Atribui um modelo para manipular a tabela 
        modelo_jtl_consultar_loc = (DefaultTableModel) jtl_consultar_loc.getModel();
        modelo_jtl_consultar_locacao = (DefaultTableModel) jtl_consultar_locacao.getModel();
      
        log_fun.setText(funcionarioDTO.getLog_fun());
        
        preencheComboCarro();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jtl_consultar_loc = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        pesquisa_nome_loc = new javax.swing.JTextField();
        btnPesquisarLoc = new javax.swing.JButton();
        log_fun = new javax.swing.JTextField();
        combo_carro = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        km_ini_locacao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        km_fim_locacao = new javax.swing.JTextField();
        dat_ini_locacao = new javax.swing.JFormattedTextField();
        dat_fim_locacao = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        obs_locacao = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnCancelar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pesquisa_pla_car_locacao = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtl_consultar_locacao = new javax.swing.JTable();

        setTitle("Locação de Carros");
        setPreferredSize(new java.awt.Dimension(960, 470));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Locação");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Funcionário:");
        jLabel2.setMaximumSize(new java.awt.Dimension(49, 14));

        jtl_consultar_loc.setModel(new javax.swing.table.DefaultTableModel(
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
        jtl_consultar_loc.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtl_consultar_loc);
        if (jtl_consultar_loc.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_loc.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_loc.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtl_consultar_loc.getColumnModel().getColumn(1).setResizable(false);
            jtl_consultar_loc.getColumnModel().getColumn(1).setPreferredWidth(280);
        }

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Locador:");
        jLabel7.setMaximumSize(new java.awt.Dimension(49, 14));

        btnPesquisarLoc.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnPesquisarLoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/projeto_locadora/view/imagens/pesquisar.png"))); // NOI18N
        btnPesquisarLoc.setAlignmentY(0.0F);
        btnPesquisarLoc.setBorder(null);
        btnPesquisarLoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPesquisarLoc.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        btnPesquisarLoc.setMaximumSize(new java.awt.Dimension(113, 35));
        btnPesquisarLoc.setMinimumSize(new java.awt.Dimension(113, 35));
        btnPesquisarLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarLocActionPerformed(evt);
            }
        });

        log_fun.setEditable(false);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Carro:");
        jLabel8.setMaximumSize(new java.awt.Dimension(49, 14));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Data Inicial:");
        jLabel3.setMaximumSize(new java.awt.Dimension(49, 14));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("KM Inicial:");
        jLabel4.setMaximumSize(new java.awt.Dimension(49, 14));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Data Final:");
        jLabel5.setMaximumSize(new java.awt.Dimension(49, 14));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("KM Final:");
        jLabel6.setMaximumSize(new java.awt.Dimension(49, 14));

        try {
            dat_ini_locacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            dat_fim_locacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Observação:");
        jLabel9.setMaximumSize(new java.awt.Dimension(49, 14));

        obs_locacao.setColumns(20);
        obs_locacao.setRows(4);
        jScrollPane3.setViewportView(obs_locacao);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combo_carro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(log_fun)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dat_ini_locacao)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(km_ini_locacao, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dat_fim_locacao)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(km_fim_locacao, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pesquisa_nome_loc, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisarLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(log_fun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_carro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(km_ini_locacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dat_ini_locacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(km_fim_locacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dat_fim_locacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pesquisa_nome_loc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisarLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addContainerGap())
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
                .addGap(67, 67, 67)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Placa:");
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

        jtl_consultar_locacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Placa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtl_consultar_locacao.getTableHeader().setReorderingAllowed(false);
        jtl_consultar_locacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtl_consultar_locacaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtl_consultar_locacao);
        if (jtl_consultar_locacao.getColumnModel().getColumnCount() > 0) {
            jtl_consultar_locacao.getColumnModel().getColumn(0).setResizable(false);
            jtl_consultar_locacao.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtl_consultar_locacao.getColumnModel().getColumn(1).setResizable(false);
            jtl_consultar_locacao.getColumnModel().getColumn(1).setPreferredWidth(180);
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
                        .addComponent(pesquisa_pla_car_locacao, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(pesquisa_pla_car_locacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Método para executar os comandos quando o botão btnCancelar for clicado.
     * @param evt evento de clique no botão.
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpaCampos();
        liberaCamposNovo(false);
        liberaCamposFim(false);
        modelo_jtl_consultar_loc.setNumRows(0);
        liberaBotoes(true, false, false, false, true);
        gravar_alterar=0;
    }//GEN-LAST:event_btnCancelarActionPerformed

    
    /**
     * Método para executar os comandos quando o botão btnNovo for clicado.
     * @param evt evento de clique no botão.
     */
    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        liberaCamposNovo(true);
        liberaBotoes(false, true, true, false, true);
        gravar_alterar=1;
    }//GEN-LAST:event_btnNovoActionPerformed

    
    /**
     * Método para executar os comandos quando o botão btnSalvar for clicado.
     * @param evt evento de clique no botão.
     */
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(verificaPreenchimentoNovo()){ 
            if(gravar_alterar==1){
                gravar();
                gravar_alterar=0;
                limpaCampos();
                liberaCamposNovo(false);
                liberaCamposFim(false);
                liberaBotoes(true, false, false, false, true);
            }
            else{
                if(gravar_alterar==2){
                    if(verificaPreenchimentoFim()){
                        alterar();
                        //preencheTabela(pesquisa_nome_pes.getText().toUpperCase());
                        gravar_alterar=0;
                        limpaCampos();
                        liberaCamposNovo(false);
                        liberaCamposFim(false);
                        liberaBotoes(true, false, false, false, true);
                    } 
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro no Sistema!!!");
                }
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    
    /**
     * Método para executar os comandos quando o botão btnSair for clicado.
     * @param evt evento de clique no botão.
     */
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    
    /**
     * Método para executar os comandos quando o botão btnPesquisarLoc for clicado.
     * @param evt evento de clique no botão.
     */
    private void btnPesquisarLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarLocActionPerformed
        preencheTabelaLocador(pesquisa_nome_loc.getText());
    }//GEN-LAST:event_btnPesquisarLocActionPerformed

    
    /**
     * Método para executar os comandos quando o botão btnPesquisar for clicado.
     * @param evt evento de clique no botão.
     */
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        preencheTabelaLocacao(pesquisa_pla_car_locacao.getText().toUpperCase());
    }//GEN-LAST:event_btnPesquisarActionPerformed

    
    /**
     * Método para executar os comandos quando o jtl_consultar_locacao for clicado.
     * @param evt evento de clique no JTable.
     */
    private void jtl_consultar_locacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtl_consultar_locacaoMouseClicked

        //Pega a Pessoa selecionada e chama preencheCampos
        preencheCampos(Integer.parseInt(String.valueOf(jtl_consultar_locacao.getValueAt(jtl_consultar_locacao.getSelectedRow(), 0))));
        liberaBotoes(false, true, true, true, true);
    }//GEN-LAST:event_jtl_consultar_locacaoMouseClicked

    
    /**
     * Método utilizado para gravar os dados da locacao.
     */
    private void gravar(){
        
        carroDTO.setId_car(carro.get(combo_carro.getSelectedIndex()).getId_car());
        locacaoDTO.setDat_ini_locacao(java.sql.Date.valueOf(LocalDate.parse(dat_ini_locacao.getText(), formato)));
        locacaoDTO.setKm_ini_locacao(Integer.parseInt(km_ini_locacao.getText()));
        locadorDTO.setId_pes(Integer.parseInt(String.valueOf(jtl_consultar_loc.getValueAt(jtl_consultar_loc.getSelectedRow(), 0))));
        locacaoDTO.setObs_locacao(obs_locacao.getText());

        JOptionPane.showMessageDialog(null,
                locacaoCTR.inserirLocacao(locacaoDTO, carroDTO, locadorDTO)
        );
    }//Fecha método gravar()

    
    /**
     * Método utilizado para alterar os dados da locacao.
     */
    private void alterar(){
        locacaoDTO.setDat_fim_locacao(java.sql.Date.valueOf(LocalDate.parse(dat_fim_locacao.getText(), formato)));
        locacaoDTO.setKm_fim_locacao(Integer.parseInt(km_fim_locacao.getText()));
        locacaoDTO.setObs_locacao(obs_locacao.getText());

        JOptionPane.showMessageDialog(null,
                locacaoCTR.alterarLocacao(locacaoDTO)
        );
    }//Fecha método gravar()
    
 
    /**
     * Método utilizado para preencher/contruir a Jtable com os dados
     * da locacao que estão ativas.
     */
    private void preencheTabelaLocacao(String pla_car){
        try{
            //Limpa todas as linhas
            modelo_jtl_consultar_locacao.setNumRows(0);

            carroDTO.setPla_car(pla_car);
            rs = locacaoCTR.consultarLocacao(locacaoDTO, carroDTO, 1);
            //Enquanto tiver linhas - faça
            while(rs.next()){
                modelo_jtl_consultar_locacao.addRow(new Object[]{
                    rs.getString("id_locacao"),
                    rs.getString("pla_car")
                });
            }        
        }
        catch(Exception e){
            System.out.println("Erro SQL: " + e.getMessage());
        }  
    }//Fecha método preencheTabelaLocador()
  
    
    /**
     * Método utilizado para preencher/contruir a Jtable com os dados
     * do locador que está locando o carro.
     */
    private void preencheTabelaLocador(String nom_pes){
        try{
            //Limpa todas as linhas
            modelo_jtl_consultar_loc.setNumRows(0);

            locadorDTO.setNom_pes(nom_pes);
            rs = locadorCTR.consultarLocador(locadorDTO, 1);
            //Enquanto tiver linhas - faça
            while(rs.next()){
                modelo_jtl_consultar_loc.addRow(new Object[]{
                    rs.getString("id_pes"),
                    rs.getString("nom_pes")
                });
            }        
        }
        catch(Exception e){
            System.out.println("Erro SQL: " + e.getMessage());
        }  
    }//Fecha método preencheTabelaLocador()
        
    
    /**
     * Método utilizado para preencher/contruir a Jtable com os dados
     * do locador que está locando o carro.
     * @param id_pes, int com o id do da pessoa
     * @param nom_pes, String com nome da pessoa
     */
    private void preencheTabelaLocador(int id_pes, String nom_pes){
        try{
            //Limpa todas as linhas
            modelo_jtl_consultar_loc.setNumRows(0);

            //adiciona a linha
            modelo_jtl_consultar_loc.addRow(new Object[]{
                id_pes,
                nom_pes,
            });
            jtl_consultar_loc.setRowSelectionInterval(0, 0);
        }
        catch(Exception e){
            System.out.println("Erro SQL: " + e.getMessage());
        }  
    }//Fecha método preencheTabelaLocador(int id_pes, String nom_pes)
       
    
    /**
     * Método utilizado para Adicionar corros na combo para selecao.
     */
    private void preencheComboCarro(){
        try{
            rs = carroCTR.consultarCarro(carroDTO, 3);
            combo_carro.removeAllItems();
            //Enquanto tiver linhas - faça
            while(rs.next()){
                carroDTO.setId_car(rs.getInt("id_car"));
                carroDTO.setPla_car(rs.getString("pla_car"));
                combo_carro.addItem(carroDTO.getPla_car()); 
                carro.add(new CarroDTO(rs.getInt("id_car"), rs.getString("pla_car"))); 
            }   
        }
        catch(Exception e){
            System.out.println("Erro SQL: " + e.getMessage());
        }  
    }//Fecha método preencheComboCarro(String des_pro)
   
    
    /**
     * Método utilizado para preencher os campos da tela com 
     * valores da locacao.
     * @param id_locacao, int com o id da locacao.
     */
    private void preencheCampos(int id_locacao){
        try{
            locacaoDTO.setId_locacao(id_locacao);
            rs = locacaoCTR.consultarLocacao(locacaoDTO, carroDTO, 2);
            if(rs.next()){
                combo_carro.removeAllItems();
                carroDTO.setId_car(rs.getInt("id_car"));
                carroDTO.setPla_car(rs.getString("pla_car"));
                combo_carro.addItem(carroDTO.getPla_car()); 
                dat_ini_locacao.setText(rs.getString("data_inicial"));
                km_ini_locacao.setText(rs.getString("km_ini_locacao"));
                preencheTabelaLocador(rs.getInt("id_pes"), rs.getString("nom_pes"));
                obs_locacao.setText(rs.getString("obs_locacao"));
                liberaCamposFim(true);
                gravar_alterar = 2;
            }
        }
        catch(Exception e){
            System.out.println("Erro SQL: " + e.getMessage());
        }  
    }//Fecha método preencheCampos(int id_pro)
     
    
    /**
     * Método utilizado para liberar/bloquear os campos da tela.
     * @param a, boolean com true(libera) false(bloqueia).
     */
    private void liberaCamposNovo(boolean a){
        log_fun.setEnabled(a);
        combo_carro.setEnabled(a);
        dat_ini_locacao.setEnabled(a);
        km_ini_locacao.setEnabled(a);
        pesquisa_nome_loc.setEnabled(a);
        btnPesquisarLoc.setEnabled(a);
        jtl_consultar_loc.setEnabled(a);
        obs_locacao.setEnabled(a);    
    }//Fecha método liberaCamposNovo(boolean a)
    
    
    /**
     * Método utilizado para liberar/bloquear os campos data final e km final da tela.
     * @param a, boolean com true(libera) false(bloqueia).
     */
    private void liberaCamposFim(boolean a){
        dat_fim_locacao.setEnabled(a);
        km_fim_locacao.setEnabled(a);  
        obs_locacao.setEnabled(a);
    }//Fecha método liberaCamposFim(boolean a)
    
    
    /**
     * Método utilizado para limpar os campos da tela.
     */
    private void limpaCampos(){
        combo_carro.removeAllItems();
        dat_ini_locacao.setText("");
        km_ini_locacao.setText("");
        dat_fim_locacao.setText("");
        km_fim_locacao.setText("");
        modelo_jtl_consultar_loc.setNumRows(0);
        obs_locacao.setText("");
        modelo_jtl_consultar_locacao.setNumRows(0);     
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
        btnSair.setEnabled(e);
    }//Fecha método liberaBotoes(boolean a, boolean b, boolean c, boolean d, boolean e)

    
    /**
     * Método utilizado para verificar se os campos estão preenchidos.
     * @return boolean false(campo não preenchido) true(campo preenchido).
     */
    private boolean verificaPreenchimentoNovo() { 
        if(combo_carro.getSelectedItem().toString().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "O campo Carro deve ser preenchido");
            return false;
        }
        else{
            if((dat_ini_locacao.getText().equalsIgnoreCase("")) || (dat_ini_locacao.getText().equalsIgnoreCase("  /  /    "))){
                JOptionPane.showMessageDialog(null, "O campo Data Inicial da Locacação deve ser preenchido");
                dat_ini_locacao.requestFocus();
                return false;
            }
            else{
                if((km_ini_locacao.getText().equalsIgnoreCase(""))){
                    JOptionPane.showMessageDialog(null, "O campo Km Inicial da Locação deve ser preenchido");
                    km_ini_locacao.requestFocus();
                    return false;
                }
                else{
                    if(jtl_consultar_loc.getSelectedRowCount() <= 0){
                        JOptionPane.showMessageDialog(null, "Deve ser selecionado um Locador");
                        pesquisa_nome_loc.requestFocus();
                        return false;
                    }
                    else{
                        if((obs_locacao.getText().equalsIgnoreCase(""))){
                            JOptionPane.showMessageDialog(null, "O campo Observação deve ser preenchido");
                            obs_locacao.requestFocus();
                            return false;
                        } 
                        else{
                            return true;
                        }
                    }//Fecha else jtl_consultar_loc
                }//Fecha else do km_ini_locacao
            }//Fecha else dat_ini_locacao
        }//Fecha else combo_carro
    }//Fecha método verificaPreenchimentoNovo()
    
    
    /**
     * Método utilizado para verificar se os campos estão preenchidos.
     * @return boolean false(campo não preenchido) true(campo preenchido).
     */
    private boolean verificaPreenchimentoFim() { 
        if((dat_fim_locacao.getText().equalsIgnoreCase("")) || (dat_fim_locacao.getText().equalsIgnoreCase("  /  /    "))){
            JOptionPane.showMessageDialog(null, "O campo Data Final da Locacação deve ser preenchido");
            dat_fim_locacao.requestFocus();
            return false;
        }
        else{
            if((km_fim_locacao.getText().equalsIgnoreCase(""))){
                JOptionPane.showMessageDialog(null, "O campo Km Final da Locação deve ser preenchido");
                km_fim_locacao.requestFocus();
                return false;
            }
            else{
                if((obs_locacao.getText().equalsIgnoreCase(""))){
                    JOptionPane.showMessageDialog(null, "O campo Observação deve ser preenchido");
                    obs_locacao.requestFocus();
                    return false;
                } 
                else{
                    return true;
                }//Fecha else obs_locacao
            }//Fecha else km_fim_locacao
        }//Fecha else do dat_fim_locacao
    }//Fecha método verificaPreenchimentoFim()
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnPesquisarLoc;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> combo_carro;
    private javax.swing.JFormattedTextField dat_fim_locacao;
    private javax.swing.JFormattedTextField dat_ini_locacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtl_consultar_loc;
    private javax.swing.JTable jtl_consultar_locacao;
    private javax.swing.JTextField km_fim_locacao;
    private javax.swing.JTextField km_ini_locacao;
    private javax.swing.JTextField log_fun;
    private javax.swing.JTextArea obs_locacao;
    private javax.swing.JTextField pesquisa_nome_loc;
    private javax.swing.JTextField pesquisa_pla_car_locacao;
    // End of variables declaration//GEN-END:variables
}//Fecha classe LocacaoVIEW
