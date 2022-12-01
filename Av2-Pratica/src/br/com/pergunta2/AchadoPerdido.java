package br.com.pergunta2;

public class AchadoPerdido implements Publicacao{

    private String titulo;
    private String descricao;
    private String foto;
    private String tipo;
    private String local_achado;
    private String data_hora;
    private String status;

    public AchadoPerdido(String titulo, String descricao, String tipo, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.status = status;
    }

    public void completaDados(String foto, String local_achado, String data_hora){
        this.foto = foto;
        this.local_achado = local_achado;
        this.data_hora = data_hora;
    }

    @Override
    public boolean buscarTitulo(String titulo) {
        if(titulo!=null){
            return true;
        }
        return true;
    }

    public String visualizarDetalhes(){
        return "Título: " + titulo + "\nDescrição: " + descricao + "\nFoto: " + foto + "\nTipo" + tipo + "\nLocal Achado: " + local_achado + "\nData e hora: "  + data_hora + "\nStatus: " + status;
    }
}
