import java.util.ArrayList;

public class SimpleDotCom {

	private ArrayList<String> locationCells;
	// int numOfHits = 0;		// don't need this anymore

	public void setLocationCells(ArrayList<String> loc){
		locationCells = loc;
	}

	public String checkYourself(String userInput){
		
		int index = locationCells.indexOf(userInput);

		if (index >= 0){
			locationCells.remove(index);

			if (locationCells.isEmpty()){
				result = "kill";
			}
			else {
				result = "hit";
			} // close if/else
		} // close outer if
		return result;
	} // close checkYourself method
} // close class