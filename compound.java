import java.util.*;
class compound{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double p = sc.nextDouble();
double r = sc.nextDouble();
double t = sc.nextDouble();
double n = sc.nextDouble();
double amount = p * Math.pow(1 + (r / n), n * t);
System.out.println("compound interest is"+""+amount);
}
}
