public class ScoreMain {
    public static void main(String[] args) {
        Score s = new Score();
        Score s1 = new Score();

        s.SetScore(20);
        s.EarnScore(20);
        s.GiveScore();
        
        s1.EarnScore(20);
        s1.GiveScore();
    }
}
