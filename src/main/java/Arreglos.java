public class Arreglos {
    public static void main(String[] args) {
        // Arreglo
        //int[] enteros = {100, 200, 300, 400, 500};
        var enteros = new int[]{100, 200, 300, 400, 500};

        for (var i = 0; i < enteros.length; i++) {
            System.out.println("Valor " + (i + 1) + " : " + enteros[i]);
        }

        // Imprimir el arreglo -> nos da la dirección de memoria (ya que variable apunta a un arreglo que se encuentra en la memoria heap)
        System.out.println("Imprimir el arreglo: " + enteros);
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