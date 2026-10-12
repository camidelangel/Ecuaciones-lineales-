# Método de Gauss modularizado

Este proyecto implementa el **Método de Eliminación Gaussiana** para resolver sistemas de ecuaciones lineales.
El programa transforma una matriz aumentada en una matriz triangular superior mediante eliminación Gaussiana 
y posteriormente obtiene las soluciones mediante sustitución regresiva.

### Clase Gauss.java

Contiene la lógica principal del método numérico.

Incluye los métodos:

* `eliminacionGaussiana()`
* `sustitucionRegresiva()`

### Clase DefMatrizz.java

Contiene la matriz aumentada correspondiente al sistema de ecuaciones que será resuelto.

### Clase LanzadorGauss.java

Es la clase principal del programa. Se encarga de obtener la matriz, ejecutar la eliminación Gaussiana, 
realizar la sustitución regresiva y mostrar los resultados.

## Sistema de ecuaciones utilizado

El programa resuelve el siguiente sistema:

```text
3x1 - 0.1x2 - 0.2x3 = 7.85

0.1x1 + 7x2 - 0.3x3 = -19.3

0.3x1 - 0.2x2 + 10x3 = 71.4
```

La matriz aumentada utilizada es:

```text
[ 3.0  -0.1  -0.2   7.85 ]
[ 0.1   7.0  -0.3 -19.30 ]
[ 0.3  -0.2  10.0  71.40 ]
```

## Ejemplo de prueba

### Entrada

El programa utiliza la siguiente matriz:

```text
[ 3.0  -0.1  -0.2   7.85 ]
[ 0.1   7.0  -0.3 -19.30 ]
[ 0.3  -0.2  10.0  71.40 ]
```

### Resultado esperado

```text
x1 = 3.0000
x2 = -2.5000
x3 = 7.0000
```

El programa está dividido en tres clases, cada una con una responsabilidad específica:
```text
DefMatriz: proporciona los datos
    
LanzadorGauss: ejecuta el proceso
    
Gauss:  Eliminación Gaussiana y Sustitución regresiva
```
Esta separación permite mantener el código organizado, facilitar su comprensión y permitir modificaciones futuras sin tener que cambiar todo el programa.

## Datos del alumno
Instituto Tecnológico Superior de Xalapa.

Métodos Numéricos.

Víctor Hugo Vásquez Herrera

**Unidad 3 — Método de Gauss**

Sistemas Computacionales 3ro "B"

Camila amor del angel cervantes 

7/10/2026
