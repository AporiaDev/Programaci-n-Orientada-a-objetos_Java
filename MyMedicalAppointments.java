public class MyMedicalAppointments {

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Brayn", "cirujano");
        doctor.showId();
        Doctor doctor2 = new Doctor("Brenda", "cirujano");
        doctor2.showId();

        UIMenu.showMenu();
    }
}
