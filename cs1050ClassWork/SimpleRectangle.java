/**
 * 
 */

/**
 * 
 */
public class TestSimpleRectangle {

public static void main(String args) {
SimpleRectangle rec1 = new SimpleRectangle();
System.out.println("The radius of rectangle one: " + rec1.defaultRectangle());
}
}

class SimpleRectangle {
private double radius;

double getRadius() {
return radius;
}

double defaultRectangle() {
radius = 1;
return radius;
}


}


