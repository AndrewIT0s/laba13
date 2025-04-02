package task2;

public class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void print(){
        System.out.println("color:"+color);
    }
}


