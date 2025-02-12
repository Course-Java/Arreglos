import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        // Introducir valores a un arreglo
        var consola = new Scanner(System.in);

        // Declarar el arreglo
        System.out.print("Proporciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());

        // Creamos de manera dinámica el arreglo
        var enteros = new int[largoArreglo];

        // Solicitar los valores del arreglo
        for (var i = 0; i < largoArreglo; i++) {
            System.out.print("Proporciona enteros[" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }

        System.out.print("Tu arreglo es = [");

        // Imprimir los valores del arreglo
        for (var i = 0; i < largoArreglo; i++) {
            if (i == largoArreglo - 1) {
                System.out.print(enteros[i]);
                break;
            }
            System.out.print(enteros[i] + ", ");
        }

        System.out.print("]");
    }
}

/*
 * NOTAS:
 * Un arreglo nos permite almacenar múltiples valores en una sola variable
 * tipoDato[] nombreArreglo; -> con los [] corchetes indicamos que es un arreglo de ese tipo de dato (esto solo define un variable de tipo arreglo) (esto ocurre en la memoria stack)
 * nombreArreglo = new tipoDatoUsado[cantidad de espacio para el arreglo] -> usando la palabra reservada new le asignamos la cantidad de espacio que queremos que tenga el arreglo (esto ocurre en la memoria heap)
 * En memoria se crea una variable arreglo que puede apuntar a varios valores
 * Cada casilla del arreglo tienen asignadas un índice que puedes gestionar en los cuales puede almacenar variables del tipo asignado en la inicialización (por el momento se guardan el valor default de la variable (o sea 0 en el caso del int))
 * Recordemos que, por ejemplo, asignamos un espacio de 5 casillas, el índice irá desde 0 hasta n-1 (ya que incluimos el 0 cómo índice)
 * Recordemos que no podemos guardar valores fuera del rango de índices ya que nos saldría error de desbordamiento
 * Hay formas de simplificar la sintaxis de la declaración de arreglos, cómo:
 * int[] enteros = {100, 200, 300, 400, 500}; -> indicar el tipo de dato e indicar que es un arreglo y en la misma linea inicializar valores dentro de unas llaves (la cantidad de valores será la cantidad de espacio con la que se inicializa el arreglo)
 * var enteros = new int[]{100, 200, 300, 400, 500}; -> usando var para luego declarar un arreglo de tipo int para luego, dentro de llaves, colocar los elementos
 */