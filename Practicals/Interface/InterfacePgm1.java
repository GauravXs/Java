//Java program to demonstrate working of
//interface

package corejava;

//A simple interface
interface InterfacePgm1 {
 
 // public, static and final
 final int a = 10;

 // public and abstract
 void display();
}

//A class that implements the interface.
class TestClass implements InterfacePgm1 {
 
 // Implementing the capabilities of
 // interface.
 public void display(){
 System.out.println("yOU");
 }

 // main method
 public static void main(String[] args)
 {
     TestClass t = new TestClass();// Creating object of test class
     t.display();//calling display method using object
     System.out.println(a);
 }
}