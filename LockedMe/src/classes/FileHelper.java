package classes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileHelper {
	private File file;
	
	public void displayFiles() {
		file=new File(FileManager.MainPath);
		File[] files=new File[file.listFiles().length];
		files= file.listFiles();
		Util.printHeading("Display");
		for(File file:files) {
			if(file.isFile())
			  System.out.println(file.getName());
		}
		Util.printLine();
		Util.next();
	}
	
	public void addFile() {
		System.out.println("Tip-> Dont provide extension to file");
		String fileName=Util.input("Enter File Name:");
		file=new File(FileManager.MainPath+"/"+fileName+".txt");
		try {
			if(file.createNewFile()) {
				Util.printLine();
				System.out.println("File Created Successfully");
				Util.printLine();
				Util.next();
				Util.skipLines(2);			}
			else {
				Util.printLine();
				System.out.println("Already File Existed With Same Name");
				Util.printLine();
				Util.next();
				Util.skipLines(2);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void deleteFile() {
		System.out.println("Tip-> Dont provide extension to file");
		String fileName=Util.input("Enter File Name:");
		file=new File(FileManager.MainPath+"/"+fileName+".txt");
		
		 try {
				if(Files.deleteIfExists(Paths.get(FileManager.MainPath+"/"+fileName+".txt"))) {
					Util.printLine();
					System.out.println("File Deleted Successfully");
					Util.printLine();
					Util.next();
					Util.skipLines(2);
				}
				else {
					Util.printLine();
					System.out.println("No Such File Existed");
					Util.printLine();
					Util.next();
					Util.skipLines(2);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}