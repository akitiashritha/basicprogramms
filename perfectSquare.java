import java.util.*;
class perfectSquare{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
for(int i=1;i<num;i++){
if(i*i==num)
System.out.println("given number is a perfect square"+i);
}
}
}