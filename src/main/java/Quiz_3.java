import java.util.Scanner;

public class Quiz_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("숫자를 입력하세요. : \n");
        a = s.nextInt();

        System.out.printf("입력 값 : %d \n", a);
        System.out.printf("\n");

        if (a % 3 == 0) {
            if (a % 5 == 0)
                System.out.printf("3의 배수와 5의 배수를 둘다 만족합니다.\n");
            else {
                System.out.printf("3의 배수입니다. \n");
            }
        }
        else{
        if (a % 5 == 0) {
            System.out.printf("5의 배수입니다. \n");
        }
    }
}
}


