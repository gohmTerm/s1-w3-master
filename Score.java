public class Score {
    private int score;

    public Score(){
        score = 50;
    }

    public void SetScore(int a){
        score = a;
    }

    public void EarnScore(int a){
        score += a;
    }

    public void DecScore(int a){
        score -= a;
    }

    public int GiveScore(){
        return score;
    }
}
