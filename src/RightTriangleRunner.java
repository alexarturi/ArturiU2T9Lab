public class RightTriangleRunner {
    public static void main(String[]args){
        RightTriangle r1 = new RightTriangle(3,4);
        RightTriangle r2 = new RightTriangle(6.5,10.7);
        RightTriangle r3 = new RightTriangle(3.14, 5.34);
        double length1 = r1.hypotenuse();
        double length2 = r2.hypotenuse();
        double length3 = r3.hypotenuse();
        System.out.println(length1);
        System.out.println(length2);
        System.out.println(length3);
    }
}
