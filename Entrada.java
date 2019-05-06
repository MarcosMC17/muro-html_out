import java.util.*;
import java.time.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Entrada 
{
    private String usuario;
    private LocalDateTime momentoPublicacion;
    private int cantidadMeGusta;

    public Entrada(String autor){
        usuario = autor;
        momentoPublicacion = LocalDateTime.now();
        cantidadMeGusta = 0; 
    }

    public LocalDateTime getMomentoPublicacion(){
        return momentoPublicacion;
    }

    public void meGusta(){
        cantidadMeGusta++;
    }

    public String toString (){
        String textoADevolver = "";
        textoADevolver = "Usuario: " + getUsuario() + "\n";
        textoADevolver += getTiempoPasadoDesdeLaPublicacion() + "\n";
        textoADevolver += "Likes: " + getCantidadMeGusta() + "\n";
        System.out.println(textoADevolver);
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

    public int getCantidadMeGusta() {
        return cantidadMeGusta;
    }

}
