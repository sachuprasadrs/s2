import java.io.*;
import java.util.StringTokenizer;
class file4 {
	public static void main(String args[]) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("number.txt"));
		FileWriter oddWriter = new FileWriter("odd.txt");
		FileWriter evenWriter = new FileWriter("even.txt");
		String line;
		while ((line = reader.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line, " ,;\t\n");
			while (st.hasMoreTokens()) {
				String token = st.nextToken();
				try {
					int num = Integer.parseInt(token);
					if (num % 2 == 0) {
						evenWriter.write(num + " ");
					} else {
						oddWriter.write(num + " ");
					}
				} catch (NumberFormatException e) {
				}
			}
		}
		reader.close();
		oddWriter.close();
		evenWriter.close();
		System.out.println("\nContents of odd.txt:");
		BufferedReader oddReader = new BufferedReader(new FileReader("odd.txt"));
		while ((line = oddReader.readLine()) != null) {
			System.out.println(line);
		}
		oddReader.close();
		System.out.println("Contents of even.txt:");
		BufferedReader evenReader = new BufferedReader(new FileReader("even.txt"));
		while ((line = evenReader.readLine()) != null) {
			System.out.println(line);
		}
		evenReader.close();
	}
}
