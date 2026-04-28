package lockedme.com;
import java.util.*;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			//main menu
			System.out.println("\n------Welcome to LockedMe.com------");
			System.out.println("by Akhona\n");
			System.out.println("1. Retrieve files");
			System.out.println("2. File Manager");
			System.out.println("3. Close Program");
			int mainOption = scanner.nextInt();
			
			switch(mainOption) {
			//Retrieve files
			case 1:
				
				break;
				
			//File manager (add,delete,search, back operations)	
			case 2:
				
//				System.out.println("\n------Manage your files------\n");
//				System.out.println("1. Add file");
//				System.out.println("2. Delete file");
//				System.out.println("3. Search for file");
//				System.out.println("4. Back to main menu");
//				int submenuOption = scanner.nextInt();
//				
//				if (submenuOption == 1) {
//					//Add
//					
//				}else if (submenuOption == 2) {
//					//Delete
//					
//				}else if (submenuOption == 3) {
//					//Search
//					
//				}else if (submenuOption == 4){
//					//Back
//					
//					
//				}else {
//					System.out.println("Invalid menu option. Please enter a valid option (1/2/3/4).");
//				}
				
				boolean isSubmenuOption = true;
				while(isSubmenuOption) {
					System.out.println("\n------Manage your files------\n");
					System.out.println("1. Add file");
					System.out.println("2. Delete file");
					System.out.println("3. Search for file");
					System.out.println("4. Back to main menu");
					int submenuOption = scanner.nextInt();
					
					switch(submenuOption) {
					//Add
					case 1:
						break;
						
					//Delete	
					case 2:
						break;
					
					//Search
					case 3:
						break;
					
					//Back
					case 4:
						isSubmenuOption = false;
						break;
					
					default:
						System.out.println("Invalid menu option. Please enter a valid option (1/2/3).");
					}
				}
				
				
				break;
				
			//Close program	
			case 3:
				System.out.println("Closing program...");
				
				break;
			default:
				System.out.println("Invalid menu option. Please enter a valid option (1/2/3).");
				
			}
			
		}catch(InputMismatchException e) {
			System.err.println("Invalid option. Please try again.");
		}
		scanner.close();
	}

}
