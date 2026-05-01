package lockedme.com;
import java.util.*;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> files = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
		try {
			boolean isMainOption = true;
			while(isMainOption)  {
				
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
					System.out.println("\nFile list: \n");
					if(files.isEmpty()) {
						System.out.println("There are currently no files to display.");
					}else {
						Collections.sort(files);
						for(String file : files) {
							System.out.println(file);
						}
					}
					
					break;
					
				//File manager (add,delete,search, back operations)	
				case 2:

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
							System.out.print("\nEnter name of your file: \n");
							String fileName = scanner2.nextLine();	
							files.add(fileName);
							System.out.printf("\n The file %s has been added successfully.\n", fileName);
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
					//will break the outer while loop
					isMainOption = false;
					
					break;
				default:
					System.out.println("Invalid menu option. Please enter a valid option (1/2/3).");
					break;
					
				}
			}
			
			
		}catch(InputMismatchException e) {
			System.err.println("Invalid option. Please try again.");
		}
		scanner.close();
		scanner2.close();
	}

}
