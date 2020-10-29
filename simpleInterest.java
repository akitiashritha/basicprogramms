import java.util.*;
class simpleInterest{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double p = sc.nextDouble();
double r = sc.nextDouble();
double t = sc.nextDouble();
double amount = (p * t * r)/100;
System.out.println("simple interest is"+""+amount);
}
}
