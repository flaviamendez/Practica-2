package mates;

public class Matematicas {

    /**
     * Calcula el valor aproximado de pi utilizando un enfoque recursivo.
     * 
     * @param pasos El número de pasos para realizar el cálculo.
     * @return El valor aproximado de pi.
     */
    public static double piRecursivo(long pasos) {
        return generarNumeroPiRecursivo(pasos, 0, 0);
    }

    private static double generarNumeroPiRecursivo(long pasos, long contador, long puntosDentroDelCirculo) {
        if (contador == pasos) {
            
            // La probabilidad de que un punto esté dentro del círculo es π/4, por lo que multiplicamos por 4 el ratio
            return 4.0 * (double) puntosDentroDelCirculo / pasos;
        } else {
            double x = Math.random();
            double y = Math.random();

            // Si el punto generado está dentro del círculo de radio 1, incrementamos el contador
            if (x * x + y * y <= 1) {
                puntosDentroDelCirculo++;
            }
            // Llamada recursiva con el siguiente contador
            return generarNumeroPiRecursivo(pasos, contador + 1, puntosDentroDelCirculo);
        }
    }
}