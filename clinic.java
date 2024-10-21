import java.util.ArrayList;
import java.util.HashMap;

public class Clinic {

    // HashMap for dermatologists which contains the ArrayList of appointments
    // for each dermatologist
    public static HashMap<Dermatologist, ArrayList<Appointment>> dermList = new HashMap<>();

    public static void main(String[] args) {
        // Create a new patient
        Patient udara = new Patient(1, "Udara");
        udara.displayPatient();

        // Create a new appointment
        Appointment app1 = new Appointment(1, "2024-10-20", "10:15");

        // Create a new dermatologist
        Dermatologist d = new Dermatologist(1, "Kasun");

        // Check availability of the appointment slot
        if (checkAvailability("2024-10-20", "10:00", app1)) {
            ArrayList<Appointment> appointments = new ArrayList<>();
            appointments.add(app1);

            // Book the appointment for the dermatologist
            d.bookDermatologist(appointments);
        }
    }

    // Method to check availability of an appointment
    public static Boolean checkAvailability(String Date, String Time, Appointment app) {
        if (app.appDate.equals(Date) && app.appTime.equals(Time)) {
            return false; // Time slot is not available
        } else {
            return true; // Time slot is available
        }
    }
}