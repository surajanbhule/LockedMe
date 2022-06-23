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
