package task2;

class Circle extends Shape {
    private int  radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }


    public void print(){
        super.print();
        System.out.println("radius "+radius);


    }
}
