package corejava;
//Java program to sort an array of strings
//in ascending and descending alphabetical order
//Using Arrays.sort()

//Importing arrays and Collections class
//from java.util class
import java.util.Arrays;
import java.util.Collections;

//Main class
public class arrayReverse{


  // Main driver method
  public static void main(String[] args)
  {
      // Custom input string
      String arr[] = { "Rupesh Patil",
                      "Suraj S",
                      "Amruta" };


      // Sorts arr[] in ascending order
      Arrays.sort(arr);
      System.out.printf("In Ascending Order Modified arr[] : \n%s\n\n",Arrays.toString(arr));



      // Sorts arr[] in descending order
      Arrays.sort(arr, Collections.reverseOrder());



      // Lastly printing the above array
      System.out.printf("In descending Order Modified arr[] : \n%s\n\n",Arrays.toString(arr));
  }
}