// Raika Roy Choudhury, Peterson APCS Per # 2
// 27 September 2021

// This program prints a scalable elf christmas hat ASCII art image
public class AsciiArt {

	// This class constant can be changed to scale the hat
	static final int SCALE = 4;
	
	// This is the main method which calls the static methods to print the hat
	public static void main(String[] args) {
		body();
		base();

	}

	// This is the method that prints the main body of the hat
	public static void body() {
		
		// This for loop prints the pom-pom on top
		System.out.println("*");
		for(int i = 1; i <= SCALE + 1; i++) {
		    for(int j = 0; j < i; j++)
		        System.out.print("\\");
		    System.out.println();
		    
		}
	}
	
	// This method prints the fluffy base of the hat
	public static void base() {
		for (int k = 1; k <= SCALE + 2; k++) {
			System.out.print("*");
		}
	}
	
}
