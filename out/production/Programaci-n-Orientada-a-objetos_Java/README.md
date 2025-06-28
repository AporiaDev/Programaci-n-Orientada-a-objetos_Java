# Programación Orientada a Objetos (POO)

La **Programación Orientada a Objetos (POO)** es un paradigma que organiza el código en **objetos**. Su propósito es facilitar la **organización y mantenimiento** del código, fomentar la **reutilización**, permitir la **modularidad** y **escalabilidad**, y ofrecer **seguridad** mediante el **encapsulamiento**.

## Objetos

Los objetos son unidades fundamentales que representan entidades del mundo real o conceptos básicos y abstractos dentro de un programa. Un objeto posee características llamadas **atributos**, que son sus propiedades. Sus principales características son:

- **Identidad:** Cada objeto es único, incluso si comparte atributos con otros.
- **Comportamientos:** También llamados **métodos**, son las acciones que un objeto puede realizar.

## Clases

Una **clase** es una plantilla o molde que define las propiedades y comportamientos que tendrán los objetos creados a partir de ella. A través de la **abstracción**, se identifican las características esenciales de un objeto para diseñar la clase correspondiente. De este modo, la clase actúa como un modelo base que permite instanciar múltiples objetos con atributos y métodos específicos.

### Ejemplo de Clases y Objetos en Java

A continuación, se presenta un ejemplo en Java donde se define una clase `Coche` con atributos y métodos. Luego, se crea un objeto de esa clase y se utilizan sus métodos.

```java
// Definición de la clase Coche
public class Coche {
    // Atributos de la clase
    private String marca;
    private String modelo;
    private int año;

    // Constructor de la clase
    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    // Método para obtener la descripción del coche
    public void mostrarDetalles() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Año: " + this.año);
    }

    // Método para simular un arranque del coche
    public void arrancar() {
        System.out.println("El coche " + this.modelo + " está arrancando...");
    }

    // Método para detener el coche
    public void detener() {
        System.out.println("El coche " + this.modelo + " está detenido.");
    }
}

// Clase principal para probar el ejemplo
public class Main {
    public static void main(String[] args) {
        // Creación de un objeto de la clase Coche
        Coche miCoche = new Coche("Toyota", "Corolla", 2020);
        // el metodo conastructo siempre esta después del  New
        // Uso de los métodos del objeto
        miCoche.mostrarDetalles();
        miCoche.arrancar();
        miCoche.detener();
    }
}

```
### Aspectos importantes

## Declaración de un objeto

```java
Persona persona1 = new Persona("Juan", 25);
```
- Persona : se refiere al molde en donde se administrara memoria para persona1 la cual contiene el objeto.
- persona1 : No contiene el objeto, si no que hace referencia a la ubicación del objeto en el espacio de memoria.
- = : Apunta al objeto recien creado en la memoria.
- new :  Reserva espacio en la memoria para el nuevo objeto
- Persona("Juan" , 25) = llama al constructor de la clase Persona
### Constructor
Coche miCoche = new Coche("Toyota", "Corolla", 2020)


Un constructor en Java es un bloque especial de código que se ejecuta cuando se crea una nueva instancia (u objeto) de una clase. Es un tipo de método que se utiliza para inicializar el objeto recién creado, es decir, asignar valores iniciales a las variables de instancia de la clase.
### **Diagramas UML**

Digrama el cual utiliza el Lenguaje Unificado de Modelado, se crean con la finalidad de entender la arquitectura del codigo
- **Estructura**
  
