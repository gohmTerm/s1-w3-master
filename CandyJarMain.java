public class CandyJarMain{
    public static void main(String[] args) {
        CandyJar j = new CandyJar();
        CandyJar j1 = new CandyJar();



        j.refill(10);
        j.printState();

        j1.refill(20);
        j1.printState();
    }
}