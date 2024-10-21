import java.util.ArrayList;

public class Dermatologist {
    int dermID;
    String dermName;

    public Dermatologist(int dermID, String dermName) {
        this.dermID = dermID;
        this.dermName = dermName;
    }

    // Method to book appointments for the dermatologist
    public void bookDermatologist(ArrayList<Appointment> app) {
        Clinic.dermList.put(this, app); // Access Clinic's dermList statically
    }

    public static void main(String[] args) {
        // System.out.println("Hi Test");
    }
}