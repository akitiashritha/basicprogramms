import java.util.*;
class vowel{
public static void main(String args[]){
Scanner s = new Scanner(System.in);
System.out.println("enter a character");
char ch = s.next().charAt(0); 
if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
System.out.println("it is vowel"+ " "+ch);
else
System.out.println("it is a consonant"+" "+ch);
}
}