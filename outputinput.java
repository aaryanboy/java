import java.util.Scanner;
public class outputinput {
 public static void main(String[] args){
    Scanner lo=new Scanner(System.in);
    int a,b;
    String c;
    System.out.println("give me code");
    a=lo.nextInt();
    System.out.println("give me name");
    c=lo.next();
    System.out.println("give me the capacity");
    b=lo.nextInt();
    Aeroplane a1=new Aeroplane();
    a1.getdata(a,c,b);
    a1.putdata();
    a1.helloworld();
 }   
}
