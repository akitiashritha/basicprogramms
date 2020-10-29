import java.util.*;
class evenOdd{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter number");
int number = sc.nextInt();
if(number%2==0)
System.out.println("it is an even number"+ " "+number);
else
System.out.println("it is an odd number"+" "+number);
}
}