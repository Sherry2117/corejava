package abstractexample.abstractkeywords;


abstract class Shape{
    abstract void draw();
}
//In real scenario, implementation is provided by others. unknown by end user.

class Rectangle extends Shape{
    void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("drawing Circle");
    }
}

//In real scenario, method is called by programmer/user.

public class Test1 {
    public static void main(String[] args) {
        Shape s = new Circle(); //in a real scenario, object is provided through method eg. getShape method
        s.draw();
    }
}
