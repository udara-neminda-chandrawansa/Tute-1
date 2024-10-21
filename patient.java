public class patient{
    int patID;
    String patName;

    public patient(int patID, String patName){
        this.patID = patID;
        this.patName = patName;
    }
    public static void main(String[] args){
        // System.out.println("Hi Test");
    }

    public void displayPatient(){
        System.out.println("ID: " + this.patID + " - Name: " + this.patName);
    }
}