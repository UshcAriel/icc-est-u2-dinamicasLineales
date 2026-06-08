import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio {

    public String invertString(String texto){

        Deque<Character> pila = new ArrayDeque<>();

        for (Character letra : texto.toCharArray()) {
            pila.push(letra);
        }

        String invertido = "";
        while (!pila.isEmpty()) {
            invertido += pila.peek(); 
        }
        
        return invertido;
    }
    
}
