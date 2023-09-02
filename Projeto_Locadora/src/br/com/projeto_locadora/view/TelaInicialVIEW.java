package br.com.projeto_locadora.view;

/**
 * Importando as classes necessárias para trabalhar nesta classe
 */
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import br.com.projeto_locadora.dto.FuncionarioDTO;
import javax.swing.JInternalFrame;

/**
 * Essa classe contém os métodos para chamar as classes necessárias fazendo a interação com o usuário.
 * Disciplina de LPA - Integrado IFSP
 *
 * @author Andre Luis Gobbi Primo/Marcelo Luis Murari
 * @version 2.0
 */
public class TelaInicialVIEW extends javax.swing.JFrame {

    FuncionarioDTO funcionarioDTO = new FuncionarioDTO();

    
    /**
     * Método construtor da Classe
     * @param funcionarioDTO onde será extraido log_usu do tipo String 
     * (login do usuário que veio da classe LoginVIEW).
     */
    public TelaInicialVIEW(FuncionarioDTO funcionarioDTO) {
        this.funcionarioDTO = funcionarioDTO;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Controle de Locação");
        lblusuario.setText(lblusuario.getText() + this.funcionarioDTO.getLog_fun().toUpperCase());

    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        ImageIcon imageicon = new ImageIcon(getClass().getResource("imagens/tela.png"));
        Image image = imageicon.getImage();
        desktopPane = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics graphics){
                graphics.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        lblusuario = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        MenuCadastros = new javax.swing.JMenu();
        MenuItemFuncionario = new javax.swing.JMenuItem();
        MenuItemLocador = new javax.swing.JMenuItem();
        MenuItemCarro = new javax.swing.JMenuItem();
        MenuItemLocacao = new javax.swing.JMenuItem();
        MenuSobre = new javax.swing.JMenu();
        MenuItemOsAutores = new javax.swing.JMenuItem();
        MenuSair = new javax.swing.JMenu();
        MenuItemSairSistema = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        lblusuario.setForeground(new java.awt.Color(255, 255, 255));
        lblusuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblusuario.setText("Você está logado como ");
        desktopPane.add(lblusuario);
        lblusuario.setBounds(750, 10, 250, 20);

        MenuCadastros.setMnemonic('c');
        MenuCadastros.setText("Cadastros");

        MenuItemFuncionario.setMnemonic('o');
        MenuItemFuncionario.setText("Funcionário");
        MenuItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemFuncionarioActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuItemFuncionario);

        MenuItemLocador.setMnemonic('a');
        MenuItemLocador.setText("Locador");
        MenuItemLocador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemLocadorActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuItemLocador);

        MenuItemCarro.setText("Carro");
        MenuItemCarro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCarroActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuItemCarro);

        MenuItemLocacao.setText("Locação");
        MenuItemLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemLocacaoActionPerformed(evt);
            }
        });
        MenuCadastros.add(MenuItemLocacao);

        menuBar.add(MenuCadastros);

        MenuSobre.setMnemonic('i');
        MenuSobre.setText("Informação");

        MenuItemOsAutores.setMnemonic('c');
        MenuItemOsAutores.setText("Os Autores");
        MenuItemOsAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemOsAutoresActionPerformed(evt);
            }
        });
        MenuSobre.add(MenuItemOsAutores);

        menuBar.add(MenuSobre);

        MenuSair.setMnemonic('s');
        MenuSair.setText("Sair");

        MenuItemSairSistema.setText("Sair do Sistema");
        MenuItemSairSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSairSistemaActionPerformed(evt);
            }
        });
        MenuSair.add(MenuItemSairSistema);

        menuBar.add(MenuSair);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1029, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );

        desktopPane.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Método para executar os comandos quando o menu MenuItemLocador for clicado.
     * @param evt evento de clique no menu.
     */
    private void MenuItemLocadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemLocadorActionPerformed
        LocadorVIEW locadorVIEW = new LocadorVIEW();
        this.desktopPane.add(locadorVIEW);
        locadorVIEW.setVisible(true); 
        locadorVIEW.setPosicao();
    }//GEN-LAST:event_MenuItemLocadorActionPerformed

    
    /**
     * Método para executar os comandos quando o menu MenuItemFuncionario for clicado.
     * @param evt evento de clique no menu.
     */
    private void MenuItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemFuncionarioActionPerformed
        try{
            FuncionarioVIEW funcionarioVIEW = new FuncionarioVIEW();
            this.desktopPane.add(funcionarioVIEW);
            funcionarioVIEW.setVisible(true);
            funcionarioVIEW.setPosicao();
            funcionarioVIEW.setMaximum(true);
        } 
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir a tela de Funcionário");
        }
    }//GEN-LAST:event_MenuItemFuncionarioActionPerformed
    
    
    /**
     * Método para executar os comandos quando o menu MenuItemOsAutores for clicado.
     * @param evt evento de clique no menu.
     */
    private void MenuItemOsAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemOsAutoresActionPerformed
        JOptionPane.showMessageDialog(null, "Autores: André Luis Gobbi Primo/Marcelo Luis Murari"
                + "\nDisciplina: Linguagem de Programação I"
                + "\nVersão: 2.0");
    }//GEN-LAST:event_MenuItemOsAutoresActionPerformed

    
    /**
     * Método para executar os comandos quando o menu MenuItemSairSistema for clicado.
     * @param evt evento de clique no menu.
     */
    private void MenuItemSairSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSairSistemaActionPerformed
        sair();  
    }//GEN-LAST:event_MenuItemSairSistemaActionPerformed

    
    /**
     * Método para executar os comandos quando o menu MenuItemCarro for clicado.
     * @param evt evento de clique no menu.
     */
    private void MenuItemCarroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCarroActionPerformed
        CarroVIEW carroVIEW = new CarroVIEW();
        this.desktopPane.add(carroVIEW);
        carroVIEW.setVisible(true);
        carroVIEW.setPosicao();
    }//GEN-LAST:event_MenuItemCarroActionPerformed

    
    /**
     * Método para executar os comandos quando o menu MenuItemLocacao for clicado.
     * @param evt evento de clique no menu.
     */
    private void MenuItemLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemLocacaoActionPerformed
        LocacaoVIEW locacaoVIEW = new LocacaoVIEW(funcionarioDTO);
        this.desktopPane.add(locacaoVIEW);
        locacaoVIEW.setVisible(true);
        locacaoVIEW.setPosicao();
    }//GEN-LAST:event_MenuItemLocacaoActionPerformed

    
    
    /**
     * Método para fechar o sistema.
     */ 
    private void sair(){
        Object[] options = { "Sair", "Cancelar" };
        if(JOptionPane.showOptionDialog(null, "Deseja Sair do Sistema", "Informação", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]) == 0){
            System.exit(0);
        } 
    } 
    


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCadastros;
    private javax.swing.JMenuItem MenuItemCarro;
    private javax.swing.JMenuItem MenuItemFuncionario;
    private javax.swing.JMenuItem MenuItemLocacao;
    private javax.swing.JMenuItem MenuItemLocador;
    private javax.swing.JMenuItem MenuItemOsAutores;
    private javax.swing.JMenuItem MenuItemSairSistema;
    private javax.swing.JMenu MenuSair;
    private javax.swing.JMenu MenuSobre;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblusuario;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}//Fecha a classe TelaInicialVIEW
