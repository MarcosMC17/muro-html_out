import java.util.*;
import java.time.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Entrada 
{
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;
    private int fotoPerfil;

    public Entrada(String autor){
        usuario = autor;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0; 
        fotoPerfil = 0;
    }

    public LocalDateTime getMomentoPublicacion(){
        return momentoPublicacion;
    }

    public void meGusta(){
        cantidadMeGusta++;
    }

    public String toString(){
        return "";
    }
    
    public String toHTML(){
        String textoADevolver = "";
        textoADevolver =  "<div class=\"divFperfil\">" + "<img class=\"fperfil\"src=\"img/"+ fotoPerfil + ".png\"/> </div>";
        textoADevolver += "<div class=\"divUsuario\">" + "<p>" + "Usuario: " + getUsuario() + "</p>" + "</div>";
        textoADevolver += "<div class=\"divTiempo\">" + "<p>" + getTiempoPasadoDesdeLaPublicacion() + "</p>" + "</div>";
        textoADevolver += "<div class=\"divLikes\">" + "<p>" + "Likes: " + getCantidadMeGusta() + "</p>" + "</div>";
        textoADevolver += toString();
        return textoADevolver;
    }

    public String getTiempoPasadoDesdeLaPublicacion() {
        String textoADevolver = "";
        LocalDateTime momentoActual = LocalDateTime.now();
        long tiempoTranscurridoSegundos = momentoPublicacion.until(momentoActual, ChronoUnit.SECONDS);
        long tiempoTranscurridoMinutos = 0;
        if(tiempoTranscurridoSegundos > 59) {
            tiempoTranscurridoMinutos = tiempoTranscurridoSegundos / 60;
            tiempoTranscurridoSegundos = tiempoTranscurridoSegundos - tiempoTranscurridoMinutos * 60;
            if(tiempoTranscurridoMinutos == 1) {
                textoADevolver += "Hace " + tiempoTranscurridoMinutos + " minuto y " + tiempoTranscurridoSegundos + " segundos";
            }
            else {
                textoADevolver += "Hace " + tiempoTranscurridoMinutos + " minutos y " + tiempoTranscurridoSegundos + " segundos";
            }
        }
        else {
            textoADevolver += "Hace " + tiempoTranscurridoSegundos + " segundos";
        }
        return textoADevolver;
    }

    public String getUsuario() {
        return usuario;
    }
    
    public void setFoto(int nuevaFoto){
        fotoPerfil = nuevaFoto;
    }
    
    public int getFoto(){
        return fotoPerfil;
    }

    public int getCantidadMeGusta() {
        return cantidadMeGusta;
    }

}
