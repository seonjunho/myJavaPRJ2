package Ex08;

public class Ex08_ball {

    public static void main(String[] args) {

        int ball[] = new int[6];


        for(int i = 0; i < 6 ; i++){
            ball[i] = (int)(Math.random()*45)+1;

            for (int j = 0; j <i ; j++){
                if(ball[i] == ball[j]){
                    i--;
                    break;
                }
            }
        }
        System.out.print("ball No :");
        for(int i = 0; i < 6; i++){
            System.out.print(ball[i]+" ");
        }
    }
}
