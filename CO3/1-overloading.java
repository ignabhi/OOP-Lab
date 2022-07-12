class over
{
    float pi=3.14f;
    int length,bredth,r;

    void area(int r)
    {
        System.out.println("Area of circle : "+(pi*r*r));
    }
    void area(int length,int bredth)
    {
        System.out.println("Area of rectanle : "+(length*bredth));

    }
}
class overloading
{
    public static void main(String args[]) {
        over O=new over();
        O.area(1);
        O.area(2,4);
    
    }
}
