import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterAndForeach {

	public static void main(String[] args) {
		
	
		List<String> employee = Arrays.asList("Shan", "madaawan", "kholi");
		for (String emp : employee) {
			System.out.println("This is " + emp);
			
		}

	}

}