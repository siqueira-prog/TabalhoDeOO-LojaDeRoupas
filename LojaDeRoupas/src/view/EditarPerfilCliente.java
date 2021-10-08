package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EditarPerfilCliente implements ActionListener {
    // [DEFININDO VARIÁVEIS]

    // JANELA
    private static JFrame janela = new JFrame("Cliente");
    private static JLabel titulo = new JLabel("Cliente - Editar Perfil ");
    private static JLabel subtitulo1 = new JLabel("Infomações Pessoais");
    private static JLabel subtitulo2 = new JLabel("Infomações de Endereço");
    private static JLabel subtitulo3 = new JLabel("Infomações do Cartão de Crédito");

    // INFORMAÇÕES PESSOAIS

    // Input nome
    private static JLabel labelNome = new JLabel("Didigite seu nome:");
    private static JTextField fieldNome = new JTextField();

    // Input CPF
    private static JLabel labelCPF = new JLabel("Didigite seu CPF:");
    private static JTextField fieldCPF = new JTextField();

    // Input email
    private static JLabel labelEmail = new JLabel("Didigite seu email:");
    private static JTextField fieldEmail = new JTextField();

    // Input DDD
    private static JLabel labelDDD = new JLabel("DDD:");
    private static JTextField fieldDDD = new JTextField();

    // Input telefone
    private static JLabel labelTele = new JLabel("Telefone:");
    private static JTextField fieldTele = new JTextField();

    // Input senha
    private static JLabel labelSenha = new JLabel("Didigite sua senha:");
    JPasswordField senha = new JPasswordField();

    // Input confirmar senha
    private static JLabel labelConfirmSenha = new JLabel("Repita sua senha:");
    JPasswordField confirmSenha = new JPasswordField();

    // ENDEREÇO

    // Logradouro
    private static JLabel labelLogradouro = new JLabel("Logradouro:");
    private static JTextField fieldLogradouro = new JTextField();

    // Numero do Endereço
    private static JLabel labelNumeroEnd = new JLabel("Nº:");
    private static JTextField fieldNumeroEnd = new JTextField();

    // Bairro
    private static JLabel labelBairro = new JLabel("Bairro:");
    private static JTextField fieldBairro = new JTextField();

    // CEP
    private static JLabel labelCep = new JLabel("CEP:");
    private static JTextField fieldCep = new JTextField();

    // Cidade
    private static JLabel labelCidade = new JLabel("Cidade");
    private static JTextField fieldCidade = new JTextField();

    // Estado
    private static JLabel labelEstado = new JLabel("Estado");
    private static JTextField fieldEstado = new JTextField();

    // CARTÃO DE CRÉDITO

    // Bandeira
    private static JLabel labelBand = new JLabel("Didigite a bandeira do cartão:");
    private static JTextField fieldBand = new JTextField();

    // Número do Cartão
    private static JLabel labelNumCart = new JLabel("Didigite o número do seu cartão:");
    private static JTextField fieldNumCart = new JTextField();

    // Código de Segurança
    private static JLabel labelCodSeg = new JLabel("Didigite o código de segurança:");
    private static JTextField fieldCodSeg = new JTextField();

    // Input data de nascimento
    private static JLabel labelDataNasc = new JLabel("Digite a sua data de nascimento:");
    private static JTextField fieldDataNasc = new JTextField();

    // Input data de vencimento do cartão
    private static JLabel labelDataVenc = new JLabel("Digite a data de vencimento do cartão:");
    private static JLabel labelMesVenc = new JLabel("Mês:");
    private static JLabel labelAnoVenc = new JLabel("Ano:");

    private static JTextField fieldMesVenc = new JTextField();
    private static JTextField fieldAnoVenc = new JTextField();

    // Botões

    private static JButton cadastrar = new JButton("Cadastrar");
    private static JButton cancelar = new JButton("Cancelar");
    private static JButton excluir = new JButton("Excluir");

    public EditarPerfilCliente() {

        // JANELA

        janela.setLayout(null);

        titulo.setFont(new Font("Arial", Font.BOLD, 20));
        titulo.setBounds(20, 20, 250, 50);
        subtitulo1.setFont(new Font("Arial", Font.BOLD, 14));
        subtitulo1.setBounds(20, 80, 250, 50);
        subtitulo2.setFont(new Font("Arial", Font.BOLD, 14));
        subtitulo2.setBounds(380, 80, 250, 50);
        subtitulo3.setFont(new Font("Arial", Font.BOLD, 14));
        subtitulo3.setBounds(730, 80, 250, 50);
        cadastrar.setBounds(20, 640, 250, 50);
        cadastrar.setBackground(Color.GREEN);
        cancelar.setBounds(380, 640, 250, 50);
        excluir.setBounds(730, 640, 250, 50);
        excluir.setBackground(Color.RED);

        // INFORMAÇÕES PESSOAIS

        // Input nome
        labelNome.setBounds(20, 110, 250, 50);
        fieldNome.setBounds(20, 150, 250, 50);

        // Input CPF
        labelCPF.setBounds(20, 190, 250, 50);
        fieldCPF.setBounds(20, 230, 250, 50);

        // Input email
        labelEmail.setBounds(20, 270, 250, 50);
        fieldEmail.setBounds(20, 310, 250, 50);

        // Input DDD
        labelDDD.setBounds(20, 350, 50, 50);
        fieldDDD.setBounds(20, 390, 50, 50);

        // Input telefone
        labelTele.setBounds(90, 350, 250, 50);
        fieldTele.setBounds(90, 390, 180, 50);

        // Iput senha
        labelSenha.setBounds(20, 430, 250, 50);
        senha.setBounds(20, 470, 250, 50);

        // Input confirmar senha
        labelConfirmSenha.setBounds(20, 510, 250, 50);
        confirmSenha.setBounds(20, 550, 250, 50);

        // ENDEREÇO

        // Input logradouro
        labelLogradouro.setBounds(380, 110, 250, 50);
        fieldLogradouro.setBounds(380, 150, 250, 50);

        // Input Numero Endereço
        labelNumeroEnd.setBounds(380, 190, 50, 50);
        fieldNumeroEnd.setBounds(380, 230, 50, 50);

        // Input bairro
        labelBairro.setBounds(450, 190, 200, 50);
        fieldBairro.setBounds(450, 230, 180, 50);

        // Iput cep
        labelCep.setBounds(380, 270, 250, 50);
        fieldCep.setBounds(380, 310, 250, 50);

        // Input cidade
        labelCidade.setBounds(380, 350, 250, 50);
        fieldCidade.setBounds(380, 390, 250, 50);

        // Input estado
        labelEstado.setBounds(380, 430, 250, 50);
        fieldEstado.setBounds(380, 470, 250, 50);

        // CARTÃO DE CRÉDITO

        // Input bandeira
        labelBand.setBounds(730, 110, 250, 50);
        fieldBand.setBounds(730, 150, 250, 50);

        // Input numero do cartão
        labelNumCart.setBounds(730, 190, 250, 50);
        fieldNumCart.setBounds(730, 230, 250, 50);

        // Input código de segurança
        labelCodSeg.setBounds(730, 270, 250, 50);
        fieldCodSeg.setBounds(730, 310, 250, 50);

        // Iput data de nascimento
        labelDataNasc.setBounds(730, 350, 250, 50);
        fieldDataNasc.setBounds(730, 390, 250, 50);

        // Input data de vencimento do cartão

        labelDataVenc.setBounds(730, 430, 250, 50);
        labelMesVenc.setBounds(730, 450, 250, 50);
        labelAnoVenc.setBounds(880, 450, 250, 50);
        fieldMesVenc.setBounds(730, 490, 100, 50);
        fieldAnoVenc.setBounds(880, 490, 100, 50);

        // [ADICIONANDO A JANELA]
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setVisible(true);
        janela.setSize(1024, 768);
        janela.add(titulo);
        janela.add(subtitulo1);
        janela.add(subtitulo2);
        janela.add(subtitulo3);

        janela.add(cadastrar);
        janela.add(cancelar);
        janela.add(excluir);

        // Informações pessoais

        janela.add(labelNome);
        janela.add(fieldNome);
        janela.add(labelCPF);
        janela.add(fieldCPF);
        janela.add(labelEmail);
        janela.add(fieldEmail);
        janela.add(labelDDD);
        janela.add(fieldDDD);
        janela.add(labelTele);
        janela.add(fieldTele);
        janela.add(labelSenha);
        janela.add(senha);
        janela.add(labelConfirmSenha);
        janela.add(confirmSenha);

        // Endereço

        janela.add(labelLogradouro);
        janela.add(fieldLogradouro);
        janela.add(labelNumeroEnd);
        janela.add(fieldNumeroEnd);
        janela.add(labelBairro);
        janela.add(fieldBairro);
        janela.add(labelCep);
        janela.add(fieldCep);
        janela.add(labelCidade);
        janela.add(fieldCidade);
        janela.add(labelEstado);
        janela.add(fieldEstado);

        // Cartão de Crédito

        janela.add(labelBand);
        janela.add(fieldBand);
        janela.add(labelNumCart);
        janela.add(fieldNumCart);
        janela.add(labelCodSeg);
        janela.add(fieldCodSeg);
        janela.add(labelDataNasc);
        janela.add(fieldDataNasc);
        janela.add(labelDataVenc);
        janela.add(labelMesVenc);
        janela.add(labelAnoVenc);
        janela.add(fieldMesVenc);
        janela.add(fieldAnoVenc);

    }

    public void editarPerfil() {
        EditarPerfilCliente editarperfilcliente = new EditarPerfilCliente();
        cadastrar.addActionListener(editarperfilcliente);
        cancelar.addActionListener(editarperfilcliente);
        excluir.addActionListener(editarperfilcliente);
    }

    public static void main(String[] args) {
        EditarPerfilCliente editarperfilcliente = new EditarPerfilCliente();
        cadastrar.addActionListener(editarperfilcliente);
        cancelar.addActionListener(editarperfilcliente);
        excluir.addActionListener(editarperfilcliente);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object src = e.getSource();
        if (src == cadastrar) {
            JOptionPane.showMessageDialog(null, "Cadastro efetivado com sucesso!", null,
                    JOptionPane.INFORMATION_MESSAGE);
            janela.dispose();
        }
        if (src == cancelar) {
            janela.dispose();
        }
        if (src == excluir) {
            JOptionPane.showMessageDialog(null, "Perfil excluído com sucesso!", null, JOptionPane.INFORMATION_MESSAGE);
            janela.dispose();
        }
    }
}
