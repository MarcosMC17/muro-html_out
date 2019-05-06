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
		return super.toString() + "Mensaje: "+ mensaje + "\n";
	}
	
	public void mostrarPorPantalla() {
        System.out.println(this);
    }
	
}











