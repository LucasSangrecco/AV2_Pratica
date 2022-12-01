package br.com.pergunta1;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        String dataCriacao;
        String nomeUsuario;
        String dataNascimento;
        String senha;
        String dataPublicacao;
        String textoPublicacao;
        String linkMidia;



        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/aaaa HH:mm:ss");
        Date data = new Date();

        JOptionPane.showMessageDialog(null, "Faça seu Cadastro: ");
        nomeUsuario = JOptionPane.showInputDialog("Digite o seu nome de usuario: ");
        dataNascimento = JOptionPane.showInputDialog("Digite a data do seu nascimento: ");
        senha = JOptionPane.showInputDialog("Digite sua senha: ");
        dataCriacao= sdf.format(data);

        RedeSocial usuario = new RedeSocial(dataCriacao,nomeUsuario,dataNascimento, senha);

        JOptionPane.showMessageDialog(null, "Faça uma publicação: ");
        textoPublicacao = JOptionPane.showInputDialog("Digite o texto da publicação: ");
        linkMidia = JOptionPane.showInputDialog("Insira o link da publicação: ");
        dataPublicacao = sdf.format(data);

        Publicacao publicacao1 = new Publicacao(dataPublicacao, textoPublicacao,linkMidia);
        usuario.InserePublicacao(publicacao1);

        JOptionPane.showMessageDialog(null, "Faça uma publicação: ");
        textoPublicacao = JOptionPane.showInputDialog("Digite o texto da publicação: ");
        linkMidia = JOptionPane.showInputDialog("Insira o link da publicação: ");
        dataPublicacao = sdf.format(data);

        Publicacao publicacao2 = new Publicacao(dataPublicacao, textoPublicacao,linkMidia);
        usuario.InserePublicacao(publicacao2);

        usuario.ImprimePublicacao();

    }
}
