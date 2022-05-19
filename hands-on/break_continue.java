//Program o demonstrate concept of break and continue statement
package corejava;


public class break_continue {

	public static void main(String[] args) {
	for(int i=10;i>=0;i--) {
		if(i==1) {
			break;
		}
		else if(i==4 || i==5) {
			continue;
		}
		System.out.println(i);
	}
	}

}
