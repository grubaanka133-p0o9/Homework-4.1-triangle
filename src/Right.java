public class Right {
    boolean isRightTriangle(Triangle triangle) {
        return ((square(triangle.a) + square(triangle.b) == square(triangle.c)) || (square(triangle.c) + square(triangle.b)
                == square(triangle.a)) || (square(triangle.a) + square(triangle.c) == square(triangle.b)));

    }

    double square(double a) {
        return a * a;
    }

    boolean isItTriangle(Triangle triangle){
        return (triangle.a + triangle.b > triangle.c) && (triangle.c + triangle.b > triangle.a) &&
                (triangle.a + triangle.c > triangle.b);
    }

}
