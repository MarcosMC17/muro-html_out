import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class EntradaTexto extends EntradaConComentarios {

    private String mensaje;

    public EntradaTexto(String autor, String texto){
        super(autor);
        mensaje = texto;
    }

    public String getMensaje(){
        return mensaje;
    }

    public String toString (){
        return "<div class=\"divMensaje\">" + "<p>" + "Mensaje: " + mensaje + "\n" + "</p>" + "</div>" + super.toString();
    }

    public void mostrarPorPantalla() {
        System.out.println(this);
    }

}






