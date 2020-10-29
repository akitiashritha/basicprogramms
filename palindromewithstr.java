import java.util.*;
class palindromewithstr{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String s = sc.next();
String reverse="";
for(int i=s.length()-1;i>=0;i--)
reverse= reverse+s.charAt(i);
if(s.equals(reverse))
System.out.println("palindrome");
else
System.out.println("not Palindrome");
}
}