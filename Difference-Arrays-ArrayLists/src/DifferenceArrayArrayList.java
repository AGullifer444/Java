import java.util.ArrayList;
import java.util.Arrays;


	public class DifferenceArrayArrayList {
		
		public static void main(String[] args) {
			//  in an Array size cannot be modified
			String [] housePetArray = {"Cat", "Dog", "Bird", "Hamster"}; 
			// an Array will print the memory location of the array
			System.out.println(housePetArray);
			// an ArrayList size can be modified
			ArrayList<String> housePetArrayList = 
					new ArrayList<>(Arrays.asList("Cat", "Dog", "Bird", "Hamster"));
			// in an ArrayList the actual data in the elements will print
			System.out.println(housePetArrayList);
			
			//in ArrayList elements can be added, in arrays elements cannot be added
			housePetArrayList.add("Snake");
			System.out.println(housePetArrayList);
			
			// array & Array List element can be modified by replacing an element
			System.out.println(housePetArray[1]);
			housePetArray[1] = "Fish";
			System.out.println(housePetArray [1]); 
			housePetArrayList.set(1, "Fish");
			System.out.println(housePetArrayList);
			
			// in ArrayList elements can be removed, an array's size cannot be modified
			housePetArrayList.remove("Hamster");
			System.out.println(housePetArrayList);		
			
	}

	}

