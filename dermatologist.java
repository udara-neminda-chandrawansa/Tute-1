public class dermatologist{
    int dermID;
    String dermName;

    public dermatologist(int dermID, String dermName){
        this.dermID = dermID;
        this.dermName = dermName;
    }

    public void bookDermatologist(ArrayList<appointment> app){
        dermList.put(this, app);
    }

    public static void main(String[] args){
        // System.out.println("Hi Test");
    }
}