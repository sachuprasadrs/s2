import java.io.*;
import java.util.*;
public class FileRW{
	public static void main(String[] args){
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter text to write to File1.txt:");
			String input = sc.nextLine();
			FileWriter fw = new FileWriter("File1.txt");
			fw.write(input);
			fw.close();
			System.out.println("Text written to File1.txt.");
			FileReader f1 = new FileReader("File1.txt");
			FileWriter f2 = new FileWriter("File2.txt");
			int i;
			System.out.println("Contents of File1.txt:");
			while ((i = f1.read()) != -1){
				f2.write(i);
				System.out.print((char)i);
			}
			f1.close();
			f2.close();
			System.out.println("Contents copied to File2.txt.");
		}
		catch (Exception e){
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}
