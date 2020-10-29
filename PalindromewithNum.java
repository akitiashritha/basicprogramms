import java.util.*;   
class PalindromewithNum  
{  
   public static void main(String args[])  
   {  
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number");
      int n = sc.nextInt();
	int temp=n,sum=0,rem;
	while(n>0){
	rem=n%10;
	sum=(sum*10)+rem;
	n=n/10;
	}
	if(temp==sum)
	System.out.println("palindrome");
	else
	System.out.println("not a palindrome");
   }  
}  