package task2;

class Rectangle extends Shape {
        public int height;

        public Rectangle(String color, int height) {
            super(color);
            this.height = height;
        }

public int getHeight(){
    return height;

}
public void  setHeight(int height) {
    this.height = height;
        }


        public void print(){
            super.print();
            System.out.println("height "+height);


        }
    }

