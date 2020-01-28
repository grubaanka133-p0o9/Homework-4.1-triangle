public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1,1,1);
        Right right = new Right();
        if (right.isItTriangle(triangle)) {
            System.out.println("Is the triangle with sides " + triangle.a + ", " + triangle.b + ", " + triangle.c +
                    " right?: " + right.isRightTriangle(triangle));
        } else {
            System.out.println("This is not a triangle");
        }
    }
}
