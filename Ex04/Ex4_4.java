package Ex04;

public class Ex4_4 {
    String title;
    String author;
        public Ex4_4(String t){
        title = t;
        author = "작자미상";
}

public Ex4_4(String t, String a) {
    title = t; author = a;
}

public static void main(String[] args) {
    Ex4_4 littlePrince = new Ex4_4("어린왕자","생텍쥐페리");
    Ex4_4 loveStroy = new Ex4_4("춘양전");

    System.out.println(littlePrince.title+ " " + littlePrince.author);
    System.out.println(loveStroy.title+ " " + loveStroy.author);
}
}

