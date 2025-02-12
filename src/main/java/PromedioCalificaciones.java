import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio de Calificaciones ***");

        var consola = new Scanner(System.in);

        System.out.print("¿Cuantas calificaciones deseas agregar? ");
        var largoArregloCalificaciones = Integer.parseInt(consola.nextLine());

        var calificaciones = new int[largoArregloCalificaciones];

        for (var i = 0; i < largoArregloCalificaciones; i++) {
            System.out.print("Calificacion[" + i + "] = ");
            calificaciones[i] = Integer.parseInt(consola.nextLine());
        }

        var sumatoriaCalificaciones = 0;

        for (var i = 0; i < largoArregloCalificaciones; i++) {
            sumatoriaCalificaciones += calificaciones[i];
        }

        var promedioCalificaciones = sumatoriaCalificaciones / largoArregloCalificaciones;

        System.out.println("Promedio de las calificaciones: " + promedioCalificaciones);
    }
}
