package Ecuaciones_Lineales.Gauss;

public class Defmatriz {
    public static double[][] defmatriz() {
        return new double[][] {
                /**
                 * Define y devuelve la matriz aumentada del sistema.
                 *
                 * Cada fila representa una ecuación.
                 * La última columna contiene los términos independientes.
                 */
                { 3.0, -0.1, -0.2,  7.85 },
                { 0.1,  7.0, -0.3, -19.3 },
                { 0.3, -0.2, 10.0,  71.4 }
        };
    }
}
