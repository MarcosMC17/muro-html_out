
public class EntradaEvento extends Entrada
{
    private String mensajeEvento;

    /**
     * Constructor for objects of class EntradaEvento
     */
    public EntradaEvento(String autor, String mensaje)
    {
        super(autor);
        mensajeEvento = mensaje;
    }

    public String toString (){
        return super.toString() + "Evento: "+ mensajeEvento + "\n";
    }    

    public void mostrarPorPantalla() {
        System.out.println(this);
    }
}