package Graphics;
interface interface_graphics{
    public void rectangleArea(int l, int h);
    public void circleArea(int r);
    public void squareArea(int a);
    public void triangleArea(int l, int h);
}

public class Graphics implements interface_graphics {
    
    public void  rectangleArea(int l, int h){
        System.out.println("Area of Rectangle : "+l*h) ;
    }
    public void circleArea(int r){
        System.out.println("Area of Circle : "+3.14*r*r);
    }
    public void squareArea(int a){
        System.out.println("Area of Square : "+a*a);
    }
    public void triangleArea(int l, int h){
        System.out.println("Area of Triangle : "+(l*h)/2);
    }
    
}
