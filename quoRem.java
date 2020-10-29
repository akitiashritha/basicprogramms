import java.util.*;
class quoRem{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n1 = sc.nextInt();
int n2 = sc.nextInt();
int rem = n1%n2;
int quo = n1/n2;
System.out.println("remainder is"+" "+rem);
System.out.println("quotient is"+" "+quo);
}
}