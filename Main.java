import java.util.Scanner;

class Vehiculo {

    private String marca;
    private double cilindraje;
    private double precio;
    private int numeroChasis;
    private String tipo;

    public Vehiculo(String marca, double cilindraje, double precio, int numeroChasis, String tipo) {

        this.marca = marca;
        this.cilindraje = cilindraje;
        this.precio = precio;
        this.numeroChasis = numeroChasis;
        this.tipo = tipo;
    }

    public double precioDescuento(){
        
        double total = precio;

        if ((precio >= 30000000)&&(precio <= 50000000)){
            total = precio - (precio * 0.1);
        }else if(precio >= 550000000){
            total = precio - (precio * 0.15);
        }else {
            total = precio;
        }
            return total;
    }

}

class VehiculoUsado extends Vehiculo{

    private int kilometraje;
    private String modelo;
    
}


class Concesionario{

    private int NIT;
    private String propietario;
    private String direccion;
    private int telefono;
    private String correo;
     
}

class Vendedores extends Concesionario {

    private String nombreCompleto;
    private int ID;
    private String fechaNacimiento;
    private int telefono;
    private String correoVendedor;
    private String fechaIngreso;
    private double porcentaje;
    private String tipoContrato;


}

public class Main {
    public static void main(String[] args) {

        // Crear 5 objetos de la clase Vehiculo
        Vehiculo vehiculo1 = new Vehiculo("Toyota", 1.8, 20000, 123456, "Sedan");
        Vehiculo vehiculo2 = new Vehiculo("Honda", 2.0, 25000, 789012, "SUV");
        Vehiculo vehiculo3 = new Vehiculo("Ford", 2.5, 30000, 345678, "Pick-Up");
        Vehiculo vehiculo4 = new Vehiculo("Chevrolet", 1.6, 22000, 901234, "Hatchback");
        Vehiculo vehiculo5 = new Vehiculo("BMW", 3.0, 50000, 567890, "Convertible");
        
        // Crear 2 objetos de la clase VehiculoUsado
        VehiculoUsado vehiculoUsado1 = new VehiculoUsado ("Nissan", 2.2, 18000, 112233, "Sedan", 75000, "Altima");
        VehiculoUsado vehiculoUsado2 = new VehiculoUsado ("Mazda", 2.0, 16000, 445566, "SUV", 90000, "CX-5");
        
        
        Scanner inData = new Scanner(System.in);

        System.out.print("Bienvenido al mejor concesionario de vehiculos\nIngrese que accion desea realizar\n");
        System.out.print("1.Cotizar lista de Vehiculos\n2.Comprar nuevo vehiculo\n3.Vender vehiculo");
        int opcion = inData.nextInt();

        //[Proceso para condicionar el menu]
        if (opcion == 1){
            
        }else if (opcion == 2){
            System.out.print("Desea dar un vehiculo en parte de pago?\n1.si\2.no ");
            int opcion_2 = inData.nextInt();
            if (opcion_2 == 1){

            }


        }else if (opcion == 3){

        }else{
            System.out.println("Ingreso una opcion no valida");
        }
        
    }
}

