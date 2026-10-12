package Ecuaciones_Lineales.GaussJordan;
// Importamos la clase que contiene la matriz de prueba.
import Ecuaciones_Lineales.Gauss.Defmatriz;

public class Lanzador_GaussJordan {

        public static void main(String[] args) {

            // PASO 1:
            // Obtenemos la matriz aumentada del sistema de ecuaciones.
            double[][] matriz = Defmatriz.defmatriz();

            // PASO 2:
            // Mostramos la matriz original.
            System.out.println("Matriz aumentada original:");
            imprimirMatriz(matriz);

            // PASO 3:
            // Invocamos el método Gauss-Jordan.
            // La matriz se modifica directamente porque se pasa su referencia.
            double[] soluciones = GaussJordan.resolver(matriz);

            // PASO 4:
            // Mostramos la matriz reducida.
            System.out.println("\nMatriz reducida por Gauss-Jordan:");
            imprimirMatriz(matriz);

            // PASO 5:
            // Mostramos las soluciones de las incógnitas.
            System.out.println("\nSoluciones del sistema:");

            for (int i = 0; i < soluciones.length; i++) {
                System.out.printf("x%d = %.4f%n", i + 1, soluciones[i]);
            }
        }

        /**
         * Imprime una matriz aumentada en la consola.
         *
         * @param matriz Matriz que se desea mostrar.
         */
        public static void imprimirMatriz(double[][] matriz) {

            // Recorremos cada fila de la matriz.
            for (int i = 0; i < matriz.length; i++) {

                // Imprimimos cada elemento de la fila.
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.printf("%12.4f", matriz[i][j]);
                }

                // Saltamos a la siguiente línea al terminar cada fila.
                System.out.println();
            }
        }
}
