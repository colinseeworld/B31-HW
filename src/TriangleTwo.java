class Triangles{
    int sideA;
    int sideB;
    int sideC;

    //'Triangle' with constructor having the three sides as its parameters.
    Triangles(int a, int b, int c){
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
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
public class TriangleTwo {
    public static void main(String[] args) {
        Triangles triangle = new Triangles(3,4,5);

        System.out.println("Triangle area is: " + triangle.Area());
        System.out.println("Triangle area is: " + triangle.Perimeter());
    }
}
