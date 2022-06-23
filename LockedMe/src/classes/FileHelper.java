package classes;

import java.io.File;

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
	
	
}