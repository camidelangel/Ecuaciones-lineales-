package Ecuaciones_Lineales.GaussJordan;
//Importamos la clase Gauss que está en otro paquete.
// Así reutilizamos la eliminación gaussiana ya implementada.
import Ecuaciones_Lineales.Gauss.Gauss;
public class GaussJordan {

        /**
         * Resuelve un sistema de ecuaciones lineales mediante
         * el método de Gauss-Jordan.
         *
         * Reutiliza la eliminación gaussiana para triangular
         * la matriz y después normaliza los pivotes y elimina
         * los coeficientes que están arriba de cada pivote.
         *
         * @param matriz Matriz aumentada del sistema [A | b].
         * @return Arreglo con las soluciones de las incógnitas.
         */
        public static double[] resolver(double[][] matriz) {

            // Número de ecuaciones e incógnitas del sistema.
            int n = matriz.length;

            // PASO 1:
            // Reutilizamos el método de Gauss del otro paquete.
            // Este método transforma la matriz en triangular superior.
            Gauss.eliminacionGaussiana(matriz);

            // PASO 2:
            // Recorremos los renglones desde el último hasta el primero.
            // En cada renglón convertimos el pivote en 1 y eliminamos
            // los coeficientes que están por encima de él.
            for (int i = n - 1; i >= 0; i--) {

                // Obtenemos el pivote de la diagonal principal.
                double pivote = matriz[i][i];

                // Comprobamos que el pivote no sea cero.
                // Si es cero, no podemos normalizar esa fila.
                if (Math.abs(pivote) < 1e-12) {
                    throw new ArithmeticException(
                            "No se puede continuar: pivote cero o muy cercano a cero."
                    );
                }

                // PASO 3:
                // Dividimos todos los elementos de la fila entre
                // el pivote para convertirlo en 1.
                for (int j = 0; j <= n; j++) {
                    matriz[i][j] = matriz[i][j] / pivote;
                }

                // PASO 4:
                // Recorremos las filas que están arriba del pivote.
                for (int k = i - 1; k >= 0; k--) {

                    // Obtenemos el coeficiente que queremos convertir en cero.
                    double factor = matriz[k][i];

                    // Restamos a la fila superior el producto de
                    // ese coeficiente por la fila del pivote.
                    for (int j = 0; j <= n; j++) {
                        matriz[k][j] =
                                matriz[k][j] - factor * matriz[i][j];
                    }
                }
            }

            // PASO 5:
            // Extraemos las soluciones de la última columna.
            // La matriz ya tiene unos en la diagonal principal
            // y ceros en los demás coeficientes de cada fila.
            double[] soluciones = new double[n];

            for (int i = 0; i < n; i++) {
                soluciones[i] = matriz[i][n];
            }

            // Devolvemos el vector de soluciones.
            return soluciones;
        }
}

