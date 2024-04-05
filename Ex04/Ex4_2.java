package Ex04;

import java.util.Scanner;

public class Ex4_2 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print(">> ");
        rect.width = scanner.nextInt();
        rect.high = scanner.nextInt();
        System.out.println("사각형의 면적은 " + rect.getArea());
        scanner.close();
        
    }
    
}

class Rectangle {
    int width;
    int high;
    public int getArea(){
        return width*high;
    }
}