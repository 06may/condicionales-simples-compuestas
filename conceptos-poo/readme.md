### CONCEPTOS DE POO

### Ejercicio Ciudad

Este ejercicio consiste en crear un proyecto en Java llamado `EjercicioCiudad`, que permita almacenar la información de una ciudad mediante dos clases: `Ciudad` y la clase principal para ejecutar el programa. 

### Requisitos:

1. **Clase Ciudad**: - Atributos: `nombre`, `población`, `país`, `presidente`. - Se deben crear los **Getters** y **Setters** correspondientes para cada atributo. - Incluir un constructor para inicializar los atributos (puede ser un constructor sin parámetros o con parámetros).

2. **Clase Principal**: - En la clase principal, se deben mostrar los datos almacenados de la ciudad utilizando los **Getters**.

### Codigo 

    public class Main {

    public static void main(String[] args) {

        // Crear un objeto de la clase Ciudad con los datos específicos

        Ciudad ciudad = new Ciudad("Acapulco", "México", "Abelina", 1000.00);

        // Llamar al método dataCiudad del objeto ciudad para mostrar la información

        ciudad.dataCiudad();

    }


    public static class Ciudad {

    // Atributos privados de la clase Ciudad

    private String nombre, pais, presidente;

    private double poblacion;

    // Constructor de la clase Ciudad

    public Ciudad(String nombre, String pais, String presidente, double poblacion) {

        this.nombre = nombre;

        this.presidente = presidente;

        this.pais = pais;

        this.poblacion = poblacion;

    }    

    // Métodos Getter para obtener los valores de los atributos

    public String getNombre() {

        return nombre;

    }

    public String getPais() {

        return pais;

    }

    public String getPresidente() {

        return presidente;

    }

    public double getPoblacion() {

        return poblacion;

    }    

    // Métodos Setter para modificar los valores de los atributos
    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public void setPais(String pais) {

        this.pais = pais;

    }

    public void setPresidente(String presidente) {

        this.presidente = presidente;

    }

    public void setPoblacion(double poblacion) {

        this.poblacion = poblacion;

    }

    // Método para mostrar los datos de la ciudad

    public void dataCiudad() {

        System.out.println("Nombre de la ciudad: " + nombre);

        System.out.println("País al que pertenece: " + pais);

        System.out.println("Presidente Actual: " + presidente);

        System.out.println("Población Total: " + poblacion);

     }

    }

### Casa 1

### Descripción del Proyecto **Casa**: tiene como objetivo almacenar y mostrar la información básica de una casa, como la ciudad, barrio, color, número de pisos, habitaciones, baños y cocinas. Estos atributos son constantes y se inicializan dentro de la clase **Casa**. 

### Clases 1. 

**Clase Casa**: - La clase **Casa** contiene los siguientes 

**atributos**: - **ciudad**: Ciudad donde se encuentra la casa

**barrio**: El barrio donde está ubicada la casa. 

**color**: El color de la casa. 

**pisos**: Número de pisos en la casa. 

**habitaciones**: Número de habitaciones en la casa.

**baños**: Número de baños en la casa.

**cocinas**: Número de cocinas en la casa.

**Constantes**: Los atributos de la clase **Casa** se consideran constantes, lo que significa que no pueden modificarse una vez que la casa haya sido creada. 

**Métodos Getters**: - Para acceder a los valores de estos atributos, se crean métodos **getters**. Un getter es un método que devuelve el valor de un atributo. 

2. **Clase Principal**: - En la clase principal, se crea un objeto de tipo **Casa** y se inicializan los valores de sus atributos a través del constructor de la clase **Casa**.  Luego, se utiliza los **getters** para mostrar la información de la casa en la consola. **Flujo de trabajo**: - Se crea un objeto de la clase **Casa** con los valores iniciales. - Se llaman los **getters** para obtener y mostrar los valores de los atributos de la casa. 

### codigo 

    public class casaUno {   // Se definen los atributos de la casa, con valores constantes que no cambian.

    final String ciudad = "Acapulco"; // Atributo constante para el nombre de la ciudad.

    final String barrio = "La Marquesa"; // Atributo constante para el barrio de la casa.

    final String color = "Azul"; // Atributo constante para el color de la casa.

    final byte pisos = 2; // Atributo constante que representa la cantidad de pisos de la casa.

    final byte habitaciones = 3; // Atributo constante que representa la cantidad de habitaciones en la casa.

    final byte banios = 3; // Atributo constante que representa la cantidad de baños en la casa.

    final byte cocinas = 1; // Atributo constante que representa la cantidad de cocinas en la casa.

    // Métodos getter para obtener los valores de los atributos.

    public String getCiudad() {

        return ciudad; // Retorna el nombre de la ciudad.

    }

    public String getBarrio() {

        return barrio; // Retorna el nombre del barrio.

    }

    public String getColor() {

        return color; // Retorna el color de la casa.

    }

    public byte getPisos() {

        return pisos; // Retorna la cantidad de pisos en la casa.

    }

    public byte getHabitaciones() {

        return habitaciones; // Retorna la cantidad de habitaciones en la casa.

    }

    public byte getBanios() {

        return banios; // Retorna la cantidad de baños en la casa.

    }

    public byte getCocinas() {

        return cocinas; // Retorna la cantidad de cocinas en la casa.

     }

    }

    class ejercicioCasaUno {

    // Método principal para ejecutar el programa.

    public static void main(String[] args) {

        casaUno casa = new casaUno(); // Se crea un objeto de la clase casaUno.

        // Se imprimen los detalles de la casa utilizando los getters.

        System.out.println("Ciudad: " + casa.getCiudad()); 

        System.out.println("Barrio: " + casa.getBarrio()); 

        System.out.println("Color: " + casa.getColor()); 

        System.out.println("Pisos: " + casa.getPisos()); 

        System.out.println("Habitaciones: " + casa.getHabitaciones()); 

        System.out.println("Baños: " + casa.getBanios()); 

        System.out.println("Cocinas: " + casa.getCocinas()); 

     }

    }

### Casa 2: Uso de Constructores

### Descripción del ejercicio

Replica el ejercicio anterior, pero en este caso, en lugar de utilizar valores constantes para los atributos, se deben inicializar mediante **constructores**. Los constructores permitirán pasar los valores de los atributos al crear un objeto de la clase `Casa`.

### Requisitos:

1. **Primer Constructor**: Este constructor recibirá los siguientes parámetros:

   - Ciudad

   - Barrio

   - Color

2. **Segundo Constructor**: Este constructor recibirá los siguientes parámetros:

   - Barrio

   - Color

   - Pisos

3. **Tercer Constructor**: Este constructor recibirá los siguientes parámetros:

   - Pisos

   - Habitaciones

   - Baños

   - Cocinas

### En la clase principal:

   - Se deben crear tres objetos diferentes, cada uno representando a una casa construida con uno de los tres constructores. 
   
   - Para cada objeto creado, se utilizarán los **getters** para obtener y mostrar la información almacenada en los atributos de cada casa.

### Codigo 

    public class CasaDos { 
  
    // Definición de los atributos de la clase CasaDos.

    private String ciudad; // Atributo de tipo String para la ciudad.

    private String barrio; // Atributo de tipo String para el barrio.

    private String color; // Atributo de tipo String para el color.

    private byte pisos; // Atributo de tipo byte para los pisos.

    private byte habitaciones; // Atributo de tipo byte para las habitaciones.

    private byte banios; // Atributo de tipo byte para los baños.

    private byte cocinas; // Atributo de tipo byte para las cocinas.

    // Primer constructor: inicializa ciudad, barrio y color.

    public CasaDos(String ciudad, String barrio, String color){

        this.ciudad = ciudad; // Asigna el valor de ciudad al atributo ciudad.

        this.barrio = barrio; // Asigna el valor de barrio al atributo barrio.

        this.color = color; // Asigna el valor de color al atributo color.

    }

    // Segundo constructor: inicializa barrio, color y pisos.

    public CasaDos(String barrio, String color, byte pisos){

        this.barrio = barrio; // Asigna el valor de barrio al atributo barrio.

        this.color = color; // Asigna el valor de color al atributo color.

        this.pisos = pisos; // Asigna el valor de pisos al atributo pisos.

    }

    // Tercer constructor: inicializa pisos, habitaciones, baños y cocinas.

    public CasaDos(byte pisos, byte habitaciones, byte banios, byte cocinas){

        this.pisos = pisos; // Asigna el valor de pisos al atributo pisos.

        this.habitaciones = habitaciones; // Asigna el valor de habitaciones al atributo habitaciones.

        this.banios = banios; // Asigna el valor de banios al atributo banios.

        this.cocinas = cocinas; // Asigna el valor de cocinas al atributo cocinas.

    }

    // Métodos getter para obtener los valores de los atributos.

    public String getCiudad() { 

        return ciudad; // Retorna el valor del atributo ciudad.

    }

    public String getBarrio() { 

        return barrio; // Retorna el valor del atributo barrio.

    }

    public String getColor() { 

        return color; // Retorna el valor del atributo color.

    }

    public byte getPisos() { 

        return pisos; // Retorna el valor del atributo pisos.

    }

    public byte getHabitaciones() { 

        return habitaciones; // Retorna el valor del atributo habitaciones.

    }

    public byte getBanios() { 

        return banios; // Retorna el valor del atributo banios.

    }

    public byte getCocinas() { 

        return cocinas; // Retorna el valor del atributo cocinas.

      }

    }

    class EjercicioCasaDos {

    public static void main(String[] args){

        // Se crea una casa usando el primer constructor.

        CasaDos casa1 = new CasaDos("Acapulco", "La Marquesa", "Beige"); 

        System.out.println("Casa 1");

        System.out.println("Ciudad: "+casa1.getCiudad()+"."); // Imprime la ciudad de casa1.

        System.out.println("Barrio: "+casa1.getBarrio()+"."); // Imprime el barrio de casa1.

        System.out.println("Color: "+casa1.getColor()+"."); // Imprime el color de casa1.

        // Se crea una casa usando el segundo constructor.

        CasaDos casa2 = new CasaDos("La Marquesa", "Azul", (byte) 2); 

        System.out.println("Casa 2");

        System.out.println("Barrio: "+casa2.getBarrio()+"."); // Imprime el barrio de casa2.

        System.out.println("Color: "+casa2.getColor()+"."); // Imprime el color de casa2.

        System.out.println("Pisos: "+casa2.getPisos()+"."); // Imprime los pisos de casa2.

        // Se crea una casa usando el tercer constructor.

        CasaDos casa3 = new CasaDos((byte) 2, (byte) 3, (byte) 2, (byte) 1); 

        System.out.println("Casa 3");

        System.out.println("Pisos: "+casa3.getPisos()+"."); // Imprime los pisos de casa3.

        System.out.println("Habitaciones: "+casa3.getHabitaciones()+"."); // Imprime las habitaciones de casa3.

        System.out.println("Baños: "+casa3.getBanios()+"."); // Imprime los baños de casa3.

        System.out.println("Cocinas: "+casa3.getCocinas()+"."); // Imprime las cocinas de casa3.

      }

    }
