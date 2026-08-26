public class CokeCooler {
    private int amount;

    public CokeCooler(){
        amount = 100;
    }

    public CokeCooler(int a){
        amount = a;
    }

    public void drink(int amt){
        amount -= amt;
    }

    public void refill(int amt){
        amount += amt;
    }

    public void cokeCount(){
        System.out.println(amount);
    }

}
