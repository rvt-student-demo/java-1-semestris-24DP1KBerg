package rvt;

// add this if your other files use a package:
// package rvt;

public class Box {

    // Exercise 1 – make fields private (immutable box)
    private final double width;
    private final double height;
    private final double length;

    // Constructor: Box(width, height, length)
    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    // Constructor: Box(side) – cube
    public Box(double side) {
        this(side, side, side);
    }

    // Exercise 3 – copy constructor: Box(Box oldBox)
    public Box(Box oldBox) {
        this.width = oldBox.width();
        this.height = oldBox.height();
        this.length = oldBox.length();
    }

    // ---- Public methods ----

    // Volume of the box
    public double volume() {
        return width * height * length;
    }

    // Exercise 2 – area() using private helper methods
    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    // Exercise 3 – access methods (getters)
    public double width() {
        return this.width;
    }

    public double height() {
        return this.height;
    }

    public double length() {
        return this.length;
    }

    // Exercise 4 – biggerBox: 25% larger in every dimension
    public static Box biggerBox(Box oldBox) {
        return new Box(
            1.25 * oldBox.width(),
            1.25 * oldBox.height(),
            1.25 * oldBox.length()
        );
    }

    // Exercise 4 – smallerBox: 25% smaller in every dimension
    public static Box smallerBox(Box oldBox) {
        return new Box(
            0.75 * oldBox.width(),
            0.75 * oldBox.height(),
            0.75 * oldBox.length()
        );
    }

    // Exercise 5 – does THIS box fit inside outsideBox (no rotation)?
    public boolean nests(Box outsideBox) {
        return this.width  < outsideBox.width()  &&
               this.height < outsideBox.height() &&
               this.length < outsideBox.length();
    }

    // ---- Private helper methods for area() (Exercise 2) ----

    // front face: width × height
    private double faceArea() {
        return width * height;
    }

    // top face: width × length
    private double topArea() {
        return width * length;
    }

    // side face: height × length
    private double sideArea() {
        return height * length;
    }
}

