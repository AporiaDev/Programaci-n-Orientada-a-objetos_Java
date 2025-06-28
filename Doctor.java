public class Doctor {
    //Features

    static int id = 0;
    String name;
    String specialization;

    //Methods

    // builder

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        id++;
    }
    public void showName(){
        System.out.println(name + id + specialization);
    }
    public void showId(){System.out.println("Id Doctor: " + id + " name: " + name);}
}
