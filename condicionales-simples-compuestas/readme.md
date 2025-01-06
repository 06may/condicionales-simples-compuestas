### CONDICIONALES SIMPLES Y COMPUESTAS

### Programa para verificar si un número es negativo

Este programa en Java utiliza una estructura condicional para determinar si un número entero es negativo. Si el número es menor que cero, muestra el mensaje "El número es negativo." De lo contrario, muestra "El número no es negativo."

### Código

    public class numNegativo {
    public static void main(String[] args) {
        
    // Número entero fijo

        int numero = 100;

        // Estructura condicional para verificar si el número es negativo

        if (numero < 0) {

            System.out.println("El número es negativo.");

        } else {

            System.out.println("El número no es negativo.");

         }

       }

    } 

### Verificar si un número es múltiplo de otro

Este programa en Java determina si un número entero es divisible por otro, es decir, si el primero es múltiplo del segundo. Incluye validación para evitar divisiones por cero.

### Descripción

El programa realiza los siguientes pasos:
1. Declara dos números enteros (`NumberOne` y `NumberTwo`).
2. Verifica si el divisor (`NumberTwo`) es cero.
   - Si es cero, muestra un mensaje de error.
3. Evalúa si `NumberOne` es divisible por `NumberTwo` usando el operador módulo (`%`).
   - Si el residuo es cero, muestra que es múltiplo.
   - De lo contrario, indica que no es múltiplo.

### Código

    package variables;

    public class Multiplos {

    public static void main(String[] args) {

        // Declaración de variables

        int NumberOne = 10;

        int NumberTwo = 5;

        // Verificación de múltiplos

        if (NumberOne == 0) {

            System.out.println("Error: no se puede dividir por cero");
        } else if (NumberOne % NumberTwo == 0) {


            System.out.println(NumberOne + " es múltiplo de " + NumberTwo);

        } else {

            System.out.println(NumberOne + " no es múltiplo de " + NumberTwo);

         }

      }

    }


### Determinar si el estudiante ha pasado o no la asignatura

A partir de una calificación decimal, el programa determinará si el estudiante ha aprobado o reprobado una asignatura según las siguientes reglas:
•	Si la calificación está entre 0 y 6, el estudiante no ha aprobado.
•	Si la calificación está entre 7 y 10, el estudiante ha aprobado.
•	Si la calificación está fuera del rango 0 a 10, se mostrará un mensaje indicando que la calificación no es válida.

### codigo

    package variables; 

    public class CalificacionEstudiante { 

    public static void main(String[] args) { // Inicio del método principal

        double decimal = 5.5; // Declarar e inicializar la variable de calificación

        // Evaluar si la calificación está dentro del rango válido

        if (decimal < 0 || decimal > 10) { // Comprobar si la calificación está fuera del rango 0-10 


            System.out.println("La calificación debe estar entre 0 y 10."); // Imprimir mensaje de rango invalido


        } else if (decimal <= 6) { // Comprobar si la calificación es menor o igual a 6

            System.out.println("Estás reprobado."); // Imprimir mensaje de reprobado

        } else { // Si la calificación es mayor a 6

            System.out.println("Aprobaste."); // Imprimir mensaje de aprobado

          } 

      } 

    } 



### Determinar el nivel alcanzado en una prueba de capacitación

El programa evalúa el nivel alcanzado por un candidato en una prueba de capacitación basándose en el porcentaje de respuestas correctas. Los niveles se determinan según los siguientes criterios:
•	Nivel máximo: porcentaje igual o superior al 90%.
•	Nivel medio: porcentaje entre 75% y menos de 90%.
•	Nivel regular: porcentaje entre 50% y menos de 75%.
•	Fuera de nivel: porcentaje inferior al 50%.

### codigo

    public class Porcentajes { 

    public static void main(String[] args) { // Inicio del método principal

        int porcentaje = 70; // Declarar e inicializar el porcentaje

        // Evaluar el nivel basado en el porcentaje

        if (porcentaje >= 90) { // Comprobar si el porcentaje es mayor o igual a 90

            System.out.println("Es nivel máximo."); // Imprimir nivel máximo

        } else if (porcentaje >= 75 && porcentaje < 90) { // Comprobar si está entre 75 y menos de 90

            System.out.println("Es nivel medio."); // Imprimir nivel medio

        } else if (porcentaje >= 50 && porcentaje < 75) { // Comprobar si está entre 50 y menos de 75

            System.out.println("Es nivel regular."); // Imprimir nivel regular

        } else { // Si no cumple ninguna de las condiciones anteriores

            System.out.println("Es inferior.");

          } 

      } 

    } 

