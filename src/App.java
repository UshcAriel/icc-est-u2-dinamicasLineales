
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        runLinkedList();
        runQueue();
        runStack();
    }

    private static void runLinkedList(){
        System.err.println("Lista Enlazada / LinkedList");
        LinkedList<String> nombres =  new LinkedList<>();
        System.out.println("Esta vacia? " + nombres.isEmpty());
        System.out.println("Tamanio: " + nombres.size());

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Luis");
        nombres.add("Pepe");
        nombres.add("Rosa");
        nombres.add("Elizabet");
        
        System.out.println(nombres.getFirst());
        System.out.println(nombres.get(0));
        System.out.println(nombres.getLast());

        System.out.println(nombres.peek());
        System.out.println(nombres.size());

    }

    private static void runQueue(){

        Queue<String> cola = new ArrayDeque<>();
        cola.offer("jose");
        cola.offer("Marco");
        cola.offer("Maria");
        cola.offer("Luis");

        System.out.println(cola.isEmpty());
        System.out.println(cola.size());

        
        System.out.println(cola.peek());
        System.out.println(cola.size());

        System.err.println(cola.poll());
        System.out.println(cola.size());

        while (!cola.isEmpty()) {
            String cliente = cola.poll();
            System.err.println("Atenti a" + cliente); 
            
        }
    }

    private static void runStack(){
        Stack<String> pila = new Stack<>();
        pila.push("A");
        pila.push("B");
        pila.push("C");
        String elemento = pila.pop();
        System.out.println(pila.size());
        System.out.println(elemento);

        Deque<String> pila2 = new ArrayDeque<>();
        Deque<String> pila3 = new LinkedList<>();
        pila2.push("a");
        pila3.push("A");
        pila.pop();
        pila.pop();
        
    }
}
