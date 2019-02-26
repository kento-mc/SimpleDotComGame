import java.io.*;

public class GameHelper {

	public String getUserInput(String prompt){
		String inputLine = null;
		System.out.print(prompt + " ");
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			inputLine = is.readLine();

			if (inputLine.length() == 0) return null;
		} // close try
		catch (IOException e){
			System.out.println("IOException: " + e);
		} //close catch
		return inputLine;
	} // close getUserInput() method
} //close class