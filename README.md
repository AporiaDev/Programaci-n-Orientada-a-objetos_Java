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
        
        // Uso de los métodos del objeto
        miCoche.mostrarDetalles();
        miCoche.arrancar();
        miCoche.detener();
    }
}

```
### **Diagramas UML**

Digrama el cual utiliza el Lenguaje Unificado de Modelado, se crean con la finalidad de entender la arquitectura del codigo
- **Estructura**
  
![image](https://github.com/user-attachments/assets/4dda5642-c15b-4700-bc0d-ec0e0be45714)

- **Ejemplo**
  
![image](https://github.com/user-attachments/assets/05ce6a06-3c31-4328-ad2b-0dadf93c83d1)

## **Modularidad**

La modularidad en Java se refiere a la capacidad de dividir un programa en partes más pequeñas, independientes y reutilizables llamadas módulos. Cada módulo contiene clases, interfaces y otros recursos que cumplen una función específica. Esta característica facilita el mantenimiento, la escalabilidad y la colaboración en proyectos grandes.


