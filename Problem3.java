/*Problem_3 of project_5 in which we count the number of times
 * user enters the animal correctly starting with random letter*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//creates a collection col
		ArrayCollection<String> col = new ArrayCollection<>(2000);
		
		Scanner input = new Scanner(System.in);
		
		//generates random character
		Random r = new Random();
		char c = (char) ('A' + r.nextInt(26));
		int count =0;
		
		//creates a file and then read the file and inputs the data into collection col
		File file = new File("Animals.txt");
		
	    Scanner myReader = new Scanner(file);
	    
	    while (myReader.hasNextLine()) {
	    	col.add(myReader.nextLine());
	    }
		    
	    myReader.close();
		    
	    
		System.out.println("Enter names of animals that begins with the character:" + c);
		System.out.print("Name>");
		
		//asks ther user for animal name
		String s = input.nextLine();

		//while loop which loops till 1st character of animal name is equal to random character generated
		while (s.charAt(0) == c) {
			//if statement which checks if the animal is in the collection and if true 
			//then removes it increments count and again asks user to enter animal name otherwise breaks.
			if(col.contains(s)) {  
				col.remove(s);
				count++;
				System.out.print("Name>");
				s = input.nextLine();
			}
			else
				break;
		}
		
		//prints out the count of correctly answered animal names
		System.out.println("You successfully entered " + count  + " unique animal name(s) that begins with the character " + c +".");
		
		
	}	
}
