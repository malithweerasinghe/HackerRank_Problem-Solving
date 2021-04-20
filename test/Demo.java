class Myclass{

   byte a;
   short b;
   int c;
   long d;
   float e;
   double f;
   char g;

  boolean h;

  Box b1;
  string name;
  int[] xr;
  Random r;

}


public class Demo {

    public static void main(String args[]){
        MyClass c1=new MyClass();
        System.out.println("byte  : "+c1.a);
        System.out.println("short : "+c1.b);
        System.out.println("int   : "+c1.c);
        System.out.println("long  : "+c1.d);
        System.out.println("float : "+c1.e);
        System.out.println("double: "+c1.f);
        System.out.println("char  : "+c1.g);
        System.out.println("boolean: "+c1.h);
        
        System.out.println("Box   : "+c1.b1);
        System.out.println("String: "+c1.name);
        System.out.println("int[] : "+c1.xr);
        System.out.println("Random: "+c1.r);
    }
}
