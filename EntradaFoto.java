import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class EntradaFoto extends EntradaConComentarios {

    private String urlImagen;
    private String titulo;

    public EntradaFoto(String autor, String url, String titulo){
        super(autor);
        urlImagen = url;
        this.titulo = titulo;
    }

    public String getUrlImagen(){
        return urlImagen;
    }

    public String getTituloImagen(){
        return titulo;
    }

    public String toString (){
        return "<div class=\"divFoto\">" + "<img class=\"foto\"src=\""+ urlImagen + "\"/>" + "</div>" + "<div class=\"divPieFoto\">" + "<p>" + "Titulo: " + titulo + "</p>" + "</div>" + super.toString();
    }

    public void mostrarPorPantalla() {
        System.out.println(this);
    }

}
