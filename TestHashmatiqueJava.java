import java.util.ArrayList;
import java.util.HashMap;

public class TestHashmatiqueJava {
    
	public static void main(String[] args) {
		HashmatiqueJava examineList = new HashmatiqueJava();

        // examine track list
        
        HashMap<String, String> trackList = examineList.examineList();
        System.out.println(trackList);
		
	}
}
