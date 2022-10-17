public class RightTriangle {
    private double base;
    private double height;

    public RightTriangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double hypotenuse(){
        return Math.sqrt(Math.pow(base,2.0)+Math.pow(height,2.0));
    }
}
