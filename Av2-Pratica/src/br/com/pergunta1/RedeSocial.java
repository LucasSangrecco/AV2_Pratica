package br.com.pergunta1;

import java.util.ArrayList;

public class RedeSocial {

    private String dataCriacao;
    private String nomeUsuario;
    private String dataNascimento;
    private String senha;

    ArrayList<Publicacao> publicacoes = new ArrayList<>();

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void InserePublicacao(Publicacao publi){
        publicacoes.add(publi);
    }
    public void ImprimePublicacao(){
            double totalPublicacoes = 0;
        for(int i=0;i<publicacoes.size();i++){
            totalPublicacoes = publicacoes.get(i).getContadorPublicacao();
            Publicacao p = (Publicacao)publicacoes.get(i);
            System.out.println("Texto publicado: " + p.getTextoPublicacao());
            System.out.println("Data de publicação: " + p.getDataPublicacao());
        }
        System.out.println("Total de Publicações:" + totalPublicacoes);
    }
}
