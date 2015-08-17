package ocajp;

import java.io.File;
import java.io.IOException;

public class Arquivo {
	public static void main(String[] args) {
		File dir = new File(".");
		File filezinho = new File("file.txt");
		try {
			System.out.println("file.createNewFile():"+filezinho.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(dir.getAbsoluteFile());
		for (int i = 0; i < dir.listFiles().length; i++) {
			File file = dir.listFiles()[i];
			System.out.println("Arquivo:"+file.getName()+" file:"+file.isFile()+" dir:"+file.isDirectory());
		}
		
		
		
	}

}
