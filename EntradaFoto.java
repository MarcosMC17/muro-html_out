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
        return super.toString() + "<div class=\"elemento\">" + "<p>" + "Imagen: "+ urlImagen + "</p>" + "</div>" + "<div class=\"elemento\">" + "<p>" + "Titulo: " + titulo + "</p>" + "</div>" ;
    }

    public void mostrarPorPantalla() {
        System.out.println(this);
    }

}
