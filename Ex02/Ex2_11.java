package Ex02;

import java.util.Scanner;

public class Ex2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하세요:");
        int age = scanner.nextInt();
        if ((age>=20)&&(age<30)) {
            System.out.print("20대입니다. ");
            System.out.println("20대라서 행복한디요");            
        }
        else
            System.out.println("20대가 아닌디요");

        scanner.close();
    }
    
}
