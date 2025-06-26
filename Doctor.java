public class Doctor {

    //Features

    int id;
    String name;
    String specialization;

    //Methods

    // builder

    public Doctor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
    }
    public void showName(){
        System.out.println(name + id + specialization);
    }
}
