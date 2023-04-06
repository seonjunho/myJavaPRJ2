package Ex08;
public class New_Ex08 {
    public static void main(String[] args) {
        int score[] = {68, 67, 76, 55, 70};

        int SUM = 0;
        float average = 0f;

        for(int i = 0; i < score.length; i++){
            SUM += score[i];
        }
        average = SUM / (float)score.length;

        System.out.println("합 : "+SUM);
        System.out.println("평균 : "+average);
    }
}
