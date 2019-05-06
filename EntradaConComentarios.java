import java.util.ArrayList;

public class EntradaConComentarios extends Entrada
{
    private ArrayList<String> comentarios;

    /**
     * Constructor for objects of class EntradaConComentarios
     */
    public EntradaConComentarios(String autor)
    {
        super(autor);
        comentarios = new ArrayList<>();
    }

    public void addComentario(String text){
        comentarios.add(text);
    }

    public String getTextoComentarios() {
        String textoComentarios = "";
        if(comentarios.size() > 0){
            for(String comentarioActual : comentarios){
                textoComentarios += comentarioActual + "\n";
            }
        }
        else{
            textoComentarios += "No hay comentarios";
        }           
        return textoComentarios;
    }

    public String toString (){
        return super.toString() + getTextoComentarios();
    }
}