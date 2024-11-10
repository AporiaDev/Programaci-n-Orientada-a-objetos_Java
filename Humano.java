import java.util.Scanner;

class Poo{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Humano person = new Humano("Bryan",  25);

    //Llamar los metodos 
    System.out.println("Nombre: " + person.getNombre());
    System.out.println("Edad: "+ person.getEdad());

    //Llamar a metodo para imprimir informacion
    person.printInformacion();

    }
}

public class Humano{

    private String nombre;
    private int edad;

    //Constructor
    public Humano(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Metodo para obtener un nombre
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    //Metodo para imprimir informacion
    public  void printInformacion(){
        System.out.println("Nombre: " + nombre+ ", Edad: "+ edad);
    }
    //Usar en el main
}

class Persona{
     //Atributos para una clase Persona
    String nombree = "Bryan";
    String ApellidoPaterno = "Silva";
    String ApellidoMaterno = "Vergel";
    int edadd;
    int peso;
}
class PruebaPersona{
    public static void main(String args[]){
    Persona persona1 = new Persona();  

        System.out.println("Nombre: " + persona1.nombree);
        System.out.println("Apellidos: " + persona1.ApellidoPaterno + " " + persona1.ApellidoMaterno);

    }
}
/*La Programacion Orientada a Objetos es un estilo para programar conociendose esto como "paradigma"
    Clase: Represetacion de una entidad a trabajar, tiene caracteristicas y comportamientos
    Entidad: Una enttidad es un objeto de una clase creada
    Metodos: Los metodos son los comportmientos que puede tener una clase
    Abstracción: Proceso por el cual tomamos un problemaa real  y lo aplicacamos en POO
    Atributos: tambien conocidaas como; campo y variables de instancia, son las caracteristicas de las clases

 */

 //void al utiliazar void simplemete ejecuta una instruccionde lo que hat dentro de el metodo sin devolver
 //ningun valor


 /*
Podemos organizar los métodos en tres tipos, teniendo en cuenta aspectos sintácticos y semánticos:
 Constructores. Métodos que inicializan la instancia
 Métodos genéricos. Realizan acciones utilizando los atributos
 Métodos para accesos directo a los atributos (getters & setters). Estos métodos son opcionales y
suelen utilizarse más en clases de tipo “entidad”, es decir, que tienen persistencia en bases de
datos, o en los “beans”, donde tienen una correspondencia con formularios. Aunque estos
métodos son realmente generales, los distinguimos por separado por tener unas normas
concretas de estilo 
  */

  /*Constructores
   * Los constructores son métodos especiales que reúnen las tareas de inicialización de los objetos de una
clase; por lo tanto, el constructor establece el estado inicial de todos los objetos que se instancian.
No es obligatorio definir constructores, si no se realiza, existe un constructor por defecto sin parámetros.
La ejecución del constructor es implícita a la creación de una instancia.
La restricción sintáctica del constructor es que debe llamarse igual que la clase y no devuelve ningún tipo
ni lleva la palabra void.
Como ejemplo añadimos un constructor a la clase Punto:
public class Punto{
private int x,y;
public Punto(int x, int y){}
...
}

   */


/*Sobrecarga de metodos
 * 
 */