![image](https://github.com/user-attachments/assets/4dda5642-c15b-4700-bc0d-ec0e0be45714)

- **Ejemplo**
  
![image](https://github.com/user-attachments/assets/05ce6a06-3c31-4328-ad2b-0dadf93c83d1)

## **Modularidad**

La modularidad en Java se refiere a la capacidad de dividir un programa en partes más pequeñas, independientes y reutilizables llamadas módulos. Cada módulo contiene clases, interfaces y otros recursos que cumplen una función específica. Esta característica facilita el mantenimiento, la escalabilidad y la colaboración en proyectos grandes.

# Variables Estáticas y Métodos Estáticos en Java

## **Variables Estáticas**
Una **variable estática** en Java pertenece a la clase en lugar de a las instancias (objetos) de esa clase. Esto significa que:
- Es compartida por todas las instancias de la clase.
- Se puede acceder directamente utilizando el nombre de la clase.

### **Sintaxis y Características**
- Se declara usando la palabra clave `static`.
- Solo existe una copia de la variable para toda la clase.

### **Ejemplo de Variable Estática**
```java
public class Contador {
    public static int totalInstancias = 0; // Variable estática compartida.

    public Contador() {
        totalInstancias++; // Incrementar cada vez que se crea un objeto.
    }

    public static void main(String[] args) {
        new Contador();
        new Contador();
        new Contador();

        // Acceso a la variable estática mediante el nombre de la clase
        System.out.println("Total de instancias: " + Contador.totalInstancias); // Output: 3
    }
}
```
---

## **Métodos Estáticos**
Un **método estático** pertenece a la clase en lugar de a las instancias de la clase. Se utiliza cuando el comportamiento no depende de los datos de instancias específicas.

### **Sintaxis y Características**
- Se declara usando la palabra clave `static`.
- Puede ser llamado directamente usando el nombre de la clase.
- No puede acceder a variables o métodos de instancia (no estáticos) directamente.

### **Ejemplo de Método Estático**
```java
public class Utilidades {
    public static int sumar(int a, int b) {
        return a + b; // Operación estática.
    }

    public static void main(String[] args) {
        int resultado = Utilidades.sumar(5, 3); // Llamada al método estático.
        System.out.println("El resultado de la suma es: " + resultado); // Output: 8
    }
}
```
---

# Uso de `final` y Variables Constantes

## **`final` en Java**
La palabra clave **`final`** se utiliza para declarar variables que no pueden cambiar después de su inicialización.

### **Características de `final`:**
- Hace que la variable sea **inmutable** (su valor no puede ser reasignado).
- Puede ser inicializada:
  - En el momento de la declaración.
  - En un constructor (para variables de instancia).

### **Ejemplo de Variable `final`**
```java
public class Persona {
    public final String nombre; // Variable final.

    public Persona(String nombre) {
        this.nombre = nombre; // Inicialización en el constructor.
    }

    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
        System.out.println("Nombre: " + persona.nombre); // Output: Juan
        // persona.nombre = "Pedro"; // Error: no se puede modificar una variable final.
    }
}
```

---

## **Variables Constantes: `static final`**
Una **variable constante** es una combinación de `static` y `final`. Esto significa que:
- **`static`**: Pertenece a la clase (es compartida).
- **`final`**: No puede cambiar su valor una vez asignado.

### **Ejemplo de Variable Constante**
```java
public class Configuracion {
    public static final String NOMBRE_APP = "MiAplicacion"; // Constante.
    public static final double PI = 3.14159;

    public static void main(String[] args) {
        System.out.println("Nombre de la aplicación: " + Configuracion.NOMBRE_APP); // Output: MiAplicacion
        System.out.println("Valor de PI: " + Configuracion.PI); // Output: 3.14159
        // Configuracion.PI = 3.14; // Error: no se puede modificar una constante.
    }
}
```

---

## **Sobrecarga**

También concidca como **overloading**, permite que un metodo tenga el mismo nombre pero con distintos parametros.Es una forma de hacer que el código sea más flexible y legible.

Cuando aplico sobre carga en un constructor puedo instanciar un objeto con diferentes parametros, lo cual permite no abstenerse a crear objetos de un solo tipo.

```java
public class Persona {

    private String nombre;
    private int edad;

    // Constructor por defecto
    public Persona() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    // Constructor con un parámetro
    public Persona(String nombre) {
        this.nombre = nombre;
        this.edad = 0; // Edad predeterminada
    }

    // Constructor con dos parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método sobrecargado para mostrar información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre + ", Edad: " + this.edad);
    }

    // Método sobrecargado para mostrar la información con un saludo adicional
    public void mostrarInformacion(String saludo) {
        System.out.println(saludo + " Nombre: " + this.nombre + ", Edad: " + this.edad);
    }

    // Método sobrecargado para mostrar solo el nombre
    public void mostrarInformacion(boolean mostrarNombreSolo) {
        if (mostrarNombreSolo) {
            System.out.println("Nombre: " + this.nombre);
        } else {
            System.out.println("Nombre: " + this.nombre + ", Edad: " + this.edad);
        }
    }

    public static void main(String[] args) {
        // Crear objetos utilizando diferentes constructores
        Persona persona1 = new Persona();                       // Llama al constructor sin parámetros
        Persona persona2 = new Persona("Carlos");               // Llama al constructor con un parámetro
        Persona persona3 = new Persona("Ana", 25);              // Llama al constructor con dos parámetros

        // Llamadas a métodos sobrecargados
        persona1.mostrarInformacion();               // Muestra "Nombre: Desconocido, Edad: 0"
        persona2.mostrarInformacion("¡Hola! ");      // Muestra "¡Hola! Nombre: Carlos, Edad: 0"
        persona3.mostrarInformacion(true);           // Muestra "Nombre: Ana"
        persona3.mostrarInformacion(false);          // Muestra "Nombre: Ana, Edad: 25"
    }
}


```
## Encapsulamiento

Técnica por la cual se ocultan los detaller internos de una clase y proporcinan acceso a detalles a través de métodos públicos. Ayuda a proteger datos, mejorar la seguridad , aislar el código y facilitar la depuración y mantenimiento

- **Atributos privados:** Son generalvente declarados con **private** para evitar su acceso directo desde fuera de la clase.
- **Metodos públicos:** Los métodos que permiten acceder y modificar esos atributos son **public**. Los dos tipos de métodos más comunes son los **getters**(Permiten leer el valor de un atributo) y **setters**(Permiten modificar el valor de un atributo)

```java
public class Persona {

    // Atributos privados
    private String nombre;
    private int edad;

    // Constructor de la clase
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para modificar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para obtener la edad
    public int getEdad() {
        return edad;
    }

    // Setter para modificar la edad
    public void setEdad(int edad) {
        if (edad >= 0) {  // Validación antes de modificar la edad
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    // Método para mostrar la información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    public static void main(String[] args) {
        // Crear un objeto de la clase Persona
        Persona persona1 = new Persona("Carlos", 30);

        // Acceder a los atributos a través de los métodos getters
        System.out.println("Nombre inicial: " + persona1.getNombre());
        System.out.println("Edad inicial: " + persona1.getEdad());

        // Modificar los atributos a través de los métodos setters
        persona1.setNombre("Juan");
        persona1.setEdad(35);

        // Mostrar la información después de modificarla
        persona1.mostrarInformacion();

        // Intentar modificar la edad con un valor negativo
        persona1.setEdad(-5);  // Esto imprimirá un mensaje de error
    }
}


```
# Stack vs Heap

En la ejecución de programas, existen dos áreas principales de memoria utilizadas: **Stack (Pila)** y **Heap (Montículo)**. Cada una tiene características distintas y se usa en diferentes escenarios.

## 📌 Stack (Pila)
- Se utiliza para **almacenar variables locales y llamadas a funciones**.
- Su tamaño es **limitado** y administrado automáticamente por el sistema operativo.
- Sigue un esquema **LIFO (Last In, First Out)**.
- La memoria se **asigna y libera automáticamente** cuando las funciones entran y salen del contexto.
- Es **más rápida** que el heap debido a su estructura organizada.

### 🔹 Ejemplo en Java:
```java
public class Main {
    void funcion() {
        int x = 10;  // Se almacena en el stack
    }
}
```

## 📌 Heap (Montículo)
- Se usa para **asignación dinámica de memoria**.
- Su tamaño es **mucho mayor** que el stack, pero su acceso es más lento.
- La memoria debe **asignarse y liberarse manualmente** (en Java, el recolector de basura se encarga de liberar la memoria).
- Puede fragmentarse si no se gestiona correctamente.

### 🔹 Ejemplo en Java:
```java
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");  // Se almacena en el heap
    }
}

class Persona {
    String nombre;
    Persona(String nombre) {
        this.nombre = nombre;
    }
}
```

# **Clases Anidadas**

Una clase puede definirse dentro de otra clase. La clase exterior se conoce como **clase padre**, y la clase dentro de ella es la **clase anidada**.

## 📌 Tipos de Clases Anidadas
En Java, las clases anidadas se dividen en dos tipos principales:

### 🔹 Clases Internas
Son clases definidas dentro de otra clase sin usar la palabra clave `static`. Tienen acceso a los miembros de la clase exterior, incluyendo los privados.

#### **1. Clases Internas Normales**
Son clases que se definen dentro de otra clase pero fuera de cualquier método.
```java
class Externa {
    private String mensaje = "Hola desde la clase interna";
    
    class Interna {
        void mostrarMensaje() {
            System.out.println(mensaje); // Puede acceder a los miembros privados
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Externa externa = new Externa();
        Externa.Interna interna = externa.new Interna();
        interna.mostrarMensaje();
    }
}
```

#### **2. Clases Locales a un Método**
Son clases definidas dentro de un método y solo pueden ser utilizadas dentro de ese método.
```java
class Externa {
    void metodoExterno() {
        class Interna {
            void mensaje() {
                System.out.println("Clase interna dentro de un método");
            }
        }
        Interna interna = new Interna();
        interna.mensaje();
    }
}

public class Main {
    public static void main(String[] args) {
        new Externa().metodoExterno();
    }
}
```

#### **3. Clases Internas Anónimas**
Son clases sin nombre que se declaran y se instancian en una única expresión.
```java
abstract class Saludo {
    abstract void mensaje();
}

public class Main {
    public static void main(String[] args) {
        Saludo saludo = new Saludo() { // Clase interna anónima
            void mensaje() {
                System.out.println("Hola desde una clase interna anónima");
            }
        };
        saludo.mensaje();
    }
}
```

### 🔹 Clases Estáticas Anidadas
Son clases que se definen dentro de otra clase usando `static`. No tienen acceso directo a los miembros de la clase externa, a menos que sean estáticos.
```java
class Externa {
    static class Interna {
        void mensaje() {
            System.out.println("Clase estática anidada");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Externa.Interna interna = new Externa.Interna();
        interna.mensaje();
    }
}
```




