import java.util.*;
class Armstrong{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int length=sc.nextInt();
int num = sc.nextInt();
int c=0,rem,sum=0;
int x,num1=num;
for(int i=0;i<length;i++){
c++;
}
while(num!=0){
rem=num%10;
x=(int)Math.pow(rem,c);
sum=sum+x;
num=num/10;
}
System.out.println(sum);
if(sum==num1)
System.out.println("Armstrong");
else
System.out.println("not Armstrong");
}
}