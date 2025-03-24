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
