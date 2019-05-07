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

    public Muro()
    {
        entradas = new ArrayList <Entrada> ();
    }

    public void addEntrada (Entrada entrada)
    {
        entradas.add(entrada);

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
            info += "<div class=\"fila\">" + entrada + "</div>";
        }

        try  
        {
            BufferedWriter archivo = Files.newBufferedWriter(rutaArchivo);
            archivo.write(
                "<html>"+
                "<head>" + 
                "</head>" +
                "<body>" +
                "<img src=\"./html/img/logo.png\"/>" +
                "<p>Twotter</p>" +             
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