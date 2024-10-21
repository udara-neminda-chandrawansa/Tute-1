public class Patient {
    int patID;
    String patName;

    public Patient(int patID, String patName) {
        this.patID = patID;
        this.patName = patName;
    }

    public void displayPatient() {
        System.out.println("ID: " + this.patID + " - Name: " + this.patName);
    }

    public static void main(String[] args) {
        // System.out.println("Hi Test");
    }
}