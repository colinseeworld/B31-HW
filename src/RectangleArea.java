class Rectangle{
    int length;
    int breadth;

    //length and breadth passed as parameters to its constructor.
    Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    public int Area(){
        return length * breadth;
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(5,8);

        System.out.println("The area for rectangle with sides (4,5) is: " + rectangle1.Area());
        System.out.println("The area for rectangle with sides (5,8) is: " + rectangle2.Area());
    }
}
