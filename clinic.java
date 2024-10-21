import java.util.ArrayList;
import java.util.HashMap;

public class clinic{
    
    // hashmap for dermatologists which contains the arraylist of appointments
    // for each dermatologist
    public static HashMap<dermatologist, ArrayList<appointment>>dermList = new HashMap<>();

    

    public static void main(String[] args){
        // System.out.println("Hi Test");
        patient udara = new patient(1, "Udara");
        udara.displayPatient();

        appointment app1 = new appointment(1, "2024-10-20", "10:15");
        dermatologist d = new dermatologist(1, "Kasun");

        if(checkAvailability("2024-10-20", "10:00", app1)){
            // d.bookDermatologist(null); check again
        }
    }

    public static Boolean checkAvailability(String Date, String Time, appointment app){
        if(app.appDate == Date && app.appTime == Time){
            return false;
        }else{
            return true;
        }
    }
}