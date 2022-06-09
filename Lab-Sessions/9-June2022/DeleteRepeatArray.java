package LabSessions;

//class name should be "DeleteRepeatArray"
//otherwise solution won't be accepted
public class DeleteRepeatArray {

	public static char[] k;
	
	public static void main(String[] args) throws Exception {

	/* enter your code here. read input from SIDIN. print output to SIDOUT*/
		 Scanner sc=new Scanner(System.in);
		 char[]arr=new char[4];
		 
		 System.out.println("Array before deleting duplicates:");
		 
		 for(int i=0;i<arr.length;i++) {
			 arr[i]=sc.next().charAt(0);
			 
			 System.out.println("a["+i+"]="+arr[i]);		 }