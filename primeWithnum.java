import java.util.*;
class primeWithnum{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
boolean isPrime=true;
int temp;
for(int i=2;i<=num/2;i++){
temp=num%i;
if(temp==0){
isPrime=false;
break;
}
}
if(isPrime)
System.out.println("it is a prime number");
else
System.out.println("it is not a prime number");
}
}