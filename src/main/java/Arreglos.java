public class Arreglos {
    public static void main(String[] args) {
        // Arreglo
        var enteros = new int[5];

        // Modificar los elementos
        enteros[0] = 13;
        enteros[1] = 21;
        enteros[4] = 62;
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
 */