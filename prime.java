import java.util.*;
class prime{
public static void main(String args[]){
int c=0;
for(int i=2;i<50;i++){
for(int j=2;j<i;j++){
if(i%j==0)
c++;
}
if(c==0)
System.out.println(i);
else
c=0;
}
}
}
