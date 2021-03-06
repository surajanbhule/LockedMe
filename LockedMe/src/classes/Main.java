package classes;

public class Main {
	private static FileHelper helper;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		helper=new FileHelper();
		FileManager.setupAppFiles();
		System.out.println(" ********** Welcome to the Locked-Me App **********");
		Util.printLine();
		Util.printAppInfo();
		
		System.out.println("Please enter 1 to continue or any number to exit");
		
		if(1==checkInputNumber()) {
			mainNavigation();
		}
		else {
			System.out.println("Exiting...... Thanks for using");
		}
	}

	private static int checkInputNumber() {
		return Integer.parseInt(Util.input("Input"));
	}

	private static void mainNavigation() {
		while(true) {
			Util.printHeading("Main Menu");
			Util.printMainMenu();
			System.out.println("Select Main Menu Item");
			switch(checkInputNumber()) {
			
				case 1:
					helper.displayFiles();
					break;
				case 2:
					switchToFileMenu();
					break;
				case 0:
					System.out.println("Exiting .... thanks for using");
					System.exit(0);
					break;
					
				default:
					System.out.println("Invalid Input ... Please read instruction .. try again");
					break;
			}
		}
		
	}

	private static void switchToFileMenu() {
		boolean fileMenuEnabled=true;
		while(fileMenuEnabled) {
			Util.printHeading("File Menu");
			Util.printFileMenu();
			System.out.println("Select Main Menu Item");
			switch(checkInputNumber()) {
				case 1:
					helper.addFile();
					break;
				case 2:
					helper.deleteFile();
					break;
				case 3:
					helper.searchFile();
					break;
				case 4:
					fileMenuEnabled=false;
					break;
				default:
					System.out.println("Invalid Input ... Please read instruction .. try again");
					break;
					
			}
		}
	}

	

}
