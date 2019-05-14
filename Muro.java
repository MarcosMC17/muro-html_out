import java.util.ArrayList;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
public class Muro
{
    // instance variables - replace the example below with your own
    private ArrayList <Entrada> entradas;
    Path rutaArchivo = Paths.get("./html/index.html");
    private int contadorFoto; 

    public Muro()
    {
        entradas = new ArrayList <Entrada> ();
        contadorFoto = 1;
    }

    public void addEntrada (Entrada entrada)
    {
        entrada.setFoto(contadorFoto);
        entradas.add(entrada);
        contadorFoto++;
        if(contadorFoto>20){
            contadorFoto=1;
        }
    }

    public String toString()
    {
        String info = "";
        for (Entrada entrada : entradas){
            info += entrada + "\n";
        }
        return info;
    }

    public void mostrarMuroEnNavegador(){
        String info = "";
        for (Entrada entrada : entradas){
            info += "<div class=\"fila\">" + entrada.toHTML() + "</div>";
        }

        try  
        {
            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);
            archivo.write(
                "<html>"+
                "<head>" +
                    "<link rel=\"stylesheet\" href=\"estilos.css\">"+
                    "<meta charset=\"UTF-8\">" + 
                    "<div class=\"header\">"+
                        "<img class=\"logo\" src=\"logo.png\"/>"+
                        "<h1>Twotter</h1>"+
                    "</div>"+
                "</head>" +
                "<body>" +          
                    "<div class=\"tabla\">" +
                        info +
                    "</div>"+
                "</body>" +
                "</html>"
            );
            archivo.close();
        }
        catch (IOException excepcion) {
            System.out.println(excepcion.toString());
        }
    }
}