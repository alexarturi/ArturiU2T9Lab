public class CircleRunner {
    public static void main (String []args){
        Circle cir = new Circle(5.0);
        System.out.println(cir.getInfo());
        cir.setRadius(9.2);
        System.out.println(cir.getInfo());
        cir.setRadius(1.2);
        System.out.println(cir.getInfo());
    }
}
