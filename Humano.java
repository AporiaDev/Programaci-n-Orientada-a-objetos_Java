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