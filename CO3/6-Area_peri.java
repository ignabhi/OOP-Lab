import java.util.Scanner;
interface task
{
    public void area();
    public void perimeter();

}
 class Circle implements task
{
    int r;
    float ar;
    float peri;
    public void area()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the radius  : ");
    r=sc.nextInt();
    ar=3.14f*r*r;
    }
    public void perimeter()
    {
        peri=2*3.14f*r ;
        System.out.println("Perimeter of circle  : "+peri);
        System.out.println("Area of circle  : "+ar);
    }
}
class Rectangle implements task
{

    int l,b;
    float ar;
    float peri;
    public void area()
    {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter the length  : ");
    l=sc.nextInt();
    System.out.println("Enter the breadth  : ");
    b=sc.nextInt();
    ar=l*b;
    }
    public void perimeter()
    {
        peri=2*l*b;
        System.out.println("Perimeter of Rectangle  : "+peri);
        System.out.println("Area of Rectangle  : "+ar);
    }
}
class Area_peri
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("\n----------MENU----------\n");
        System.out.println("\t1. Circle\n\t2. Rectangle\n");
        System.out.println("Enter your choice : ");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
            task t1=new Circle();
            t1.area();
            t1.perimeter(); 
            break;
            case 2:
            task t2=new Rectangle();
            t2.area();
            t2.perimeter(); 
            break;
            default:
            System.out.println("Enter valid choice  ");

                break;
        }
    }
}
