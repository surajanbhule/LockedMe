package classes;

class Util {
	public static void printLine() {
		System.out.println("====================================================");
	}
	
	public static void printAppInfo() {
		animationEffect();
		System.out.println("               Hi user good to see you,  please read \n instructions properly.");
		animationEffect();
		System.out.println("          ********** Application Info **********");
		System.out.println("       Project Name: Locked-Me");
		System.out.println("     Developer Name: Suraj Anbhule");
		animationEffect();
		System.out.println("    Developer Email: surajanbhule69@gmail.com");
		System.out.println("     Project Github: www.github.com/surajanbhule/LockedMe");
		printLine();
		animationEffect();
		System.out.println("Project Description:-");
		
		System.out.println("          This application allow you to create files \n and perform  basic operations on that file.");
		printLine();
		animationEffect();
		System.out.println("       ********** > How to use < **********");
		printLine();
		appGuide();
		printLine();
	}
	
	private static void appGuide() {
		// TODO Auto-generated method stub
		System.out.println("1. Read the instructions at end of the console.");
		animationEffect();
		System.out.println("2. Provide correct input as per the instructions.");
		animationEffect();
		System.out.println("3. If wrong input provided, you will get one more try.");
		animationEffect();
		System.out.println("4. You will get menu number to select perticular menu item.");
		animationEffect();
		System.out.println("5. Thank you, explore the app.");
		
	}

	private static void animationEffect() {
		try {
			Thread.sleep(700);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
