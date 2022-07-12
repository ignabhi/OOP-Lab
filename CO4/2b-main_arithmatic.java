import Arithmatic.*;

class main_arithmatic {
    public static void main(String []args){
        Arithmatic testObj = new Arithmatic();
        System.out.println("sum  : "+testObj.add(1,2));
        System.out.println("Difference : "+testObj.substract(1,2));
        System.out.println("product : "+testObj.multiple(1,2));
        System.out.println("division : "+testObj.divide(5,2));
        System.out.println("remainder : "+testObj.remainder(11,2));
    }
}
