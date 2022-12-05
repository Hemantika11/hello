package P.Datatype;

public class Datatype
{
    public static void main(String[] args)
    {
        //INTEGER FAMILY
        //Byte range is -128 to 127
        byte a=100;
        byte j=20;
        System.out.println("a="+a);
        System.out.println("ARITHMATIC OPERATORS");
        System.out.println(a+j);
        System.out.println(a-j);
        System.out.println(a*j);
        System.out.println(a/j);
        System.out.println(++a);
        System.out.println(a--);

        //Short range is -32768 to 32767
        short b=32660;
        System.out.println("b="+b);

        //Int Range is -2,147,483,648 to 2,147,483,647
        int d=600000;
        System.out.println("d="+d);

        //Long range is -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long c=90000L;
        System.out.println("c="+c);

        //FLOAT FAMIY
        //float range is 3.4E-38 to 3.4E+38

        float f=125.0342f;
        System.out.println("f="+f);
        //double range is approximately 1.8*(10)308

        double x=105.14536;
        System.out.println("x="+x);

        //CHARACTER FAMILY
        //character range is unicode value(single range value)
        char h='V';
        System.out.println("h="+h);

        //BOOLEAN FAMILY
        //boolean range is less than 1 bit.
         boolean s= true;
         boolean k=false;
         System.out.println("s="+s);
         System .out.println("k="+k);






    }
}
