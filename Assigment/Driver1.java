package assignments;

public class Driver1
{ 
public static void main ( String [] args ) 
{ 
double [] dblArr = {3.5 , 6.8 , 2.3 , 9.1 , 1.0
};
System.out.println("Length: "+dblArr.length);     //length=5

 for (int i = 0; i < dblArr . length ; i ++) 	//i=0-
{
 dblArr [ i ] /= 2; 		//dblArr[3.5]/=2--->1.75
 System.out.println(dblArr[i]);
} 

for (int i = dblArr . length - 1; i >= 0; i--) 	//i=5-1;---->1.0
{ 
System . out . println (" Value : " + dblArr [ i ]) ;
 }
 		}
 }
