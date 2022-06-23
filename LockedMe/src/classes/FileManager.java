package classes;

import java.io.File;

class FileManager {
	public static String MainPath="D:/LockedMe/Main";
	
	public static void setupAppFiles() {
		if(createAppFolder())
			System.out.println("App Files Created Successfully");
		else
			System.out.println("Something went wrong...");
	}
	private static boolean createAppFolder() {
		File folder = new File(MainPath);
		if(folder.exists()) {
			System.out.println("App files are already existed");
			return true;
		}
	    else {
			return folder.mkdirs();
		}
	}
}
