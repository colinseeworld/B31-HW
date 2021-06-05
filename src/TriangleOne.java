class Triangle{
    int sideA;
    int sideB;
    int sideC;

    //'Triangle' without any parameter in its constructor.
    Triangle(){

    }

    public double Area(){
        double semiPerimeter = (sideA + sideB + sideC)/2.0;
        double Area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) *
                (semiPerimeter - sideB) * (semiPerimeter - sideC));
        return Area;
    }

    public double Perimeter(){
        return sideA + sideB + sideC;
    }
}
public class TriangleOne {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.sideA = 3;
        triangle.sideB = 4;
        triangle.sideC = 5;

        System.out.println("Triangle area is: " + triangle.Area());
        System.out.println("Triangle area is: " + triangle.Perimeter());
    }
}
