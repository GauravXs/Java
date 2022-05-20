package corejava;

public class multidimensionalArray {

	public static void main(String args[])
    {
        // declaring and initializing  array
        int arr[][] = { {2,7,9},{3,6,1},{7,4,2} };

 

        // printing  array
        for (int i=0; i< 3 ; i++)
        {
            for (int j=0; j < 3 ; j++) {
                System.out.print(arr[i][j] + " ");
            }
      
            System.out.println();
        }
    }
}