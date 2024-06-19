package src;

public class ShapeFactory {


    public Shape createShape(String name) {
        if (name.equals("Circle")) {
            return Circle.draw();
        }
        if(name.equals("Rectangle")) {
            return Rectangle.draw();
        }
        if(name.equals("Square"))
        {
            return Square.draw();
        }
        return null;
    }
}