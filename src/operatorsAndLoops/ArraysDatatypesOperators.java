package operatorsAndLoops;

public class ArraysDatatypesOperators {

	public static void main(String[] args) {
		        
		        // Step 1: Create two arrays - one for names and one for marks
		        String[] names = {"Suresh", "Mahesh", "Naresh"};
		        int[] marks = {75, 80, 82};
		        
		        // Step 2: Create another array to store updated marks
		        int[] newMarks = new int[3];
		        
		        // Step 3: Add 10 marks to each student using assignment operator
		        for (int i = 0; i < marks.length; i++) {
		            newMarks[i] = marks[i] + 10;
		        }
		        
		        // Step 4: Display updated marks
		        System.out.println("Updated Marks of Students:");
		        for (int i = 0; i < names.length; i++) {
		            System.out.println(names[i] + " = " + newMarks[i]);
		        }
		        
		        // Step 5: Find average marks
		        int total = 0;
		        for (int i = 0; i < newMarks.length; i++) {
		            total = total + newMarks[i];
		        }
		        
		        double average = total / 3.0;
		        System.out.println("Average Marks after adding 10: " + average);
		    }


	}

