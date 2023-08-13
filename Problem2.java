/*Problem_2 of project_5 in which we printed out collection and print out the number of 
 * elements after the particular animal inputed by user*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//create a Sorted arrayCollection object col
		SortedArrayCollection<String> col = new SortedArrayCollection<>();
		
		Scanner input = new Scanner(System.in);

		//create a file and then read the data and input to colllection named col
		File file = new File("AnimalsPart.txt");
			
		Scanner myReader = new Scanner(file);
		while (myReader.hasNextLine()) {
			col.add(myReader.nextLine());
			
		}
		    
		myReader.close();
		    
		//prints out collection
		System.out.println(col.toString());
		
		//asks the user for animal name for which they want to count the later animals
		System.out.println("Enter name of animal for which you want to count number of alphabatically later animals:");
		System.out.print("Name>");
		//takes and input and prints out
		String wor = input.next();
		System.out.println("Count of animals that are alphabetically later: " + col.greater(wor));
		
	}
	
}
