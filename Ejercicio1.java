
import java.util.Stack;

/**
 * 
 * @author José David Lozano Ojidos
 * @version 1.0
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		/**
		 * Teniendo un conjunto de nombres: Marta, Clara, Pablo, Marcos. Definir un
		 * objeto de la clase Stack y imprime por pantalla:
		 * 
		 * La cantidad de elementos Extrae un elemento. 
		 * ¿Cuál será el que salga?
		 * ¿Porqué? Muestra cual es el primer elemento Muestra la cantidad de elementos
		 * Elimina todos los elementos
		 */

		Stack<String> nombre = new Stack<String>();

		nombre.push("Marta");
		nombre.push("Clara");
		nombre.push("Pablo");
		nombre.push("Marcos");

		System.out.println("Cantidad de elementos: " + nombre.size());
		
		System.out.println("Extraer elemento: " + nombre.pop());
		System.out.println("Marcos eliminado");
		
		System.out.println("Consultamos el primer elemento de la pila sin extraerlo:" + nombre.peek());
		
		System.out.println("Cantidad de elementos: " + nombre.size());
		
		nombre.clear();
		
		System.out.println("Eliminamos los elementos....");
	}

}
