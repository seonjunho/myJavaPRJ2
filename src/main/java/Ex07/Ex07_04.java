package Ex07;

import java.io.IOException;
import java.util.Scanner;

public class Ex07_04 {
    public static void main(String[] args) throws IOException { //쓰루에 에러를 던져라 그러면 뒤 문구에서 에러에대한 처리한다.
        Scanner sc = new Scanner(System.in);
        int a, b;
        char ch;

        while(true) {  // 조건이 들어가면 반복된다.
            System.out.printf("계산할 첫번째 수를 입력 :");
            a = sc.nextInt();
            System.out.printf("계산할 두번째 수를 입력 :");
            b = sc.nextInt();
            System.out.printf("계산할 세번째 수를 입력 :");
            ch = (char) System.in.read(); //예외 확률이 있는 구문
            switch (ch){
                case '+':   //case마다 break 필수
                    System.out.printf("%d + %d = %d 입니다\n", a, b, a+b); break;
                case '-':
                    System.out.printf("%d - %d = %d 입니다\n", a, b, a-b); break;
                case '*':
                    System.out.printf("%d * %d = %d 입니다\n", a, b, a*b); break;
                case '/':
                    System.out.printf("%d / %d = %d 입니다\n", a, b, a/b); break;
                case '%':
                    System.out.printf("%d %% %d = %d 입니다\n", a, b, a%b); break;
                default:
                    System.out.printf("연산자를 잘못 입력했습니다. \n");
            }
        }

    }
}
