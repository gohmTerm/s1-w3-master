public class Refillable {
    private int amount;

    public Refillable(){
        amount = 10;
    }

    public Refillable(int a){
        amount = a;
    }

    public void useUp(int a){
        amount -= a;
    }

    public void addTo(int a){
        amount += a;
    }

    public int ReportAmt(){
        return amount;
    }

}
