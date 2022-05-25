package assignments;

public class Driver3
{ 
public static void main ( String [] args )
{ 
int [] intArr = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
for (int i = 0; i < intArr . length ; i += 3) 	//i=1+3=4	//i=4+3=7
{ 
System . out . println (" Value : " + intArr [ i ]) ; //intARR[4]=5		//intArr[7]=8
} 
} 
}
