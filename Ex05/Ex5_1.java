package Ex05;

class Point {
    private int x,y;
    public void set(int x, int y) {
        this.x =x; this.y=y;
    }
    public void showPoint() {
        System.out.println("(" +x+","+y+")");
    }
}

class ColorPoint extends Point {
    private String color;
    private void setColor(String color) {
    this.color = color;
    }
    public void show
}


public class Ex5_1 {
    public static void main(String [] args) {
        Point p = new Point();
        p.set(1,2);
    }


    
}