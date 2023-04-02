package New_pj;

import java.util.Scanner;

public class Quiz_001 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();

        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
