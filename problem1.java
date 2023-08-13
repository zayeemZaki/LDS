/*Problem_1 of project_5 in which we print the collection, 
 * count the number of animals of the inputed animal name and also removes the animal*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		
		//create a collection named col from ArrayCollection class
		ArrayCollection<String> col = new ArrayCollection<>();
		//Creates a scanner object input
		Scanner input = new Scanner(System.in);
		
		//try catch block where we import .txt file, read it and input all the data to collection
		try {
			File file = new File("AnimalsPart.txt");
			
		    Scanner myReader = new Scanner(file);
		    while (myReader.hasNextLine()) {
		    	col.add(myReader.nextLine());

		    }
		    
		    myReader.close();
		    
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//Prints out collection
		System.out.println(col.toString());
		
		//asks the user for animal he needs to count.
		System.out.println("Enter name of animal that you want to count:");
		System.out.print("Name>");
		String wor = input.nextLine();
		
		//counts the animal
		int num =col.count(wor);
		
		//prints out the data after counting animal
		System.out.println("The animal name Flamingo appears " + col.count(wor) + " times.");
		
		//asks the user for animal name that he wants to remove
		System.out.println("Enter name of animal that you want to remove:");
		System.out.print("Name>");
		String wor1 = input.nextLine();
		
		//counts the number of times this animal is in collection
		int numR =col.count(wor1);
		
		//removes it from collection
		while(numR>0) {
			col.remove(wor1);
			numR--;
		}
		
		//prints out collection after removing
		System.out.println("The collection after removing.");
		System.out.println(col.toString());
		
		input.close();
	}

}
