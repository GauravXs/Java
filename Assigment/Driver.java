package assignments;

public class Driver 
{ 
public static void main (String[] args) 
{
	
 String[] strArr = new String [10]; 
 
System.out.println(strArr.length);
for (int i = strArr . length - 1; i >= 0; i--) //10-1=9;i-break=0;	
{
 strArr[ i ] = "b" + ( i - 1) ; //strArr[5]="b" + (5-1)="b"+4
}
 System.out.println(" Value : " + strArr [5]) ;
 }
}

