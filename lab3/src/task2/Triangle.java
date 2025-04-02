package task2;

class Triangle  extends Shape{

        public int  area;

        public Triangle(String color, int area) {
            super(color);
            this.area = area;
        }


        public void print(){
            super.print();
            System.out.println("area "+area);


        }
    }


